import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

/**
 * Страница авторизации
 */
public class SignInPage {
    Constants constants = new Constants();

    /**
     * Заполнение поля Email
     * @param text
     */
    public void fillEmail(String text){
        constants.textBoxEmailSignIn.sendKeys(text);
    }
    /**
     * Заполнение поля Password
     * @param text
     */
    public void fillPassword(String text){
        constants.textBoxPasswordSignIn.sendKeys(text);
    }
    /**
     * Нажатие по кнопке "Sign In"
     * @return
     */
    public MainPage clickButtonSignIn(){
        constants.buttonSignIn.click();
        return new MainPage();
    }

    /**
     * Проверка появдения сообщения о необходимости заполнить поля
     * @return
     */
    public boolean visibleMessengerEmptyText(){
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

    /**
     * Проверка появления сообщения о вводе неверного пароля
     * @return
     */
    public boolean visibleMessengerInvalidPassword(){
        return constants.errorInvalidPassword.shouldBe(visible).isDisplayed();
    }
}
