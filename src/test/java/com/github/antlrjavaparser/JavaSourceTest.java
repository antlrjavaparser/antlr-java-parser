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
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: Mike De Haan
 * Date: 12/12/12
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class JavaSourceTest {

    @Test
    public void testValidJavaFiles() {
        //URL url = this.getClass().getResource("/testFiles/SimpleTest.java.txt");
        //File file = new File(url.getFile());

        if (true) {
            return;
        }

        File testDirectory = new File("/tmp/java8-src");

        listFiles(testDirectory, new Listener() {

            // Change to true when skipping files
            private boolean skip = false;

            public void enterFile(File file) {

                if (file.getPath().endsWith("\\tmp\\java8-src\\java\\lang\\invoke\\MethodHandleInfo.java")) {
                    skip = false;
                }

                if (file.getName().endsWith(".java") && !skip) {

                    try {
                        System.out.println("Parsing file: " + file.getPath());

                        FileInputStream fileInputStream = new FileInputStream(file);
                        CompilationUnit compilationUnit = JavaParser.parse(fileInputStream, new ParserConfigurator() {
                            public void configure(Java7Parser parser) {
                                parser.removeErrorListeners();
                                parser.addErrorListener(new DiagnosticErrorListener());
                                parser.setErrorHandler(new BailErrorStrategy());
                            }
                        });
                    } catch (IOException e) {
                        e.printStackTrace();
                        fail();
                    }
                }
            }
        });

    }

    private void listFiles(File directory, Listener listener) {
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                listFiles(file, listener);
            } else {
                listener.enterFile(file);
            }
        }
    }

    private interface Listener {
        void enterFile(File file);
    }
}
