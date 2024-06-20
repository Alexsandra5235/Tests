import static com.codeborne.selenide.Condition.visible;

/**
 * Страница просмотра и изменения пользовательской информацции
 */
public class AccountInformationPage {
    Constants constants = new Constants();

    /**
     * Активация чекбокса "Change Password"
     */
    public void onCheckBoxChangePassword(){
        constants.checkBoxChangePassword.click();
    }
    /**
     * Заполнение поля "Current Password"
     * @param text
     */
    public void fullCurrentPassword(String text){
        constants.textBoxCurrentPassword.sendKeys(text);
    }

    /**
     * Заполнение поля "New Password"
     * @param text
     */
    public void fullNewPassword(String text){
        constants.textBoxPassword.sendKeys(text);
    }

    /**
     * Заполнение поля "Confirm New Password"
     * @param text
     */
    public void fullConfirmNewPassword(String text){
        constants.textBoxConfirmPassword.sendKeys(text);
    }

    /**
     * Нажатие на кнопку "Save"
     * @return
     */
    public SignInPage clickButtonSave(){
        constants.buttonSaveNewPassword.click();
        return new SignInPage();
    }

    /**
     * Проверка появления сообщения о неверно введеном "Current Password"
     * @return
     */
    public boolean visibleMessengerInvalidCurrentPassword(){
        return constants.messengerErrorCurrentPassword.shouldBe(visible).isDisplayed();
    }
}
