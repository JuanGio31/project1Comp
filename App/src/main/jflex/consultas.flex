package org.example;

import java_cup.runtime.*;

%%
%public
%class Lexer_Consultas
%cup
%line
%column

L = [\w]
D = [0-9]
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]

%{
      StringBuffer string = new StringBuffer();

      private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }
%}


%eofval{
    return symbol(ParserSym.EOF);
%eofval}

%%
<YYINITIAL> {
    ("$"|"_"|"-"){L}*       {/*No hace nada*/}
    {L}*          {
                        String str = yytext();
                        if (str.toUpperCase().equals("CONSULTAR")) {
                            return symbol(ParserSym.CONSULTAR, yytetxt());
                        }else if (str.toUpperCase().equals("VISITAS_SITIO")){
                            return symbol(ParserSym.VIS_SITIOS, yytext());
                        }else if(str.toUpperCase().equals("VISITAS_PAGINA")){
                            return symbol(ParserSym.VIS_PAGINA, yytext());
                        } else if(str.toUpperCase().equals("PAGINAS_POPULARES")){
                            return symbol(ParserSym.PAG_POPULARES, yytext());
                        }else if(str.toUpperCase().equals("COMPONENTE")){
                            return symbol(ParserSym.COMPONENTE, yytext());
                        }else if(str.toUpperCase().equals("TODOS")){
                            return symbol(ParserSym.TODOS, yytext());
                        }
                    }
    {WhiteSpace}+ { /* no haceer nada */}

    }

///[^] { throw new Error("cadena ilegal < "+ yytext()+" >"); }
//[^] { return symbol(ParserSym.ERROR, yytext()); }
\n  {yychar=1;}
. {System.err.println("watning: Unrecognized character "+yytext()+ "--ignored"+" at " + (yyline+1) +", "+(yycolumn+1));}