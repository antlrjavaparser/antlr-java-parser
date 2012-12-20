package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class InclusiveOrExpressionContextAdapter implements Adapter<Expression, Java7Parser.InclusiveOrExpressionContext> {
    public Expression adapt(Java7Parser.InclusiveOrExpressionContext context) {
        return AdapterUtil.handleExpression(Adapters.getExclusiveOrExpressionContextAdapter(), context.exclusiveOrExpression(), BinaryExpr.Operator.binOr);
    }
}
