package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

import java.util.LinkedList;
import java.util.List;

public class AnnotationTypeBodyContextAdapter implements Adapter<List<BodyDeclaration>, Java7Parser.AnnotationTypeBodyContext> {
    public List<BodyDeclaration> adapt(Java7Parser.AnnotationTypeBodyContext context) {

        List<BodyDeclaration> bodyDeclarationList = new LinkedList<BodyDeclaration>();
        for (Java7Parser.AnnotationTypeElementDeclarationContext declarationContext : context.annotationTypeElementDeclaration()) {
            bodyDeclarationList.add(Adapters.getAnnotationTypeElementDeclarationContextAdapter().adapt(declarationContext));
        }

        return bodyDeclarationList;
    }
}
