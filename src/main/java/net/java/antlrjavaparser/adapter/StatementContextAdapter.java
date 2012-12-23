package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.*;

public class StatementContextAdapter implements Adapter<Statement, Java7Parser.StatementContext> {
    /**
     *
     * @param context
     * @return
     */
    public Statement adapt(Java7Parser.StatementContext context) {

        /*
            :   block
            |   ASSERT  expression (COLON expression)? SEMI
            |   ASSERT  expression (COLON expression)? SEMI
            |   IF parExpression statement (ELSE statement)?
            |   forstatement
            |   WHILE parExpression statement
            |   DO statement WHILE parExpression SEMI
            |   trystatement
            |   SWITCH parExpression LBRACE switchBlockStatementGroups RBRACE
            |   SYNCHRONIZED parExpression block
            |   RETURN (expression )? SEMI
            |   THROW expression SEMI
            |   BREAK
                    (Identifier
                    )? SEMI
            |   CONTINUE
                    (Identifier
                    )? SEMI
            |   expression  SEMI
            |   Identifier COLON statement
            |   SEMI

         */

        if (context.ASSERT() != null) {
            AssertStmt assertStmt = new AssertStmt();
            assertStmt.setCheck(Adapters.getExpressionContextAdapter().adapt(context.expression(0)));

            if (context.expression().size() > 1) {
                assertStmt.setMessage(Adapters.getExpressionContextAdapter().adapt(context.expression(0)));
            }

            return assertStmt;
        } else if (context.IF() != null) {
            IfStmt ifStmt = new IfStmt();
            ifStmt.setCondition(Adapters.getParExpressionContextAdapter().adapt(context.parExpression()));
            ifStmt.setThenStmt(Adapters.getStatementContextAdapter().adapt(context.statement(0)));

            if (context.ELSE() != null) {
                ifStmt.setElseStmt(Adapters.getStatementContextAdapter().adapt(context.statement(1)));
            }

            return ifStmt;
        } else if (context.forstatement() != null) {
            if (context.forstatement().foreachStatement() != null) {
                return Adapters.getForeachStatementContextAdapter().adapt(context.forstatement().foreachStatement());
            } else if (context.forstatement().normalForStatement() != null) {
                return Adapters.getNormalForStatementContextAdapter().adapt(context.forstatement().normalForStatement());
            }
        } else if (context.WHILE() != null) {
            WhileStmt whileStmt = new WhileStmt();
            whileStmt.setCondition(Adapters.getParExpressionContextAdapter().adapt(context.parExpression()));
            whileStmt.setBody(Adapters.getStatementContextAdapter().adapt(context.statement(0)));
            return whileStmt;
        } else if (context.DO() != null) {
            DoStmt doStmt = new DoStmt();
            doStmt.setBody(Adapters.getStatementContextAdapter().adapt(context.statement(0)));
            doStmt.setCondition(Adapters.getParExpressionContextAdapter().adapt(context.parExpression()));
            return doStmt;
        } else if (context.trystatement() != null) {
            return Adapters.getTrystatementContextAdapter().adapt(context.trystatement());
        } else if (context.SWITCH() != null) {
            SwitchStmt switchStmt = new SwitchStmt();
            switchStmt.setEntries(Adapters.getSwitchBlockStatementGroupsContextAdapter().adapt(context.switchBlockStatementGroups()));
            switchStmt.setSelector(Adapters.getParExpressionContextAdapter().adapt(context.parExpression()));
            return switchStmt;
        } else if (context.SYNCHRONIZED() != null) {
            SynchronizedStmt synchronizedStmt = new SynchronizedStmt();
            synchronizedStmt.setExpr(Adapters.getParExpressionContextAdapter().adapt(context.parExpression()));
            synchronizedStmt.setBlock(Adapters.getBlockContextAdapter().adapt(context.block()));
            return synchronizedStmt;
        } else if (context.block() != null) {
                return Adapters.getBlockContextAdapter().adapt(context.block());
        } else if (context.RETURN() != null) {
            ReturnStmt returnStmt = new ReturnStmt();
            returnStmt.setExpr(Adapters.getExpressionContextAdapter().adapt(context.expression(0)));
            return returnStmt;
        } else if (context.THROW() != null) {
            ThrowStmt throwStmt = new ThrowStmt();
            throwStmt.setExpr(Adapters.getExpressionContextAdapter().adapt(context.expression(0)));
            return throwStmt;
        } else if (context.BREAK() != null) {
            BreakStmt breakStmt = new BreakStmt();
            breakStmt.setId(context.Identifier().getText());
            return breakStmt;
        } else if (context.CONTINUE() != null) {
            ContinueStmt continueStmt = new ContinueStmt();
            if (context.Identifier() != null) {
                continueStmt.setId(context.Identifier().getText());
            }

            return continueStmt;
        } else if (context.Identifier() != null) {
            LabeledStmt labeledStmt = new LabeledStmt();
            labeledStmt.setLabel(context.Identifier().getText());
            labeledStmt.setStmt(Adapters.getStatementContextAdapter().adapt(context.statement(0)));
            return labeledStmt;
        } else if (context.emptyStatement() != null) {
            return new EmptyStmt();
        } else if (context.expression() != null) {
            ExpressionStmt expressionStmt = new ExpressionStmt();
            expressionStmt.setExpression(Adapters.getExpressionContextAdapter().adapt(context.expression(0)));
            return expressionStmt;
        }

        throw new RuntimeException("Unknown or unhandled statement type");
    }
}
