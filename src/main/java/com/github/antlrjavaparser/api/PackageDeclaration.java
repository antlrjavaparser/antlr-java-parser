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
package com.github.antlrjavaparser.api;

import com.github.antlrjavaparser.api.expr.AnnotationExpr;
import com.github.antlrjavaparser.api.expr.NameExpr;
import com.github.antlrjavaparser.api.visitor.GenericVisitor;
import com.github.antlrjavaparser.api.visitor.VoidVisitor;

import java.util.List;

/**
 * This class represents the package declaration. The package declaration is
 * optional for the {@link CompilationUnit}.
 *
 * The PackageDeclaration is constructed following the syntax:<br>
 *
 * @author Julio Vilmar Gesser
 */
public final class PackageDeclaration extends Node {

    private List<AnnotationExpr> annotations;

    private NameExpr name;

    public PackageDeclaration() {
    }

    public PackageDeclaration(NameExpr name) {
        this.name = name;
    }

    public PackageDeclaration(List<AnnotationExpr> annotations, NameExpr name) {
        this.annotations = annotations;
        this.name = name;
    }

    public PackageDeclaration(int beginLine, int beginColumn, int endLine, int endColumn, List<AnnotationExpr> annotations, NameExpr name) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.annotations = annotations;
        this.name = name;
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    /**
     * Retrieves the list of annotations declared before the package
     * declaration. Return <code>null</code> if there are no annotations.
     *
     * @return list of annotations or <code>null</code>
     */
    public List<AnnotationExpr> getAnnotations() {
        return annotations;
    }

    /**
     * Return the name of the package.
     *
     * @return the name of the package
     */
    public NameExpr getName() {
        return name;
    }

    /**
     * @param annotations
     *            the annotations to set
     */
    public void setAnnotations(List<AnnotationExpr> annotations) {
        this.annotations = annotations;
    }

    /**
     * Sets the name of this package declaration.
     *
     * @param name
     *            the name to set
     */
    public void setName(NameExpr name) {
        this.name = name;
    }

}
