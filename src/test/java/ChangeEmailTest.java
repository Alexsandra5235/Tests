import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangeEmailTest extends BaseTest{
    /**
     * Изменение почты (параметры корректны)
     */
    @Test
    public void ChangeEmail(){
        mainPage.ClickHrefSignIn();

        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.Password);
        signInPage.clickButtonSignIn();

        mainPage.clickDropDownList();
        mainPage.clickMyAccount();

        myAccountPage.clickButtonEdit();

        accountInformationPage.onCheckBoxChangeEmail();
        accountInformationPage.cleanerTextBoxNewEmail();
        accountInformationPage.fullNewEmail(constants.newEmail);
        accountInformationPage.fullCurrentPassword(constants.Password);
        accountInformationPage.clickButtonSave();

        assertTrue(signInPage.visibleMessengerValidChangePassword());
        // Меняем почту обратно
        signInPage.fillEmail(constants.newEmail);
        signInPage.fillPassword(constants.Password);
        signInPage.clickButtonSignIn();

        mainPage.clickDropDownList();
        mainPage.clickMyAccount();

        myAccountPage.clickButtonEdit();

        accountInformationPage.onCheckBoxChangeEmail();
        accountInformationPage.cleanerTextBoxNewEmail();
        accountInformationPage.fullNewEmail(constants.registeredEmail);
        accountInformationPage.fullCurrentPassword(constants.Password);
        accountInformationPage.clickButtonSave();
    }
}
