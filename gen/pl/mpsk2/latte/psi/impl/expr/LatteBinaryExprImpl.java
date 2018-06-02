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

public class LatteBinaryExprImpl extends LatteExprImpl implements LatteBinaryExpr {

  public LatteBinaryExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitBinaryExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LatteExpr> getExprList() {
    return LattePsiTreeUtil.getChildrenOfTypeAsList(this, LatteExpr.class);
  }

  @Override
  @NotNull
  public LatteExpr getLhs() {
    List<LatteExpr> p1 = getExprList();
    return p1.get(0);
  }

  @Override
  @Nullable
  public LatteExpr getRhs() {
    List<LatteExpr> p1 = getExprList();
    return p1.size() < 2 ? null : p1.get(1);
  }

}
