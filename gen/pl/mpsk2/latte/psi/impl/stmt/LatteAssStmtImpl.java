// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.impl.stmt;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import pl.mpsk2.latte.psi.util.LattePsiTreeUtil;
import static pl.mpsk2.latte.psi.LatteTypes.*;
import pl.mpsk2.latte.psi.stmt.*;
import pl.mpsk2.latte.psi.LatteVisitor;
import pl.mpsk2.latte.psi.impl.LattePsiImplUtil;
import pl.mpsk2.latte.psi.LatteIdent;
import pl.mpsk2.latte.psi.expr.LatteExpr;

public class LatteAssStmtImpl extends LatteStmtImpl implements LatteAssStmt {

  public LatteAssStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitAssStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatteExpr getExpr() {
    return findNotNullChildByClass(LatteExpr.class);
  }

  @Override
  @NotNull
  public LatteIdent getIdent() {
    return findNotNullChildByClass(LatteIdent.class);
  }

  @Override
  @NotNull
  public PsiElement getAss() {
    return findNotNullChildByType(ASS);
  }

  @Override
  @NotNull
  public PsiElement getSem() {
    return findNotNullChildByType(SEM);
  }

}
