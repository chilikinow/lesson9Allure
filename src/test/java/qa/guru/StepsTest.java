package qa.guru;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import qa.guru.testdata.TestBase;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class StepsTest extends TestBase {

    private static final String REPOSITORY = "eroshenkoam/allure-example";

    private static final int ISSUENUMBER = 76;

    @Test
    void lambdaStepsTest() {

        step("Открываем страницу", () -> {
            open("https://github.com");
                });
        step("Ищем репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").setValue(REPOSITORY).submit();
                });
        step("Кликаем по ссылке репозитория " + REPOSITORY, () -> {
                    $(linkText(REPOSITORY)).click();
                });
        step("Открываем список задач", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем наличие задачи с номером " + ISSUENUMBER, () -> {
            $(withText("#" + ISSUENUMBER)).shouldBe(Condition.visible);
        });

    }

    @Test
    void annotatedStepTest() {

        WebSteps webSteps = new WebSteps();

        webSteps.openMainPage();
        webSteps.searchForRepository(REPOSITORY);
        webSteps.clickOnRepositoryLink(REPOSITORY);
        webSteps.openIssuesTab();
        webSteps.shouldSeeIssueWithNumber(ISSUENUMBER);
    }
}
