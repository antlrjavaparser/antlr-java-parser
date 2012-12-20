package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class NotEqualityExpressionContextAdapter implements Adapter<Expression, Java7Parser.NotEqualityExpressionContext> {
    @Override
    public Expression adapt(Java7Parser.NotEqualityExpressionContext context) {
        return AdapterUtil.handleExpression(Adapters.getInstanceOfExpressionContextAdapter(), context.instanceOfExpression(), BinaryExpr.Operator.notEquals);
    }
}
