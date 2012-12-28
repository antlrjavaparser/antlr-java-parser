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

package net.java.antlrjavaparser;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.Java7ParserBaseListener;
import net.java.antlrjavaparser.adapter.Adapters;
import net.java.antlrjavaparser.api.CompilationUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Mike De Haan
 * Date: 11/28/12
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompilationUnitListener extends Java7ParserBaseListener {

    private CompilationUnit compilationUnit;

    @Override
    public void exitCompilationUnit(Java7Parser.CompilationUnitContext ctx) {
        compilationUnit = Adapters.getCompilationUnitContextAdapter().adapt(ctx);
    }


    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }
}
