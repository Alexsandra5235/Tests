import static com.codeborne.selenide.Condition.visible;

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
    /**
     * Нажатие на ссылку авторизации пользователя
     */
    public SignInPage ClickHrefSignIn(){
        constants.hrefSignIn.click();
        return new SignInPage();
    }
    /**
     * Отображение элемента страницы
     * @return
     */
    public boolean visibleItemPage(){
        return constants.textWelcomeMainPage.shouldBe(visible).isDisplayed();
    }

    /**
     * Раскрытие выпадающего списка для перехода в настройки аккаунта
     */
    public void clickDropDownList(){
        constants.buttonOpenDropDownList.click();
    }

    /**
     * Переход в аккаунт пользователя
     * @return
     */
    public MyAccountPage clickMyAccount(){
        constants.buttonOpenMyAccount.click();
        return new MyAccountPage();
    }






}
