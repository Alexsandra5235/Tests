import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта
 */
public class MainPage {
    Constants constants = new Constants();
    /**
     * Нажатие на ссылку создания аккаунта
     */
    public CreateAccountPage ClickHrefCreateAccount(){
        constants.hrefCreateAccount.click();
        return new CreateAccountPage();
    }





}
