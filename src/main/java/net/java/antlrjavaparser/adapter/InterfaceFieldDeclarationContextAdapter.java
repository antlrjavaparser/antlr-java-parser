package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;
import net.java.antlrjavaparser.api.body.FieldDeclaration;
import net.java.antlrjavaparser.api.body.VariableDeclarator;

import java.util.LinkedList;
import java.util.List;

public class InterfaceFieldDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.InterfaceFieldDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.InterfaceFieldDeclarationContext context) {

        /*
        interfaceFieldDeclaration
            :   modifiers type variableDeclarator
                (COMMA variableDeclarator
                )*
                SEMI
            ;
         */

        FieldDeclaration fieldDeclaration = new FieldDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), fieldDeclaration);
        fieldDeclaration.setType(Adapters.getTypeContextAdapter().adapt(context.type()));

        List<VariableDeclarator> variableDeclaratorList = new LinkedList<VariableDeclarator>();
        for (Java7Parser.VariableDeclaratorContext variableDeclaratorContext : context.variableDeclarator()) {
            variableDeclaratorList.add(Adapters.getVariableDeclaratorContextAdapter().adapt(variableDeclaratorContext));
        }
        fieldDeclaration.setVariables(variableDeclaratorList);

        return fieldDeclaration;
    }
}
