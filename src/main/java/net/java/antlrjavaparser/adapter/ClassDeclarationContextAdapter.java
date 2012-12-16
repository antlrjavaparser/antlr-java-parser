package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.TypeDeclaration;

public class ClassDeclarationContextAdapter implements Adapter<TypeDeclaration, Java7Parser.ClassDeclarationContext> {
    public TypeDeclaration adapt(Java7Parser.ClassDeclarationContext context) {

        if (context.enumDeclaration() != null) {
            return Adapters.getEnumDeclarationContextAdapter().adapt(context.enumDeclaration());
        } else if (context.normalClassDeclaration() != null) {
            return Adapters.getNormalClassDeclarationContextAdapter().adapt(context.normalClassDeclaration());
        }

        return null;
    }
}
