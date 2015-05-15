/*
 * Copyright (C) 2015 Julio Vilmar Gesser and Mike DeHaan
 *
 * This file is part of antlr-java-parser.
 *
 * antlr-java-parser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * antlr-java-parser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.expr.Expression;
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
    public Statement adapt(Java7Parser.StatementContext context, AdapterParameters adapterParameters) {

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
            assertStmt.setCheck(Adapters.getExpressionContextAdapter().adapt(context.expression(0), adapterParameters));

            if (context.expression().size() > 1) {
                assertStmt.setMessage(Adapters.getExpressionContextAdapter().adapt(context.expression(0), adapterParameters));
            }

            return assertStmt;
        } else if (context.IF() != null) {
            IfStmt ifStmt = new IfStmt();
            AdapterUtil.setComments(ifStmt, context, adapterParameters);
            AdapterUtil.setPosition(ifStmt, context);

            Expression conditionExpression = Adapters.getExpressionContextAdapter().adapt(context.parExpression().expression(), adapterParameters);
            AdapterUtil.setComments(conditionExpression, context.parExpression().expression(), adapterParameters);
            AdapterUtil.setPosition(conditionExpression, context);
            ifStmt.setCondition(conditionExpression);

            Statement thenStatement = Adapters.getStatementContextAdapter().adapt(context.statement(0), adapterParameters);
            AdapterUtil.setComments(thenStatement, context.statement(0), adapterParameters);
            AdapterUtil.setPosition(thenStatement, context);
            ifStmt.setThenStmt(thenStatement);

            if (context.ELSE() != null) {
                Statement elseStatement = Adapters.getStatementContextAdapter().adapt(context.statement(1), adapterParameters);
                AdapterUtil.setComments(elseStatement, context.statement(1), adapterParameters);
                AdapterUtil.setPosition(elseStatement, context);
                ifStmt.setElseStmt(elseStatement);
            }

            return ifStmt;
        } else if (context.forstatement() != null) {
            if (context.forstatement().foreachStatement() != null) {
                return Adapters.getForeachStatementContextAdapter().adapt(context.forstatement().foreachStatement(), adapterParameters);
            } else if (context.forstatement().normalForStatement() != null) {
                return Adapters.getNormalForStatementContextAdapter().adapt(context.forstatement().normalForStatement(), adapterParameters);
            }
        } else if (context.WHILE() != null) {
            WhileStmt whileStmt = new WhileStmt();
            AdapterUtil.setComments(whileStmt, context, adapterParameters);
            AdapterUtil.setPosition(whileStmt, context);
            whileStmt.setCondition(Adapters.getExpressionContextAdapter().adapt(context.parExpression().expression(), adapterParameters));
            whileStmt.setBody(Adapters.getStatementContextAdapter().adapt(context.statement(0), adapterParameters));
            return whileStmt;
        } else if (context.DO() != null) {
            DoStmt doStmt = new DoStmt();
            AdapterUtil.setComments(doStmt, context, adapterParameters);
            AdapterUtil.setPosition(doStmt, context);
            doStmt.setBody(Adapters.getStatementContextAdapter().adapt(context.statement(0), adapterParameters));
            doStmt.setCondition(Adapters.getParExpressionContextAdapter().adapt(context.parExpression(), adapterParameters));
            return doStmt;
        } else if (context.trystatement() != null) {
            return Adapters.getTrystatementContextAdapter().adapt(context.trystatement(), adapterParameters);
        } else if (context.SWITCH() != null) {
            SwitchStmt switchStmt = new SwitchStmt();
            AdapterUtil.setComments(switchStmt, context, adapterParameters);
            AdapterUtil.setPosition(switchStmt, context);
            switchStmt.setEntries(Adapters.getSwitchBlockStatementGroupsContextAdapter().adapt(context.switchBlockStatementGroups(), adapterParameters));
            switchStmt.setSelector(Adapters.getParExpressionContextAdapter().adapt(context.parExpression(), adapterParameters));
            return switchStmt;
        } else if (context.SYNCHRONIZED() != null) {
            SynchronizedStmt synchronizedStmt = new SynchronizedStmt();
            AdapterUtil.setComments(synchronizedStmt, context, adapterParameters);
            AdapterUtil.setPosition(synchronizedStmt, context);
            synchronizedStmt.setExpr(Adapters.getParExpressionContextAdapter().adapt(context.parExpression(), adapterParameters));
            synchronizedStmt.setBlock(Adapters.getBlockContextAdapter().adapt(context.block(), adapterParameters));
            return synchronizedStmt;
        } else if (context.block() != null) {
                return Adapters.getBlockContextAdapter().adapt(context.block(), adapterParameters);
        } else if (context.RETURN() != null) {
            ReturnStmt returnStmt = new ReturnStmt();
            AdapterUtil.setComments(returnStmt, context, adapterParameters);
            AdapterUtil.setPosition(returnStmt, context);
            if (context.expression(0) != null) {
                returnStmt.setExpr(Adapters.getExpressionContextAdapter().adapt(context.expression(0), adapterParameters));
            }
            return returnStmt;
        } else if (context.THROW() != null) {
            ThrowStmt throwStmt = new ThrowStmt();
            AdapterUtil.setComments(throwStmt, context, adapterParameters);
            AdapterUtil.setPosition(throwStmt, context);
            throwStmt.setExpr(Adapters.getExpressionContextAdapter().adapt(context.expression(0), adapterParameters));
            return throwStmt;
        } else if (context.BREAK() != null) {
            BreakStmt breakStmt = new BreakStmt();
            AdapterUtil.setComments(breakStmt, context, adapterParameters);
            AdapterUtil.setPosition(breakStmt, context);
            if (context.Identifier() != null) {
                breakStmt.setId(context.Identifier().getText());
            }
            return breakStmt;
        } else if (context.CONTINUE() != null) {
            ContinueStmt continueStmt = new ContinueStmt();
            AdapterUtil.setComments(continueStmt, context, adapterParameters);
            AdapterUtil.setPosition(continueStmt, context);
            if (context.Identifier() != null) {
                continueStmt.setId(context.Identifier().getText());
            }

            return continueStmt;
        } else if (context.Identifier() != null) {
            LabeledStmt labeledStmt = new LabeledStmt();
            AdapterUtil.setComments(labeledStmt, context, adapterParameters);
            AdapterUtil.setPosition(labeledStmt, context);
            labeledStmt.setLabel(context.Identifier().getText());
            labeledStmt.setStmt(Adapters.getStatementContextAdapter().adapt(context.statement(0), adapterParameters));
            return labeledStmt;
        } else if (context.emptyStatement() != null) {
            Statement emptyStatement = new EmptyStmt();
            AdapterUtil.setComments(emptyStatement, context.emptyStatement(), adapterParameters);
            AdapterUtil.setPosition(emptyStatement, context);
            return emptyStatement;
        } else if (context.expression() != null) {
            ExpressionStmt expressionStmt = new ExpressionStmt();
            AdapterUtil.setComments(expressionStmt, context, adapterParameters);
            AdapterUtil.setPosition(expressionStmt, context);
            expressionStmt.setExpression(Adapters.getExpressionContextAdapter().adapt(context.expression(0), adapterParameters));
            return expressionStmt;
        }

        throw new RuntimeException("Unknown or unhandled statement type");
    }
}
