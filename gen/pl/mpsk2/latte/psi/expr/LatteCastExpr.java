// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.expr;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LatteCastExpr extends LatteExpr {

  @NotNull
  List<LatteExpr> getExprList();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
