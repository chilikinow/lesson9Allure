package qa.guru;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step("Открываем страницу")
    void openMainPage(){
        open("https://github.com");
    }

    @Step("Ищем репозиторий {repo}")
    void searchForRepository(String repo){
        $(".header-search-input").setValue(repo).submit();
    }

    @Step("Кликаем по ссылке репозитория {repo}")
    void clickOnRepositoryLink(String repo){
        $(linkText(repo)).click();
    }

    @Step("Открываем список задач")
    void openIssuesTab(){
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие задачи с номером {issue}")
    void shouldSeeIssueWithNumber(int issue){
        $(withText("#" + issue)).shouldBe(Condition.exist);
    }

}
