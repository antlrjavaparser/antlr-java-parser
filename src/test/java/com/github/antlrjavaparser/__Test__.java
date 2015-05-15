/*
 * Copyright (C) 2015 Julio Vilmar Gesser and Mike DeHaan
 *
 * This file is part of antlr-java-parser.
 *
 * antlr-java-parser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * antlr-java-parser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.github.antlrjavaparser;

import com.github.antlrjavaparser.api.CompilationUnit;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.InputStream;


public class __Test__ {

    private CompilationUnit compilationUnit = new CompilationUnit();

    public static void main(String args[]) throws Exception {
        __Test__ tester = new __Test__();
        tester.test();
    }

    public void test() throws Exception {
        InputStream in = getClass().getClassLoader().getResourceAsStream("testFiles/SimpleTest.java.txt");

        if (in == null) {
            System.err.println("Unable to find test file.");
            return;
        }

        Java7Lexer lex = new Java7Lexer(new ANTLRInputStream(in));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        //printTokens(lex);

        Java7Parser parser = new Java7Parser(tokens);
        long start = System.currentTimeMillis();

        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        ParseTree tree = null;

        tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();

        // Fills out the compilationUnit object
        CompilationUnitListener listener = new CompilationUnitListener(tokens);
        walker.walk(listener, tree);
        compilationUnit = listener.getCompilationUnit();

        System.out.println("==========================================================================");

        long end = System.currentTimeMillis();

        System.out.println((end - start) + "ms");

        System.out.println(compilationUnit.toString());
    }

    private void printTokens(Java7Lexer lex) {
        // Print tokens
        Token token = null;
        while ((token = lex.nextToken()) != null) {

            if (token.getType() == Token.EOF) {
                break;
            }

            if (token.getChannel() == Token.HIDDEN_CHANNEL) {
                continue;
            }

            System.out.println("Token: [" + token.getText() + "][" + token.getType() + "]");
        }

        lex.reset();
    }
}
