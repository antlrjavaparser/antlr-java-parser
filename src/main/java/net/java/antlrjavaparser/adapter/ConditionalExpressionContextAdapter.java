package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.ConditionalExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class ConditionalExpressionContextAdapter implements Adapter<Expression, Java7Parser.ConditionalExpressionContext> {
    public Expression adapt(Java7Parser.ConditionalExpressionContext context) {
        Expression expression = Adapters.getConditionalOrExpressionContextAdapter().adapt(context.conditionalOrExpression());

        if (context.QUES() != null) {
            Expression thenExpression = Adapters.getExpressionContextAdapter().adapt(context.expression());
            Expression elseExpression = Adapters.getConditionalExpressionContextAdapter().adapt(context.conditionalExpression());

            ConditionalExpr conditionalExpr = new ConditionalExpr();
            conditionalExpr.setCondition(expression);
            conditionalExpr.setThenExpr(thenExpression);
            conditionalExpr.setElseExpr(elseExpression);

            return conditionalExpr;
        } else {
            return expression;
        }
    }
}
