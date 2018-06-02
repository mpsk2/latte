package pl.mpsk2.latte.parser;

public class GoodLatteParserTest extends LatteParserTestBase {
    public GoodLatteParserTest() {
        super("good");
    }

    public void testEmpty() { doTest(); }
    public void testHelloWorld() { doTest(); }
    public void testPrintTo10() { doTest(); }
    public void testReturn() { doTest(); }
    public void testStrong() { doTest(); }
}
