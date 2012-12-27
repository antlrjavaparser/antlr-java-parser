package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.Resource;
import net.java.antlrjavaparser.api.body.VariableDeclaratorId;

public class ResourceContextAdapter implements Adapter<Resource, Java7Parser.ResourceContext> {
    public Resource adapt(Java7Parser.ResourceContext context) {
        /*
            resource
            :    variableModifiers? type Identifier EQ expression                       // {VariableModifier} ReferenceType VariableDeclaratorId = Expression
            ;
        */

        Resource resource = new Resource();

        if (context.variableModifiers() != null) {
            AdapterUtil.setVariableModifiers(context.variableModifiers(), resource);
        }

        resource.setType(Adapters.getTypeContextAdapter().adapt(context.type()));

        VariableDeclaratorId variableDeclaratorId = new VariableDeclaratorId();
        variableDeclaratorId.setName(context.Identifier().getText());
        resource.setId(variableDeclaratorId);

        resource.setExpression(Adapters.getExpressionContextAdapter().adapt(context.expression()));

        return resource;
    }
}
