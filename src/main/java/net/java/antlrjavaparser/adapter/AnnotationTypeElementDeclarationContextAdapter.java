package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

public class AnnotationTypeElementDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.AnnotationTypeElementDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.AnnotationTypeElementDeclarationContext context) {

        /*
        annotationTypeElementDeclaration
            :   annotationMethodDeclaration
            |   interfaceFieldDeclaration
            |   normalClassDeclaration
            |   normalInterfaceDeclaration
            |   enumDeclaration
            |   annotationTypeDeclaration
            |   SEMI
            ;
         */

        if (context.annotationMethodDeclaration() != null) {
            return Adapters.getAnnotationMethodDeclarationContextAdapter().adapt(context.annotationMethodDeclaration());
        } else if (context.interfaceFieldDeclaration() != null) {
            return Adapters.getInterfaceFieldDeclarationContextAdapter().adapt(context.interfaceFieldDeclaration());
        } else if (context.normalClassDeclaration() != null) {
            return Adapters.getNormalClassDeclarationContextAdapter().adapt(context.normalClassDeclaration());
        } else if (context.normalInterfaceDeclaration() != null) {
            return Adapters.getNormalInterfaceDeclarationContextAdapter().adapt(context.normalInterfaceDeclaration());
        } else if (context.enumDeclaration() != null) {
            return Adapters.getEnumDeclarationContextAdapter().adapt(context.enumDeclaration());
        } else if (context.annotationTypeDeclaration() != null) {
            return Adapters.getAnnotationTypeDeclarationContextAdapter().adapt(context.annotationTypeDeclaration());
        }

        throw new UnsupportedOperationException("Unknown annotationTypeElementDeclaration");
    }
}
