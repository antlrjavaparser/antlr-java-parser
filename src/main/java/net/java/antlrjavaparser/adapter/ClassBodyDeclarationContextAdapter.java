package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;
import net.java.antlrjavaparser.api.body.EmptyMemberDeclaration;
import net.java.antlrjavaparser.api.body.EmptyTypeDeclaration;
import net.java.antlrjavaparser.api.body.InitializerDeclaration;

public class ClassBodyDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.ClassBodyDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.ClassBodyDeclarationContext context) {

        if (context.block() != null) {
            InitializerDeclaration initializerDeclaration = new InitializerDeclaration();
            initializerDeclaration.setStatic(context.STATIC() != null);
            initializerDeclaration.setBlock(Adapters.getBlockContextAdapter().adapt(context.block()));
            return initializerDeclaration;
        } else if (context.memberDecl() != null) {
            return Adapters.getMemberDeclContextAdapter().adapt(context.memberDecl());
        } else if (context.SEMI() != null) {
            return new EmptyMemberDeclaration();
        }

        return null;
    }
}
