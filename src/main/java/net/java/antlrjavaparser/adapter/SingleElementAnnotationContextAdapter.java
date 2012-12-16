package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.NameExpr;
import net.java.antlrjavaparser.api.expr.SingleMemberAnnotationExpr;

public class SingleElementAnnotationContextAdapter implements Adapter<SingleMemberAnnotationExpr, Java7Parser.SingleElementAnnotationContext> {
    public SingleMemberAnnotationExpr adapt(Java7Parser.SingleElementAnnotationContext context) {
        SingleMemberAnnotationExpr singleMemberAnnotationExpr = new SingleMemberAnnotationExpr();
        singleMemberAnnotationExpr.setName(new NameExpr(context.qualifiedName().getText()));
        singleMemberAnnotationExpr.setMemberValue(Adapters.getElementValueContextAdapter().adapt(context.elementValue()));

        return singleMemberAnnotationExpr;
    }
}
