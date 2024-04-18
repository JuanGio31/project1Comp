package org.example.analizadores;

import java_cup.runtime.*;import javax.swing.text.html.parser.Parser;

%%
%public
%class Lexer_XML
%cup
%line
%column
%ignorecase

L = [\w]
nombre = [A-Z]+
D = [0-9]
name = (\$|"_"|"-") ((\$|"_"|"-") | {L})*
ID = "\"" {name} "\""

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
    "="     {return symbol(ParserXMLSym.EQ, yytext()); }
    "<"     {return symbol(ParserXMLSym.MENOR, yytext()); }
    ">"     {return symbol(ParserXMLSym.MAYOR, yytext()); }
    ","     {return symbol(ParserXMLSym.COMA, yytext()); }
    ";"     {return symbol(ParserXMLSym.P_COMA, yytext()); }
    "/"     {return symbol(ParserXMLSym.SLASH, yytext()); }
    "["     {return symbol(ParserXMLSym.COR_IZ, yytext()); }
    "]"     {return symbol(ParserXMLSym.COR_DER, yytext()); }


    "accion" {return symbol(ParserXMLSym.ACCION, yytext()); }
    "parametro" {return symbol(ParserXMLSym.PARAMETRO, yytext()); }
    "parametros"    {return symbol(ParserXMLSym.PARAMETROS, yytext()); }
    "atributos" {return symbol(ParserXMLSym.ATRIBUTOS, yytext()); }
    "atributo"  {return symbol(ParserXMLSym.ATRIBUTO, yytext()); }
    "nombre"    {return symbol(ParserXMLSym.NOMBRE, yytext()); }
    "etiqueta"  {return symbol(ParserXMLSym.ETIQUETA, yytext()); }
    "etiquetas"  {return symbol(ParserXMLSym.ETIQUETAS, yytext()); }
    "valor" {return symbol(ParserXMLSym.VALOR, yytext()); }

    {ID}    {return symbol(ParserXMLSym.ID, yytext()); }

    {WhiteSpace}+ { /* no haceer nada */}

    }

///[^] { throw new Error("cadena ilegal < "+ yytext()+" >"); }
//[^] { return symbol(ParserXMLSym.ERROR, yytext()); }
\n  {yychar=1;}
. {System.err.println("watning: Unrecognized character "+yytext()+ "--ignored"+" at " + (yyline+1) +", "+(yycolumn+1));}
