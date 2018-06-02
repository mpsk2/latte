// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.impl.expr;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import pl.mpsk2.latte.psi.util.LattePsiTreeUtil;
import static pl.mpsk2.latte.psi.LatteTypes.*;
import pl.mpsk2.latte.psi.expr.*;
import pl.mpsk2.latte.psi.LatteVisitor;
import pl.mpsk2.latte.psi.impl.LattePsiImplUtil;

public class LatteNotExprImpl extends LatteExprImpl implements LatteNotExpr {

  public LatteNotExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitNotExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LatteExpr getExpr() {
    return findChildByClass(LatteExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getNot() {
    return findNotNullChildByType(NOT);
  }

}
