package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

public class NormalInterfaceDeclarationContextAdapter implements Adapter<ClassOrInterfaceDeclaration, Java7Parser.NormalInterfaceDeclarationContext> {
    public ClassOrInterfaceDeclaration adapt(Java7Parser.NormalInterfaceDeclarationContext context) {

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = new ClassOrInterfaceDeclaration();
        classOrInterfaceDeclaration.setInterface(true);

        // All instances should be classOrInterfaceType
        List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(context.typeList());
        if (typeList != null) {
            List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();
            for (Type type : typeList) {
                ReferenceType referenceType = (ReferenceType)type;
                classOrInterfaceTypeList.add((ClassOrInterfaceType)referenceType.getType());
            }

            classOrInterfaceDeclaration.setExtends(classOrInterfaceTypeList);
        }


        // Set modifiers and annotations
        AdapterUtil.setModifiers(context.modifiers(), classOrInterfaceDeclaration);

        classOrInterfaceDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters()));
        classOrInterfaceDeclaration.setName(context.Identifier().getText());

        return classOrInterfaceDeclaration;
    }

    private boolean hasModifier(TerminalNode modifier) {
        return modifier != null;
    }
}
