/**
 * Страница просмотра и изменения пользовательской информацции
 */
public class AccountInformationPage {
    Constants constants = new Constants();

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
}
