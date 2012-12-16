package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.ArrayInitializerExpr;

public class ElementValueArrayInitializerContextAdapter implements Adapter<ArrayInitializerExpr, Java7Parser.ElementValueArrayInitializerContext> {
    public ArrayInitializerExpr adapt(Java7Parser.ElementValueArrayInitializerContext context) {
        return new ArrayInitializerExpr();
    }
}
