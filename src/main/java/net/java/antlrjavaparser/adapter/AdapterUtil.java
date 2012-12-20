package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.*;
import net.java.antlrjavaparser.api.expr.AnnotationExpr;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import net.java.antlrjavaparser.api.type.Type;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/4/12
 * Time: 7:07 PM
 * To change this template use File | Settings | File Templates.
 */
public final class AdapterUtil {
    private AdapterUtil() {

    }

    public static String dottedIdentifier(List<TerminalNode> terminalNodeList) {
        String identifier = "";

        for (int i = 0; i < terminalNodeList.size(); i++) {
            identifier += (i > 0 ? "." : "") + terminalNodeList.get(i).getText();
        }

        return identifier;
    }

    public static void setModifiers(Java7Parser.ModifiersContext modifiersContext, BodyDeclaration typeDeclaration) {
        if (modifiersContext != null && modifiersContext.modifier() != null) {
            setModifiers(modifiersContext.modifier(), typeDeclaration);
        }
    }

    public static void setModifiers(List<Java7Parser.ModifierContext> modifierList, BodyDeclaration typeDeclaration) {
        int modifiers = 0;
        List<AnnotationExpr> annotations = new LinkedList<AnnotationExpr>();
        for (Java7Parser.ModifierContext modifierContext : modifierList) {
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

        typeDeclaration.setAnnotations(annotations);

        if (typeDeclaration instanceof TypeDeclaration) {
            ((TypeDeclaration)typeDeclaration).setModifiers(modifiers);
        } else if (typeDeclaration instanceof MethodDeclaration) {
            ((MethodDeclaration)typeDeclaration).setModifiers(modifiers);
        } else if (typeDeclaration instanceof ConstructorDeclaration) {
            ((ConstructorDeclaration)typeDeclaration).setModifiers(modifiers);
        } else if (typeDeclaration instanceof FieldDeclaration) {
            ((FieldDeclaration)typeDeclaration).setModifiers(modifiers);
        }
    }

    private static boolean hasModifier(TerminalNode modifier) {
        return modifier != null;
    }

    public static List<ClassOrInterfaceType> convertTypeList(List<Type> typeList) {

        if (typeList == null) {
            return null;
        }

        List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();
        for (Type type : typeList) {
            classOrInterfaceTypeList.add((ClassOrInterfaceType)type);
        }

        return classOrInterfaceTypeList;
    }

    /**
     *
     * @param adapter
     * @param contextList
     * @param operator
     * @param <C> Context Type
     * @return
     */
    public static <C> Expression handleExpression(Adapter<Expression, C> adapter, List<C> contextList, BinaryExpr.Operator operator) {
        Expression expression = adapter.adapt(contextList.get(0));

        // This expression represents more than one consecutive OR expression
        if (contextList.size() > 1) {
            BinaryExpr root = new BinaryExpr();

            root.setLeft(expression);
            root.setOperator(operator);
            BinaryExpr currentExpression = root;

            for (int i = 1; i < contextList.size(); i++) {
                currentExpression.setRight(adapter.adapt(contextList.get(i)));

                // On the last one, do not create a tail.
                if (i < contextList.size() - 1) {
                    BinaryExpr binaryExpr = new BinaryExpr();
                    binaryExpr.setLeft(currentExpression);
                    binaryExpr.setOperator(operator);
                    currentExpression = binaryExpr;
                }
            }

            return currentExpression;
        }

        return expression;
    }
}
