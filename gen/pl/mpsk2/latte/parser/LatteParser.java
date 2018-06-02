// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static pl.mpsk2.latte.psi.LatteTypes.*;
import static pl.mpsk2.latte.parser.LatteParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LatteParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARG) {
      r = Arg(b, 0);
    }
    else if (t == ARG_VEC) {
      r = ArgVec(b, 0);
    }
    else if (t == ASS_STMT) {
      r = AssStmt(b, 0);
    }
    else if (t == B_STMT) {
      r = BStmt(b, 0);
    }
    else if (t == BLOCK) {
      r = Block(b, 0);
    }
    else if (t == COND_ELSE_STMT) {
      r = CondElseStmt(b, 0);
    }
    else if (t == COND_STMT) {
      r = CondStmt(b, 0);
    }
    else if (t == DECL_STMT) {
      r = DeclStmt(b, 0);
    }
    else if (t == DECR_STMT) {
      r = DecrStmt(b, 0);
    }
    else if (t == EMPTY_STMT) {
      r = EmptyStmt(b, 0);
    }
    else if (t == EXPR) {
      r = Expr(b, 0, -1);
    }
    else if (t == EXPR_STMT) {
      r = ExprStmt(b, 0);
    }
    else if (t == EXPR_VEC) {
      r = ExprVec(b, 0);
    }
    else if (t == FN_DEF) {
      r = FnDef(b, 0);
    }
    else if (t == IDENT) {
      r = Ident(b, 0);
    }
    else if (t == INCR_STMT) {
      r = IncrStmt(b, 0);
    }
    else if (t == ITEM) {
      r = Item(b, 0);
    }
    else if (t == ITEM_VEC) {
      r = ItemVec(b, 0);
    }
    else if (t == RET_STMT) {
      r = RetStmt(b, 0);
    }
    else if (t == STMT) {
      r = Stmt(b, 0);
    }
    else if (t == TOP_DEF) {
      r = TopDef(b, 0);
    }
    else if (t == TYPE) {
      r = Type(b, 0);
    }
    else if (t == V_RET_STMT) {
      r = VRetStmt(b, 0);
    }
    else if (t == WHILE_STMT) {
      r = WhileStmt(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return Program(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADD_EXPR, AND_EXPR, APP_EXPR, CMP_EXPR,
      EXPR, LIT_EXPR, MUL_EXPR, NEG_EXPR,
      NOT_EXPR, OR_EXPR, VAR_EXPR),
    create_token_set_(ASS_STMT, B_STMT, COND_ELSE_STMT, COND_STMT,
      DECL_STMT, DECR_STMT, EMPTY_STMT, EXPR_STMT,
      INCR_STMT, RET_STMT, STMT, V_RET_STMT,
      WHILE_STMT),
  };

  /* ********************************************************** */
  // ADD | SUB
  static boolean AddOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddOp")) return false;
    if (!nextTokenIs(b, "", ADD, SUB)) return false;
    boolean r;
    r = consumeToken(b, ADD);
    if (!r) r = consumeToken(b, SUB);
    return r;
  }

  /* ********************************************************** */
  // Type Ident
  public static boolean Arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = Type(b, l + 1);
    r = r && Ident(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Arg (COMMA Arg)*
  public static boolean ArgVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG_VEC, "<arg vec>");
    r = Arg(b, l + 1);
    r = r && ArgVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA Arg)*
  private static boolean ArgVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgVec_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ArgVec_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArgVec_1", c)) break;
    }
    return true;
  }

  // COMMA Arg
  private static boolean ArgVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Ident ASS Expr SEM
  public static boolean AssStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssStmt")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && consumeToken(b, ASS);
    r = r && Expr(b, l + 1, -1);
    r = r && consumeToken(b, SEM);
    exit_section_(b, m, ASS_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // Block
  public static boolean BStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BStmt")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Block(b, l + 1);
    exit_section_(b, m, B_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE Stmt* RBRACE
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && Block_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // Stmt*
  private static boolean Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LT | LEQ | GT | GEQ | EQ | NEQ
  static boolean CmpOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CmpOp")) return false;
    boolean r;
    r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, LEQ);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, GEQ);
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NEQ);
    return r;
  }

  /* ********************************************************** */
  // IF LPAREN Expr RPAREN Stmt ELSE Stmt
  public static boolean CondElseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CondElseStmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && Expr(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    r = r && Stmt(b, l + 1);
    r = r && consumeToken(b, ELSE);
    r = r && Stmt(b, l + 1);
    exit_section_(b, m, COND_ELSE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // IF LPAREN Expr RPAREN Stmt
  public static boolean CondStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CondStmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && Expr(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    r = r && Stmt(b, l + 1);
    exit_section_(b, m, COND_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // Type ItemVec SEM
  public static boolean DeclStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DeclStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_STMT, "<decl stmt>");
    r = Type(b, l + 1);
    r = r && ItemVec(b, l + 1);
    r = r && consumeToken(b, SEM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Ident DECR SEM
  public static boolean DecrStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecrStmt")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && consumeTokens(b, 0, DECR, SEM);
    exit_section_(b, m, DECR_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // SEM
  public static boolean EmptyStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyStmt")) return false;
    if (!nextTokenIs(b, SEM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEM);
    exit_section_(b, m, EMPTY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // Expr SEM
  public static boolean ExprStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = Expr(b, l + 1, -1);
    r = r && consumeToken(b, SEM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expr (COMMA Expr)?
  public static boolean ExprVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprVec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_VEC, "<expr vec>");
    r = Expr(b, l + 1, -1);
    r = r && ExprVec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA Expr)?
  private static boolean ExprVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprVec_1")) return false;
    ExprVec_1_0(b, l + 1);
    return true;
  }

  // COMMA Expr
  private static boolean ExprVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Type Ident LPAREN ArgVec? RPAREN Block
  public static boolean FnDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_DEF, "<fn def>");
    r = Type(b, l + 1);
    r = r && Ident(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && FnDef_3(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ArgVec?
  private static boolean FnDef_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDef_3")) return false;
    ArgVec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // id
  public static boolean Ident(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Ident")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // Ident INCR SEM
  public static boolean IncrStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IncrStmt")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && consumeTokens(b, 0, INCR, SEM);
    exit_section_(b, m, INCR_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // Ident (ASS Expr)?
  public static boolean Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && Item_1(b, l + 1);
    exit_section_(b, m, ITEM, r);
    return r;
  }

  // (ASS Expr)?
  private static boolean Item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_1")) return false;
    Item_1_0(b, l + 1);
    return true;
  }

  // ASS Expr
  private static boolean Item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASS);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Item (COMMA Item)?
  public static boolean ItemVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ItemVec")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Item(b, l + 1);
    r = r && ItemVec_1(b, l + 1);
    exit_section_(b, m, ITEM_VEC, r);
    return r;
  }

  // (COMMA Item)?
  private static boolean ItemVec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ItemVec_1")) return false;
    ItemVec_1_0(b, l + 1);
    return true;
  }

  // COMMA Item
  private static boolean ItemVec_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ItemVec_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MUL | DIV | MOD
  static boolean MulOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulOp")) return false;
    boolean r;
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    return r;
  }

  /* ********************************************************** */
  // TopDef*
  static boolean Program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Program")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TopDef(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Program", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // RETURN Expr SEM
  public static boolean RetStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RetStmt")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && Expr(b, l + 1, -1);
    r = r && consumeToken(b, SEM);
    exit_section_(b, m, RET_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // EmptyStmt
  //     | BStmt
  //     | DeclStmt
  //     | AssStmt
  //     | IncrStmt
  //     | DecrStmt
  //     | RetStmt
  //     | VRetStmt
  //     | CondStmt
  //     | CondElseStmt
  //     | WhileStmt
  //     | ExprStmt
  public static boolean Stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, STMT, "<stmt>");
    r = EmptyStmt(b, l + 1);
    if (!r) r = BStmt(b, l + 1);
    if (!r) r = DeclStmt(b, l + 1);
    if (!r) r = AssStmt(b, l + 1);
    if (!r) r = IncrStmt(b, l + 1);
    if (!r) r = DecrStmt(b, l + 1);
    if (!r) r = RetStmt(b, l + 1);
    if (!r) r = VRetStmt(b, l + 1);
    if (!r) r = CondStmt(b, l + 1);
    if (!r) r = CondElseStmt(b, l + 1);
    if (!r) r = WhileStmt(b, l + 1);
    if (!r) r = ExprStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FnDef
  public static boolean TopDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopDef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_DEF, "<top def>");
    r = FnDef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INT | STR | BOOL | VOID
  public static boolean Type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, STR);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, VOID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RETURN SEM
  public static boolean VRetStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VRetStmt")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RETURN, SEM);
    exit_section_(b, m, V_RET_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // WHILE LPAREN Expr RPAREN Stmt
  public static boolean WhileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LPAREN);
    r = r && Expr(b, l + 1, -1);
    r = r && consumeToken(b, RPAREN);
    r = r && Stmt(b, l + 1);
    exit_section_(b, m, WHILE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Expr
  // Operator priority table:
  // 0: BINARY(OrExpr)
  // 1: BINARY(AndExpr)
  // 2: BINARY(CmpExpr)
  // 3: BINARY(AddExpr)
  // 4: BINARY(MulExpr)
  // 5: ATOM(NotExpr)
  // 6: ATOM(NegExpr)
  // 7: ATOM(AppExpr)
  // 8: ATOM(VarExpr)
  // 9: ATOM(LitExpr)
  public static boolean Expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = NotExpr(b, l + 1);
    if (!r) r = NegExpr(b, l + 1);
    if (!r) r = AppExpr(b, l + 1);
    if (!r) r = VarExpr(b, l + 1);
    if (!r) r = LitExpr(b, l + 1);
    p = r;
    r = r && Expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, OR)) {
        r = Expr(b, l, 0);
        exit_section_(b, l, m, OR_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, AND)) {
        r = Expr(b, l, 1);
        exit_section_(b, l, m, AND_EXPR, r, true, null);
      }
      else if (g < 2 && CmpOp(b, l + 1)) {
        r = Expr(b, l, 2);
        exit_section_(b, l, m, CMP_EXPR, r, true, null);
      }
      else if (g < 3 && AddOp(b, l + 1)) {
        r = Expr(b, l, 3);
        exit_section_(b, l, m, ADD_EXPR, r, true, null);
      }
      else if (g < 4 && MulOp(b, l + 1)) {
        r = Expr(b, l, 4);
        exit_section_(b, l, m, MUL_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // NOT Expr
  public static boolean NotExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NotExpr")) return false;
    if (!nextTokenIsSmart(b, NOT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NOT_EXPR, null);
    r = consumeTokenSmart(b, NOT);
    p = r; // pin = 1
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SUB Expr
  public static boolean NegExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NegExpr")) return false;
    if (!nextTokenIsSmart(b, SUB)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NEG_EXPR, null);
    r = consumeTokenSmart(b, SUB);
    p = r; // pin = 1
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Ident LPAREN ExprVec? RPAREN
  public static boolean AppExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppExpr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && AppExpr_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, APP_EXPR, r);
    return r;
  }

  // ExprVec?
  private static boolean AppExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AppExpr_2")) return false;
    ExprVec(b, l + 1);
    return true;
  }

  // Ident
  public static boolean VarExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarExpr")) return false;
    if (!nextTokenIsSmart(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Ident(b, l + 1);
    exit_section_(b, m, VAR_EXPR, r);
    return r;
  }

  // number | string | TRUE | FALSE
  public static boolean LitExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LitExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIT_EXPR, "<lit expr>");
    r = consumeTokenSmart(b, NUMBER);
    if (!r) r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, TRUE);
    if (!r) r = consumeTokenSmart(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}