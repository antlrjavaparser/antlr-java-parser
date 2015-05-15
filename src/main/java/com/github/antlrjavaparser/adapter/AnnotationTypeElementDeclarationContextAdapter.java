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
import com.github.antlrjavaparser.api.body.BodyDeclaration;

public class AnnotationTypeElementDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.AnnotationTypeElementDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.AnnotationTypeElementDeclarationContext context, AdapterParameters adapterParameters) {

        /*
        annotationTypeElementDeclaration
            :   annotationMethodDeclaration
            |   interfaceFieldDeclaration
            |   normalClassDeclaration
            |   normalInterfaceDeclaration
            |   enumDeclaration
            |   annotationTypeDeclaration
            |   SEMI
            ;
         */

        if (context.annotationMethodDeclaration() != null) {
            return Adapters.getAnnotationMethodDeclarationContextAdapter().adapt(context.annotationMethodDeclaration(), adapterParameters);
        } else if (context.interfaceFieldDeclaration() != null) {
            return Adapters.getInterfaceFieldDeclarationContextAdapter().adapt(context.interfaceFieldDeclaration(), adapterParameters);
        } else if (context.normalClassDeclaration() != null) {
            return Adapters.getNormalClassDeclarationContextAdapter().adapt(context.normalClassDeclaration(), adapterParameters);
        } else if (context.normalInterfaceDeclaration() != null) {
            return Adapters.getNormalInterfaceDeclarationContextAdapter().adapt(context.normalInterfaceDeclaration(), adapterParameters);
        } else if (context.enumDeclaration() != null) {
            return Adapters.getEnumDeclarationContextAdapter().adapt(context.enumDeclaration(), adapterParameters);
        } else if (context.annotationTypeDeclaration() != null) {
            return Adapters.getAnnotationTypeDeclarationContextAdapter().adapt(context.annotationTypeDeclaration(), adapterParameters);
        }

        throw new UnsupportedOperationException("Unknown annotationTypeElementDeclaration");
    }
}
