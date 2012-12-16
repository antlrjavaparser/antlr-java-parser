package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class RelationalExpressionContextAdapter implements Adapter<Expression, Java7Parser.RelationalExpressionContext> {
    public Expression adapt(Java7Parser.RelationalExpressionContext context) {

        for (Java7Parser.ShiftExpressionContext shiftExpressionContext : context.shiftExpression()) {
            Adapters.getShiftExpressionContextAdapter().adapt(shiftExpressionContext);
        }

        return null;
    }
}
