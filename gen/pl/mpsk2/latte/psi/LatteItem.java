// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.expr.LatteExpr;

public interface LatteItem extends PsiElement {

  @Nullable
  LatteExpr getExpr();

  @NotNull
  LatteIdent getIdent();

  @Nullable
  PsiElement getAss();

}
