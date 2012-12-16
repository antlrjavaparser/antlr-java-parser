package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.Type;

public class TypeContextAdapter implements Adapter<Type, Java7Parser.TypeContext> {
    public Type adapt(Java7Parser.TypeContext context) {

        if (context.classOrInterfaceType() != null) {
            return Adapters.getClassOrInterfaceTypeContextAdapter().adapt(context.classOrInterfaceType());
        } else if (context.primitiveType() != null) {
            return Adapters.getPrimitiveTypeContextAdapter().adapt(context.primitiveType());
        }

        return null;
    }
}
