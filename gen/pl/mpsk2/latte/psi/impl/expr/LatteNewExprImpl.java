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
import pl.mpsk2.latte.psi.LatteNewExprType;

public class LatteNewExprImpl extends LatteExprImpl implements LatteNewExpr {

  public LatteNewExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitNewExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LatteNewExprType getNewExprType() {
    return findChildByClass(LatteNewExprType.class);
  }

  @Override
  @NotNull
  public PsiElement getNew() {
    return findNotNullChildByType(NEW);
  }

}
