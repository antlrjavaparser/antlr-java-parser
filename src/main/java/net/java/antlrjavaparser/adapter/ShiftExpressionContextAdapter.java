package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class ShiftExpressionContextAdapter implements Adapter<Expression, Java7Parser.ShiftExpressionContext> {
    public Expression adapt(Java7Parser.ShiftExpressionContext context) {

        for (Java7Parser.AdditiveExpressionContext additiveExpressionContext : context.additiveExpression()) {
            Adapters.getAdditiveExpressionContextAdapter().adapt(additiveExpressionContext);
        }

        return null;
    }
}
