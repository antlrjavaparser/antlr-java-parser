package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class ConditionalOrExpressionContextAdapter implements Adapter<Expression, Java7Parser.ConditionalOrExpressionContext> {
    public Expression adapt(Java7Parser.ConditionalOrExpressionContext context) {
        return AdapterUtil.handleExpression(Adapters.getConditionalAndExpressionContextAdapter(), context.conditionalAndExpression(), BinaryExpr.Operator.or);
    }
}
