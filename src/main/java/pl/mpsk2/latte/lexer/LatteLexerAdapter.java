package pl.mpsk2.latte.lexer;

import com.intellij.lexer.FlexAdapter;

public class LatteLexerAdapter extends FlexAdapter {
    public LatteLexerAdapter() {
        super(new _LatteLexer());
    }
}
