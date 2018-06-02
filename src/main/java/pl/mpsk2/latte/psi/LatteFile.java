package pl.mpsk2.latte.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.latte.LatteFileType;
import pl.mpsk2.latte.LatteLanguage;

import javax.swing.*;

public class LatteFile extends PsiFileBase {
    public LatteFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, LatteLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return LatteFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
