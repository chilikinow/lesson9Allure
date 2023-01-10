package qa.guru.testdata;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import qa.guru.helpers.Attach;

import java.util.ArrayList;
import java.util.HashMap;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

//        Configuration.browser = "chrome";
//        Configuration.browserVersion = "104.0";

//        Configuration.remote = "http://selenoid:4444/wd/hub";
        Configuration.remote = "http://localhost:4444/wd/hub";
//        Configuration.browserSize = "1920x1080";


//        System.setProperty("selenide.browser", "Chrome");
//        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe"); //104.0.5112.79//Version=102.0.5005.61 for linux
//        System.setProperty("webdriver.chrome.driver", "C:\workspace\lesson9Allure\driver\chromedriver.exe");

//        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);


//        capabilities.setCapability("browserVersion", "104.0");
//        capabilities.setCapability("selenoid:options", new HashMap<String, Object>() {{
//            /* How to add test badge */
//            put("name", "Test badge...");
//
//            /* How to set session timeout */
//            put("sessionTimeout", "15m");
//
//            /* How to set timezone */
//            put("env", new ArrayList<String>() {{
//                add("TZ=UTC");
//            }});
//
//            /* How to add "trash" button */
//            put("labels", new HashMap<String, Object>() {{
//                put("manual", "true");
//            }});
//
//            /* How to enable video recording */
//            put("enableVideo", true);
//        }});


//        Configuration.browserCapabilities = capabilities;

    }

    @BeforeEach
    void addListener() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
//        Attach.browserConsoleLogs();
//        Attach.addVideo();
    }
}
