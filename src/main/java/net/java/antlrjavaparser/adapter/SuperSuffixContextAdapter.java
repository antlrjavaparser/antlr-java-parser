package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.expr.MethodCallExpr;
import net.java.antlrjavaparser.api.expr.SuperExpr;
import org.omg.PortableServer.AdapterActivator;

public class SuperSuffixContextAdapter implements Adapter<MethodCallExpr, Java7Parser.SuperSuffixContext> {
    public MethodCallExpr adapt(Java7Parser.SuperSuffixContext context) {

        /*
        superSuffix
            :   DOT (typeArguments)? Identifier (arguments)?
            ;

         */

        MethodCallExpr methodCallExpr = new MethodCallExpr();
        methodCallExpr.setScope(new SuperExpr());

        if (context.typeArguments() != null) {
            methodCallExpr.setTypeArgs(Adapters.getTypeArgumentsContextAdapter().adapt(context.typeArguments()));
        }

        methodCallExpr.setName(context.Identifier().getText());

        if (context.arguments() != null) {
            methodCallExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.arguments()));
        }

        return methodCallExpr;
    }
}
