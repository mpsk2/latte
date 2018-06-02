// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import pl.mpsk2.latte.psi.util.LattePsiTreeUtil;
import static pl.mpsk2.latte.psi.LatteTypes.*;
import pl.mpsk2.latte.psi.*;

public class LatteClsDefImpl extends LatteCompositeElementImpl implements LatteClsDef {

  public LatteClsDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatteVisitor visitor) {
    visitor.visitClsDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatteVisitor) accept((LatteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LatteClsElem> getClsElemList() {
    return LattePsiTreeUtil.getChildrenOfTypeAsList(this, LatteClsElem.class);
  }

  @Override
  @NotNull
  public List<LatteIdent> getIdentList() {
    return LattePsiTreeUtil.getChildrenOfTypeAsList(this, LatteIdent.class);
  }

  @Override
  @NotNull
  public PsiElement getCls() {
    return findNotNullChildByType(CLS);
  }

  @Override
  @Nullable
  public PsiElement getExtends() {
    return findChildByType(EXTENDS);
  }

  @Override
  @Nullable
  public PsiElement getLbrace() {
    return findChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

}
