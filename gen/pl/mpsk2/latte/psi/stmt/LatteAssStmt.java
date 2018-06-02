// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.stmt;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.LatteIdent;
import pl.mpsk2.latte.psi.expr.LatteExpr;

public interface LatteAssStmt extends LatteStmt {

  @NotNull
  List<LatteExpr> getExprList();

  @NotNull
  List<LatteIdent> getIdentList();

  @NotNull
  PsiElement getAss();

  @Nullable
  PsiElement getLbrack();

  @Nullable
  PsiElement getRbrack();

  @Nullable
  PsiElement getSem();

}
