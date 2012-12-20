package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

import java.util.List;

public class MultiplicativeExpressionContextAdapter implements Adapter<Expression, Java7Parser.MultiplicativeExpressionContext> {
    public Expression adapt(Java7Parser.MultiplicativeExpressionContext context) {

        List<Java7Parser.UnaryExpressionContext> contextList = context.unaryExpression();
        Expression expression = Adapters.getUnaryExpressionContextAdapter().adapt(contextList.get(0));

        // This expression represents more than one consecutive OR expression
        if (contextList.size() > 1) {
            BinaryExpr root = new BinaryExpr();

            root.setLeft(expression);
            root.setOperator(getOperator(context.multiplicativeOp(0)));
            BinaryExpr currentExpression = root;

            for (int i = 1; i < contextList.size(); i++) {
                currentExpression.setRight(Adapters.getUnaryExpressionContextAdapter().adapt(contextList.get(i)));

                // On the last one, do not create a tail.
                if (i < contextList.size() - 1) {
                    BinaryExpr binaryExpr = new BinaryExpr();
                    binaryExpr.setLeft(currentExpression);
                    binaryExpr.setOperator(getOperator(context.multiplicativeOp(i)));
                    currentExpression = binaryExpr;
                }
            }

            return currentExpression;
        }

        return expression;
    }

    private BinaryExpr.Operator getOperator(Java7Parser.MultiplicativeOpContext operatorContext) {
        switch (operatorContext.operatorType) {
            case 1:
                return BinaryExpr.Operator.times;
            case 2:
                return BinaryExpr.Operator.divide;
            case 3:
                return BinaryExpr.Operator.remainder;
        }

        return null;
    }}
