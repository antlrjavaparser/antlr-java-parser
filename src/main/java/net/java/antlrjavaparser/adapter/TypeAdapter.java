package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.Type;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class TypeAdapter implements Adapter<Type, Java7Parser.TypeContext> {
    @Override
    public Type adapt(Java7Parser.TypeContext context) {
/*
        if (context == null) {
            return null;
        }

        if (context.classOrInterfaceType() != null) {
            return Adapters.getClassOrInterfaceTypeAdapter().adapt(context.classOrInterfaceType());
        } else {
            return Adapters.getPrimitiveTypeAdapter().adapt(context.primitiveType());
        }
*/
        return null;
    }
}
