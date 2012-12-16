package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.TypeDeclaration;

public class InterfaceDeclarationContextAdapter implements Adapter<TypeDeclaration, Java7Parser.InterfaceDeclarationContext> {
    public TypeDeclaration adapt(Java7Parser.InterfaceDeclarationContext context) {

        if (context.annotationTypeDeclaration() != null) {
            return Adapters.getAnnotationTypeDeclarationContextAdapter().adapt(context.annotationTypeDeclaration());
        } else if (context.normalInterfaceDeclaration() != null) {
            return Adapters.getNormalInterfaceDeclarationContextAdapter().adapt(context.normalInterfaceDeclaration());
        }

        return null;
    }
}
