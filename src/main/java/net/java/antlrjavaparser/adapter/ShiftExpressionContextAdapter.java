package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

import java.util.List;

public class ShiftExpressionContextAdapter implements Adapter<Expression, Java7Parser.ShiftExpressionContext> {
    public Expression adapt(Java7Parser.ShiftExpressionContext context) {

        List<Java7Parser.AdditiveExpressionContext> contextList = context.additiveExpression();
        Expression expression = Adapters.getAdditiveExpressionContextAdapter().adapt(contextList.get(0));

        // This expression represents more than one consecutive OR expression
        if (contextList.size() > 1) {
            BinaryExpr root = new BinaryExpr();

            root.setLeft(expression);
            root.setOperator(getOperator(context.shiftOp(0)));
            BinaryExpr currentExpression = root;

            for (int i = 1; i < contextList.size(); i++) {
                currentExpression.setRight(Adapters.getAdditiveExpressionContextAdapter().adapt(contextList.get(i)));

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
