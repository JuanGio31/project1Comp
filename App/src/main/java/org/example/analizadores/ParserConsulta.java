
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package org.example.analizadores;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserConsulta extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserConsultaSym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserConsulta() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserConsulta(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserConsulta(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\006\004\000\002\006" +
    "\005\000\002\006\003\000\002\007\003\000\002\007\003" +
    "\000\002\007\003\000\002\007\003\000\002\010\003\000" +
    "\002\010\005\000\002\002\005\000\002\003\005\000\002" +
    "\004\005\000\002\005\006\000\002\005\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\006\003\005\013\004\001\002\000\012\014" +
    "\014\015\021\016\020\017\015\001\002\000\006\002\ufffe" +
    "\013\ufffe\001\002\000\006\002\010\013\007\001\002\000" +
    "\012\014\014\015\021\016\020\017\015\001\002\000\004" +
    "\002\001\001\002\000\006\002\ufffd\013\ufffd\001\002\000" +
    "\006\002\ufffa\013\ufffa\001\002\000\006\002\uffff\013\uffff" +
    "\001\002\000\004\011\022\001\002\000\006\012\031\020" +
    "\032\001\002\000\006\002\ufffb\013\ufffb\001\002\000\006" +
    "\002\ufffc\013\ufffc\001\002\000\004\011\022\001\002\000" +
    "\004\011\022\001\002\000\006\007\ufff9\010\ufff9\001\002" +
    "\000\006\007\024\010\025\001\002\000\004\011\026\001" +
    "\002\000\006\002\ufff6\013\ufff6\001\002\000\006\007\ufff8" +
    "\010\ufff8\001\002\000\006\007\024\010\030\001\002\000" +
    "\006\002\ufff5\013\ufff5\001\002\000\004\011\022\001\002" +
    "\000\004\011\022\001\002\000\006\007\024\010\034\001" +
    "\002\000\006\002\ufff3\013\ufff3\001\002\000\006\007\024" +
    "\010\036\001\002\000\006\002\ufff4\013\ufff4\001\002\000" +
    "\006\007\024\010\040\001\002\000\006\002\ufff7\013\ufff7" +
    "\001\002\000\006\002\000\013\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\004\006\005\001\001\000\014\002\010\003" +
    "\016\004\015\005\011\007\040\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\002\010\003\016\004\015\005" +
    "\011\007\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\036\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\026\001\001\000\004\010\022\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\010\034\001\001\000\004\010\032\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserConsulta$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserConsulta$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserConsulta$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



     public void syntax_error (Symbol sy) {
            System.out.println("Sintax error: "+ sy.value);
        }

        public void unrecovered_syntax_error(Symbol s)throws java.lang.Exception{
            System.out.println("Sintax error:" + s.value + " en la linea "+s.right+", columna "+s.left);
        }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserConsulta$actions {
  private final ParserConsulta parser;

  /** Constructor */
  CUP$ParserConsulta$actions(ParserConsulta parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserConsulta$do_action_part00000000(
    int                        CUP$ParserConsulta$act_num,
    java_cup.runtime.lr_parser CUP$ParserConsulta$parser,
    java.util.Stack            CUP$ParserConsulta$stack,
    int                        CUP$ParserConsulta$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserConsulta$result;

      /* select the action based on the action number */
      switch (CUP$ParserConsulta$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-1)).value;
		RESULT = start_val;
              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-1)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserConsulta$parser.done_parsing();
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= CONSULTAR A 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("S",4, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-1)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // S ::= S CONSULTAR A 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("S",4, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-2)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // S ::= error 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("S",4, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // A ::= visitas_sitio 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("A",5, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // A ::= visitas_pagina 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("A",5, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // A ::= paginas_pop 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("A",5, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // A ::= componente 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("A",5, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // B ::= PATH 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("B",6, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // B ::= B COMA PATH 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("B",6, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-2)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // visitas_sitio ::= VIS_SITIOS B P_COMA 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("visitas_sitio",0, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-2)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // visitas_pagina ::= VIS_PAGINA B P_COMA 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("visitas_pagina",1, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-2)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // paginas_pop ::= PAG_POPULARES B P_COMA 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("paginas_pop",2, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-2)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // componente ::= COMPONENTE ID B P_COMA 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("componente",3, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-3)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // componente ::= COMPONENTE TODOS B P_COMA 
            {
              Object RESULT =null;

              CUP$ParserConsulta$result = parser.getSymbolFactory().newSymbol("componente",3, ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.elementAt(CUP$ParserConsulta$top-3)), ((java_cup.runtime.Symbol)CUP$ParserConsulta$stack.peek()), RESULT);
            }
          return CUP$ParserConsulta$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserConsulta$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserConsulta$do_action(
    int                        CUP$ParserConsulta$act_num,
    java_cup.runtime.lr_parser CUP$ParserConsulta$parser,
    java.util.Stack            CUP$ParserConsulta$stack,
    int                        CUP$ParserConsulta$top)
    throws java.lang.Exception
    {
              return CUP$ParserConsulta$do_action_part00000000(
                               CUP$ParserConsulta$act_num,
                               CUP$ParserConsulta$parser,
                               CUP$ParserConsulta$stack,
                               CUP$ParserConsulta$top);
    }
}

}