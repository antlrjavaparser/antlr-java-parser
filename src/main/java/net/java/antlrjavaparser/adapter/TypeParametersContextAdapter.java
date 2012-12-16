package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.TypeParameter;

import java.util.LinkedList;
import java.util.List;

public class TypeParametersContextAdapter implements Adapter<List<TypeParameter>, Java7Parser.TypeParametersContext> {
    public List<TypeParameter> adapt(Java7Parser.TypeParametersContext context) {

        if (context == null) {
            return null;
        }

        List<TypeParameter> typeParameterList = new LinkedList<TypeParameter>();
        for (Java7Parser.TypeParameterContext typeParameterContext : context.typeParameter()) {
            typeParameterList.add(Adapters.getTypeParameterContextAdapter().adapt(typeParameterContext));
        }

        return typeParameterList;
    }
}
