package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class InstanceOfExpressionContextAdapter implements Adapter<Expression, Java7Parser.InstanceOfExpressionContext> {
    public Expression adapt(Java7Parser.InstanceOfExpressionContext context) {

        Adapters.getRelationalExpressionContextAdapter().adapt(context.relationalExpression());

        return null;
    }
}
