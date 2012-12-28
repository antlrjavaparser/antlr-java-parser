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
import net.java.antlrjavaparser.api.stmt.Statement;
import net.java.antlrjavaparser.api.stmt.TypeDeclarationStmt;

public class BlockStatementContextAdapter implements Adapter<Statement, Java7Parser.BlockStatementContext> {
    public Statement adapt(Java7Parser.BlockStatementContext context) {

        if (context.classOrInterfaceDeclaration() != null) {
            TypeDeclarationStmt typeDeclarationStmt = new TypeDeclarationStmt();
            typeDeclarationStmt.setTypeDeclaration(Adapters.getClassOrInterfaceDeclarationContextAdapter().adapt(context.classOrInterfaceDeclaration()));
            return typeDeclarationStmt;
        } else if (context.localVariableDeclarationStatement() != null) {
            return Adapters.getLocalVariableDeclarationStatementContextAdapter().adapt(context.localVariableDeclarationStatement());
        } else if (context.statement() != null) {
            return Adapters.getStatementContextAdapter().adapt(context.statement());
        }

        throw new RuntimeException("Unknown statement type");
    }
}
