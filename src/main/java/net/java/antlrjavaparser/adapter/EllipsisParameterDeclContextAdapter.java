package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.Parameter;
import net.java.antlrjavaparser.api.body.VariableDeclaratorId;

import java.util.List;

public class EllipsisParameterDeclContextAdapter implements Adapter<Parameter, Java7Parser.EllipsisParameterDeclContext> {
    public Parameter adapt(Java7Parser.EllipsisParameterDeclContext context) {

        /*
        ellipsisParameterDecl
            :   variableModifiers
                type  ELLIPSIS
                Identifier
            ;
         */

        Parameter parameter = new Parameter();
        AdapterUtil.setVariableModifiers(context.variableModifiers(), parameter);

        parameter.setType(Adapters.getTypeContextAdapter().adapt(context.type()));
        parameter.setVarArgs(true);

        VariableDeclaratorId variableDeclaratorId = new VariableDeclaratorId();
        variableDeclaratorId.setName(context.Identifier().getText());

        parameter.setId(variableDeclaratorId);

        return parameter;
    }
}
