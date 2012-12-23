package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

import java.util.List;

public class AdditiveExpressionContextAdapter implements Adapter<Expression, Java7Parser.AdditiveExpressionContext> {
    public Expression adapt(Java7Parser.AdditiveExpressionContext context) {

        List<Java7Parser.MultiplicativeExpressionContext> contextList = context.multiplicativeExpression();
        Expression expression = Adapters.getMultiplicativeExpressionContextAdapter().adapt(contextList.get(0));

        // This expression represents more than one consecutive OR expression
        if (contextList.size() > 1) {
            BinaryExpr root = new BinaryExpr();

            root.setLeft(expression);
            root.setOperator(getOperator(context.additiveOp(0)));
            BinaryExpr currentExpression = root;

            for (int i = 1; i < contextList.size(); i++) {
                currentExpression.setRight(Adapters.getMultiplicativeExpressionContextAdapter().adapt(contextList.get(i)));

                // On the last one, do not create a tail.
                if (i < contextList.size() - 1) {
                    BinaryExpr binaryExpr = new BinaryExpr();
                    binaryExpr.setLeft(currentExpression);
                    binaryExpr.setOperator(getOperator(context.additiveOp(i)));
                    currentExpression = binaryExpr;
                }
            }

            return currentExpression;
        }

        return expression;
    }

    private BinaryExpr.Operator getOperator(Java7Parser.AdditiveOpContext operatorContext) {
        switch (operatorContext.operatorType) {
            case 1:
                return BinaryExpr.Operator.plus;
            case 2:
                return BinaryExpr.Operator.minus;
        }

        throw new RuntimeException("Operator Not Found");
    }
}
