package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.ParseException;
import com.github.antlrjavaparser.api.expr.AssignExpr;
import com.github.antlrjavaparser.api.expr.Expression;
import com.github.antlrjavaparser.api.expr.LambdaExpr;

/**
 * User: mdehaan
 * Date: 3/19/14
 */
public class LambdaExpressionContextAdapter implements Adapter<Expression, Java7Parser.LambdaExpressionContext> {

    @Override
    public Expression adapt(Java7Parser.LambdaExpressionContext context, AdapterParameters adapterParameters) {

        Expression expression = null;
        if (context.LAMBDA() != null) {

            // TODO: Store Lambda data in tree
            return new LambdaExpr();
        }

        if (context.conditionalExpression() != null) {
            return Adapters.getConditionalExpressionContextAdapter().adapt(context.conditionalExpression(), adapterParameters);
        }

        throw new ParseException("Unknown Expression");
    }

}