// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import pl.mpsk2.latte.psi.util.LattePsiTreeUtil;
import static pl.mpsk2.latte.psi.LatteTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import pl.mpsk2.latte.psi.*;

public class LatteTopDefImpl extends ASTWrapperPsiElement implements LatteTopDef {

  public LatteTopDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitTopDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatteFnDef getFnDef() {
    return findNotNullChildByClass(LatteFnDef.class);
  }

}
