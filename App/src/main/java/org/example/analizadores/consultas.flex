package org.example.analizadores;

import java_cup.runtime.*;

%%
%public
%class Lexer_Consulta
%cup
%line
%column

L = [\w]
D = [0-9]
name = {L}*|{L}*["."]{L}*
path = "\"" {name} "\""

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
    return symbol(ParserConsultaSym.EOF);
%eofval}

%%
<YYINITIAL> {
    "="     {return symbol(ParserConsultaSym.IGUAL, yytext()); }
    "<"     {return symbol(ParserConsultaSym.MENOR, yytext()); }
    ">"     {return symbol(ParserConsultaSym.MAYOR, yytext()); }
    ","     {return symbol(ParserConsultaSym.COMA, yytext()); }
    ";"     {return symbol(ParserConsultaSym.P_COMA, yytext()); }

    {path}    {return symbol(ParserConsultaSym.PATH, yytext()); }
    (\$|"_"|"-") ((\$|"_"|"-") | {L})*       {return
symbol(ParserConsultaSym.ID, yytext()); }

    {L}*          {
                        String str = yytext();
                        if (str.toUpperCase().equals("CONSULTAR")) {
                            return symbol(ParserConsultaSym.CONSULTAR,
yytext());
                        }else if (str.toUpperCase().equals("VISITAS_SITIO")){
                            return symbol(ParserConsultaSym.VIS_SITIOS,
yytext());
                        }else if(str.toUpperCase().equals("VISITAS_PAGINA")){
                            return symbol(ParserConsultaSym.VIS_PAGINA,
yytext());
                        } else
if(str.toUpperCase().equals("PAGINAS_POPULARES")){
                            return symbol(ParserConsultaSym.PAG_POPULARES,
yytext());
                        }else if(str.toUpperCase().equals("COMPONENTE")){
                            return symbol(ParserConsultaSym.COMPONENTE,
yytext());
                        }else if(str.toUpperCase().equals("TODOS")){
                            return symbol(ParserConsultaSym.TODOS, yytext());
                        }
                    }
    {WhiteSpace}+ { /* no haceer nada */}

    }

///[^] { throw new Error("cadena ilegal < "+ yytext()+" >"); }
//[^] { return symbol(ParserConsultaSym.ERROR, yytext()); }
\n  {yychar=1;}
. {System.err.println("watning: Unrecognized character "+yytext()+ "--ignored"+" at " + (yyline+1) +", "+(yycolumn+1));}
