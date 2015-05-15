/*
 * Copyright (C) 2015 Julio Vilmar Gesser and Mike DeHaan
 *
 * This file is part of antlr-java-parser.
 *
 * antlr-java-parser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * antlr-java-parser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.body.ModifierSet;
import com.github.antlrjavaparser.api.body.VariableDeclarator;
import com.github.antlrjavaparser.api.expr.AnnotationExpr;
import com.github.antlrjavaparser.api.expr.VariableDeclarationExpr;

import java.util.LinkedList;
import java.util.List;

public class LocalVariableDeclarationContextAdapter implements Adapter<VariableDeclarationExpr, Java7Parser.LocalVariableDeclarationContext> {
    public VariableDeclarationExpr adapt(Java7Parser.LocalVariableDeclarationContext context, AdapterParameters adapterParameters) {

        VariableDeclarationExpr variableDeclarationExpr = new VariableDeclarationExpr();
        AdapterUtil.setComments(variableDeclarationExpr, context, adapterParameters);
        AdapterUtil.setPosition(variableDeclarationExpr, context);

        int modifiers = 0;
        List<AnnotationExpr> annotations = new LinkedList<AnnotationExpr>();
        if (context.variableModifiers() != null) {
            for (Java7Parser.AnnotationContext annotationContext : context.variableModifiers().annotation()) {
                AnnotationExpr annotationExpr = Adapters.getAnnotationContextAdapter().adapt(annotationContext, adapterParameters);
                annotations.add(annotationExpr);
            }

            if (context.variableModifiers().FINAL() != null) {
                modifiers |= ModifierSet.FINAL;
            }

            variableDeclarationExpr.setModifiers(modifiers);
        }


        List<VariableDeclarator> variableDeclaratorList = new LinkedList<VariableDeclarator>();
        for (Java7Parser.VariableDeclaratorContext variableDeclaratorContext : context.variableDeclarator()) {
            variableDeclaratorList.add(Adapters.getVariableDeclaratorContextAdapter().adapt(variableDeclaratorContext, adapterParameters));
        }
        variableDeclarationExpr.setVars(variableDeclaratorList);
        variableDeclarationExpr.setAnnotations(annotations);
        variableDeclarationExpr.setType(Adapters.getTypeContextAdapter().adapt(context.type(), adapterParameters));

        return variableDeclarationExpr;
    }
}
