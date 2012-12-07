package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.TypeParameter;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 10:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class TypeParameterAdapter implements Adapter<TypeParameter, Java7Parser.TypeParameterContext> {
    @Override
    public TypeParameter adapt(Java7Parser.TypeParameterContext context) {
        TypeParameter typeParameter = new TypeParameter();
/*
        typeParameter.setTypeBound(Adapters.getTypeBoundAdapter().adapt(context.typeBound()));
*/
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
