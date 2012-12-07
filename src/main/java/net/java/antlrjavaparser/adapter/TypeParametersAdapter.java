package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.TypeParameter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 9:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class TypeParametersAdapter implements Adapter<List<TypeParameter>, Java7Parser.TypeParametersContext>{
    @Override
    public List<TypeParameter> adapt(Java7Parser.TypeParametersContext context) {
        if (context.typeParameter() == null) {
            return null;
        }

        List<TypeParameter> typeParameterList = new ArrayList<TypeParameter>();

        for (Java7Parser.TypeParameterContext typeParameterContext : context.typeParameter()) {
            typeParameterList.add(Adapters.getTypeParameterAdapter().adapt(typeParameterContext));
        }

        return typeParameterList;
    }
}
