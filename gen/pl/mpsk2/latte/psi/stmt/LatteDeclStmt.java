// This is a generated file. Not intended for manual editing.
package pl.mpsk2.latte.psi.stmt;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import pl.mpsk2.latte.psi.LatteItemVec;
import pl.mpsk2.latte.psi.LatteType;

public interface LatteDeclStmt extends LatteStmt {

  @NotNull
  LatteItemVec getItemVec();

  @NotNull
  LatteType getType();

  @NotNull
  PsiElement getSem();

}
