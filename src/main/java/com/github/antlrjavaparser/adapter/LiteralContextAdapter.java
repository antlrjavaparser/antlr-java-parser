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
import com.github.antlrjavaparser.api.expr.BooleanLiteralExpr;
import com.github.antlrjavaparser.api.expr.CharLiteralExpr;
import com.github.antlrjavaparser.api.expr.DoubleLiteralExpr;
import com.github.antlrjavaparser.api.expr.IntegerLiteralExpr;
import com.github.antlrjavaparser.api.expr.LiteralExpr;
import com.github.antlrjavaparser.api.expr.LongLiteralExpr;
import com.github.antlrjavaparser.api.expr.NullLiteralExpr;
import com.github.antlrjavaparser.api.expr.StringLiteralExpr;

public class LiteralContextAdapter implements Adapter<LiteralExpr, Java7Parser.LiteralContext> {
    public LiteralExpr adapt(Java7Parser.LiteralContext context, AdapterParameters adapterParameters) {

        LiteralExpr literalExpr;

        if (context.IntegerLiteral() != null) {
            if (isLongType(context.IntegerLiteral().getText())) {
                literalExpr = new LongLiteralExpr(context.IntegerLiteral().getText());
            } else{
                literalExpr = new IntegerLiteralExpr(context.IntegerLiteral().getText());
            }
        } else if (context.FloatingPointLiteral() != null) {
            literalExpr = new DoubleLiteralExpr(context.FloatingPointLiteral().getText());
        } else if (context.CharacterLiteral() != null) {
            literalExpr = new CharLiteralExpr(stripQuotes(context.CharacterLiteral().getText()));
        } else if (context.StringLiteral() != null) {
            literalExpr = new StringLiteralExpr(stripQuotes(context.StringLiteral().getText()));
        } else if (context.TRUE() != null) {
            literalExpr = new BooleanLiteralExpr(true);
        } else if (context.FALSE() != null) {
            literalExpr = new BooleanLiteralExpr(false);
        } else if (context.NULL() != null) {
            literalExpr = new NullLiteralExpr();
        } else {
            throw new RuntimeException("Unknown Literal Context");
        }

        AdapterUtil.setComments(literalExpr, context, adapterParameters);

        return literalExpr;

    }

    private boolean isLongType(String value) {
        return value.endsWith("l") || value.endsWith("L");
    }

    private String stripQuotes(String str) {
        return str.substring(1, str.length() - 1);
    }
}
