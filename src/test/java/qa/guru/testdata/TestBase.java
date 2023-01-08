package qa.guru.testdata;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

//        Configuration.headless = true;
        Configuration.remote = "http://localhost:4444";
        Configuration.browserSize = "1920x1080";
    }
}
