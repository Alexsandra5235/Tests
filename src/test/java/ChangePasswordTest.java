import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangePasswordTest extends BaseTest {
    /**
     * Изменение пароля с корректными параметрами
     */
    @Test
    public void ChangePassword(){
        mainPage.ClickHrefSignIn();

        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.Password);
        signInPage.clickButtonSignIn();

        mainPage.clickDropDownList();
        mainPage.clickMyAccount();

        myAccountPage.clickButtonEdit();

        accountInformationPage.onCheckBoxChangePassword();
        accountInformationPage.fullCurrentPassword(constants.Password);
        accountInformationPage.fullNewPassword(constants.newPassword);
        accountInformationPage.fullConfirmNewPassword(constants.newPassword);
        accountInformationPage.clickButtonSave();

        assertTrue(signInPage.visibleMessengerValidChangePassword());
        // Меняем пароль обратно
        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.newPassword);
        signInPage.clickButtonSignIn();

        mainPage.clickDropDownList();
        mainPage.clickMyAccount();

        myAccountPage.clickButtonEdit();

        accountInformationPage.onCheckBoxChangePassword();
        accountInformationPage.fullCurrentPassword(constants.newPassword);
        accountInformationPage.fullNewPassword(constants.Password);
        accountInformationPage.fullConfirmNewPassword(constants.Password);
        accountInformationPage.clickButtonSave();
    }

    /**
     * Изменение пароля с неверным параметром "Current Password"
     */
    @Test
    public void ChangePasswordInvalidCurrentPassword(){
        mainPage.ClickHrefSignIn();

        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.Password);
        signInPage.clickButtonSignIn();

        mainPage.clickDropDownList();
        mainPage.clickMyAccount();

        myAccountPage.clickButtonEdit();

        accountInformationPage.fullCurrentPassword(constants.newPassword);
        accountInformationPage.fullNewPassword(constants.Password);
        accountInformationPage.fullConfirmNewPassword(constants.Password);
        accountInformationPage.clickButtonSave();

        assertTrue(accountInformationPage.visibleMessengerInvalidCurrentPassword());

    }
}
