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

        myAccountPage.clickChangePassword();

        accountInformationPage.fullCurrentPassword(constants.Password);
        accountInformationPage.fullNewPassword(constants.newPassword);
        accountInformationPage.fullConfirmNewPassword(constants.newPassword);
        accountInformationPage.clickButtonSave();

        assertTrue(signInPage.visibleMessengerValidChangePassword());
    }
}
