package qa.guru.testdata;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

        Configuration.remote = "http://selenoid:4444/wd/hub";
//        Configuration.remote = "http://localhost:4444/wd/hub";
//        Configuration.browserSize = "1920x1080";
//        Configuration.browserVersion = "104.0";

//        Configuration.browser = "chrome";
//        System.setProperty("selenide.browser", "Chrome");
//        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe"); //104.0.5112.79//Version=102.0.5005.61 for linux
//        System.setProperty("webdriver.chrome.driver", "C:\workspace\lesson9Allure\driver\chromedriver.exe");

    }
}
