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
package com.github.antlrjavaparser.api.body;

import com.github.antlrjavaparser.api.Node;
import com.github.antlrjavaparser.api.expr.AnnotationExpr;
import com.github.antlrjavaparser.api.expr.Expression;
import com.github.antlrjavaparser.api.type.Type;
import com.github.antlrjavaparser.api.visitor.GenericVisitor;
import com.github.antlrjavaparser.api.visitor.VoidVisitor;

import java.util.List;

/**
 * @author Julio Vilmar Gesser
 */
public final class Resource extends Node {

    private int modifiers;

    private List<AnnotationExpr> annotations;

    private Type type;

    private VariableDeclaratorId id;

    private Expression expression;

    public Resource() {
    }

    public Resource(Type type, VariableDeclaratorId id) {
        this.type = type;
        this.id = id;
    }

    public Resource(int modifiers, Type type, VariableDeclaratorId id, Expression expression) {
        this.modifiers = modifiers;
        this.type = type;
        this.id = id;
        this.expression = expression;
    }

    public Resource(int beginLine, int beginColumn, int endLine, int endColumn, int modifiers, List<AnnotationExpr> annotations, Type type, VariableDeclaratorId id, Expression expression) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.modifiers = modifiers;
        this.annotations = annotations;
        this.type = type;
        this.id = id;
        this.expression = expression;
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    public List<AnnotationExpr> getAnnotations() {
        return annotations;
    }

    public VariableDeclaratorId getId() {
        return id;
    }

    /**
     * Return the modifiers of this parameter declaration.
     *
     * @see ModifierSet
     * @return modifiers
     */
    public int getModifiers() {
        return modifiers;
    }

    public Type getType() {
        return type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setAnnotations(List<AnnotationExpr> annotations) {
        this.annotations = annotations;
    }

    public void setId(VariableDeclaratorId id) {
        this.id = id;
    }

    public void setModifiers(int modifiers) {
        this.modifiers = modifiers;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

}
