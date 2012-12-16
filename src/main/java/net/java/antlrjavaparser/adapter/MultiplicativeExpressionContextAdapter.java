package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class MultiplicativeExpressionContextAdapter implements Adapter<Expression, Java7Parser.MultiplicativeExpressionContext> {
    public Expression adapt(Java7Parser.MultiplicativeExpressionContext context) {

        for (Java7Parser.UnaryExpressionContext unaryExpressionContext : context.unaryExpression()) {
            Adapters.getUnaryExpressionContextAdapter().adapt(unaryExpressionContext);
        }

        return null;
    }
}
