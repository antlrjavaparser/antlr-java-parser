package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.ArrayInitializerExpr;
import net.java.antlrjavaparser.api.expr.Expression;

import java.util.LinkedList;
import java.util.List;

public class ElementValueArrayInitializerContextAdapter implements Adapter<ArrayInitializerExpr, Java7Parser.ElementValueArrayInitializerContext> {
    public ArrayInitializerExpr adapt(Java7Parser.ElementValueArrayInitializerContext context) {
        /*
            elementValueArrayInitializer
            :   LBRACE
                    (elementValue
                            (COMMA elementValue
                            )*
                    )? (COMMA)? RBRACE
            ;
        */
        ArrayInitializerExpr arrayInitializerExpr = new ArrayInitializerExpr();

        List<Expression> expressionList = new LinkedList<Expression>();
        for (Java7Parser.ElementValueContext elementValueContext : context.elementValue()) {
            expressionList.add(Adapters.getElementValueContextAdapter().adapt(elementValueContext));
        }
        arrayInitializerExpr.setValues(expressionList);

        return arrayInitializerExpr;
    }
}
