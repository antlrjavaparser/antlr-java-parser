/*
 * This file is part of antlr-java-parser.
 *
 *     antlr-java-parser is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     antlr-java-parser is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.body.AnnotationMemberDeclaration;
import com.github.antlrjavaparser.api.body.BodyDeclaration;
import com.github.antlrjavaparser.api.body.CatchParameter;
import com.github.antlrjavaparser.api.body.ConstructorDeclaration;
import com.github.antlrjavaparser.api.body.FieldDeclaration;
import com.github.antlrjavaparser.api.body.MethodDeclaration;
import com.github.antlrjavaparser.api.body.ModifierSet;
import com.github.antlrjavaparser.api.body.Parameter;
import com.github.antlrjavaparser.api.body.Resource;
import com.github.antlrjavaparser.api.body.TypeDeclaration;
import com.github.antlrjavaparser.api.expr.AnnotationExpr;
import com.github.antlrjavaparser.api.expr.BinaryExpr;
import com.github.antlrjavaparser.api.expr.Expression;
import com.github.antlrjavaparser.api.type.ClassOrInterfaceType;
import com.github.antlrjavaparser.api.type.ReferenceType;
import com.github.antlrjavaparser.api.type.Type;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mike De Haan
 * Date: 12/4/12
 * Time: 7:07 PM
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

    public static void setVariableModifiers(Java7Parser.VariableModifiersContext context, Resource resource) {
        List<AnnotationExpr> annotations = getAnnotations(context);

        int modifiers = 0;
        if (hasModifier(context.FINAL())) {
            modifiers |= ModifierSet.FINAL;
        }

        resource.setAnnotations(annotations);
        resource.setModifiers(modifiers);
    }

    public static void setVariableModifiers(Java7Parser.VariableModifiersContext context, Parameter parameter) {
        List<AnnotationExpr> annotations = getAnnotations(context);

        int modifiers = 0;
        if (hasModifier(context.FINAL())) {
            modifiers |= ModifierSet.FINAL;
        }

        parameter.setAnnotations(annotations);
        parameter.setModifiers(modifiers);
    }

    public static void setVariableModifiers(Java7Parser.VariableModifiersContext context, CatchParameter parameter) {
        /*
        variableModifiers
        :   annotation* FINAL? annotation*
        ;
        */
        int modifiers = 0;
        List<AnnotationExpr> annotations = getAnnotations(context);

        if (hasModifier(context.FINAL())) {
            modifiers |= ModifierSet.FINAL;
        }

        parameter.setAnnotations(annotations);
        parameter.setModifiers(modifiers);
    }

    private static List<AnnotationExpr> getAnnotations(Java7Parser.VariableModifiersContext context) {
        List<AnnotationExpr> annotations = new LinkedList<AnnotationExpr>();
        for (Java7Parser.AnnotationContext annotationContext : context.annotation()) {
            AnnotationExpr annotationExpr = Adapters.getAnnotationContextAdapter().adapt(annotationContext);
            annotations.add(annotationExpr);
        }
        return annotations;
    }

    private static void setModifiersByType(BodyDeclaration bodyDeclaration, int modifiers) {
        if (bodyDeclaration instanceof TypeDeclaration) {
            ((TypeDeclaration)bodyDeclaration).setModifiers(modifiers);
        } else if (bodyDeclaration instanceof MethodDeclaration) {
            ((MethodDeclaration)bodyDeclaration).setModifiers(modifiers);
        } else if (bodyDeclaration instanceof ConstructorDeclaration) {
            ((ConstructorDeclaration)bodyDeclaration).setModifiers(modifiers);
        } else if (bodyDeclaration instanceof FieldDeclaration) {
            ((FieldDeclaration)bodyDeclaration).setModifiers(modifiers);
        } else if (bodyDeclaration instanceof AnnotationMemberDeclaration) {
            ((AnnotationMemberDeclaration)bodyDeclaration).setModifiers(modifiers);
        } else {
            throw new RuntimeException("Unknown type to set modifiers: " + bodyDeclaration.getClass().getName());
        }
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

        setModifiersByType(typeDeclaration, modifiers);
    }

    private static boolean hasModifier(TerminalNode modifier) {
        return modifier != null;
    }

    public static List<ClassOrInterfaceType> convertTypeList(List<Type> typeList) {

        if (typeList == null) {
            return null;
            //throw new RuntimeException("typeList cannot be null");
        }

        List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();
        for (Type type : typeList) {

            if (type instanceof ReferenceType) {
                ReferenceType referenceType = (ReferenceType)type;
                classOrInterfaceTypeList.add((ClassOrInterfaceType)referenceType.getType());
            } else {
                classOrInterfaceTypeList.add((ClassOrInterfaceType)type);
            }
        }

        return classOrInterfaceTypeList;
    }

    /**
     *
     * @param adapter
     * @param contextList
     * @param operator
     * @param <C> Context Type
     * @return Expression
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

    public static <T> List<T> singleElementList(T element) {
        List<T> newElementList = new LinkedList<T>();
        newElementList.add(element);
        return newElementList;
    }
}
