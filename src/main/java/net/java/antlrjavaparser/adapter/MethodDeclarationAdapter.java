package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.body.MethodDeclaration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/4/12
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class MethodDeclarationAdapter implements Adapter<MethodDeclaration, Object> {
    @Override
    public MethodDeclaration adapt(Object context) {

        /*
        MethodDeclaration methodDeclaration = new MethodDeclaration();

        if (context.methodHeader().result().VOID() != null) {
            methodDeclaration.setType(new VoidType());
        } else {
            Type type = Adapters.getTypeAdapter().adapt(context.methodHeader().result().type());
            methodDeclaration.setType(type);
        }

        methodDeclaration.setName(context.methodHeader().methodDeclarator().Identifier().getText());
        //methodDeclaration.setBody(Adapters.getBlockAdapter(context.methodDeclarationRest().methodBody()));

        if (context.methodBody() != null) {
            methodDeclaration.setBody(Adapters.getBlockAdapter().adapt(context.methodBody().block()));
        }


        return methodDeclaration;

        */

        return null;
    }
}
