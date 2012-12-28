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
import net.java.antlrjavaparser.api.stmt.BlockStmt;
import net.java.antlrjavaparser.api.stmt.Statement;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/16/12
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConstructorBlockContextAdapter implements Adapter<BlockStmt, Java7Parser.ConstructorBlockContext> {
    @Override
    public BlockStmt adapt(Java7Parser.ConstructorBlockContext context) {

        /*
        constructorBlock
            :    LBRACE explicitConstructorInvocation? blockStatement* RBRACE
            ;
         */


        BlockStmt blockStmt = new BlockStmt();

        List<Statement> statementList = new LinkedList<Statement>();

        if (context.explicitConstructorInvocation() != null) {
            statementList.add(Adapters.getExplicitConstructorInvocationContextAdapter().adapt(context.explicitConstructorInvocation()));
        }

        if (context.blockStatement() != null && context.blockStatement().size() > 0) {
            for (Java7Parser.BlockStatementContext blockStatementContext : context.blockStatement()) {
                statementList.add(Adapters.getBlockStatementContextAdapter().adapt(blockStatementContext));
            }
        }

        blockStmt.setStmts(statementList);

        return blockStmt;
    }
}
