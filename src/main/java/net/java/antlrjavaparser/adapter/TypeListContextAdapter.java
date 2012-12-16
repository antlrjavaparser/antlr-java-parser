package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.Type;

import java.util.LinkedList;
import java.util.List;

public class TypeListContextAdapter implements Adapter<List<Type>, Java7Parser.TypeListContext> {
    public List<Type> adapt(Java7Parser.TypeListContext context) {

        if (context == null) {
            return null;
        }

        List<Type> typeList = new LinkedList<Type>();
        for (Java7Parser.TypeContext typeContext : context.type()) {
            typeList.add(Adapters.getTypeContextAdapter().adapt(typeContext));
        }

        return typeList;
    }
}
