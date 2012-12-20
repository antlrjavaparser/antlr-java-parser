package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class AndExpressionContextAdapter implements Adapter<Expression, Java7Parser.AndExpressionContext> {
    public Expression adapt(Java7Parser.AndExpressionContext context) {
        return AdapterUtil.handleExpression(Adapters.getEqualityExpressionContextAdapter(), context.equalityExpression(), BinaryExpr.Operator.binAnd);
    }
}
