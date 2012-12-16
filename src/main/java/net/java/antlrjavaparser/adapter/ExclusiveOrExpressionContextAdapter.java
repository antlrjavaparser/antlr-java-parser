package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class ExclusiveOrExpressionContextAdapter implements Adapter<Expression, Java7Parser.ExclusiveOrExpressionContext> {
    public Expression adapt(Java7Parser.ExclusiveOrExpressionContext context) {
        for (Java7Parser.AndExpressionContext andExpressionContext : context.andExpression()) {
            Adapters.getAndExpressionContextAdapter().adapt(andExpressionContext);
        }
        return null;
    }
}
