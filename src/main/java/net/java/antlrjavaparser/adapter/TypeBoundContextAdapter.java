package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import net.java.antlrjavaparser.api.type.Type;

import java.util.LinkedList;
import java.util.List;

public class TypeBoundContextAdapter implements Adapter<List<ClassOrInterfaceType>, Java7Parser.TypeBoundContext> {
    public List<ClassOrInterfaceType> adapt(Java7Parser.TypeBoundContext context) {

        if (context == null) {
            return null;
        }

        List<Type> typeList = new LinkedList<Type>();
        List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();

        for (Java7Parser.TypeContext typeContext : context.type()) {
            typeList.add(Adapters.getTypeContextAdapter().adapt(typeContext));
        }

        // All instances should be classOrInterfaceType
        for (Type type : typeList) {
            classOrInterfaceTypeList.add((ClassOrInterfaceType)type);
        }

        return classOrInterfaceTypeList;
    }
}
