package pl.mpsk2.latte.psi.tree;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.latte.LatteLanguage;

public class LatteTokenType extends IElementType  {
    public LatteTokenType(@NotNull @Nls String debugName) {
        super(debugName, LatteLanguage.INSTANCE);
    }
}
