package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;

import java.util.LinkedList;
import java.util.List;

public class ClassOrInterfaceTypeContextAdapter implements Adapter<ClassOrInterfaceType, Java7Parser.ClassOrInterfaceTypeContext> {
    public ClassOrInterfaceType adapt(Java7Parser.ClassOrInterfaceTypeContext context) {

        ClassOrInterfaceType classOrInterfaceType = new ClassOrInterfaceType();

        List<ClassOrInterfaceType> scopes = new LinkedList<ClassOrInterfaceType>();

        for (Java7Parser.IdentifierTypeArgumentContext identifierTypeArgumentContext : context.identifierTypeArgument())  {

            ClassOrInterfaceType scope = new ClassOrInterfaceType();
            scope.setTypeArgs(Adapters.getTypeArgumentsContextAdapter().adapt(identifierTypeArgumentContext.typeArguments()));
            scope.setName(identifierTypeArgumentContext.Identifier().getText());

            scopes.add(scope);
        }

        // This is a weird way of handling this, but should take care of the scope hierarchy
        classOrInterfaceType = scopes.get(scopes.size() - 1);
        ClassOrInterfaceType currentScope = classOrInterfaceType;
        for (int i = (scopes.size() - 2); i >= 0; i--) {
            ClassOrInterfaceType scope = scopes.get(i);
            currentScope.setScope(scope);
            currentScope = scope;
        }

        return classOrInterfaceType;
    }
}
