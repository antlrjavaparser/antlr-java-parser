package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.expr.Expression;
import com.github.antlrjavaparser.api.expr.LambdaExpr;
import com.github.antlrjavaparser.api.expr.MethodReferenceExpr;

/**
 * User: mdehaan
 * Date: 8/22/2014
 */
public class MethodReferenceContextAdapter implements Adapter<Expression, Java7Parser.MethodReferenceContext> {
    @Override
    public Expression adapt(Java7Parser.MethodReferenceContext context, AdapterParameters adapterParameters) {

        if (context.lambdaExpression() != null) {
            return Adapters.getLambdaExpressionContextAdapter().adapt(context.lambdaExpression(), adapterParameters);
        }

        // TODO: Store the method reference data in the data tree

        // Otherwise return a method reference

        return new MethodReferenceExpr();
    }
}
