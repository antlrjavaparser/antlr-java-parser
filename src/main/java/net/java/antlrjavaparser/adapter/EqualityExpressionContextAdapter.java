package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class EqualityExpressionContextAdapter implements Adapter<Expression, Java7Parser.EqualityExpressionContext> {
    public Expression adapt(Java7Parser.EqualityExpressionContext context) {
        return AdapterUtil.handleExpression(Adapters.getNotEqualityExpressionContextAdapter(), context.notEqualityExpression(), BinaryExpr.Operator.equals);
    }
}
