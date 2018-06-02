package pl.mpsk2.latte;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LatteFileType extends LanguageFileType {
    public static final LatteFileType INSTANCE = new LatteFileType();

    private LatteFileType() {
        super(LatteLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Latte file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Latte language file";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "lat";
    }

}
