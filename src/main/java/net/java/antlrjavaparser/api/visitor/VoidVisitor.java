/*
 * Copyright (C) 2007 J�lio Vilmar Gesser.
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
 * Created on 05/10/2006
 */
package net.java.antlrjavaparser.api.visitor;

import net.java.antlrjavaparser.api.BlockComment;
import net.java.antlrjavaparser.api.CompilationUnit;
import net.java.antlrjavaparser.api.ImportDeclaration;
import net.java.antlrjavaparser.api.LineComment;
import net.java.antlrjavaparser.api.PackageDeclaration;
import net.java.antlrjavaparser.api.TypeParameter;
import net.java.antlrjavaparser.api.body.AnnotationDeclaration;
import net.java.antlrjavaparser.api.body.AnnotationMemberDeclaration;
import net.java.antlrjavaparser.api.body.CatchParameter;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;
import net.java.antlrjavaparser.api.body.ConstructorDeclaration;
import net.java.antlrjavaparser.api.body.EmptyMemberDeclaration;
import net.java.antlrjavaparser.api.body.EmptyTypeDeclaration;
import net.java.antlrjavaparser.api.body.EnumConstantDeclaration;
import net.java.antlrjavaparser.api.body.EnumDeclaration;
import net.java.antlrjavaparser.api.body.FieldDeclaration;
import net.java.antlrjavaparser.api.body.InitializerDeclaration;
import net.java.antlrjavaparser.api.body.JavadocComment;
import net.java.antlrjavaparser.api.body.MethodDeclaration;
import net.java.antlrjavaparser.api.body.Parameter;
import net.java.antlrjavaparser.api.body.VariableDeclarator;
import net.java.antlrjavaparser.api.body.VariableDeclaratorId;
import net.java.antlrjavaparser.api.expr.ArrayAccessExpr;
import net.java.antlrjavaparser.api.expr.ArrayCreationExpr;
import net.java.antlrjavaparser.api.expr.ArrayInitializerExpr;
import net.java.antlrjavaparser.api.expr.AssignExpr;
import net.java.antlrjavaparser.api.expr.BinaryExpr;
import net.java.antlrjavaparser.api.expr.BooleanLiteralExpr;
import net.java.antlrjavaparser.api.expr.CastExpr;
import net.java.antlrjavaparser.api.expr.CharLiteralExpr;
import net.java.antlrjavaparser.api.expr.ClassExpr;
import net.java.antlrjavaparser.api.expr.ConditionalExpr;
import net.java.antlrjavaparser.api.expr.DoubleLiteralExpr;
import net.java.antlrjavaparser.api.expr.EnclosedExpr;
import net.java.antlrjavaparser.api.expr.FieldAccessExpr;
import net.java.antlrjavaparser.api.expr.InstanceOfExpr;
import net.java.antlrjavaparser.api.expr.IntegerLiteralExpr;
import net.java.antlrjavaparser.api.expr.IntegerLiteralMinValueExpr;
import net.java.antlrjavaparser.api.expr.LongLiteralExpr;
import net.java.antlrjavaparser.api.expr.LongLiteralMinValueExpr;
import net.java.antlrjavaparser.api.expr.MarkerAnnotationExpr;
import net.java.antlrjavaparser.api.expr.MemberValuePair;
import net.java.antlrjavaparser.api.expr.MethodCallExpr;
import net.java.antlrjavaparser.api.expr.NameExpr;
import net.java.antlrjavaparser.api.expr.NormalAnnotationExpr;
import net.java.antlrjavaparser.api.expr.NullLiteralExpr;
import net.java.antlrjavaparser.api.expr.ObjectCreationExpr;
import net.java.antlrjavaparser.api.expr.QualifiedNameExpr;
import net.java.antlrjavaparser.api.expr.SingleMemberAnnotationExpr;
import net.java.antlrjavaparser.api.expr.StringLiteralExpr;
import net.java.antlrjavaparser.api.expr.SuperExpr;
import net.java.antlrjavaparser.api.expr.ThisExpr;
import net.java.antlrjavaparser.api.expr.UnaryExpr;
import net.java.antlrjavaparser.api.expr.VariableDeclarationExpr;
import net.java.antlrjavaparser.api.stmt.AssertStmt;
import net.java.antlrjavaparser.api.stmt.BlockStmt;
import net.java.antlrjavaparser.api.stmt.BreakStmt;
import net.java.antlrjavaparser.api.stmt.CatchClause;
import net.java.antlrjavaparser.api.stmt.ContinueStmt;
import net.java.antlrjavaparser.api.stmt.DoStmt;
import net.java.antlrjavaparser.api.stmt.EmptyStmt;
import net.java.antlrjavaparser.api.stmt.ExplicitConstructorInvocationStmt;
import net.java.antlrjavaparser.api.stmt.ExpressionStmt;
import net.java.antlrjavaparser.api.stmt.ForStmt;
import net.java.antlrjavaparser.api.stmt.ForeachStmt;
import net.java.antlrjavaparser.api.stmt.IfStmt;
import net.java.antlrjavaparser.api.stmt.LabeledStmt;
import net.java.antlrjavaparser.api.stmt.ReturnStmt;
import net.java.antlrjavaparser.api.stmt.SwitchEntryStmt;
import net.java.antlrjavaparser.api.stmt.SwitchStmt;
import net.java.antlrjavaparser.api.stmt.SynchronizedStmt;
import net.java.antlrjavaparser.api.stmt.ThrowStmt;
import net.java.antlrjavaparser.api.stmt.TryStmt;
import net.java.antlrjavaparser.api.stmt.TypeDeclarationStmt;
import net.java.antlrjavaparser.api.stmt.WhileStmt;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import net.java.antlrjavaparser.api.type.PrimitiveType;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.VoidType;
import net.java.antlrjavaparser.api.type.WildcardType;

/**
 * @author Julio Vilmar Gesser
 */
public interface VoidVisitor<A> {

    //- Compilation Unit ----------------------------------

    public void visit(CompilationUnit n, A arg);

    public void visit(PackageDeclaration n, A arg);

    public void visit(ImportDeclaration n, A arg);

    public void visit(TypeParameter n, A arg);

    public void visit(LineComment n, A arg);

    public void visit(BlockComment n, A arg);

    //- Body ----------------------------------------------

    public void visit(ClassOrInterfaceDeclaration n, A arg);

    public void visit(EnumDeclaration n, A arg);

    public void visit(EmptyTypeDeclaration n, A arg);

    public void visit(EnumConstantDeclaration n, A arg);

    public void visit(AnnotationDeclaration n, A arg);

    public void visit(AnnotationMemberDeclaration n, A arg);

    public void visit(FieldDeclaration n, A arg);

    public void visit(VariableDeclarator n, A arg);

    public void visit(VariableDeclaratorId n, A arg);

    public void visit(ConstructorDeclaration n, A arg);

    public void visit(MethodDeclaration n, A arg);

    public void visit(Parameter n, A arg);

    public void visit(CatchParameter n, A arg);

    public void visit(EmptyMemberDeclaration n, A arg);

    public void visit(InitializerDeclaration n, A arg);

    public void visit(JavadocComment n, A arg);

    //- Type ----------------------------------------------

    public void visit(ClassOrInterfaceType n, A arg);

    public void visit(PrimitiveType n, A arg);

    public void visit(ReferenceType n, A arg);

    public void visit(VoidType n, A arg);

    public void visit(WildcardType n, A arg);

    //- Expression ----------------------------------------

    public void visit(ArrayAccessExpr n, A arg);

    public void visit(ArrayCreationExpr n, A arg);

    public void visit(ArrayInitializerExpr n, A arg);

    public void visit(AssignExpr n, A arg);

    public void visit(BinaryExpr n, A arg);

    public void visit(CastExpr n, A arg);

    public void visit(ClassExpr n, A arg);

    public void visit(ConditionalExpr n, A arg);

    public void visit(EnclosedExpr n, A arg);

    public void visit(FieldAccessExpr n, A arg);

    public void visit(InstanceOfExpr n, A arg);

    public void visit(StringLiteralExpr n, A arg);

    public void visit(IntegerLiteralExpr n, A arg);

    public void visit(LongLiteralExpr n, A arg);

    public void visit(IntegerLiteralMinValueExpr n, A arg);

    public void visit(LongLiteralMinValueExpr n, A arg);

    public void visit(CharLiteralExpr n, A arg);

    public void visit(DoubleLiteralExpr n, A arg);

    public void visit(BooleanLiteralExpr n, A arg);

    public void visit(NullLiteralExpr n, A arg);

    public void visit(MethodCallExpr n, A arg);

    public void visit(NameExpr n, A arg);

    public void visit(ObjectCreationExpr n, A arg);

    public void visit(QualifiedNameExpr n, A arg);

    public void visit(ThisExpr n, A arg);

    public void visit(SuperExpr n, A arg);

    public void visit(UnaryExpr n, A arg);

    public void visit(VariableDeclarationExpr n, A arg);

    public void visit(MarkerAnnotationExpr n, A arg);

    public void visit(SingleMemberAnnotationExpr n, A arg);

    public void visit(NormalAnnotationExpr n, A arg);

    public void visit(MemberValuePair n, A arg);

    //- Statements ----------------------------------------

    public void visit(ExplicitConstructorInvocationStmt n, A arg);

    public void visit(TypeDeclarationStmt n, A arg);

    public void visit(AssertStmt n, A arg);

    public void visit(BlockStmt n, A arg);

    public void visit(LabeledStmt n, A arg);

    public void visit(EmptyStmt n, A arg);

    public void visit(ExpressionStmt n, A arg);

    public void visit(SwitchStmt n, A arg);

    public void visit(SwitchEntryStmt n, A arg);

    public void visit(BreakStmt n, A arg);

    public void visit(ReturnStmt n, A arg);

    public void visit(IfStmt n, A arg);

    public void visit(WhileStmt n, A arg);

    public void visit(ContinueStmt n, A arg);

    public void visit(DoStmt n, A arg);

    public void visit(ForeachStmt n, A arg);

    public void visit(ForStmt n, A arg);

    public void visit(ThrowStmt n, A arg);

    public void visit(SynchronizedStmt n, A arg);

    public void visit(TryStmt n, A arg);

    public void visit(CatchClause n, A arg);

}
