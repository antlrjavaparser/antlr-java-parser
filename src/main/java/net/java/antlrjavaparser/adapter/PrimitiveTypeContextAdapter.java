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
import net.java.antlrjavaparser.api.type.PrimitiveType;

public class PrimitiveTypeContextAdapter implements Adapter<PrimitiveType, Java7Parser.PrimitiveTypeContext> {
    public PrimitiveType adapt(Java7Parser.PrimitiveTypeContext context) {

        if (context.BOOLEAN() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Boolean);
        } else if (context.BYTE() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Byte);
        } else if (context.CHAR() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Char);
        } else if (context.DOUBLE() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Double);
        } else if (context.FLOAT() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Float);
        } else if (context.INT() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Int);
        } else if (context.LONG() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Long);
        } else if (context.SHORT() != null) {
            return new PrimitiveType(PrimitiveType.Primitive.Short);
        }

        return null;
    }
}
