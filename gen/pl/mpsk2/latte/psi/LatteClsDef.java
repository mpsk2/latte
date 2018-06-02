// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LatteClsDef extends PsiElement {

  @NotNull
  List<LatteClsElem> getClsElemList();

  @NotNull
  List<LatteIdent> getIdentList();

  @NotNull
  PsiElement getCls();

  @Nullable
  PsiElement getExtends();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
