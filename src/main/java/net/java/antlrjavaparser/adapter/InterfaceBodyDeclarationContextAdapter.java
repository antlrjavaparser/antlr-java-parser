package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;
import net.java.antlrjavaparser.api.body.EmptyMemberDeclaration;

import java.awt.geom.Path2D;

public class InterfaceBodyDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.InterfaceBodyDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.InterfaceBodyDeclarationContext context) {

        /*
        interfaceBodyDeclaration
            :   interfaceFieldDeclaration
            |   interfaceMethodDeclaration
            |   interfaceDeclaration
            |   classDeclaration
            |   SEMI
            ;
        */

        if (context.interfaceFieldDeclaration() != null) {
            return Adapters.getInterfaceFieldDeclarationContextAdapter().adapt(context.interfaceFieldDeclaration());
        } else if (context.interfaceMethodDeclaration() != null) {
            return Adapters.getInterfaceMethodDeclarationContextAdapter().adapt(context.interfaceMethodDeclaration());
        } else if (context.interfaceDeclaration() != null) {
            return Adapters.getInterfaceDeclarationContextAdapter().adapt(context.interfaceDeclaration());
        } else if (context.classDeclaration() != null) {
            return Adapters.getClassDeclarationContextAdapter().adapt(context.classDeclaration());
        } else if (context.SEMI() != null) {
            return new EmptyMemberDeclaration();
        }

        return null;
    }
}
