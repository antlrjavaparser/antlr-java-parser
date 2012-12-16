package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.TypeParameter;

public class TypeParameterContextAdapter implements Adapter<TypeParameter, Java7Parser.TypeParameterContext> {
    public TypeParameter adapt(Java7Parser.TypeParameterContext context) {

        TypeParameter typeParameter = new TypeParameter();
        typeParameter.setTypeBound(Adapters.getTypeBoundContextAdapter ().adapt(context.typeBound()));
        typeParameter.setName(context.Identifier().getText());

        return typeParameter;
    }
}
