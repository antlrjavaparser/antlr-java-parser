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
import com.github.antlrjavaparser.api.expr.BinaryExpr;
import com.github.antlrjavaparser.api.expr.Expression;

import java.util.List;

public class ShiftExpressionContextAdapter implements Adapter<Expression, Java7Parser.ShiftExpressionContext> {
    public Expression adapt(Java7Parser.ShiftExpressionContext context, AdapterParameters adapterParameters) {

        List<Java7Parser.AdditiveExpressionContext> contextList = context.additiveExpression();
        Expression expression = Adapters.getAdditiveExpressionContextAdapter().adapt(contextList.get(0), adapterParameters);

        // This expression represents more than one consecutive OR expression
        if (contextList.size() > 1) {
            BinaryExpr root = new BinaryExpr();

            root.setLeft(expression);
            root.setOperator(getOperator(context.shiftOp(0)));
            BinaryExpr currentExpression = root;

            for (int i = 1; i < contextList.size(); i++) {
                currentExpression.setRight(Adapters.getAdditiveExpressionContextAdapter().adapt(contextList.get(i), adapterParameters));

                // On the last one, do not create a tail.
                if (i < contextList.size() - 1) {
                    BinaryExpr binaryExpr = new BinaryExpr();
                    binaryExpr.setLeft(currentExpression);
                    binaryExpr.setOperator(getOperator(context.shiftOp(i)));
                    currentExpression = binaryExpr;
                }
            }

            return currentExpression;
        }

        return expression;
    }

    private BinaryExpr.Operator getOperator(Java7Parser.ShiftOpContext operatorContext) {
        switch (operatorContext.operatorType) {
            case 1:
                return BinaryExpr.Operator.lessEquals;
            case 2:
                return BinaryExpr.Operator.greaterEquals;
            case 3:
                return BinaryExpr.Operator.less;
            case 4:
                return BinaryExpr.Operator.greater;
        }

        return null;
    }
}
