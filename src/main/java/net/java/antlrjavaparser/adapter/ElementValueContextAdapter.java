package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class ElementValueContextAdapter implements Adapter<Expression, Java7Parser.ElementValueContext> {
    public Expression adapt(Java7Parser.ElementValueContext context) {

        if (context.conditionalExpression() != null) {
            return Adapters.getConditionalExpressionContextAdapter().adapt(context.conditionalExpression());
        } else if (context.annotation() != null) {
            return Adapters.getAnnotationContextAdapter().adapt(context.annotation());
        } else if (context.elementValueArrayInitializer() != null) {
            return Adapters.getElementValueArrayInitializerContextAdapter().adapt(context.elementValueArrayInitializer());
        }

        return null;
    }
}
