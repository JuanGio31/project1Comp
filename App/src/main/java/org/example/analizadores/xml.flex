
package org.example;

import java_cup.runtime.*;

%%
%public
%class Lexer_XML
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
    return symbol(ParserXMLSym.EOF);
%eofval}

%%
<YYINITIAL> {
    "="     {return symbol(ParserXMLSym.IGUAL, yytext()); }
    "<"     {return symbol(ParserXMLSym.MENOR, yytext()); }
    ">"     {return symbol(ParserXMLSym.MAYOR, yytext()); }
    ","     {return symbol(ParserXMLSym.COMA, yytext()); }
    ";"     {return symbol(ParserXMLSym.P_COMA, yytext()); }

    {path}    {return symbol(ParserXMLSym.PATH, yytext()); }
    (\$|"_"|"-") ((\$|"_"|"-") | {L})*       {return
symbol(ParserXMLSym.ID, yytext()); }

    {L}*          {
                        String str = yytext();
                        if (str.toUpperCase().equals("CONSULTAR")) {
                            return symbol(ParserXMLSym.CONSULTAR,
yytext());
                        }else if (str.toUpperCase().equals("VISITAS_SITIO")){
                            return symbol(ParserXMLSym.VIS_SITIOS,
yytext());
                        }else if(str.toUpperCase().equals("VISITAS_PAGINA")){
                            return symbol(ParserXMLSym.VIS_PAGINA,
yytext());
                        } else
if(str.toUpperCase().equals("PAGINAS_POPULARES")){
                            return symbol(ParserXMLSym.PAG_POPULARES,
yytext());
                        }else if(str.toUpperCase().equals("COMPONENTE")){
                            return symbol(ParserXMLSym.COMPONENTE,
yytext());
                        }else if(str.toUpperCase().equals("TODOS")){
                            return symbol(ParserXMLSym.TODOS, yytext());
                        }
                    }
    {WhiteSpace}+ { /* no haceer nada */}

    }

///[^] { throw new Error("cadena ilegal < "+ yytext()+" >"); }
//[^] { return symbol(ParserXMLSym.ERROR, yytext()); }
\n  {yychar=1;}
. {System.err.println("watning: Unrecognized character "+yytext()+ "--ignored"+" at " + (yyline+1) +", "+(yycolumn+1));}
