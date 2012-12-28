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

package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

public class AnnotationTypeElementDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.AnnotationTypeElementDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.AnnotationTypeElementDeclarationContext context) {

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
            return Adapters.getAnnotationMethodDeclarationContextAdapter().adapt(context.annotationMethodDeclaration());
        } else if (context.interfaceFieldDeclaration() != null) {
            return Adapters.getInterfaceFieldDeclarationContextAdapter().adapt(context.interfaceFieldDeclaration());
        } else if (context.normalClassDeclaration() != null) {
            return Adapters.getNormalClassDeclarationContextAdapter().adapt(context.normalClassDeclaration());
        } else if (context.normalInterfaceDeclaration() != null) {
            return Adapters.getNormalInterfaceDeclarationContextAdapter().adapt(context.normalInterfaceDeclaration());
        } else if (context.enumDeclaration() != null) {
            return Adapters.getEnumDeclarationContextAdapter().adapt(context.enumDeclaration());
        } else if (context.annotationTypeDeclaration() != null) {
            return Adapters.getAnnotationTypeDeclarationContextAdapter().adapt(context.annotationTypeDeclaration());
        }

        throw new UnsupportedOperationException("Unknown annotationTypeElementDeclaration");
    }
}
