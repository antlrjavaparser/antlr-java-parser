package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;
import net.java.antlrjavaparser.api.body.ModifierSet;
import net.java.antlrjavaparser.api.body.TypeDeclaration;
import net.java.antlrjavaparser.api.expr.AnnotationExpr;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

public class NormalClassDeclarationContextAdapter implements Adapter<TypeDeclaration, Java7Parser.NormalClassDeclarationContext> {
    public TypeDeclaration adapt(Java7Parser.NormalClassDeclarationContext context) {

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = new ClassOrInterfaceDeclaration();

        int modifiers = 0;
        List<AnnotationExpr> annotations = new LinkedList<AnnotationExpr>();
        for (Java7Parser.ModifierContext modifierContext : context.modifiers().modifier()) {
            if (hasModifier(modifierContext.PUBLIC())) {
                modifiers |= ModifierSet.PUBLIC;
            }

            if (hasModifier(modifierContext.PROTECTED())) {
                modifiers |= ModifierSet.PROTECTED;
            }

            if (hasModifier(modifierContext.PRIVATE())) {
                modifiers |= ModifierSet.PRIVATE;
            }

            if (hasModifier(modifierContext.ABSTRACT())) {
                modifiers |= ModifierSet.ABSTRACT;
            }

            if (hasModifier(modifierContext.STATIC())) {
                modifiers |= ModifierSet.STATIC;
            }

            if (hasModifier(modifierContext.FINAL())) {
                modifiers |= ModifierSet.FINAL;
            }

            if (hasModifier(modifierContext.STRICTFP())) {
                modifiers |= ModifierSet.STRICTFP;
            }

            if (modifierContext.annotation() != null) {
                AnnotationExpr annotationExpr = Adapters.getAnnotationContextAdapter().adapt(modifierContext.annotation());
                annotations.add(annotationExpr);
            }
        }

        classOrInterfaceDeclaration.setAnnotations(annotations);
        classOrInterfaceDeclaration.setModifiers(modifiers);
        classOrInterfaceDeclaration.setInterface(false);
        classOrInterfaceDeclaration.setName(context.Identifier().getText());

        // Extends
        if (context.type() != null) {
            List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();
            ClassOrInterfaceType extendsClassOrInterfaceType = (ClassOrInterfaceType)Adapters.getTypeContextAdapter().adapt(context.type());
            classOrInterfaceTypeList.add(extendsClassOrInterfaceType);
            classOrInterfaceDeclaration.setExtends(classOrInterfaceTypeList);
        }

        //classOrInterfaceDeclaration.getExtends()

        return classOrInterfaceDeclaration;
    }

    private boolean hasModifier(TerminalNode modifier) {
        return modifier != null;
    }
}
