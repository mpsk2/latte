// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import pl.mpsk2.latte.psi.tree.LatteElementType;
import pl.mpsk2.latte.psi.tree.LatteTokenType;
import pl.mpsk2.latte.psi.impl.*;
import pl.mpsk2.latte.psi.impl.expr.*;
import pl.mpsk2.latte.psi.impl.stmt.*;

public interface LatteTypes {

  IElementType ADD_EXPR = new LatteElementType("ADD_EXPR");
  IElementType AND_EXPR = new LatteElementType("AND_EXPR");
  IElementType APP_EXPR = new LatteElementType("APP_EXPR");
  IElementType ARG = new LatteElementType("ARG");
  IElementType ARG_VEC = new LatteElementType("ARG_VEC");
  IElementType ASS_STMT = new LatteElementType("ASS_STMT");
  IElementType BLOCK = new LatteElementType("BLOCK");
  IElementType B_STMT = new LatteElementType("B_STMT");
  IElementType CMP_EXPR = new LatteElementType("CMP_EXPR");
  IElementType COND_ELSE_STMT = new LatteElementType("COND_ELSE_STMT");
  IElementType COND_STMT = new LatteElementType("COND_STMT");
  IElementType DECL_STMT = new LatteElementType("DECL_STMT");
  IElementType DECR_STMT = new LatteElementType("DECR_STMT");
  IElementType EMPTY_STMT = new LatteElementType("EMPTY_STMT");
  IElementType EXPR = new LatteElementType("EXPR");
  IElementType EXPR_STMT = new LatteElementType("EXPR_STMT");
  IElementType EXPR_VEC = new LatteElementType("EXPR_VEC");
  IElementType FN_DEF = new LatteElementType("FN_DEF");
  IElementType IDENT = new LatteElementType("IDENT");
  IElementType INCR_STMT = new LatteElementType("INCR_STMT");
  IElementType ITEM = new LatteElementType("ITEM");
  IElementType ITEM_VEC = new LatteElementType("ITEM_VEC");
  IElementType LIT_EXPR = new LatteElementType("LIT_EXPR");
  IElementType MUL_EXPR = new LatteElementType("MUL_EXPR");
  IElementType NEG_EXPR = new LatteElementType("NEG_EXPR");
  IElementType NOT_EXPR = new LatteElementType("NOT_EXPR");
  IElementType OR_EXPR = new LatteElementType("OR_EXPR");
  IElementType RET_STMT = new LatteElementType("RET_STMT");
  IElementType STMT = new LatteElementType("STMT");
  IElementType TOP_DEF = new LatteElementType("TOP_DEF");
  IElementType TYPE = new LatteElementType("TYPE");
  IElementType VAR_EXPR = new LatteElementType("VAR_EXPR");
  IElementType V_RET_STMT = new LatteElementType("V_RET_STMT");
  IElementType WHILE_STMT = new LatteElementType("WHILE_STMT");

  IElementType ADD = new LatteTokenType("+");
  IElementType AND = new LatteTokenType("&&");
  IElementType ASS = new LatteTokenType("=");
  IElementType BOOL = new LatteTokenType("boolean");
  IElementType COMMA = new LatteTokenType(",");
  IElementType COMMENT = new LatteTokenType("comment");
  IElementType DECR = new LatteTokenType("--");
  IElementType DIV = new LatteTokenType("/");
  IElementType ELSE = new LatteTokenType("else");
  IElementType EQ = new LatteTokenType("==");
  IElementType FALSE = new LatteTokenType("false");
  IElementType FOR = new LatteTokenType("for");
  IElementType GEQ = new LatteTokenType(">=");
  IElementType GT = new LatteTokenType(">");
  IElementType ID = new LatteTokenType("id");
  IElementType IF = new LatteTokenType("if");
  IElementType INCR = new LatteTokenType("++");
  IElementType INT = new LatteTokenType("int");
  IElementType LBRACE = new LatteTokenType("{");
  IElementType LBRACK = new LatteTokenType("[");
  IElementType LEQ = new LatteTokenType("<=");
  IElementType LPAREN = new LatteTokenType("(");
  IElementType LT = new LatteTokenType("<");
  IElementType MOD = new LatteTokenType("%");
  IElementType MUL = new LatteTokenType("*");
  IElementType NEQ = new LatteTokenType("!=");
  IElementType NOT = new LatteTokenType("!");
  IElementType NUMBER = new LatteTokenType("number");
  IElementType OR = new LatteTokenType("||");
  IElementType RBRACE = new LatteTokenType("}");
  IElementType RBRACK = new LatteTokenType("]");
  IElementType RETURN = new LatteTokenType("return");
  IElementType RPAREN = new LatteTokenType(")");
  IElementType SEM = new LatteTokenType(";");
  IElementType STR = new LatteTokenType("string");
  IElementType STRING = new LatteTokenType("string");
  IElementType SUB = new LatteTokenType("-");
  IElementType TRUE = new LatteTokenType("true");
  IElementType VOID = new LatteTokenType("void");
  IElementType WHILE = new LatteTokenType("whiel");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADD_EXPR) {
        return new LatteAddExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new LatteAndExprImpl(node);
      }
      else if (type == APP_EXPR) {
        return new LatteAppExprImpl(node);
      }
      else if (type == ARG) {
        return new LatteArgImpl(node);
      }
      else if (type == ARG_VEC) {
        return new LatteArgVecImpl(node);
      }
      else if (type == ASS_STMT) {
        return new LatteAssStmtImpl(node);
      }
      else if (type == BLOCK) {
        return new LatteBlockImpl(node);
      }
      else if (type == B_STMT) {
        return new LatteBStmtImpl(node);
      }
      else if (type == CMP_EXPR) {
        return new LatteCmpExprImpl(node);
      }
      else if (type == COND_ELSE_STMT) {
        return new LatteCondElseStmtImpl(node);
      }
      else if (type == COND_STMT) {
        return new LatteCondStmtImpl(node);
      }
      else if (type == DECL_STMT) {
        return new LatteDeclStmtImpl(node);
      }
      else if (type == DECR_STMT) {
        return new LatteDecrStmtImpl(node);
      }
      else if (type == EMPTY_STMT) {
        return new LatteEmptyStmtImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new LatteExprStmtImpl(node);
      }
      else if (type == EXPR_VEC) {
        return new LatteExprVecImpl(node);
      }
      else if (type == FN_DEF) {
        return new LatteFnDefImpl(node);
      }
      else if (type == IDENT) {
        return new LatteIdentImpl(node);
      }
      else if (type == INCR_STMT) {
        return new LatteIncrStmtImpl(node);
      }
      else if (type == ITEM) {
        return new LatteItemImpl(node);
      }
      else if (type == ITEM_VEC) {
        return new LatteItemVecImpl(node);
      }
      else if (type == LIT_EXPR) {
        return new LatteLitExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new LatteMulExprImpl(node);
      }
      else if (type == NEG_EXPR) {
        return new LatteNegExprImpl(node);
      }
      else if (type == NOT_EXPR) {
        return new LatteNotExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new LatteOrExprImpl(node);
      }
      else if (type == RET_STMT) {
        return new LatteRetStmtImpl(node);
      }
      else if (type == TOP_DEF) {
        return new LatteTopDefImpl(node);
      }
      else if (type == TYPE) {
        return new LatteTypeImpl(node);
      }
      else if (type == VAR_EXPR) {
        return new LatteVarExprImpl(node);
      }
      else if (type == V_RET_STMT) {
        return new LatteVRetStmtImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new LatteWhileStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}