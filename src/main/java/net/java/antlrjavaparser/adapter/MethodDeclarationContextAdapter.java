package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.MethodDeclaration;
import net.java.antlrjavaparser.api.type.VoidType;

public class MethodDeclarationContextAdapter implements Adapter<MethodDeclaration, Java7Parser.MethodDeclarationContext> {
    public MethodDeclaration adapt(Java7Parser.MethodDeclarationContext context) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();

        methodDeclaration.setName(context.Identifier().getText());

        if (context.VOID() != null) {
            methodDeclaration.setType(new VoidType());
        } else {
            methodDeclaration.setType(Adapters.getTypeContextAdapter().adapt(context.type()));
        }

        AdapterUtil.setModifiers(context.modifiers(), methodDeclaration);
        methodDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList()));

        return methodDeclaration;
    }
}
