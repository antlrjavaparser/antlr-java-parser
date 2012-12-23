package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.AnnotationExpr;

import java.util.LinkedList;
import java.util.List;

public class AnnotationsContextAdapter implements Adapter<List<AnnotationExpr>, Java7Parser.AnnotationsContext> {
    public List<AnnotationExpr> adapt(Java7Parser.AnnotationsContext context) {
        if (context != null) {
            List<AnnotationExpr> annotationExprList = new LinkedList<AnnotationExpr>();
            for (Java7Parser.AnnotationContext annotationContext : context.annotation()) {
                annotationExprList.add(Adapters.getAnnotationContextAdapter().adapt(annotationContext));
            }
            return annotationExprList;
        }

        throw new RuntimeException("Null annotations context");
    }
}
