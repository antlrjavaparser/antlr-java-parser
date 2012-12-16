package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class ConditionalAndExpressionContextAdapter implements Adapter<Expression, Java7Parser.ConditionalAndExpressionContext> {
    public Expression adapt(Java7Parser.ConditionalAndExpressionContext context) {

        for (Java7Parser.InclusiveOrExpressionContext inclusiveOrExpressionContext : context.inclusiveOrExpression()) {
            Adapters.getInclusiveOrExpressionContextAdapter().adapt(inclusiveOrExpressionContext);
        }

        return null;
    }
}
