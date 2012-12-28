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
import com.github.antlrjavaparser.api.type.ReferenceType;

public class TypeContextAdapter implements Adapter<ReferenceType, Java7Parser.TypeContext> {
    public ReferenceType adapt(Java7Parser.TypeContext context) {

        if (context.classOrInterfaceType() != null) {
            ReferenceType referenceType = new ReferenceType();
            referenceType.setType(Adapters.getClassOrInterfaceTypeContextAdapter().adapt(context.classOrInterfaceType()));
            if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
                referenceType.setArrayCount(context.LBRACKET().size());
            }
            return referenceType;
        } else if (context.primitiveType() != null) {
            ReferenceType referenceType = new ReferenceType();
            referenceType.setType(Adapters.getPrimitiveTypeContextAdapter().adapt(context.primitiveType()));
            if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
                referenceType.setArrayCount(context.LBRACKET().size());
            }
            return referenceType;
        }

        return null;
    }
}
