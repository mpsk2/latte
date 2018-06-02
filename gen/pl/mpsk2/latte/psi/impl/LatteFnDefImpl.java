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

public class LatteFnDefImpl extends ASTWrapperPsiElement implements LatteFnDef {

  public LatteFnDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitFnDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LatteArgVec getArgVec() {
    return findChildByClass(LatteArgVec.class);
  }

  @Override
  @NotNull
  public LatteBlock getBlock() {
    return findNotNullChildByClass(LatteBlock.class);
  }

  @Override
  @NotNull
  public LatteIdent getIdent() {
    return findNotNullChildByClass(LatteIdent.class);
  }

  @Override
  @NotNull
  public LatteType getType() {
    return findNotNullChildByClass(LatteType.class);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return findNotNullChildByType(LPAREN);
  }

  @Override
  @NotNull
  public PsiElement getRparen() {
    return findNotNullChildByType(RPAREN);
  }

}
