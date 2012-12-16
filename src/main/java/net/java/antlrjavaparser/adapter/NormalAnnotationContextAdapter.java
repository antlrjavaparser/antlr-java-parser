package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.NameExpr;
import net.java.antlrjavaparser.api.expr.NormalAnnotationExpr;

public class NormalAnnotationContextAdapter implements Adapter<NormalAnnotationExpr, Java7Parser.NormalAnnotationContext> {
    public NormalAnnotationExpr adapt(Java7Parser.NormalAnnotationContext context) {
        NormalAnnotationExpr normalAnnotationExpr = new NormalAnnotationExpr();
        normalAnnotationExpr.setName(
                new NameExpr(context.qualifiedName().getText()));

        return normalAnnotationExpr;
    }
}
