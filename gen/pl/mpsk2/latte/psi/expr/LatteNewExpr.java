// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.expr;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.LatteNewExprType;

public interface LatteNewExpr extends LatteExpr {

  @Nullable
  LatteNewExprType getNewExprType();

  @NotNull
  PsiElement getNew();

}