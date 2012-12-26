package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.Parameter;
import net.java.antlrjavaparser.api.body.VariableDeclaratorId;
import net.java.antlrjavaparser.api.type.ReferenceType;

public class NormalParameterDeclContextAdapter implements Adapter<Parameter, Java7Parser.NormalParameterDeclContext> {
    public Parameter adapt(Java7Parser.NormalParameterDeclContext context) {

        /*
        normalParameterDecl
            :   variableModifiers type Identifier (LBRACKET RBRACKET)*
            ;
         */

        Parameter parameter = new Parameter();
        AdapterUtil.setVariableModifiers(context.variableModifiers(), parameter);
        parameter.setType(Adapters.getTypeContextAdapter().adapt(context.type()));

        VariableDeclaratorId variableDeclaratorId = new VariableDeclaratorId();
        variableDeclaratorId.setName(context.Identifier().getText());
        parameter.setId(variableDeclaratorId);

        if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
            ReferenceType referenceType = (ReferenceType)parameter.getType();
            referenceType.setArrayCount(referenceType.getArrayCount() + context.LBRACKET().size());
        }

        return parameter;
    }
}
