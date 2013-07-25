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
import com.github.antlrjavaparser.api.ImportDeclaration;

public class ImportDeclarationContextAdapter implements Adapter<ImportDeclaration, Java7Parser.ImportDeclarationContext> {
    public ImportDeclaration adapt(Java7Parser.ImportDeclarationContext context, AdapterParameters adapterParameters) {

        ImportDeclaration importDeclaration = new ImportDeclaration();
        AdapterUtil.setComments(importDeclaration, context, adapterParameters);
        AdapterUtil.setPosition(importDeclaration, context);

        importDeclaration.setStatic(context.STATIC() != null);
        importDeclaration.setName(AdapterUtil.qualifiedName(context.Identifier()));
        importDeclaration.setAsterisk(context.STAR() != null);

        return importDeclaration;
    }
}
