/*
 * This file is part of antlr-java-parser.
 *
 *     antlr-java-parser is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     antlr-java-parser is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.stmt.AssertStmt;
import com.github.antlrjavaparser.api.stmt.BreakStmt;
import com.github.antlrjavaparser.api.stmt.ContinueStmt;
import com.github.antlrjavaparser.api.stmt.DoStmt;
import com.github.antlrjavaparser.api.stmt.EmptyStmt;
import com.github.antlrjavaparser.api.stmt.ExpressionStmt;
import com.github.antlrjavaparser.api.stmt.IfStmt;
import com.github.antlrjavaparser.api.stmt.LabeledStmt;
import com.github.antlrjavaparser.api.stmt.ReturnStmt;
import com.github.antlrjavaparser.api.stmt.Statement;
import com.github.antlrjavaparser.api.stmt.SwitchStmt;
import com.github.antlrjavaparser.api.stmt.SynchronizedStmt;
import com.github.antlrjavaparser.api.stmt.ThrowStmt;
import com.github.antlrjavaparser.api.stmt.WhileStmt;

public class StatementContextAdapter implements Adapter<Statement, Java7Parser.StatementContext> {
    /**
     *
     * @param context
     * @return Statement
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
            ifStmt.setCondition(Adapters.getExpressionContextAdapter().adapt(context.parExpression().expression()));
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
            whileStmt.setCondition(Adapters.getExpressionContextAdapter().adapt(context.parExpression().expression()));
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
            if (context.expression(0) != null) {
                returnStmt.setExpr(Adapters.getExpressionContextAdapter().adapt(context.expression(0)));
            }
            return returnStmt;
        } else if (context.THROW() != null) {
            ThrowStmt throwStmt = new ThrowStmt();
            throwStmt.setExpr(Adapters.getExpressionContextAdapter().adapt(context.expression(0)));
            return throwStmt;
        } else if (context.BREAK() != null) {
            BreakStmt breakStmt = new BreakStmt();
            if (context.Identifier() != null) {
                breakStmt.setId(context.Identifier().getText());
            }
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
