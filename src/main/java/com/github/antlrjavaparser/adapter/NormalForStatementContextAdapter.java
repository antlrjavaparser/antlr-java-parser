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
import com.github.antlrjavaparser.api.expr.Expression;
import com.github.antlrjavaparser.api.stmt.ForStmt;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mike De Haan
 * Date: 12/20/12
 * Time: 1:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class NormalForStatementContextAdapter implements Adapter<ForStmt, Java7Parser.NormalForStatementContext> {
    @Override
    public ForStmt adapt(Java7Parser.NormalForStatementContext context, AdapterParameters adapterParameters) {

        /*
            normalForStatement
                :    FOR LPAREN (forInit)? SEMI (expression)? SEMI (expressionList)? RPAREN statement
                ;

            forInit
                :   localVariableDeclaration
                |   expressionList
                ;

         */

        ForStmt forStmt = new ForStmt();
        AdapterUtil.setComments(forStmt, context, adapterParameters);

        forStmt.setBody(Adapters.getStatementContextAdapter().adapt(context.statement(), adapterParameters));

        if (context.forInit() != null) {
            if (context.forInit().localVariableDeclaration() != null) {
                List<Expression> expressionList = new LinkedList<Expression>();
                expressionList.add(Adapters.getLocalVariableDeclarationContextAdapter().adapt(context.forInit().localVariableDeclaration(), adapterParameters));
                forStmt.setInit(expressionList);
            } else if (context.forInit().expressionList() != null) {
                forStmt.setInit(Adapters.getExpressionListContextAdapter().adapt(context.forInit().expressionList(), adapterParameters));
            }
        }

        if (context.expression() != null) {
            forStmt.setCompare(Adapters.getExpressionContextAdapter().adapt(context.expression(), adapterParameters));
        }

        if (context.expressionList() != null) {
            forStmt.setUpdate(Adapters.getExpressionListContextAdapter().adapt(context.expressionList(), adapterParameters));
        }

        return forStmt;
    }
}
