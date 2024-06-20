import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static net.bytebuddy.matcher.ElementMatchers.is;


/**
 * Страница создания аккаунта
 */
public class CreateAccountPage {
    Constants constants = new Constants();

    /**
     * Заполнение поля "Email"
     *
     * @param text
     */
    public void ClickTextBoxEmail(String text) {
        constants.textBoxEmail.sendKeys(text);
    }

    /**
     * Заполнение поля "Password"
     *
     * @param text
     */
    public void ClickTextBoxPassword(String text) {
        constants.textBoxPassword.sendKeys(text);
    }

    /**
     * Заполнение поля "Confirm Password"
     *
     * @param text
     */
    public void ClickTextBoxConfirmPassword(String text) {
        constants.textBoxConfirmPassword.sendKeys(text);
    }

    /**
     * Заполнение поля "First Name"
     *
     * @param text
     */
    public void ClickTextBoxFirstName(String text) {
        constants.textBoxFirstName.sendKeys(text);
    }

    /**
     * Заполнение поля "Last Name"
     *
     * @param text
     */
    public void ClickTextBoxLastName(String text) {
        constants.textBoxLastName.sendKeys(text);
    }

    /**
     * Нажание по кнопке "Create An Account"
     */
    public MyAccountPage ClickButtonCreateAccount() {
        constants.buttonCreateAccount.click();
        return new MyAccountPage();
    }

    /**
     * Проверка отображения элемента, который появляется при ошибке Создания аккаунта
     *
     * @return
     */
    public boolean VisibleItemClickCreateAccount() {
        for (SelenideElement element : constants.errorClickButtonCreateAccount) {
            if (element.shouldBe(visible).isDisplayed()) {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
    public boolean visibleMessengerRegisteredEmail() {
        return constants.errorEmailRegistered.shouldBe(visible).isDisplayed();
    }
    public boolean visibleMessengerInvalidEmail(){
        return constants.errorInvalidEmail.shouldBe(visible).isDisplayed();
    }


}
