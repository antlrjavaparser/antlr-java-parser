package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class ConditionalAndExpressionContextAdapter implements Adapter<Expression, Java7Parser.ConditionalAndExpressionContext> {
    public Expression adapt(Java7Parser.ConditionalAndExpressionContext context) {
        return AdapterUtil.handleExpression(Adapters.getInclusiveOrExpressionContextAdapter(), context.inclusiveOrExpression(), BinaryExpr.Operator.and);
    }
}
