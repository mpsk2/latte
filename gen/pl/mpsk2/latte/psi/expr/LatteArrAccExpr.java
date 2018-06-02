// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.expr;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LatteArrAccExpr extends LatteExpr {

  @NotNull
  List<LatteExpr> getExprList();

  @NotNull
  PsiElement getLbrack();

  @Nullable
  PsiElement getRbrack();

}
