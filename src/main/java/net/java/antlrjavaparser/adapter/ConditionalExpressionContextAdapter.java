package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class ConditionalExpressionContextAdapter implements Adapter<Expression, Java7Parser.ConditionalExpressionContext> {
    public Expression adapt(Java7Parser.ConditionalExpressionContext context) {
        //ConditionalExpr conditionalExpr =  Adapters.getConditionalOrExpressionContextAdapter().adapt(context.conditionalOrExpression());

        Expression expression = Adapters.getConditionalOrExpressionContextAdapter().adapt(context.conditionalOrExpression());

        if (context.QUES() != null) {

            Conditional

            return null;
        } else {
            return expression;
        }
    }
}
