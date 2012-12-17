package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;

public class TypeContextAdapter implements Adapter<Type, Java7Parser.TypeContext> {
    public Type adapt(Java7Parser.TypeContext context) {

        if (context.classOrInterfaceType() != null) {
            ReferenceType referenceType = new ReferenceType();
            referenceType.setType(Adapters.getClassOrInterfaceTypeContextAdapter().adapt(context.classOrInterfaceType()));
            if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
                referenceType.setArrayCount(context.LBRACKET().size());
            }
            return referenceType;
        } else if (context.primitiveType() != null) {
            ReferenceType referenceType = new ReferenceType();
            referenceType.setType(Adapters.getPrimitiveTypeContextAdapter().adapt(context.primitiveType()));
            if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
                referenceType.setArrayCount(context.LBRACKET().size());
            }
            return referenceType;
        }

        return null;
    }
}
