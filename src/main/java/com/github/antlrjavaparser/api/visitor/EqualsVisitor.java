/*
 * Copyright (C) 2010 J�lio Vilmar Gesser.
 *
 * This file is part of Java 1.5 parser and Abstract Syntax Tree.
 *
 * Java 1.5 parser and Abstract Syntax Tree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Java 1.5 parser and Abstract Syntax Tree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java 1.5 parser and Abstract Syntax Tree.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 17/01/2010
 */
package com.github.antlrjavaparser.api.visitor;

import com.github.antlrjavaparser.api.BlockComment;
import com.github.antlrjavaparser.api.CompilationUnit;
import com.github.antlrjavaparser.api.ImportDeclaration;
import com.github.antlrjavaparser.api.LineComment;
import com.github.antlrjavaparser.api.Node;
import com.github.antlrjavaparser.api.PackageDeclaration;
import com.github.antlrjavaparser.api.TypeParameter;
import com.github.antlrjavaparser.api.body.AnnotationDeclaration;
import com.github.antlrjavaparser.api.body.AnnotationMemberDeclaration;
import com.github.antlrjavaparser.api.body.CatchParameter;
import com.github.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;
import com.github.antlrjavaparser.api.body.ConstructorDeclaration;
import com.github.antlrjavaparser.api.body.EmptyMemberDeclaration;
import com.github.antlrjavaparser.api.body.EmptyTypeDeclaration;
import com.github.antlrjavaparser.api.body.EnumConstantDeclaration;
import com.github.antlrjavaparser.api.body.EnumDeclaration;
import com.github.antlrjavaparser.api.body.FieldDeclaration;
import com.github.antlrjavaparser.api.body.InitializerDeclaration;
import com.github.antlrjavaparser.api.body.JavadocComment;
import com.github.antlrjavaparser.api.body.MethodDeclaration;
import com.github.antlrjavaparser.api.body.Parameter;
import com.github.antlrjavaparser.api.body.Resource;
import com.github.antlrjavaparser.api.body.VariableDeclarator;
import com.github.antlrjavaparser.api.body.VariableDeclaratorId;
import com.github.antlrjavaparser.api.expr.ArrayAccessExpr;
import com.github.antlrjavaparser.api.expr.ArrayCreationExpr;
import com.github.antlrjavaparser.api.expr.ArrayInitializerExpr;
import com.github.antlrjavaparser.api.expr.AssignExpr;
import com.github.antlrjavaparser.api.expr.BinaryExpr;
import com.github.antlrjavaparser.api.expr.BooleanLiteralExpr;
import com.github.antlrjavaparser.api.expr.CastExpr;
import com.github.antlrjavaparser.api.expr.CharLiteralExpr;
import com.github.antlrjavaparser.api.expr.ClassExpr;
import com.github.antlrjavaparser.api.expr.ConditionalExpr;
import com.github.antlrjavaparser.api.expr.DoubleLiteralExpr;
import com.github.antlrjavaparser.api.expr.EnclosedExpr;
import com.github.antlrjavaparser.api.expr.FieldAccessExpr;
import com.github.antlrjavaparser.api.expr.InstanceOfExpr;
import com.github.antlrjavaparser.api.expr.IntegerLiteralExpr;
import com.github.antlrjavaparser.api.expr.IntegerLiteralMinValueExpr;
import com.github.antlrjavaparser.api.expr.LambdaExpr;
import com.github.antlrjavaparser.api.expr.LongLiteralExpr;
import com.github.antlrjavaparser.api.expr.LongLiteralMinValueExpr;
import com.github.antlrjavaparser.api.expr.MarkerAnnotationExpr;
import com.github.antlrjavaparser.api.expr.MemberValuePair;
import com.github.antlrjavaparser.api.expr.MethodCallExpr;
import com.github.antlrjavaparser.api.expr.MethodReferenceExpr;
import com.github.antlrjavaparser.api.expr.NameExpr;
import com.github.antlrjavaparser.api.expr.NormalAnnotationExpr;
import com.github.antlrjavaparser.api.expr.NullLiteralExpr;
import com.github.antlrjavaparser.api.expr.ObjectCreationExpr;
import com.github.antlrjavaparser.api.expr.QualifiedNameExpr;
import com.github.antlrjavaparser.api.expr.SingleMemberAnnotationExpr;
import com.github.antlrjavaparser.api.expr.StringLiteralExpr;
import com.github.antlrjavaparser.api.expr.SuperExpr;
import com.github.antlrjavaparser.api.expr.ThisExpr;
import com.github.antlrjavaparser.api.expr.UnaryExpr;
import com.github.antlrjavaparser.api.expr.VariableDeclarationExpr;
import com.github.antlrjavaparser.api.stmt.AssertStmt;
import com.github.antlrjavaparser.api.stmt.BlockStmt;
import com.github.antlrjavaparser.api.stmt.BreakStmt;
import com.github.antlrjavaparser.api.stmt.CatchClause;
import com.github.antlrjavaparser.api.stmt.ContinueStmt;
import com.github.antlrjavaparser.api.stmt.DoStmt;
import com.github.antlrjavaparser.api.stmt.EmptyStmt;
import com.github.antlrjavaparser.api.stmt.ExplicitConstructorInvocationStmt;
import com.github.antlrjavaparser.api.stmt.ExpressionStmt;
import com.github.antlrjavaparser.api.stmt.ForStmt;
import com.github.antlrjavaparser.api.stmt.ForeachStmt;
import com.github.antlrjavaparser.api.stmt.IfStmt;
import com.github.antlrjavaparser.api.stmt.LabeledStmt;
import com.github.antlrjavaparser.api.stmt.ReturnStmt;
import com.github.antlrjavaparser.api.stmt.SwitchEntryStmt;
import com.github.antlrjavaparser.api.stmt.SwitchStmt;
import com.github.antlrjavaparser.api.stmt.SynchronizedStmt;
import com.github.antlrjavaparser.api.stmt.ThrowStmt;
import com.github.antlrjavaparser.api.stmt.TryStmt;
import com.github.antlrjavaparser.api.stmt.TypeDeclarationStmt;
import com.github.antlrjavaparser.api.stmt.WhileStmt;
import com.github.antlrjavaparser.api.type.ClassOrInterfaceType;
import com.github.antlrjavaparser.api.type.PrimitiveType;
import com.github.antlrjavaparser.api.type.ReferenceType;
import com.github.antlrjavaparser.api.type.VoidType;
import com.github.antlrjavaparser.api.type.WildcardType;

import java.util.List;

/**
 * @author Julio Vilmar Gesser
 */
public class EqualsVisitor implements GenericVisitor<Boolean, Node> {
    @Override
    public Boolean visit(Resource n, Node arg) {
        // TODO: Implement this
        return null;
    }

    private static final EqualsVisitor SINGLETON = new EqualsVisitor();

    public static boolean equals(Node n1, Node n2) {
        return SINGLETON.nodeEquals(n1, n2);
    }

    private EqualsVisitor() {
        // hide constructor
    }

    private <T extends Node> boolean nodesEquals(List<T> nodes1, List<T> nodes2) {
        if (nodes1 == null) {
            if (nodes2 == null) {
                return true;
            }
            return false;
        } else if (nodes2 == null) {
            return false;
        }
        if (nodes1.size() != nodes2.size()) {
            return false;
        }
        for (int i = 0; i < nodes1.size(); i++) {
            if (!nodeEquals(nodes1.get(i), nodes2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private <T extends Node> boolean nodeEquals(T n1, T n2) {
        if (n1 == n2) {
            return true;
        }
        if (n1 == null) {
            if (n2 == null) {
                return true;
            }
            return false;
        } else if (n2 == null) {
            return false;
        }
        if (n1.getClass() != n2.getClass()) {
            return false;
        }
        return n1.accept(this, n2).booleanValue();
    }

    private boolean objEquals(Object n1, Object n2) {
        if (n1 == n2) {
            return true;
        }
        if (n1 == null) {
            if (n2 == null) {
                return true;
            }
            return false;
        } else if (n2 == null) {
            return false;
        }
        return n1.equals(n2);
    }

    public Boolean visit(CompilationUnit n1, Node arg) {
        CompilationUnit n2 = (CompilationUnit) arg;

        if (!nodeEquals(n1.getPackage(), n2.getPackage())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getImports(), n2.getImports())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypes(), n2.getTypes())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(PackageDeclaration n1, Node arg) {
        PackageDeclaration n2 = (PackageDeclaration) arg;

        if (!nodeEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ImportDeclaration n1, Node arg) {
        ImportDeclaration n2 = (ImportDeclaration) arg;

        if (!nodeEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(TypeParameter n1, Node arg) {
        TypeParameter n2 = (TypeParameter) arg;

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeBound(), n2.getTypeBound())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ClassOrInterfaceDeclaration n1, Node arg) {
        ClassOrInterfaceDeclaration n2 = (ClassOrInterfaceDeclaration) arg;

        // javadoc are checked at CompilationUnit

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (n1.isInterface() != n2.isInterface()) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeParameters(), n2.getTypeParameters())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getExtends(), n2.getExtends())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getImplements(), n2.getImplements())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getMembers(), n2.getMembers())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(EnumDeclaration n1, Node arg) {
        EnumDeclaration n2 = (EnumDeclaration) arg;

        // javadoc are checked at CompilationUnit

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getImplements(), n2.getImplements())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getEntries(), n2.getEntries())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getMembers(), n2.getMembers())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(EmptyTypeDeclaration n1, Node arg) {
        return Boolean.TRUE;
    }

    public Boolean visit(EnumConstantDeclaration n1, Node arg) {
        EnumConstantDeclaration n2 = (EnumConstantDeclaration) arg;

        // javadoc are checked at CompilationUnit

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getArgs(), n2.getArgs())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getClassBody(), n2.getClassBody())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(AnnotationDeclaration n1, Node arg) {
        AnnotationDeclaration n2 = (AnnotationDeclaration) arg;

        // javadoc are checked at CompilationUnit

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getMembers(), n2.getMembers())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(AnnotationMemberDeclaration n1, Node arg) {
        AnnotationMemberDeclaration n2 = (AnnotationMemberDeclaration) arg;

        // javadoc are checked at CompilationUnit

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getDefaultValue(), n2.getDefaultValue())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(FieldDeclaration n1, Node arg) {
        FieldDeclaration n2 = (FieldDeclaration) arg;

        // javadoc are checked at CompilationUnit

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getVariables(), n2.getVariables())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(VariableDeclarator n1, Node arg) {
        VariableDeclarator n2 = (VariableDeclarator) arg;

        if (!nodeEquals(n1.getId(), n2.getId())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getInit(), n2.getInit())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(VariableDeclaratorId n1, Node arg) {
        VariableDeclaratorId n2 = (VariableDeclaratorId) arg;

        if (n1.getArrayCount() != n2.getArrayCount()) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ConstructorDeclaration n1, Node arg) {
        ConstructorDeclaration n2 = (ConstructorDeclaration) arg;

        // javadoc are checked at CompilationUnit

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getBlock(), n2.getBlock())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getParameters(), n2.getParameters())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getThrows(), n2.getThrows())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeParameters(), n2.getTypeParameters())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(MethodDeclaration n1, Node arg) {
        MethodDeclaration n2 = (MethodDeclaration) arg;

        // javadoc are checked at CompilationUnit

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (n1.getArrayCount() != n2.getArrayCount()) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getBody(), n2.getBody())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getParameters(), n2.getParameters())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getThrows(), n2.getThrows())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeParameters(), n2.getTypeParameters())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(Parameter n1, Node arg) {
        Parameter n2 = (Parameter) arg;

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getId(), n2.getId())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(CatchParameter n1, Node arg) {
        CatchParameter n2 = (CatchParameter) arg;

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getId(), n2.getId())) {
            return Boolean.FALSE;
        }

        // TODO make this better
        // I'm not sure if this class is used anyway
        for (int i = 0; i < n1.getTypeList().size(); i++) {
            if (!nodeEquals(n1.getTypeList().get(i), n2.getTypeList().get(i))) {
                return Boolean.FALSE;
            }
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(EmptyMemberDeclaration n1, Node arg) {
        return Boolean.TRUE;
    }

    public Boolean visit(InitializerDeclaration n1, Node arg) {
        InitializerDeclaration n2 = (InitializerDeclaration) arg;

        if (!nodeEquals(n1.getBlock(), n2.getBlock())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ClassOrInterfaceType n1, Node arg) {
        ClassOrInterfaceType n2 = (ClassOrInterfaceType) arg;

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getScope(), n2.getScope())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeArgs(), n2.getTypeArgs())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(PrimitiveType n1, Node arg) {
        PrimitiveType n2 = (PrimitiveType) arg;

        if (n1.getType() != n2.getType()) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ReferenceType n1, Node arg) {
        ReferenceType n2 = (ReferenceType) arg;

        if (n1.getArrayCount() != n2.getArrayCount()) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(VoidType n1, Node arg) {
        return Boolean.TRUE;
    }

    public Boolean visit(WildcardType n1, Node arg) {
        WildcardType n2 = (WildcardType) arg;

        if (!nodeEquals(n1.getExtends(), n2.getExtends())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getSuper(), n2.getSuper())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ArrayAccessExpr n1, Node arg) {
        ArrayAccessExpr n2 = (ArrayAccessExpr) arg;

        if (!nodeEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getIndex(), n2.getIndex())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ArrayCreationExpr n1, Node arg) {
        ArrayCreationExpr n2 = (ArrayCreationExpr) arg;

        if (n1.getArrayCount() != n2.getArrayCount()) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getInitializer(), n2.getInitializer())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getDimensions(), n2.getDimensions())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ArrayInitializerExpr n1, Node arg) {
        ArrayInitializerExpr n2 = (ArrayInitializerExpr) arg;

        if (!nodesEquals(n1.getValues(), n2.getValues())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(AssignExpr n1, Node arg) {
        AssignExpr n2 = (AssignExpr) arg;

        if (n1.getOperator() != n2.getOperator()) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getTarget(), n2.getTarget())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(BinaryExpr n1, Node arg) {
        BinaryExpr n2 = (BinaryExpr) arg;

        if (n1.getOperator() != n2.getOperator()) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getLeft(), n2.getLeft())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getRight(), n2.getRight())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(CastExpr n1, Node arg) {
        CastExpr n2 = (CastExpr) arg;

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getExpr(), n2.getExpr())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ClassExpr n1, Node arg) {
        ClassExpr n2 = (ClassExpr) arg;

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ConditionalExpr n1, Node arg) {
        ConditionalExpr n2 = (ConditionalExpr) arg;

        if (!nodeEquals(n1.getCondition(), n2.getCondition())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getThenExpr(), n2.getThenExpr())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getElseExpr(), n2.getElseExpr())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(EnclosedExpr n1, Node arg) {
        EnclosedExpr n2 = (EnclosedExpr) arg;

        if (!nodeEquals(n1.getInner(), n2.getInner())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(FieldAccessExpr n1, Node arg) {
        FieldAccessExpr n2 = (FieldAccessExpr) arg;

        if (!nodeEquals(n1.getScope(), n2.getScope())) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getField(), n2.getField())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeArgs(), n2.getTypeArgs())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(InstanceOfExpr n1, Node arg) {
        InstanceOfExpr n2 = (InstanceOfExpr) arg;

        if (!nodeEquals(n1.getExpr(), n2.getExpr())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(StringLiteralExpr n1, Node arg) {
        StringLiteralExpr n2 = (StringLiteralExpr) arg;

        if (!objEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(IntegerLiteralExpr n1, Node arg) {
        IntegerLiteralExpr n2 = (IntegerLiteralExpr) arg;

        if (!objEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(LongLiteralExpr n1, Node arg) {
        LongLiteralExpr n2 = (LongLiteralExpr) arg;

        if (!objEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(IntegerLiteralMinValueExpr n1, Node arg) {
        IntegerLiteralMinValueExpr n2 = (IntegerLiteralMinValueExpr) arg;

        if (!objEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(LongLiteralMinValueExpr n1, Node arg) {
        LongLiteralMinValueExpr n2 = (LongLiteralMinValueExpr) arg;

        if (!objEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(CharLiteralExpr n1, Node arg) {
        CharLiteralExpr n2 = (CharLiteralExpr) arg;

        if (!objEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(DoubleLiteralExpr n1, Node arg) {
        DoubleLiteralExpr n2 = (DoubleLiteralExpr) arg;

        if (!objEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(BooleanLiteralExpr n1, Node arg) {
        BooleanLiteralExpr n2 = (BooleanLiteralExpr) arg;

        if (n1.getValue() != n2.getValue()) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(NullLiteralExpr n1, Node arg) {
        return Boolean.TRUE;
    }

    public Boolean visit(MethodCallExpr n1, Node arg) {
        MethodCallExpr n2 = (MethodCallExpr) arg;

        if (!nodeEquals(n1.getScope(), n2.getScope())) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getArgs(), n2.getArgs())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeArgs(), n2.getTypeArgs())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(LambdaExpr n1, Node arg) {
        LambdaExpr n2 = (LambdaExpr) arg;
/*
        if (!nodeEquals(n1.getScope(), n2.getScope())) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getArgs(), n2.getArgs())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeArgs(), n2.getTypeArgs())) {
            return Boolean.FALSE;
        }*/

        return Boolean.TRUE;
    }

    public Boolean visit(NameExpr n1, Node arg) {
        NameExpr n2 = (NameExpr) arg;

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ObjectCreationExpr n1, Node arg) {
        ObjectCreationExpr n2 = (ObjectCreationExpr) arg;

        if (!nodeEquals(n1.getScope(), n2.getScope())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnonymousClassBody(), n2.getAnonymousClassBody())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getArgs(), n2.getArgs())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeArgs(), n2.getTypeArgs())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(QualifiedNameExpr n1, Node arg) {
        QualifiedNameExpr n2 = (QualifiedNameExpr) arg;

        if (!nodeEquals(n1.getQualifier(), n2.getQualifier())) {
            return Boolean.FALSE;
        }

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ThisExpr n1, Node arg) {
        ThisExpr n2 = (ThisExpr) arg;

        if (!nodeEquals(n1.getClassExpr(), n2.getClassExpr())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(SuperExpr n1, Node arg) {
        SuperExpr n2 = (SuperExpr) arg;

        if (!nodeEquals(n1.getClassExpr(), n2.getClassExpr())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(UnaryExpr n1, Node arg) {
        UnaryExpr n2 = (UnaryExpr) arg;

        if (n1.getOperator() != n2.getOperator()) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getExpr(), n2.getExpr())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(VariableDeclarationExpr n1, Node arg) {
        VariableDeclarationExpr n2 = (VariableDeclarationExpr) arg;

        if (n1.getModifiers() != n2.getModifiers()) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getAnnotations(), n2.getAnnotations())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getType(), n2.getType())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getVars(), n2.getVars())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(MarkerAnnotationExpr n1, Node arg) {
        MarkerAnnotationExpr n2 = (MarkerAnnotationExpr) arg;

        if (!nodeEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(SingleMemberAnnotationExpr n1, Node arg) {
        SingleMemberAnnotationExpr n2 = (SingleMemberAnnotationExpr) arg;

        if (!nodeEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getMemberValue(), n2.getMemberValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(NormalAnnotationExpr n1, Node arg) {
        NormalAnnotationExpr n2 = (NormalAnnotationExpr) arg;

        if (!nodeEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getPairs(), n2.getPairs())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(MemberValuePair n1, Node arg) {
        MemberValuePair n2 = (MemberValuePair) arg;

        if (!objEquals(n1.getName(), n2.getName())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getValue(), n2.getValue())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ExplicitConstructorInvocationStmt n1, Node arg) {
        ExplicitConstructorInvocationStmt n2 = (ExplicitConstructorInvocationStmt) arg;

        if (!nodeEquals(n1.getExpr(), n2.getExpr())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getArgs(), n2.getArgs())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getTypeArgs(), n2.getTypeArgs())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(TypeDeclarationStmt n1, Node arg) {
        TypeDeclarationStmt n2 = (TypeDeclarationStmt) arg;

        if (!nodeEquals(n1.getTypeDeclaration(), n2.getTypeDeclaration())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(AssertStmt n1, Node arg) {
        AssertStmt n2 = (AssertStmt) arg;

        if (!nodeEquals(n1.getCheck(), n2.getCheck())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getMessage(), n2.getMessage())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(BlockStmt n1, Node arg) {
        BlockStmt n2 = (BlockStmt) arg;

        if (!nodesEquals(n1.getStmts(), n2.getStmts())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(LabeledStmt n1, Node arg) {
        LabeledStmt n2 = (LabeledStmt) arg;

        if (!nodeEquals(n1.getStmt(), n2.getStmt())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(EmptyStmt n1, Node arg) {
        return Boolean.TRUE;
    }

    public Boolean visit(ExpressionStmt n1, Node arg) {
        ExpressionStmt n2 = (ExpressionStmt) arg;

        if (!nodeEquals(n1.getExpression(), n2.getExpression())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(SwitchStmt n1, Node arg) {
        SwitchStmt n2 = (SwitchStmt) arg;

        if (!nodeEquals(n1.getSelector(), n2.getSelector())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getEntries(), n2.getEntries())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(SwitchEntryStmt n1, Node arg) {
        SwitchEntryStmt n2 = (SwitchEntryStmt) arg;

        if (!nodeEquals(n1.getLabel(), n2.getLabel())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getStmts(), n2.getStmts())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(BreakStmt n1, Node arg) {
        BreakStmt n2 = (BreakStmt) arg;

        if (!objEquals(n1.getId(), n2.getId())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ReturnStmt n1, Node arg) {
        ReturnStmt n2 = (ReturnStmt) arg;

        if (!nodeEquals(n1.getExpr(), n2.getExpr())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(IfStmt n1, Node arg) {
        IfStmt n2 = (IfStmt) arg;

        if (!nodeEquals(n1.getCondition(), n2.getCondition())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getThenStmt(), n2.getThenStmt())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getElseStmt(), n2.getElseStmt())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(WhileStmt n1, Node arg) {
        WhileStmt n2 = (WhileStmt) arg;

        if (!nodeEquals(n1.getCondition(), n2.getCondition())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getBody(), n2.getBody())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ContinueStmt n1, Node arg) {
        ContinueStmt n2 = (ContinueStmt) arg;

        if (!objEquals(n1.getId(), n2.getId())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(DoStmt n1, Node arg) {
        DoStmt n2 = (DoStmt) arg;

        if (!nodeEquals(n1.getBody(), n2.getBody())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getCondition(), n2.getCondition())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ForeachStmt n1, Node arg) {
        ForeachStmt n2 = (ForeachStmt) arg;

        if (!nodeEquals(n1.getVariable(), n2.getVariable())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getIterable(), n2.getIterable())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getBody(), n2.getBody())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ForStmt n1, Node arg) {
        ForStmt n2 = (ForStmt) arg;

        if (!nodesEquals(n1.getInit(), n2.getInit())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getCompare(), n2.getCompare())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getUpdate(), n2.getUpdate())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getBody(), n2.getBody())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(ThrowStmt n1, Node arg) {
        ThrowStmt n2 = (ThrowStmt) arg;

        if (!nodeEquals(n1.getExpr(), n2.getExpr())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(SynchronizedStmt n1, Node arg) {
        SynchronizedStmt n2 = (SynchronizedStmt) arg;

        if (!nodeEquals(n1.getExpr(), n2.getExpr())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getBlock(), n2.getBlock())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(TryStmt n1, Node arg) {
        TryStmt n2 = (TryStmt) arg;

        if (!nodeEquals(n1.getTryBlock(), n2.getTryBlock())) {
            return Boolean.FALSE;
        }

        if (!nodesEquals(n1.getCatchs(), n2.getCatchs())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getFinallyBlock(), n2.getFinallyBlock())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public Boolean visit(CatchClause n1, Node arg) {
        CatchClause n2 = (CatchClause) arg;

        if (!nodeEquals(n1.getExcept(), n2.getExcept())) {
            return Boolean.FALSE;
        }

        if (!nodeEquals(n1.getCatchBlock(), n2.getCatchBlock())) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    @Override
    public Boolean visit(MethodReferenceExpr n, Node arg) {
        return Boolean.TRUE;
    }
}
