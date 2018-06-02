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

public class LatteVRetStmtImpl extends LatteStmtImpl implements LatteVRetStmt {

  public LatteVRetStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitVRetStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getReturn() {
    return findNotNullChildByType(RETURN);
  }

  @Override
  @NotNull
  public PsiElement getSem() {
    return findNotNullChildByType(SEM);
  }

}
