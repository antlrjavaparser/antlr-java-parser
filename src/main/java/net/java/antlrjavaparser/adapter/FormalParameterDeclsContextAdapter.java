package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.Parameter;

import java.util.LinkedList;
import java.util.List;

public class FormalParameterDeclsContextAdapter implements Adapter<List<Parameter>, Java7Parser.FormalParameterDeclsContext> {
    public List<Parameter> adapt(Java7Parser.FormalParameterDeclsContext context) {

        /*
        formalParameterDecls
        locals [int parameterType]
            :   ellipsisParameterDecl                               {$parameterType = 1;}
            |   normalParameterDecl (COMMA normalParameterDecl)*    {$parameterType = 2;}
            |   (normalParameterDecl COMMA)+ ellipsisParameterDecl  {$parameterType = 3;}
            ;
         */
        List<Parameter> parameterList = new LinkedList<Parameter>();

        if (context.normalParameterDecl() != null && context.normalParameterDecl().size() > 0) {
            for (Java7Parser.NormalParameterDeclContext normalParameterDeclContext : context.normalParameterDecl()) {
                parameterList.add(Adapters.getNormalParameterDeclContextAdapter().adapt(normalParameterDeclContext));
            }
        }

        if (context.ellipsisParameterDecl() != null) {
            parameterList.add(Adapters.getEllipsisParameterDeclContextAdapter().adapt(context.ellipsisParameterDecl()));
        }

        return parameterList;
    }
}
