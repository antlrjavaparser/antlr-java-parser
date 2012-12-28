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
import net.java.antlrjavaparser.api.body.BodyDeclaration;
import net.java.antlrjavaparser.api.body.EmptyMemberDeclaration;
import net.java.antlrjavaparser.api.body.EmptyTypeDeclaration;
import net.java.antlrjavaparser.api.body.InitializerDeclaration;

public class ClassBodyDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.ClassBodyDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.ClassBodyDeclarationContext context) {

        if (context.block() != null) {
            InitializerDeclaration initializerDeclaration = new InitializerDeclaration();
            initializerDeclaration.setStatic(context.STATIC() != null);
            initializerDeclaration.setBlock(Adapters.getBlockContextAdapter().adapt(context.block()));
            return initializerDeclaration;
        } else if (context.memberDecl() != null) {
            return Adapters.getMemberDeclContextAdapter().adapt(context.memberDecl());
        } else if (context.SEMI() != null) {
            return new EmptyMemberDeclaration();
        }

        return null;
    }
}
