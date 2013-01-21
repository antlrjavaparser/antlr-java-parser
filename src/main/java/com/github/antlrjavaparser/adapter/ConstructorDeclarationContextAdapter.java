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
import com.github.antlrjavaparser.api.body.ConstructorDeclaration;

public class ConstructorDeclarationContextAdapter implements Adapter<ConstructorDeclaration, Java7Parser.ConstructorDeclarationContext> {
    @Override
    public ConstructorDeclaration adapt(Java7Parser.ConstructorDeclarationContext context, AdapterParameters adapterParameters) {

        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), constructorDeclaration, adapterParameters);

        constructorDeclaration.setName(context.Identifier().getText());
        constructorDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters(), adapterParameters));
        constructorDeclaration.setBlock(Adapters.getConstructorBlockContextAdapter().adapt(context.constructorBlock(), adapterParameters));
        constructorDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList(), adapterParameters));

        return constructorDeclaration;
    }
}
