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
}
