package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class ConditionalOrExpressionContextAdapter implements Adapter<Expression, Java7Parser.ConditionalOrExpressionContext> {
    public Expression adapt(Java7Parser.ConditionalOrExpressionContext context) {
        Expression expression = Adapters.getConditionalAndExpressionContextAdapter().adapt(context.conditionalAndExpression(0));

        // This expression represents more than one consecutive OR expression
        if (context.BARBAR() != null && context.BARBAR().size() > 1) {
            BinaryExpr root = new BinaryExpr();

            root.setLeft(expression);
            root.setOperator(BinaryExpr.Operator.or);
            BinaryExpr currentExpression = root;


            for (int i = 1; i < context.conditionalAndExpression().size(); i++) {
                currentExpression.setRight(Adapters.getConditionalAndExpressionContextAdapter().adapt(context.conditionalAndExpression(i)));

                // On the last one, do not create a tail.
                if (i < context.conditionalAndExpression().size() - 1) {
                    BinaryExpr binaryExpr = new BinaryExpr();
                    binaryExpr.setLeft(currentExpression);
                    binaryExpr.setOperator(BinaryExpr.Operator.or);
                    currentExpression = binaryExpr;
                }
            }

            return currentExpression;
        }

        return expression;
    }
}
