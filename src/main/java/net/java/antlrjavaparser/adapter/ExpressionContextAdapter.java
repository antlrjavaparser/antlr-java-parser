package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.AssignExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class ExpressionContextAdapter implements Adapter<Expression, Java7Parser.ExpressionContext> {
    public Expression adapt(Java7Parser.ExpressionContext context) {

        Expression expression = null;
        if (context.conditionalExpression() != null) {
            expression = Adapters.getConditionalExpressionContextAdapter().adapt(context.conditionalExpression());
        }

        if (context.assignmentOperator() != null) {
            // This is an assignment expression

            /*
                :   EQ          {$assignmentType = 1;}
                |   PLUSEQ      {$assignmentType = 2;}
                |   SUBEQ       {$assignmentType = 3;}
                |   STAREQ      {$assignmentType = 4;}
                |   SLASHEQ     {$assignmentType = 5;}
                |   AMPEQ       {$assignmentType = 6;}
                |   BAREQ       {$assignmentType = 7;}
                |   CARETEQ     {$assignmentType = 8;}
                |   PERCENTEQ   {$assignmentType = 9;}
                |   LT LT EQ    {$assignmentType = 10;}
                |   GT GT GT EQ {$assignmentType = 11;}
                |   GT GT EQ    {$assignmentType = 12;}
             */
            AssignExpr assignExpr = new AssignExpr();

            AssignExpr.Operator operator = null;
            switch (context.assignmentOperator().assignmentType) {
                case 1:
                    operator = AssignExpr.Operator.assign;
                    break;
                case 2:
                    operator = AssignExpr.Operator.plus;
                    break;
                case 3:
                    operator = AssignExpr.Operator.minus;
                    break;
                case 4:
                    operator = AssignExpr.Operator.star;
                    break;
                case 5:
                    operator = AssignExpr.Operator.slash;
                    break;
                case 6:
                    operator = AssignExpr.Operator.and;
                    break;
                case 7:
                    operator = AssignExpr.Operator.or;
                    break;
                case 8:
                    operator = AssignExpr.Operator.xor;
                    break;
                case 9:
                    operator = AssignExpr.Operator.rem;
                    break;
                case 10:
                    operator = AssignExpr.Operator.lShift;
                    break;
                case 11:
                    operator = AssignExpr.Operator.rUnsignedShift;
                    break;
                case 12:
                    operator = AssignExpr.Operator.rSignedShift;
                    break;
            }
            assignExpr.setOperator(operator);
            assignExpr.setValue(Adapters.getExpressionContextAdapter().adapt(context.expression()));
            assignExpr.setTarget(expression);

            return assignExpr;
        } else {
            return expression;
        }
    }
}
