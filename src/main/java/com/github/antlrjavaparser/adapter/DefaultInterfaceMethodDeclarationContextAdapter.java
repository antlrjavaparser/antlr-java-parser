package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.body.BodyDeclaration;
import com.github.antlrjavaparser.api.body.MethodDeclaration;
import com.github.antlrjavaparser.api.type.ReferenceType;
import com.github.antlrjavaparser.api.type.Type;
import com.github.antlrjavaparser.api.type.VoidType;

/**
 * User: mdehaan
 * Date: 8/22/2014
 */
public class DefaultInterfaceMethodDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.DefaultInterfaceMethodDeclarationContext>  {
    @Override
    public BodyDeclaration adapt(Java7Parser.DefaultInterfaceMethodDeclarationContext context, AdapterParameters adapterParameters) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), methodDeclaration, adapterParameters);
        AdapterUtil.setComments(methodDeclaration, context, adapterParameters);
        AdapterUtil.setPosition(methodDeclaration, context);

        if (context.typeParameters() != null) {
            methodDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters(), adapterParameters));
        }

        if (context.VOID() != null) {
            Type type = new VoidType();
            methodDeclaration.setType(type);
        } else {
            Type type = Adapters.getTypeContextAdapter().adapt(context.type(), adapterParameters);

            if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
                ReferenceType referenceType = new ReferenceType();
                if (type instanceof ReferenceType) {
                    referenceType = (ReferenceType)type;
                } else {
                    referenceType = new ReferenceType();
                    referenceType.setType(type);
                }

                int arraySize = referenceType.getArrayCount();
                arraySize += context.LBRACKET().size();
                referenceType.setArrayCount(arraySize);

                methodDeclaration.setType(referenceType);
            } else {
                methodDeclaration.setType(type);
            }
        }

        methodDeclaration.setName(context.Identifier().getText());

        methodDeclaration.setParameters(Adapters.getFormalParametersContextAdapter().adapt(context.formalParameters(), adapterParameters));

        if (context.THROWS() != null) {
            methodDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList(), adapterParameters));
        }

        if (context.block() != null) {
            methodDeclaration.setBody(Adapters.getBlockContextAdapter().adapt(context.block(), adapterParameters));
        }

        if (context.DEFAULT() != null) {
            methodDeclaration.setDefaultMethod(true);
        }

        return methodDeclaration;
    }
}
