package qa.guru.testdata;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        capabilities.setCapability(CapabilityType.BROWSER_VERSION, "102.0");

        Configuration.browserCapabilities = capabilities;
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browserSize = "1920x1080";
    }
}
