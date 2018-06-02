package pl.mpsk2.latte.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static pl.mpsk2.latte.psi.LatteTypes.*;

%%

%{
  public _LatteLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _LatteLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
LINE_COMMENT=("//"|#).*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"
NUMBER=[0-9]+(\.[0-9]*)?
ID=[:letter:][a-zA-Z_0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  ";"                  { return SEM; }
  "{"                  { return LBRACE; }
  "["                  { return LBRACK; }
  "("                  { return LPAREN; }
  "}"                  { return RBRACE; }
  "]"                  { return RBRACK; }
  ")"                  { return RPAREN; }
  ","                  { return COMMA; }
  "."                  { return DOT; }
  "int"                { return INT; }
  "boolean"            { return BOOL; }
  "string"             { return STR; }
  "void"               { return VOID; }
  "&&"                 { return AND; }
  "||"                 { return OR; }
  "+"                  { return ADD; }
  "-"                  { return SUB; }
  "*"                  { return MUL; }
  "/"                  { return DIV; }
  "%"                  { return MOD; }
  "<"                  { return LT; }
  "<="                 { return LEQ; }
  ">"                  { return GT; }
  ">="                 { return GEQ; }
  "=="                 { return EQ; }
  "!="                 { return NEQ; }
  "!"                  { return NOT; }
  "="                  { return ASS; }
  "++"                 { return INCR; }
  "--"                 { return DECR; }
  "return"             { return RETURN; }
  "if"                 { return IF; }
  "else"               { return ELSE; }
  "while"              { return WHILE; }
  "for"                { return FOR; }
  "true"               { return TRUE; }
  "false"              { return FALSE; }
  "class"              { return CLS; }
  "new"                { return NEW; }
  "null"               { return NULL; }

  {SPACE}              { return SPACE; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {NUMBER}             { return NUMBER; }
  {ID}                 { return ID; }
  {STRING}             { return STRING; }

}

[^] { return BAD_CHARACTER; }
