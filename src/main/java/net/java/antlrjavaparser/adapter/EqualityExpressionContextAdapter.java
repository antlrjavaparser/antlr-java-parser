package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class EqualityExpressionContextAdapter implements Adapter<Expression, Java7Parser.EqualityExpressionContext> {
    public Expression adapt(Java7Parser.EqualityExpressionContext context) {

        for (Java7Parser.InstanceOfExpressionContext instanceOfExpressionContext : context.instanceOfExpression()) {
            Adapters.getInstanceOfExpressionContextAdapter().adapt(instanceOfExpressionContext);
        }

        return null;
    }
}
