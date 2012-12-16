package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.MarkerAnnotationExpr;
import net.java.antlrjavaparser.api.expr.NameExpr;

public class MarkerAnnotationContextAdapter implements Adapter<MarkerAnnotationExpr, Java7Parser.MarkerAnnotationContext> {
    public MarkerAnnotationExpr adapt(Java7Parser.MarkerAnnotationContext context) {
        MarkerAnnotationExpr markerAnnotationExpr = new MarkerAnnotationExpr();
        markerAnnotationExpr.setName(
                new NameExpr(context.qualifiedName().getText()));

        return markerAnnotationExpr;
    }
}
