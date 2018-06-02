// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.stmt;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.LatteIdent;
import pl.mpsk2.latte.psi.LatteType;
import pl.mpsk2.latte.psi.expr.LatteExpr;

public interface LatteForStmt extends LatteStmt {

  @NotNull
  LatteExpr getExpr();

  @NotNull
  LatteIdent getIdent();

  @NotNull
  LatteStmt getStmt();

  @NotNull
  LatteType getType();

  @NotNull
  PsiElement getColon();

  @NotNull
  PsiElement getFor();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
