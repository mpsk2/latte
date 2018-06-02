// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.stmt;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.LatteArrayAcc;
import pl.mpsk2.latte.psi.LatteIdentVec;
import pl.mpsk2.latte.psi.expr.LatteExpr;

public interface LatteAssStmt extends LatteStmt {

  @Nullable
  LatteArrayAcc getArrayAcc();

  @Nullable
  LatteExpr getExpr();

  @NotNull
  LatteIdentVec getIdentVec();

  @NotNull
  PsiElement getAss();

  @Nullable
  PsiElement getSem();

}
