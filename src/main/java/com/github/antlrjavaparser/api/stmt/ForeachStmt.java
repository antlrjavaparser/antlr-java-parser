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
import com.github.antlrjavaparser.api.expr.VariableDeclarationExpr;
import com.github.antlrjavaparser.api.visitor.GenericVisitor;
import com.github.antlrjavaparser.api.visitor.VoidVisitor;

/**
 * @author Julio Vilmar Gesser
 */
public final class ForeachStmt extends Statement {

    private VariableDeclarationExpr var;

    private Expression iterable;

    private Statement body;

    public ForeachStmt() {
    }

    public ForeachStmt(VariableDeclarationExpr var, Expression iterable, Statement body) {
        this.var = var;
        this.iterable = iterable;
        this.body = body;
    }

    public ForeachStmt(int beginLine, int beginColumn, int endLine, int endColumn, VariableDeclarationExpr var, Expression iterable, Statement body) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.var = var;
        this.iterable = iterable;
        this.body = body;
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    public Statement getBody() {
        return body;
    }

    public Expression getIterable() {
        return iterable;
    }

    public VariableDeclarationExpr getVariable() {
        return var;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public void setIterable(Expression iterable) {
        this.iterable = iterable;
    }

    public void setVariable(VariableDeclarationExpr var) {
        this.var = var;
    }
}
