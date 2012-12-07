package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.EnumDeclaration;
import net.java.antlrjavaparser.api.body.ModifierSet;
import net.java.antlrjavaparser.api.body.TypeDeclaration;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/3/12
 * Time: 11:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class TypeDeclarationAdapter implements Adapter<TypeDeclaration, Java7Parser.TypeDeclarationContext> {
    @Override
    public TypeDeclaration adapt(Java7Parser.TypeDeclarationContext context) {
/*
        TypeDeclaration typeDeclaration = null;

        // Determine which Type we're dealing with
        if (context.classDeclaration() != null) {
            typeDeclaration = Adapters.getClassDeclarationAdapter().adapt(context.classDeclaration());
        } else if (context.enumDeclaration() != null) {
            EnumDeclaration enumDeclaration = new EnumDeclaration();
            enumDeclaration.setName(context.enumDeclaration().Identifier().getText());
            typeDeclaration = enumDeclaration;
        } else if (context.interfaceDeclaration() != null) {
            typeDeclaration = Adapters.getInterfaceDeclarationAdapter().adapt(context.interfaceDeclaration());
        }

        int modifiers = 0;

        for (Java7Parser.ClassOrInterfaceModifierContext classOrInterfaceModifierContext : context.classOrInterfaceModifier()) {
            if (hasModifier(classOrInterfaceModifierContext.PUBLIC())) {
                modifiers |= ModifierSet.PUBLIC;
            }

            if (hasModifier(classOrInterfaceModifierContext.PROTECTED())) {
                modifiers |= ModifierSet.PROTECTED;
            }

            if (hasModifier(classOrInterfaceModifierContext.PRIVATE())) {
                modifiers |= ModifierSet.PRIVATE;
            }

            if (hasModifier(classOrInterfaceModifierContext.ABSTRACT())) {
                modifiers |= ModifierSet.ABSTRACT;
            }

            if (hasModifier(classOrInterfaceModifierContext.STATIC())) {
                modifiers |= ModifierSet.STATIC;
            }

            if (hasModifier(classOrInterfaceModifierContext.FINAL())) {
                modifiers |= ModifierSet.FINAL;
            }

            if (hasModifier(classOrInterfaceModifierContext.STRICTFP())) {
                modifiers |= ModifierSet.STRICTFP;
            }
        }

        typeDeclaration.setModifiers(modifiers);

        return typeDeclaration;
        */

        return null;
    }

    private boolean hasModifier(TerminalNode modifier) {
        return modifier != null;
    }
}
