package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class InclusiveOrExpressionContextAdapter implements Adapter<Expression, Java7Parser.InclusiveOrExpressionContext> {
    public Expression adapt(Java7Parser.InclusiveOrExpressionContext context) {

        for (Java7Parser.ExclusiveOrExpressionContext exclusiveOrExpressionContext : context.exclusiveOrExpression()) {
            Adapters.getExclusiveOrExpressionContextAdapter().adapt(exclusiveOrExpressionContext);
        }

        return null;
    }
}
