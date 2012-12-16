package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.CastExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class CastExpressionContextAdapter implements Adapter<Expression, Java7Parser.CastExpressionContext> {
    public Expression adapt(Java7Parser.CastExpressionContext context) {

        CastExpr castExpr = new CastExpr();
        castExpr.setType(Adapters.getTypeContextAdapter().adapt(context.type()));


        return null;
    }
}
