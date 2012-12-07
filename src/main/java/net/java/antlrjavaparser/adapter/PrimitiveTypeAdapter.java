package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.type.PrimitiveType;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 10:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrimitiveTypeAdapter implements Adapter<PrimitiveType, Object> {
    @Override
    public PrimitiveType adapt(Object context) {
/*
        PrimitiveType primitiveType = new PrimitiveType();

        if (context.BOOLEAN() != null) {
            primitiveType.setType(PrimitiveType.Primitive.Boolean);
        } else if (context.BYTE() != null) {
            primitiveType.setType(PrimitiveType.Primitive.Byte);
        } else if (context.CHAR() != null) {
            primitiveType.setType(PrimitiveType.Primitive.Char);
        } else if (context.DOUBLE() != null) {
            primitiveType.setType(PrimitiveType.Primitive.Double);
        } else if (context.FLOAT() != null) {
            primitiveType.setType(PrimitiveType.Primitive.Float);
        } else if (context.INT() != null) {
            primitiveType.setType(PrimitiveType.Primitive.Int);
        } else if (context.LONG() != null) {
            primitiveType.setType(PrimitiveType.Primitive.Long);
        } else if (context.SHORT() != null) {
            primitiveType.setType(PrimitiveType.Primitive.Short);
        }

        return primitiveType;  //To change body of implemented methods use File | Settings | File Templates.
        */

        return null;
    }
}
