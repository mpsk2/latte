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
import pl.mpsk2.latte.psi.LatteItemVec;
import pl.mpsk2.latte.psi.LatteType;

public class LatteDeclStmtImpl extends LatteStmtImpl implements LatteDeclStmt {

  public LatteDeclStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitDeclStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatteItemVec getItemVec() {
    return findNotNullChildByClass(LatteItemVec.class);
  }

  @Override
  @NotNull
  public LatteType getType() {
    return findNotNullChildByClass(LatteType.class);
  }

  @Override
  @NotNull
  public PsiElement getSem() {
    return findNotNullChildByType(SEM);
  }

}
