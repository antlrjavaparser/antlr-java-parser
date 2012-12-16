package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class UnaryExpressionNotPlusMinusContextAdapter implements Adapter<Expression, Java7Parser.UnaryExpressionNotPlusMinusContext> {
    public Expression adapt(Java7Parser.UnaryExpressionNotPlusMinusContext context) {

        Adapters.getCastExpressionContextAdapter().adapt(context.castExpression());

        return null;
    }
}
