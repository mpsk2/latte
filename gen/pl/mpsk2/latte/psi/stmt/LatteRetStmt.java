// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.stmt;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.expr.LatteExpr;

public interface LatteRetStmt extends LatteStmt {

  @NotNull
  LatteExpr getExpr();

  @NotNull
  PsiElement getReturn();

  @NotNull
  PsiElement getSem();

}
