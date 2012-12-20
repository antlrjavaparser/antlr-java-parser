package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.MethodDeclaration;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;
import net.java.antlrjavaparser.api.type.VoidType;

public class MethodDeclarationContextAdapter implements Adapter<MethodDeclaration, Java7Parser.MethodDeclarationContext> {
    public MethodDeclaration adapt(Java7Parser.MethodDeclarationContext context) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();

        methodDeclaration.setName(context.Identifier().getText());

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

        AdapterUtil.setModifiers(context.modifiers(), methodDeclaration);
        methodDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList()));

        methodDeclaration.setBody(Adapters.getBlockContextAdapter().adapt(context.block()));
        methodDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters()));
        methodDeclaration.setParameters(Adapters.getFormalParametersContextAdapter().adapt(context.formalParameters()));

        return methodDeclaration;
    }
}
