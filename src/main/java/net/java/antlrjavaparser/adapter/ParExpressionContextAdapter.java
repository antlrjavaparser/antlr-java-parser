package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.EnclosedExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class ParExpressionContextAdapter implements Adapter<Expression, Java7Parser.ParExpressionContext> {
    public Expression adapt(Java7Parser.ParExpressionContext context) {
        EnclosedExpr enclosedExpr = new EnclosedExpr();
        enclosedExpr.setInner(Adapters.getExpressionContextAdapter().adapt(context.expression()));
        return enclosedExpr;
    }
}
