// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.expr.*;
import pl.mpsk2.latte.psi.stmt.*;

public class LatteVisitor extends PsiElementVisitor {

  public void visitAccExpr(@NotNull LatteAccExpr o) {
    visitExpr(o);
  }

  public void visitAddExpr(@NotNull LatteAddExpr o) {
    visitBinaryExpr(o);
  }

  public void visitAndExpr(@NotNull LatteAndExpr o) {
    visitBinaryExpr(o);
  }

  public void visitAppExpr(@NotNull LatteAppExpr o) {
    visitExpr(o);
  }

  public void visitArg(@NotNull LatteArg o) {
    visitPsiElement(o);
  }

  public void visitArgVec(@NotNull LatteArgVec o) {
    visitPsiElement(o);
  }

  public void visitArrAccExpr(@NotNull LatteArrAccExpr o) {
    visitExpr(o);
  }

  public void visitArrayType(@NotNull LatteArrayType o) {
    visitType(o);
  }

  public void visitAssStmt(@NotNull LatteAssStmt o) {
    visitStmt(o);
  }

  public void visitBStmt(@NotNull LatteBStmt o) {
    visitStmt(o);
  }

  public void visitBasicType(@NotNull LatteBasicType o) {
    visitType(o);
  }

  public void visitBinaryExpr(@NotNull LatteBinaryExpr o) {
    visitExpr(o);
  }

  public void visitBlock(@NotNull LatteBlock o) {
    visitPsiElement(o);
  }

  public void visitCastExpr(@NotNull LatteCastExpr o) {
    visitExpr(o);
  }

  public void visitClsDef(@NotNull LatteClsDef o) {
    visitPsiElement(o);
  }

  public void visitClsElem(@NotNull LatteClsElem o) {
    visitPsiElement(o);
  }

  public void visitClsField(@NotNull LatteClsField o) {
    visitPsiElement(o);
  }

  public void visitClsMethod(@NotNull LatteClsMethod o) {
    visitPsiElement(o);
  }

  public void visitCmpExpr(@NotNull LatteCmpExpr o) {
    visitBinaryExpr(o);
  }

  public void visitCondElseStmt(@NotNull LatteCondElseStmt o) {
    visitStmt(o);
  }

  public void visitDeclStmt(@NotNull LatteDeclStmt o) {
    visitStmt(o);
  }

  public void visitDecrStmt(@NotNull LatteDecrStmt o) {
    visitStmt(o);
  }

  public void visitEmptyStmt(@NotNull LatteEmptyStmt o) {
    visitStmt(o);
  }

  public void visitExpr(@NotNull LatteExpr o) {
    visitPsiElement(o);
  }

  public void visitExprStmt(@NotNull LatteExprStmt o) {
    visitStmt(o);
  }

  public void visitExprVec(@NotNull LatteExprVec o) {
    visitPsiElement(o);
  }

  public void visitFnDef(@NotNull LatteFnDef o) {
    visitPsiElement(o);
  }

  public void visitForStmt(@NotNull LatteForStmt o) {
    visitStmt(o);
  }

  public void visitIdent(@NotNull LatteIdent o) {
    visitPsiElement(o);
  }

  public void visitIdentType(@NotNull LatteIdentType o) {
    visitType(o);
  }

  public void visitIncrStmt(@NotNull LatteIncrStmt o) {
    visitStmt(o);
  }

  public void visitItem(@NotNull LatteItem o) {
    visitPsiElement(o);
  }

  public void visitItemVec(@NotNull LatteItemVec o) {
    visitPsiElement(o);
  }

  public void visitLitExpr(@NotNull LatteLitExpr o) {
    visitExpr(o);
  }

  public void visitMulExpr(@NotNull LatteMulExpr o) {
    visitBinaryExpr(o);
  }

  public void visitNegExpr(@NotNull LatteNegExpr o) {
    visitExpr(o);
  }

  public void visitNewExpr(@NotNull LatteNewExpr o) {
    visitExpr(o);
  }

  public void visitNewExprType(@NotNull LatteNewExprType o) {
    visitType(o);
  }

  public void visitNotExpr(@NotNull LatteNotExpr o) {
    visitExpr(o);
  }

  public void visitOrExpr(@NotNull LatteOrExpr o) {
    visitBinaryExpr(o);
  }

  public void visitParenExpr(@NotNull LatteParenExpr o) {
    visitExpr(o);
  }

  public void visitRetStmt(@NotNull LatteRetStmt o) {
    visitStmt(o);
  }

  public void visitStmt(@NotNull LatteStmt o) {
    visitPsiElement(o);
  }

  public void visitTopDef(@NotNull LatteTopDef o) {
    visitPsiElement(o);
  }

  public void visitType(@NotNull LatteType o) {
    visitPsiElement(o);
  }

  public void visitVarExpr(@NotNull LatteVarExpr o) {
    visitExpr(o);
  }

  public void visitWhileStmt(@NotNull LatteWhileStmt o) {
    visitStmt(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
