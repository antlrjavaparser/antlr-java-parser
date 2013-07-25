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
import com.github.antlrjavaparser.api.stmt.Statement;
import com.github.antlrjavaparser.api.stmt.TypeDeclarationStmt;

public class BlockStatementContextAdapter implements Adapter<Statement, Java7Parser.BlockStatementContext> {
    public Statement adapt(Java7Parser.BlockStatementContext context, AdapterParameters adapterParameters) {

        if (context.classOrInterfaceDeclaration() != null) {
            TypeDeclarationStmt typeDeclarationStmt = new TypeDeclarationStmt();
            AdapterUtil.setComments(typeDeclarationStmt, context.classOrInterfaceDeclaration(), adapterParameters);
            AdapterUtil.setPosition(typeDeclarationStmt, context);
            typeDeclarationStmt.setTypeDeclaration(Adapters.getClassOrInterfaceDeclarationContextAdapter().adapt(context.classOrInterfaceDeclaration(), adapterParameters));
            return typeDeclarationStmt;
        } else if (context.localVariableDeclarationStatement() != null) {
            return Adapters.getLocalVariableDeclarationStatementContextAdapter().adapt(context.localVariableDeclarationStatement(), adapterParameters);
        } else if (context.statement() != null) {
            return Adapters.getStatementContextAdapter().adapt(context.statement(), adapterParameters);
        }

        throw new RuntimeException("Unknown statement type");
    }
}
