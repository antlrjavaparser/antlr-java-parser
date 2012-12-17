package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ConstructorDeclaration;

public class ConstructorDeclarationContextAdapter implements Adapter<ConstructorDeclaration, Java7Parser.ConstructorDeclarationContext> {
    @Override
    public ConstructorDeclaration adapt(Java7Parser.ConstructorDeclarationContext context) {

        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), constructorDeclaration);

        constructorDeclaration.setName(context.Identifier().getText());
        constructorDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters()));
        constructorDeclaration.setBlock(Adapters.getConstructorBlockContextAdapter().adapt(context.constructorBlock()));
        constructorDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList()));

        return constructorDeclaration;
    }
}
