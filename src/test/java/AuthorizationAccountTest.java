import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorizationAccountTest extends BaseTest{
    @Test
    public void AuthorizationValidParameters(){
        mainPage.ClickHrefSignIn();

        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.Password);

        signInPage.clickButtonSignIn();

        assertTrue(mainPage.visibleItemPage());
    }
}
