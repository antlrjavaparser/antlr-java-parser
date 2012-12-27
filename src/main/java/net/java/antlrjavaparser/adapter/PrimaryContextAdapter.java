package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.ArrayAccessExpr;
import net.java.antlrjavaparser.api.expr.ClassExpr;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.expr.FieldAccessExpr;
import net.java.antlrjavaparser.api.expr.MethodCallExpr;
import net.java.antlrjavaparser.api.expr.NameExpr;
import net.java.antlrjavaparser.api.expr.ObjectCreationExpr;
import net.java.antlrjavaparser.api.expr.SuperExpr;
import net.java.antlrjavaparser.api.expr.ThisExpr;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;
import net.java.antlrjavaparser.api.type.VoidType;

import java.util.List;

public class PrimaryContextAdapter implements Adapter<Expression, Java7Parser.PrimaryContext> {
    public Expression adapt(Java7Parser.PrimaryContext context) {

        /*
            primary
            locals [int operationType]
                :    parExpression                                      {$operationType = 1;}
                |    THIS (DOT Identifier)* (thisSuffix)?               {$operationType = 2;}
                |    Identifier (DOT Identifier)* (identifierSuffix)?   {$operationType = 3;}
                |    SUPER superSuffix                                  {$operationType = 4;}
                |    literal                                            {$operationType = 5;}
                |    creator                                            {$operationType = 6;}
                |    primitiveType (LBRACKET RBRACKET)* DOT CLASS       {$operationType = 7;}
                |    VOID DOT CLASS                                     {$operationType = 8;}
                ;

            superSuffix
                :   arguments
                |   DOT (typeArguments)? Identifier (arguments)?
                ;

            thisSuffix
            locals [int operationType]
                :   (LBRACKET expression RBRACKET)+                     {$operationType = 1;}
                |   arguments                                           {$operationType = 2;}
                |   DOT nonWildcardTypeArguments Identifier arguments   {$operationType = 3;}
                |   DOT SUPER arguments                                 {$operationType = 4;}
                |   innerCreator                                        {$operationType = 5;}
                ;

            identifierSuffix
                :   (LBRACKET RBRACKET)+ DOT CLASS                      {$operationType = 1;}
                |   (LBRACKET expression RBRACKET)+                     {$operationType = 2;}
                |   arguments                                           {$operationType = 3;}
                |   DOT CLASS                                           {$operationType = 4;}
                |   DOT nonWildcardTypeArguments Identifier arguments   {$operationType = 5;}
                |   DOT THIS                                            {$operationType = 6;}
                |   DOT SUPER arguments                                 {$operationType = 7;}
                |   innerCreator                                        {$operationType = 8;}
                ;

         */

        if (context.parExpression() != null) {
            return Adapters.getParExpressionContextAdapter().adapt(context.parExpression());
        } else if (context.operationType == 2) {
            return handleThisSuffix(context);
        } else if(context.operationType == 3) {
            return handleIdentifierSuffix(context);
        } else if (context.SUPER() != null) {
            return Adapters.getSuperSuffixContextAdapter().adapt(context.superSuffix());
        } else if (context.literal() != null) {
            return Adapters.getLiteralContextAdapter().adapt(context.literal());
        } else if (context.creator() != null) {
            return Adapters.getCreatorContextAdapter().adapt(context.creator());
        } else if (context.primitiveType() != null) {
            ClassExpr classExpr = new ClassExpr();
            Type type = Adapters.getPrimitiveTypeContextAdapter().adapt(context.primitiveType());

            if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
                ReferenceType referenceType = new ReferenceType();
                referenceType.setType(type);
                referenceType.setArrayCount(context.LBRACKET().size());
                type = referenceType;
            }

            classExpr.setType(type);

            return classExpr;
        } else if (context.VOID() != null) {
            ClassExpr classExpr = new ClassExpr();
            classExpr.setType(new VoidType());
            return classExpr;
        }

        throw new RuntimeException("Unknown or unhandled primary context");
    }

    // THIS (DOT Identifier)* (identifierSuffix)?         {$operationType = 2;}
    // Identifier (DOT Identifier)* (identifierSuffix)?   {$operationType = 3;}
    private Expression handleIdentifierSuffix(Java7Parser.PrimaryContext primaryContext) {
        /*
            identifierSuffix
            locals [int operationType]
                :   (LBRACKET RBRACKET)+ DOT CLASS                      {$operationType = 1;}
                |   (LBRACKET expression RBRACKET)+                     {$operationType = 2;}
                |   arguments                                           {$operationType = 3;}
                |   DOT CLASS                                           {$operationType = 4;}
                |   DOT nonWildcardTypeArguments Identifier arguments   {$operationType = 5;}
                |   DOT THIS                                            {$operationType = 6;}
                |   innerCreator                                        {$operationType = 7;}
                ;


        //this.m.m.m[].class;        // 0 :   (LBRACKET RBRACKET)+ DOT CLASS                      // ClassOrInterfaceType ClassOrInterfaceType ClassOrInterfaceType ReferenceType ClassExpr
        this.m.m.m[1];             // 1 |   (LBRACKET expression RBRACKET)+                     // NameExpr FieldAccessExpr FieldAccessExpr ArrayAccessExpr
        this.m.m.m("");            // 2 |   arguments                                           // NameExpr FieldAccessExpr MethodCallExpr
        //this.m.m.m.class;          // 3 |   DOT CLASS                                           // ClassOrInterfaceType ClassOrInterfaceType ClassOrInterfaceType ReferenceType ClassExpr
        this.m.m.<T>m("");         // 4 |   DOT nonWildcardTypeArguments Identifier arguments   // NameExpr FieldAccessExpr MethodCallExpr
        this.m.m.m.this;           // 5 |   DOT THIS                                            // NameExpr FieldAccessExpr FieldAccessExpr ThisExpr
        //m.m.super("");      // 6 |   DOT SUPER arguments

        */

        NameExpr nameExpr = new NameExpr();
        nameExpr.setName(primaryContext.Identifier(0).getText());
        Expression leftExpression = nameExpr;

        for (int i = 1; i < primaryContext.Identifier().size(); i++) {
            FieldAccessExpr fieldAccessExpr = new FieldAccessExpr();
            fieldAccessExpr.setField(primaryContext.Identifier(i).getText());
            fieldAccessExpr.setScope(leftExpression);
            leftExpression = fieldAccessExpr;
        }

        // if identifierSuffix is null/not specified
        if (primaryContext.identifierSuffix() == null) {
            return leftExpression;
        }

        ClassOrInterfaceType rootType = new ClassOrInterfaceType();

        if (primaryContext.Identifier() != null && primaryContext.Identifier().size() > 0) {
            rootType.setName(primaryContext.Identifier(0).getText());
        }

        switch (primaryContext.identifierSuffix().operationType) {
            case 1:
            case 4:

                // Need to consider these Identifiers as Types
                // The last one should be a referenceType
                ClassOrInterfaceType leftType = rootType;
                for (int i = 0; i < primaryContext.Identifier().size(); i++) {
                    ClassOrInterfaceType classOrInterfaceType = new ClassOrInterfaceType();
                    classOrInterfaceType.setName(primaryContext.Identifier(i).getText());
                    classOrInterfaceType.setScope(leftType);

                    leftType = classOrInterfaceType;
                }

                ReferenceType referenceType = new ReferenceType();
                referenceType.setType(leftType);

                if (primaryContext.identifierSuffix().LBRACKET() != null) {
                    referenceType.setArrayCount(primaryContext.identifierSuffix().LBRACKET().size());
                }

                ClassExpr classExpr = new ClassExpr();
                classExpr.setType(referenceType);

                return classExpr;
            case 2:
                for (int i = 0; i < primaryContext.identifierSuffix().LBRACKET().size(); i++) {
                    ArrayAccessExpr arrayAccessExpr = new ArrayAccessExpr();
                    arrayAccessExpr.setName(leftExpression);
                    arrayAccessExpr.setIndex(Adapters.getExpressionContextAdapter().adapt(primaryContext.identifierSuffix().expression(i)));
                    leftExpression = arrayAccessExpr;
                }

                return leftExpression;
            case 3:
                MethodCallExpr methodCallExpr = new MethodCallExpr();

                if (leftExpression instanceof NameExpr) {
                    methodCallExpr.setName(((NameExpr)leftExpression).getName());
                } else if (leftExpression instanceof FieldAccessExpr) {
                    methodCallExpr.setName(((FieldAccessExpr)leftExpression).getField());

                    // Set the leftExpression back one since we're changing the top one to a method call
                    leftExpression = ((FieldAccessExpr) leftExpression).getScope();
                    methodCallExpr.setScope(leftExpression);
                }

                methodCallExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(primaryContext.identifierSuffix().arguments()));
                leftExpression = methodCallExpr;

                return leftExpression;
            case 5:
                List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(primaryContext.identifierSuffix().nonWildcardTypeArguments().typeList());

                MethodCallExpr typeArgMethodCallExpr = new MethodCallExpr();
                typeArgMethodCallExpr.setName(primaryContext.identifierSuffix().Identifier().getText());
                typeArgMethodCallExpr.setTypeArgs(typeList);
                typeArgMethodCallExpr.setScope(leftExpression);
                typeArgMethodCallExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(primaryContext.identifierSuffix().arguments()));
                leftExpression = typeArgMethodCallExpr;

                return leftExpression;
            case 6:
                ThisExpr thisExpr= new ThisExpr();
                thisExpr.setClassExpr(leftExpression);
                return thisExpr;
            case 7:
                ObjectCreationExpr objectCreationExpr = Adapters.getInnerCreatorContextAdapter().adapt(primaryContext.identifierSuffix().innerCreator());
                objectCreationExpr.setScope(leftExpression);
                return objectCreationExpr;
        }

        return null;
    }

    // THIS (DOT Identifier)* (thisSuffix)?               {$operationType = 2;}
    private Expression handleThisSuffix(Java7Parser.PrimaryContext primaryContext) {
        /*
            thisSuffix
            locals [int operationType]
                :   (LBRACKET expression RBRACKET)+                     {$operationType = 1;}
                |   arguments                                           {$operationType = 2;}
                |   DOT nonWildcardTypeArguments Identifier arguments   {$operationType = 3;}
                |   innerCreator                                        {$operationType = 4;}
                ;


        //this.m.m.m[].class;        // 0 :   (LBRACKET RBRACKET)+ DOT CLASS                      // ClassOrInterfaceType ClassOrInterfaceType ClassOrInterfaceType ReferenceType ClassExpr
        this.m.m.m[1];             // 1 |   (LBRACKET expression RBRACKET)+                     // NameExpr FieldAccessExpr FieldAccessExpr ArrayAccessExpr
        this.m.m.m("");            // 2 |   arguments                                           // NameExpr FieldAccessExpr MethodCallExpr
        //this.m.m.m.class;          // 3 |   DOT CLASS                                           // ClassOrInterfaceType ClassOrInterfaceType ClassOrInterfaceType ReferenceType ClassExpr
        this.m.m.<T>m("");         // 4 |   DOT nonWildcardTypeArguments Identifier arguments   // NameExpr FieldAccessExpr MethodCallExpr
        this.m.m.m.this;           // 5 |   DOT THIS                                            // NameExpr FieldAccessExpr FieldAccessExpr ThisExpr
        //m.m.super("");      // 6 |   DOT SUPER arguments

        */

        ThisExpr thisExpr = new ThisExpr();
        Expression leftExpression = thisExpr;

        for (int i = 0; i < primaryContext.Identifier().size(); i++) {
            FieldAccessExpr fieldAccessExpr = new FieldAccessExpr();
            fieldAccessExpr.setField(primaryContext.Identifier(i).getText());
            fieldAccessExpr.setScope(leftExpression);
            leftExpression = fieldAccessExpr;
        }

        // if thisSuffix is null/not specified
        if (primaryContext.thisSuffix() == null) {
            return leftExpression;
        }

        ClassOrInterfaceType rootType = new ClassOrInterfaceType();

        if (primaryContext.Identifier() != null && primaryContext.Identifier().size() > 0) {
            rootType.setName(primaryContext.Identifier(0).getText());
        }

        switch (primaryContext.thisSuffix().operationType) {
            case 1:
                for (int i = 0; i < primaryContext.thisSuffix().LBRACKET().size(); i++) {
                    ArrayAccessExpr arrayAccessExpr = new ArrayAccessExpr();
                    arrayAccessExpr.setName(leftExpression);
                    arrayAccessExpr.setIndex(Adapters.getExpressionContextAdapter().adapt(primaryContext.thisSuffix().expression(i)));
                    leftExpression = arrayAccessExpr;
                }

                return leftExpression;
            case 2:
                MethodCallExpr methodCallExpr = new MethodCallExpr();

                if (leftExpression instanceof FieldAccessExpr) {
                    methodCallExpr.setName(((FieldAccessExpr)leftExpression).getField());

                    // Set the leftExpression back one since we're changing the top one to a method call
                    leftExpression = ((FieldAccessExpr) leftExpression).getScope();
                    methodCallExpr.setScope(leftExpression);
                }

                if (methodCallExpr.getName() == null) {
                    throw new RuntimeException("Syntax Error: possibly calling 'this' as a method with arguments.  Something like 'this(\"\")'");
                }

                methodCallExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(primaryContext.thisSuffix().arguments()));
                leftExpression = methodCallExpr;

                return leftExpression;
            case 3:
                List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(primaryContext.thisSuffix().nonWildcardTypeArguments().typeList());

                MethodCallExpr typeArgMethodCallExpr = new MethodCallExpr();
                typeArgMethodCallExpr.setName(primaryContext.thisSuffix().Identifier().getText());
                typeArgMethodCallExpr.setTypeArgs(typeList);
                typeArgMethodCallExpr.setScope(leftExpression);
                typeArgMethodCallExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(primaryContext.thisSuffix().arguments()));
                leftExpression = typeArgMethodCallExpr;

                return leftExpression;
            case 4:
                ObjectCreationExpr objectCreationExpr = Adapters.getInnerCreatorContextAdapter().adapt(primaryContext.thisSuffix().innerCreator());
                objectCreationExpr.setScope(leftExpression);
                return objectCreationExpr;
        }

        return null;
    }
}
