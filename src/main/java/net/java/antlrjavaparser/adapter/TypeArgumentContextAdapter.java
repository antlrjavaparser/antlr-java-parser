package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;
import net.java.antlrjavaparser.api.type.WildcardType;

public class TypeArgumentContextAdapter implements Adapter<Type, Java7Parser.TypeArgumentContext> {
    public Type adapt(Java7Parser.TypeArgumentContext context) {

        /*
            typeArgument
                :   type
                |   QUES ( (EXTENDS | SUPER ) type )?
                ;
         */

        if (context.QUES() != null) {
            WildcardType wildcardType = new WildcardType();

            if (context.type() != null) {
                ReferenceType referenceType = new ReferenceType();

                referenceType.setType(Adapters.getTypeContextAdapter().adapt(context.type()));

                if (context.type().LBRACKET() != null) {
                    referenceType.setArrayCount(context.type().LBRACKET().size());
                }

                if (context.SUPER() != null) {
                    wildcardType.setSuper(referenceType);
                } else if (context.EXTENDS() != null) {
                    wildcardType.setExtends(referenceType);
                }
            }

            return wildcardType;
        } else if (context.type() != null) {
            return Adapters.getTypeContextAdapter().adapt(context.type());
        }

        return null;
    }
}
