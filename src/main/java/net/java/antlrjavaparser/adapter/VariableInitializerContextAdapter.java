package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class VariableInitializerContextAdapter implements Adapter<Expression, Java7Parser.VariableInitializerContext> {
    public Expression adapt(Java7Parser.VariableInitializerContext context) {

        if (context.arrayInitializer() != null) {
            return Adapters.getArrayInitializerContextAdapter().adapt(context.arrayInitializer());
        } else if (context.expression() != null) {
            return Adapters.getExpressionContextAdapter().adapt(context.expression());
        }

        return null;
    }
}
