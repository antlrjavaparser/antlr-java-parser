package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;
import net.java.antlrjavaparser.api.body.MethodDeclaration;
import net.java.antlrjavaparser.api.type.Type;
import net.java.antlrjavaparser.api.type.VoidType;

public class InterfaceMethodDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.InterfaceMethodDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.InterfaceMethodDeclarationContext context) {

        /*
        interfaceMethodDeclaration
            :    modifiers (typeParameters)? (type|VOID) Identifier formalParameters (LBRACKET RBRACKET)* (THROWS qualifiedNameList)? SEMI
            ;
         */

        MethodDeclaration methodDeclaration = new MethodDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), methodDeclaration);
        methodDeclaration.setName(context.Identifier().getText());

        if (context.typeParameters() != null) {
            methodDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters()));
        }

        if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
            methodDeclaration.setArrayCount(context.LBRACKET().size());
        }

        Type returnType = null;
        if (context.VOID() != null) {
            returnType = new VoidType();
        } else if (context.type() != null) {
            returnType = Adapters.getTypeContextAdapter().adapt(context.type());
        }
        methodDeclaration.setType(returnType);

        methodDeclaration.setParameters(Adapters.getFormalParametersContextAdapter().adapt(context.formalParameters()));

        if (context.qualifiedNameList() != null) {
            methodDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList()));
        }

        return methodDeclaration;
    }
}
