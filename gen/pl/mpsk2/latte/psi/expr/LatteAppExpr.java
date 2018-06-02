// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.expr;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.LatteExprVec;
import pl.mpsk2.latte.psi.LatteIdent;

public interface LatteAppExpr extends LatteExpr {

  @Nullable
  LatteExprVec getExprVec();

  @NotNull
  LatteIdent getIdent();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
