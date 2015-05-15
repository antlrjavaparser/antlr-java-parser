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
import com.github.antlrjavaparser.api.expr.ArrayAccessExpr;
import com.github.antlrjavaparser.api.expr.Expression;
import com.github.antlrjavaparser.api.expr.FieldAccessExpr;
import com.github.antlrjavaparser.api.expr.MethodCallExpr;
import com.github.antlrjavaparser.api.expr.ObjectCreationExpr;
import com.github.antlrjavaparser.api.expr.SuperExpr;
import com.github.antlrjavaparser.api.expr.ThisExpr;
import com.github.antlrjavaparser.api.expr.UnaryExpr;

public class UnaryExpressionNotPlusMinusContextAdapter implements Adapter<Expression, Java7Parser.UnaryExpressionNotPlusMinusContext> {
    public Expression adapt(Java7Parser.UnaryExpressionNotPlusMinusContext context, AdapterParameters adapterParameters) {

        /*
            unaryExpressionNotPlusMinus
                :   castExpression
                |   primary (selector)* (PLUSPLUS | SUBSUB)?
                ;
         */


        /*
            selector
                :   DOT Identifier (arguments)?
                |   DOT THIS
                |   DOT SUPER superSuffix
                |   innerCreator
                |   LBRACKET expression RBRACKET
                ;

            superSuffix
                :   arguments    // ExplicitConstructorInvocationStmt
                |   DOT (typeArguments)? Identifier (arguments)? // MethodCall
                ;
         */

        /*
            primary
                :    parExpression
                |    THIS (DOT Identifier)* (identifierSuffix)?
                |    Identifier (DOT Identifier)* (identifierSuffix)?
                |    SUPER DOT (typeArguments)? Identifier (arguments)?
                |    literal
                |    creator
                |    primitiveType (LBRACKET RBRACKET)* DOT CLASS
                |    VOID DOT CLASS
                ;

         */

        if (context.castExpression() != null) {
            return Adapters.getCastExpressionContextAdapter().adapt(context.castExpression(), adapterParameters);
        } else if (context.primary() != null) {

            Expression expression = Adapters.getPrimaryContextAdapter().adapt(context.primary(), adapterParameters);
            //Expression leftExpression = expression;
            expression = handleSelector(context, expression, adapterParameters);

            // Create the Unary Expression
            if (context.PLUSPLUS() != null || context.SUBSUB() != null) {
                UnaryExpr unaryExpr = new UnaryExpr();
                unaryExpr.setExpr(expression);
                UnaryExpr.Operator operator = (context.PLUSPLUS() != null ? UnaryExpr.Operator.posIncrement : UnaryExpr.Operator.posDecrement);
                unaryExpr.setOperator(operator);
                expression = unaryExpr;
            }

            return expression;
        }

        throw new RuntimeException("Unknown UnaryExpressionNotPlusMinusContext type");

    }

    private Expression handleSelector(Java7Parser.UnaryExpressionNotPlusMinusContext context, Expression expression, AdapterParameters adapterParameters) {

        Expression leftExpression = expression;

        /*
            selector
            locals [int operationType]
                :   DOT Identifier (arguments)?     {$operationType = 1;}
                |   DOT THIS                        {$operationType = 2;}
                |   DOT SUPER superSuffix           {$operationType = 3;}
                |   innerCreator                    {$operationType = 4;}
                |   LBRACKET expression RBRACKET    {$operationType = 5;}
                ;

            superSuffix
                :   DOT (typeArguments)? Identifier (arguments)?
                ;

         */
        if (context.selector() == null || context.selector().size() <= 0) {
            return leftExpression;
        }

        for (Java7Parser.SelectorContext selector : context.selector()) {
            switch (selector.operationType) {
                case 1:
                    if (selector.arguments() != null) {
                        // Method Call
                        MethodCallExpr methodCallExpr = new MethodCallExpr();
                        methodCallExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(selector.arguments(), adapterParameters));
                        methodCallExpr.setName(selector.Identifier().getText());
                        methodCallExpr.setScope(leftExpression);
                        leftExpression = methodCallExpr;
                    } else {
                        // Field access
                        FieldAccessExpr fieldAccessExpr = new FieldAccessExpr();
                        fieldAccessExpr.setScope(leftExpression);
                        fieldAccessExpr.setField(selector.Identifier().getText());
                        leftExpression = fieldAccessExpr;
                    }
                    break;
                case 2:
                    ThisExpr thisExpr = new ThisExpr();
                    thisExpr.setClassExpr(leftExpression);
                    leftExpression = thisExpr;
                    break;
                case 3:
                    SuperExpr superExpr = new SuperExpr();
                    superExpr.setClassExpr(leftExpression);

                    MethodCallExpr methodCallExpr = Adapters.getSuperSuffixContextAdapter().adapt(selector.superSuffix(), adapterParameters);
                    methodCallExpr.setScope(superExpr);

                    leftExpression = methodCallExpr;
                    //throw new UnsupportedOperationException("This should be handled in explicitConstructorInvocation");
                    break;
                case 4:
                    ObjectCreationExpr objectCreationExpr = Adapters.getInnerCreatorContextAdapter().adapt(selector.innerCreator(), adapterParameters);
                    objectCreationExpr.setScope(leftExpression);
                    leftExpression = objectCreationExpr;
                    break;
                case 5:
                    ArrayAccessExpr arrayAccessExpr = new ArrayAccessExpr();
                    arrayAccessExpr.setName(leftExpression);
                    arrayAccessExpr.setIndex(Adapters.getExpressionContextAdapter().adapt(selector.expression(), adapterParameters));
                    leftExpression = arrayAccessExpr;
                    break;
            }
        }

        return leftExpression;
    }
}
