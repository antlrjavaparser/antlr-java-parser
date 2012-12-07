package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 9:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class TypeBoundAdapter implements Adapter<List<ClassOrInterfaceType>, Object> {
    @Override
    public List<ClassOrInterfaceType> adapt(Object context) {

        List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();
/*
        if (context.typeVariable() != null) {
            ClassOrInterfaceType classOrInterfaceType = new ClassOrInterfaceType();
            classOrInterfaceType.setName(context.typeVariable().Identifier().getText());
            classOrInterfaceTypeList.add(classOrInterfaceType);
        } else if (context.classOrInterfaceType() != null) {

            ClassOrInterfaceType classOrInterfaceType = Adapters.getClassOrInterfaceTypeAdapter().adapt(context.classOrInterfaceType());
            classOrInterfaceTypeList.add(classOrInterfaceType);

            for (Java7Parser.InterfaceTypeContext interfaceTypeContext : context.interfaceType()) {
                ClassOrInterfaceType interfaceType = Adapters.getInterfaceTypeAdapter().adapt(interfaceTypeContext);
                classOrInterfaceTypeList.add(interfaceType);
            }
        }

        return classOrInterfaceTypeList;  //To change body of implemented methods use File | Settings | File Templates.

        */

        return null;
    }
}
