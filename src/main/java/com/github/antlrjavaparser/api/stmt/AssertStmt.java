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
package com.github.antlrjavaparser.api.stmt;

import com.github.antlrjavaparser.api.expr.Expression;
import com.github.antlrjavaparser.api.visitor.GenericVisitor;
import com.github.antlrjavaparser.api.visitor.VoidVisitor;

/**
 * @author Julio Vilmar Gesser
 */
public final class AssertStmt extends Statement {

    private Expression check;

    private Expression msg;

    public AssertStmt() {
    }

    public AssertStmt(Expression check) {
        this.check = check;
    }

    public AssertStmt(Expression check, Expression msg) {
        this.check = check;
        this.msg = msg;
    }

    public AssertStmt(int beginLine, int beginColumn, int endLine, int endColumn, Expression check, Expression msg) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.check = check;
        this.msg = msg;
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    public Expression getCheck() {
        return check;
    }

    public Expression getMessage() {
        return msg;
    }

    public void setCheck(Expression check) {
        this.check = check;
    }

    public void setMessage(Expression msg) {
        this.msg = msg;
    }
}
