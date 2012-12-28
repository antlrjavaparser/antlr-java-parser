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

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.*;

public class AnnotationContextAdapter implements Adapter<AnnotationExpr, Java7Parser.AnnotationContext> {
    @Override
    public AnnotationExpr adapt(Java7Parser.AnnotationContext context) {

        if (context.markerAnnotation() != null) {
            return Adapters.getMarkerAnnotationContextAdapter().adapt(context.markerAnnotation());
        } else if (context.normalAnnotation() != null) {
            return Adapters.getNormalAnnotationContextAdapter().adapt(context.normalAnnotation());
        } else if (context.singleElementAnnotation() != null) {
            return Adapters.getSingleElementAnnotationContextAdapter().adapt(context.singleElementAnnotation());
        }

        throw new RuntimeException("Unexpected Annotation Type");
    }
}
