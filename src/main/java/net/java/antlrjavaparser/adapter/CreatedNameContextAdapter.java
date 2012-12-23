package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.Type;

public class CreatedNameContextAdapter implements Adapter<Type, Java7Parser.CreatedNameContext> {
    public Type adapt(Java7Parser.CreatedNameContext context) {

        if (context.classOrInterfaceType() != null) {
            return Adapters.getClassOrInterfaceTypeContextAdapter().adapt(context.classOrInterfaceType());
        } else if (context.primitiveType() != null) {
            return Adapters.getPrimitiveTypeContextAdapter().adapt(context.primitiveType());
        }

        throw new RuntimeException("Unknown created name type");
    }
}
