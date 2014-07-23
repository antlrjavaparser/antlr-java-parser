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

package com.github.antlrjavaparser;

import com.github.antlrjavaparser.api.CompilationUnit;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Mike De Haan
 * Date: 12/27/12
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class JavaParser {

    private JavaParser() {
        // hide the constructor
    }

    /**
     * Parses the Java code contained in the {@link InputStream} and returns
     * a {@link CompilationUnit} that represents it.
     * @param in {@link InputStream} containing Java source code
     * @return CompilationUnit representing the Java source code
     */
    public static CompilationUnit parse(InputStream in) throws IOException, ParseException {
        Java7Lexer lex = new Java7Lexer(new ANTLRInputStream(in));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Java7Parser parser = new Java7Parser(tokens);

        // Define new cache
        PredictionContextCache cache = new PredictionContextCache(); //parser.getInterpreter().getSharedContextCache();

        // Define new/clean DFA array
        DFA [] decisionToDFA = new DFA[parser.getATN().getNumberOfDecisions()];

        parser.setInterpreter(new ParserATNSimulator(parser, parser.getATN(), decisionToDFA, cache));

        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();

        // Fills out the compilationUnit object
        CompilationUnitListener listener = new CompilationUnitListener(tokens);
        walker.walk(listener, tree);
        return listener.getCompilationUnit();
    }

    /**
     * Parses the Java code contained in a {@link File} and returns
     * a {@link CompilationUnit} that represents it.
     * @param file {@link File} containing Java source code
     * @return CompilationUnit representing the Java source code
     * @throws IOException
     */
    public static CompilationUnit parse(File file) throws IOException, ParseException {
        return parse(new FileInputStream(file));
    }

    /**
     * Parses a UTF-8 encoded string as java source.
     *
     * @param javaSource
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public static CompilationUnit parse(String javaSource) throws IOException, ParseException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(javaSource.getBytes("UTF-8"));
        return parse(inputStream);
    }
}
