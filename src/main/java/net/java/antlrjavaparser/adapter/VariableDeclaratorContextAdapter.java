package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.VariableDeclarator;
import net.java.antlrjavaparser.api.body.VariableDeclaratorId;

public class VariableDeclaratorContextAdapter implements Adapter<VariableDeclarator, Java7Parser.VariableDeclaratorContext> {
    public VariableDeclarator adapt(Java7Parser.VariableDeclaratorContext context) {

        VariableDeclarator variableDeclarator = new VariableDeclarator();

        VariableDeclaratorId variableDeclaratorId = new VariableDeclaratorId();
        variableDeclaratorId.setName(context.Identifier().getText());

        if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
            variableDeclaratorId.setArrayCount(context.LBRACKET().size());
        }

        variableDeclarator.setId(variableDeclaratorId);

        variableDeclarator.setInit(Adapters.getVariableInitializerContextAdapter().adapt(context.variableInitializer()));


        return variableDeclarator;
    }
}
