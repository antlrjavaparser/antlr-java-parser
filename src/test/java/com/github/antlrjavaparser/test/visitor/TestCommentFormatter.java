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
package com.github.antlrjavaparser.test.visitor;

import com.github.antlrjavaparser.api.Comment;
import com.github.antlrjavaparser.api.body.JavadocComment;
import com.github.antlrjavaparser.api.visitor.CommentFormatter;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mike De Haan
 */
public class TestCommentFormatter {

    @Test
    public void testJavadocFormatter() {
        Comment comment = new JavadocComment("/**\n      * This is a test\n     */");

        CommentFormatter formatter = new CommentFormatter();

        String actualResult = formatter.format(comment, 1, CommentFormatter.CommentLocation.BEGINNING);

        String expectedResult =
                "    /**\n" +
                "     * This is a test\n" +
                "     */";

        Assert.assertEquals("Comment formatter results do not match.", expectedResult, actualResult);
    }

    @Test
    public void testUntaggedJavadoc() {
        String input = "This is a test\nLine two\n\"<b>Line3</b>\"";

        CommentFormatter formatter = new CommentFormatter();
        //System.out.println(formatter.formatStringAsJavadoc(input));

        Comment comment = new JavadocComment(formatter.formatStringAsJavadoc(input));
        String actualResult = formatter.format(comment, 1, CommentFormatter.CommentLocation.BEGINNING);

        String expectedResult =
                "    /**\n" +
                "     * This is a test\n" +
                "     * Line two\n" +
                "     * \"<b>Line3</b>\"\n" +
                "     */\n";

        Assert.assertEquals("Comment formatter results do not match.", expectedResult, actualResult);
    }
}
