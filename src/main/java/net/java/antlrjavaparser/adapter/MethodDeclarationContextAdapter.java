package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.MethodDeclaration;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;
import net.java.antlrjavaparser.api.type.VoidType;

public class MethodDeclarationContextAdapter implements Adapter<MethodDeclaration, Java7Parser.MethodDeclarationContext> {
    public MethodDeclaration adapt(Java7Parser.MethodDeclarationContext context) {
        /*
            methodDeclaration
                :    modifiers typeParameters? (type | VOID) Identifier formalParameters (LBRACKET RBRACKET)* (THROWS qualifiedNameList)? (block | SEMI)
                ;
         */

        MethodDeclaration methodDeclaration = new MethodDeclaration();

        AdapterUtil.setModifiers(context.modifiers(), methodDeclaration);

        if (context.typeParameters() != null) {
            methodDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters()));
        }

        if (context.VOID() != null) {
            Type type = new VoidType();
            methodDeclaration.setType(type);
        } else {
            ReferenceType referenceType = (ReferenceType)Adapters.getTypeContextAdapter().adapt(context.type());
            if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
                int arraySize = referenceType.getArrayCount();
                arraySize += context.LBRACKET().size();
                referenceType.setArrayCount(arraySize);
            }
            methodDeclaration.setType(referenceType);
        }

        methodDeclaration.setName(context.Identifier().getText());

        methodDeclaration.setParameters(Adapters.getFormalParametersContextAdapter().adapt(context.formalParameters()));

        if (context.THROWS() != null) {
            methodDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList()));
        }

        if (context.block() != null) {
            methodDeclaration.setBody(Adapters.getBlockContextAdapter().adapt(context.block()));
        }

        return methodDeclaration;
    }
}
