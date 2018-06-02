package pl.mpsk2.latte.parser;

import com.intellij.core.CoreApplicationEnvironment;
import com.intellij.lang.LanguageExtensionPoint;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.testFramework.ParsingTestCase;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.latte.LatteFileType;

abstract public class LatteParserTestBase extends ParsingTestCase {
    protected static final boolean CHECK_ERRORS = true;

    public LatteParserTestBase(String dataPath) {
        super(dataPath, LatteFileType.INSTANCE.getDefaultExtension(), new LatteParserDefinition());
    }

    @NotNull
    @Override
    protected String getTestDataPath() {
        return "testData/parser";
    }

    @Override
    protected boolean skipSpaces() {
        return true;
    }

    protected void doTest() {
        super.doTest(true);
        if (CHECK_ERRORS) {
            assertFalse(
                    "PsiFile contains error elements",
                    toParseTreeText(myFile, skipSpaces(), includeRanges()).contains("PsiErrorElement")
            );
        }
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        CoreApplicationEnvironment.registerExtensionPoint(
                Extensions.getRootArea(),
                "com.intellij.lang.braceMatcher",
                LanguageExtensionPoint.class
        );
    }
}