package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/4/12
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExpressionAdapter implements Adapter<Expression, Java7Parser.ExpressionContext> {
    @Override
    public Expression adapt(Java7Parser.ExpressionContext context) {

        switch (context.expressionType) {
            case 1:
                return Adapters.getPrimaryAdapter().adapt(context.primary());
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
        }

        /*
            expression
            locals [int expressionType]
                :   primary                                                         {$expressionType = 1;}
                |   expression DOT Identifier                                       {$expressionType = 2;}
                |   expression DOT THIS                                             {$expressionType = 3;}
                |   expression DOT SUPER LPAREN expressionList? RPAREN              {$expressionType = 4;}
                |   expression DOT NEW Identifier LPAREN expressionList? RPAREN     {$expressionType = 5;}
                |   expression DOT SUPER DOT Identifier arguments?                  {$expressionType = 6;}
                |   expression DOT explicitGenericInvocation                        {$expressionType = 7;}
                |   NEW creator                                                     {$expressionType = 8;}
                |   expression LBRACKET expression RBRACKET                         {$expressionType = 9;}
                |   LPAREN type RPAREN expression                                   {$expressionType = 10;}
                |   expression (PLUSPLUS | SUBSUB)                                  {$expressionType = 11;}
                |   expression LPAREN expressionList? RPAREN                        {$expressionType = 12;}
                |   (PLUS|SUB|PLUSPLUS|SUBSUB) expression                           {$expressionType = 13;}
                |   (TILDE|BANG) expression                                         {$expressionType = 14;}
                |   expression (STAR|SLASH|PERCENT) expression                      {$expressionType = 15;}
                |   expression (PLUS|SUB) expression                                {$expressionType = 16;}
                |   expression (LTLT | GTGTGT | GTGT) expression                    {$expressionType = 17;}
                |   expression (LTEQ | GTEQ | GT | LT) expression                   {$expressionType = 18;}
                |   expression INSTANCEOF type                                      {$expressionType = 19;}
                |   expression (EQEQ | BANGEQ) expression                           {$expressionType = 20;}
                |   expression AMP expression                                       {$expressionType = 21;}
                |   expression CARET<assoc=right> expression                        {$expressionType = 22;}
                |   expression BAR expression                                       {$expressionType = 23;}
                |   expression AMPAMP expression                                    {$expressionType = 24;}
                |   expression BARBAR expression                                    {$expressionType = 25;}
                |   expression QUES expression COLON expression                     {$expressionType = 26;}
                |   expression
                    (CARETEQ<assoc=right>
                    |PLUSEQ<assoc=right>
                    |SUBEQ<assoc=right>
                    |STAREQ<assoc=right>
                    |SLASHEQ<assoc=right>
                    |AMPEQ<assoc=right>
                    |BAREQ<assoc=right>
                    |EQ<assoc=right>
                    |GTGTEQ<assoc=right>
                    |GTGTGTEQ<assoc=right>
                    |LTLTEQ<assoc=right>
                    |PERCENTEQ<assoc=right>
                    )
                    expression                                                      {$expressionType = 27;}
                ;
         */

        return null;
    }
}
