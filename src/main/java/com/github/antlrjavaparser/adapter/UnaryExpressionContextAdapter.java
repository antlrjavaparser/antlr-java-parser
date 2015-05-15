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
import com.github.antlrjavaparser.api.expr.UnaryExpr;

public class UnaryExpressionContextAdapter implements Adapter<Expression, Java7Parser.UnaryExpressionContext> {
    public Expression adapt(Java7Parser.UnaryExpressionContext context, AdapterParameters adapterParameters) {

        if (context.unaryExpressionNotPlusMinus() != null) {
            return Adapters.getUnaryExpressionNotPlusMinusContextAdapter().adapt(context.unaryExpressionNotPlusMinus(), adapterParameters);
        } else {
            UnaryExpr unaryExpr = new UnaryExpr();
            AdapterUtil.setComments(unaryExpr, context, adapterParameters);
            AdapterUtil.setPosition(unaryExpr, context);

            UnaryExpr.Operator operator = null;

            if (context.PLUS() != null) {
                operator = UnaryExpr.Operator.positive;
            } else if (context.PLUSPLUS() != null) {
                operator = UnaryExpr.Operator.preIncrement;
            } else if (context.SUB() != null) {
                operator = UnaryExpr.Operator.negative;
            } else if (context.SUBSUB() != null) {
                operator = UnaryExpr.Operator.preDecrement;
            } else if (context.TILDE() != null) {
                operator = UnaryExpr.Operator.inverse;
            } else if (context.BANG() != null) {
                operator = UnaryExpr.Operator.not;
            }

            unaryExpr.setOperator(operator);
            unaryExpr.setExpr(Adapters.getUnaryExpressionContextAdapter().adapt(context.unaryExpression(), adapterParameters));

            return unaryExpr;
        }
    }
}
