package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/4/12
 * Time: 10:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElementValueAdapter implements Adapter<Expression, Java7Parser.ElementValueContext> {
    @Override
    public Expression adapt(Java7Parser.ElementValueContext context) {

        /*
        expression
        annotation
        elementValueArrayInitializer
        */

        if (context.annotation() != null) {
            return Adapters.getAnnotationAdapter().adapt(context.annotation());
        } else if (context.expression() != null) {

        } else if (context.elementValueArrayInitializer() != null) {

        }

        return null;
    }
}
