package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.EmptyTypeDeclaration;
import net.java.antlrjavaparser.api.body.TypeDeclaration;

public class TypeDeclarationContextAdapter implements Adapter<TypeDeclaration, Java7Parser.TypeDeclarationContext> {
    public TypeDeclaration adapt(Java7Parser.TypeDeclarationContext context) {

        // Determine which Type we're dealing with
        if (context.classOrInterfaceDeclaration() != null) {
            return Adapters.getClassOrInterfaceDeclarationContextAdapter().adapt(context.classOrInterfaceDeclaration());
        } else if (context.SEMI() != null) {
            return new EmptyTypeDeclaration();
        }

        return null;
    }
}
