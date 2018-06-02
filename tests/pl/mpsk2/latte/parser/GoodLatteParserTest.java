package pl.mpsk2.latte.parser;

public class GoodLatteParserTest extends LatteParserTestBase {
    public GoodLatteParserTest() {
        super("good");
    }

    public void testEmpty() { doTest(true); }
}
