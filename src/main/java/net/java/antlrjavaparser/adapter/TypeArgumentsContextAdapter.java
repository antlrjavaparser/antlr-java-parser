package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.Type;

import java.util.LinkedList;
import java.util.List;

public class TypeArgumentsContextAdapter implements Adapter<List<Type>, Java7Parser.TypeArgumentsContext> {
    public List<Type> adapt(Java7Parser.TypeArgumentsContext context) {

        if (context == null) {
            return null;
        }

        List<Type> typeList = new LinkedList<Type>();
        for (Java7Parser.TypeArgumentContext typeArgumentContext : context.typeArgument()) {
            typeList.add(Adapters.getTypeArgumentContextAdapter().adapt(typeArgumentContext));
        }

        return typeList;
    }
}
