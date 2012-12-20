package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;
import net.java.antlrjavaparser.api.body.TypeDeclaration;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;

import java.util.LinkedList;
import java.util.List;

public class NormalClassDeclarationContextAdapter implements Adapter<TypeDeclaration, Java7Parser.NormalClassDeclarationContext> {
    public TypeDeclaration adapt(Java7Parser.NormalClassDeclarationContext context) {

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = new ClassOrInterfaceDeclaration();

        AdapterUtil.setModifiers(context.modifiers(), classOrInterfaceDeclaration);
        classOrInterfaceDeclaration.setInterface(false);
        classOrInterfaceDeclaration.setName(context.Identifier().getText());

        if (context.type() != null) {
            List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();
            ReferenceType referenceType = (ReferenceType)Adapters.getTypeContextAdapter().adapt(context.type());
            ClassOrInterfaceType extendsClassOrInterfaceType = (ClassOrInterfaceType)referenceType.getType();
            classOrInterfaceTypeList.add(extendsClassOrInterfaceType);
            classOrInterfaceDeclaration.setExtends(classOrInterfaceTypeList);
        }

        List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(context.typeList());
        classOrInterfaceDeclaration.setImplements(AdapterUtil.convertTypeList(typeList));
        classOrInterfaceDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters()));

        classOrInterfaceDeclaration.setMembers(Adapters.getClassBodyContextAdapter().adapt(context.classBody()));

        return classOrInterfaceDeclaration;
    }
}
