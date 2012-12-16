package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class AdditiveExpressionContextAdapter implements Adapter<Expression, Java7Parser.AdditiveExpressionContext> {
    public Expression adapt(Java7Parser.AdditiveExpressionContext context) {


        for (Java7Parser.MultiplicativeExpressionContext multiplicativeExpressionContext : context.multiplicativeExpression()) {
            Adapters.getMultiplicativeExpressionContextAdapter().adapt(multiplicativeExpressionContext);
        }

        return null;
    }
}
