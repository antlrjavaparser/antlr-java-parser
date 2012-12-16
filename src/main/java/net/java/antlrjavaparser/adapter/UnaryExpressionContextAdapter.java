package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class UnaryExpressionContextAdapter implements Adapter<Expression, Java7Parser.UnaryExpressionContext> {
    public Expression adapt(Java7Parser.UnaryExpressionContext context) {

        //Adapters.get context.
        Adapters.getUnaryExpressionNotPlusMinusContextAdapter().adapt(context.unaryExpressionNotPlusMinus());

        return null;
    }
}
