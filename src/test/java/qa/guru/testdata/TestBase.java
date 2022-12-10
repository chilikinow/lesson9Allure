package qa.guru.testdata;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
//        Configuration.holdBrowserOpen = true;
    }
}
