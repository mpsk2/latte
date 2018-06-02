package pl.mpsk2.latte.psi.tree;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.latte.LatteLanguage;

public class LatteElementType extends IElementType {
    public LatteElementType(@NotNull @Nls String debugName) {
        super(debugName, LatteLanguage.INSTANCE);
    }
}
