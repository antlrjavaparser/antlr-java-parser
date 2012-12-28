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
import com.github.antlrjavaparser.api.type.Type;
import com.github.antlrjavaparser.api.type.WildcardType;

public class TypeArgumentContextAdapter implements Adapter<Type, Java7Parser.TypeArgumentContext> {
    public Type adapt(Java7Parser.TypeArgumentContext context) {

        /*
            typeArgument
                :   type
                |   QUES ( (EXTENDS | SUPER ) type )?
                ;
         */

        if (context.QUES() != null) {
            WildcardType wildcardType = new WildcardType();

            if (context.type() != null) {
                ReferenceType referenceType = new ReferenceType();

                referenceType.setType(Adapters.getTypeContextAdapter().adapt(context.type()));

                if (context.type().LBRACKET() != null) {
                    referenceType.setArrayCount(context.type().LBRACKET().size());
                }

                if (context.SUPER() != null) {
                    wildcardType.setSuper(referenceType);
                } else if (context.EXTENDS() != null) {
                    wildcardType.setExtends(referenceType);
                }
            }

            return wildcardType;
        } else if (context.type() != null) {
            return Adapters.getTypeContextAdapter().adapt(context.type());
        }

        return null;
    }
}
