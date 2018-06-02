package pl.mpsk2.latte;

import com.intellij.lang.Language;

public class LatteLanguage extends Language {
    public static final LatteLanguage INSTANCE = new LatteLanguage();

    private LatteLanguage() {
        super("Latte");
    }
}