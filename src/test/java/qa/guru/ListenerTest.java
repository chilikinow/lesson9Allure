package qa.guru;

import com.codeborne.selenide.Condition;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import qa.guru.testdata.TestBase;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class ListenerTest extends TestBase {

    @Test
    void checkExistIssueWithListener() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");
        $(".header-search-input").setValue("eroshenkoam/allure-example").submit();
        $(linkText("eroshenkoam/allure-example")).click();
        $("#issues-tab").click();
        $(withText("#76")).shouldBe(Condition.exist);
    }

}