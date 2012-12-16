package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.TypeDeclaration;

public class ClassOrInterfaceDeclarationContextAdapter implements Adapter<TypeDeclaration, Java7Parser.ClassOrInterfaceDeclarationContext> {
    public TypeDeclaration adapt(Java7Parser.ClassOrInterfaceDeclarationContext context) {
        if (context.classDeclaration() != null) {
            return Adapters.getClassDeclarationContextAdapter().adapt(context.classDeclaration());
        } else if (context.interfaceDeclaration() != null) {
            return Adapters.getInterfaceDeclarationContextAdapter().adapt(context.interfaceDeclaration());
        }

        return null;
    }
}
