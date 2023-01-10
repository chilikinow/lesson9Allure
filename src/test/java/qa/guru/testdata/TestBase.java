package qa.guru.testdata;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import qa.guru.helpers.Attach;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

        Configuration.browser = "chrome";
        Configuration.browserVersion = "104.0";

        Configuration.remote = "http://selenoid:4444/wd/hub";
//        Configuration.remote = "http://localhost:4444/wd/hub";

//        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe"); //104.0.5112.79//Version=102.0.5005.61 for linux
//        System.setProperty("webdriver.chrome.driver", "C:\workspace\lesson9Allure\driver\chromedriver.exe");

        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
