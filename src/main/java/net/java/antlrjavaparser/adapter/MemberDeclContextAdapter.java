package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

public class MemberDeclContextAdapter implements Adapter<BodyDeclaration, Java7Parser.MemberDeclContext> {
    public BodyDeclaration adapt(Java7Parser.MemberDeclContext context) {

        if (context.methodDeclaration() != null) {
            return Adapters.getMethodDeclarationContextAdapter().adapt(context.methodDeclaration());
        } else if (context.fieldDeclaration() != null) {
            return Adapters.getFieldDeclarationContextAdapter().adapt(context.fieldDeclaration());
        } else if (context.classDeclaration() != null) {
            return Adapters.getClassDeclarationContextAdapter().adapt(context.classDeclaration());
        } else if (context.interfaceDeclaration() != null) {
            return Adapters.getInterfaceDeclarationContextAdapter().adapt(context.interfaceDeclaration());
        } else if (context.constructorDeclaration() != null) {
            return Adapters.getConstructorDeclarationContextAdapter().adapt(context.constructorDeclaration());
        }

        return null;
    }
}
