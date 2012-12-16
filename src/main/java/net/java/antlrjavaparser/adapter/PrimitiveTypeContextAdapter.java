package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.PrimitiveType;

public class PrimitiveTypeContextAdapter implements Adapter<PrimitiveType, Java7Parser.PrimitiveTypeContext> {
    public PrimitiveType adapt(Java7Parser.PrimitiveTypeContext context) {

        if (context.BOOLEAN() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Boolean);
        } else if (context.BYTE() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Byte);
        } else if (context.CHAR() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Char);
        } else if (context.DOUBLE() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Double);
        } else if (context.FLOAT() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Float);
        } else if (context.INT() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Int);
        } else if (context.LONG() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Long);
        } else if (context.SHORT() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Short);
        }

        return null;
    }
}
