package org.example.analizadores;

import java_cup.runtime.*;
import javax.swing.text.html.parser.Parser;

%%
%public
%class Lexer_XML
%cup
%line
%column
%ignorecase

L = [\w]
especiales = [\W]
v = ({L}|{especiales})*}
ID = (\$|"_"|"-") ((\$|"_"|"-") | {L})*
FechaFormato = [0-9]{4}-[0-9]{2}-[0-9]{2}
Color = \\\\#[0-9A-Fa-f]{6}
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
    //**    ATRIBUTOS   **//
    "accion"      { return symbol(ParserXMLSym.ACCION, yytext()); }
    "parametro"   { return symbol(ParserXMLSym.PARAMETRO, yytext()); }
    "parametros"  { return symbol(ParserXMLSym.PARAMETROS, yytext()); }
    "atributos"   { return symbol(ParserXMLSym.ATRIBUTOS, yytext()); }
    "atributo"    { return symbol(ParserXMLSym.ATRIBUTO, yytext()); }
    "nombre"      { return symbol(ParserXMLSym.NOMBRE, yytext()); }
    "etiqueta"    { return symbol(ParserXMLSym.ETIQUETA, yytext()); }
    "etiquetas"   { return symbol(ParserXMLSym.ETIQUETAS, yytext()); }
    "valor"       { return symbol(ParserXMLSym.VALOR, yytext()); }

    "="     { return symbol(ParserXMLSym.EQ, yytext()); }
    "<"     { return symbol(ParserXMLSym.MENOR, yytext()); }
    ">"     { return symbol(ParserXMLSym.MAYOR, yytext()); }
    ","     { return symbol(ParserXMLSym.COMA, yytext()); }
    ";"     { return symbol(ParserXMLSym.P_COMA, yytext()); }
    "/"     { return symbol(ParserXMLSym.SLASH, yytext()); }


    {L}+    {
                String temp = yytext();
                switch (temp){
                    case "NUEVO_SITIO_WEB":         return symbol(ParserXMLSym.NUEVO_SITIO, yytext());
                    case "BORRAR_SITIO_WEB":        return symbol(ParserXMLSym.BORRAR_SITIO, yytext());
                    case "NUEVA_PAGINA":            return symbol(ParserXMLSym.NUEVA_PAGINA, yytext());
                    case "BORRAR_PAGINA":           return symbol(ParserXMLSym.BORRAR_PAGINA, yytext());
                    case "MODIFICAR_PAGINA":        return symbol(ParserXMLSym.MODIFICAR_PAGINA, yytext());
                    case "AGREGAR_COMPONENTE":      return symbol(ParserXMLSym.ADD_COMPONENTE, yytext());
                    case "BORRAR_COMPONENTE":       return symbol(ParserXMLSym.BORRAR_COMP, yytext());
                        //**    PARAMETROS DE LAS ACCIONES  **//
                    case "ID":                      return symbol(ParserXMLSym.ID, yytext());
                    case "USUARIO_CREACION":        return symbol(ParserXMLSym.USUARIO_CREACION, yytext());
                    case "FECHA_CREACION":          return symbol(ParserXMLSym.FECHA_CREACION, yytext());
                    case "FECHA_MODIFICACION":      return symbol(ParserXMLSym.FECHA_MOD, yytext());
                    case "USUARIO_MODIFICACION":    return symbol(ParserXMLSym.USUARIO_MOD, yytext());
                    case "TITULO":                  return symbol(ParserXMLSym.TITULO, yytext());
                    case "SITIO":                   return symbol(ParserXMLSym.SITIO, yytext());
                    case "PADRE":                   return symbol(ParserXMLSym.PADRE, yytext());
                    case "PAGINA":                  return symbol(ParserXMLSym.PAGINA, yytext());
                    case "CLASE":                   return symbol(ParserXMLSym.CLASE, yytext());
                    case "TEXTO":                   return symbol(ParserXMLSym.TEXTO, yytext());
                    case "ALINEACION":              return symbol(ParserXMLSym.ALINEACION, yytext());
                    case "CENTRAR":                 return symbol(ParserXMLSym.CENTRAR, yytext());
                    case "IZQUIERDA":               return symbol(ParserXMLSym.IZQUIERDA, yytext());
                    case "DERECHA":                 return symbol(ParserXMLSym.DERECHA, yytext());
                    case "JUSTIFICAR":              return symbol(ParserXMLSym.JUSTIFICAR, yytext());
                    case "COLOR":                   return symbol(ParserXMLSym.COLOR, yytext());
                    case "ORIGEN":                  return symbol(ParserXMLSym.ORIGEN, yytext());
                    case "ALTURA":                  return symbol(ParserXMLSym.ALTURA, yytext());
                    case "ANCHO":                   return symbol(ParserXMLSym.ANCHO, yytext());
                }
            }

    {ID}    { return symbol(ParserXMLSym.VAL_ID, yytext()); }

    /* Fechas */
    {FechaFormato} { return symbol(ParserXMLSym.VAL_FECHA, yytext()); }

    /* Colores */
    {Color} { return symbol(ParserXMLSym.VAL_COLOR, yytext()); }

    "[" {v} "]"    {return symbol(ParserXMLSym.VALOR_P, yytext()); }

    {WhiteSpace}+ { /* no haceer nada */}

    }

///[^] { throw new Error("cadena ilegal < "+ yytext()+" >"); }
//[^] { return symbol(ParserXMLSym.ERROR, yytext()); }
\n  {yychar=1;}
. {System.err.println("watning: Unrecognized character "+yytext()+ "--ignored"+" at " + (yyline+1) +", "+(yycolumn+1));}
