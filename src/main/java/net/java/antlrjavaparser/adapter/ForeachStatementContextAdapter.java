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

package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ModifierSet;
import net.java.antlrjavaparser.api.body.VariableDeclarator;
import net.java.antlrjavaparser.api.body.VariableDeclaratorId;
import net.java.antlrjavaparser.api.expr.AnnotationExpr;
import net.java.antlrjavaparser.api.expr.VariableDeclarationExpr;
import net.java.antlrjavaparser.api.stmt.ForeachStmt;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mike De Haan
 * Date: 12/20/12
 * Time: 12:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class ForeachStatementContextAdapter implements Adapter<ForeachStmt, Java7Parser.ForeachStatementContext> {
    @Override
    public ForeachStmt adapt(Java7Parser.ForeachStatementContext context) {

        /*
            foreachStatement
                :    FOR LPAREN variableModifiers type Identifier COLON expression RPAREN statement
                ;
         */

        ForeachStmt foreachStmt = new ForeachStmt();

        VariableDeclarationExpr variableDeclarationExpr = new VariableDeclarationExpr();

        int modifiers = 0;
        List<AnnotationExpr> annotations = new LinkedList<AnnotationExpr>();
        if (context.variableModifiers() != null) {
            for (Java7Parser.AnnotationContext annotationContext : context.variableModifiers().annotation()) {
                AnnotationExpr annotationExpr = Adapters.getAnnotationContextAdapter().adapt(annotationContext);
                annotations.add(annotationExpr);
            }

            if (context.variableModifiers().FINAL() != null) {
                modifiers |= ModifierSet.FINAL;
            }

            variableDeclarationExpr.setModifiers(modifiers);
        }

        // Set the loop variable
        variableDeclarationExpr.setAnnotations(annotations);
        variableDeclarationExpr.setType(Adapters.getTypeContextAdapter().adapt(context.type()));

        List<VariableDeclarator> variableDeclaratorList = new LinkedList<VariableDeclarator>();
        VariableDeclarator variableDeclarator = new VariableDeclarator();
        VariableDeclaratorId variableDeclaratorId = new VariableDeclaratorId();
        variableDeclaratorId.setName(context.Identifier().getText());
        variableDeclarator.setId(variableDeclaratorId);
        variableDeclaratorList.add(variableDeclarator);
        variableDeclarationExpr.setVars(variableDeclaratorList);

        foreachStmt.setVariable(variableDeclarationExpr);

        foreachStmt.setBody(Adapters.getStatementContextAdapter().adapt(context.statement()));
        foreachStmt.setIterable(Adapters.getExpressionContextAdapter().adapt(context.expression()));

        return foreachStmt;
    }
}
