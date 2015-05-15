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
package com.github.antlrjavaparser.api.expr;

import com.github.antlrjavaparser.api.visitor.GenericVisitor;
import com.github.antlrjavaparser.api.visitor.VoidVisitor;

/**
 * @author Julio Vilmar Gesser
 */
public final class AssignExpr extends Expression {

    public static enum Operator {
        assign, // =
        plus, // +=
        minus, // -=
        star, // *=
        slash, // /=
        and, // &=
        or, // |=
        xor, // ^=
        rem, // %=
        lShift, // <<=
        rSignedShift, // >>=
        rUnsignedShift, // >>>=
    }

    private Expression target;

    private Expression value;

    private Operator op;

    public AssignExpr() {
    }

    public AssignExpr(Expression target, Expression value, Operator op) {
        this.target = target;
        this.value = value;
        this.op = op;
    }

    public AssignExpr(int beginLine, int beginColumn, int endLine, int endColumn, Expression target, Expression value, Operator op) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.target = target;
        this.value = value;
        this.op = op;
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    public Operator getOperator() {
        return op;
    }

    public Expression getTarget() {
        return target;
    }

    public Expression getValue() {
        return value;
    }

    public void setOperator(Operator op) {
        this.op = op;
    }

    public void setTarget(Expression target) {
        this.target = target;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

}
