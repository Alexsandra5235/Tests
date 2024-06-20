import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateAccountTest extends BaseTest{


    @Test
    public void FillTextElement(){
        mainPage.ClickHrefCreateAccount();

        createAccountPage.ClickTextBoxEmail(constants.Email);
        createAccountPage.ClickTextBoxPassword(constants.Password);
        createAccountPage.ClickTextBoxConfirmPassword(constants.Password);
        createAccountPage.ClickTextBoxFirstName(constants.FirstName);
        createAccountPage.ClickTextBoxLastName(constants.LastName);
        createAccountPage.ClickButtonCreateAccount();

        assertTrue(myAccountPage.VisibleItemPage());
    }

    @Test
    public void EmptyTextElement(){
        mainPage.ClickHrefCreateAccount();

        createAccountPage.ClickButtonCreateAccount();

        assertTrue(createAccountPage.VisibleItemClickCreateAccount());
    }

    @Test
    public void registeredEmail(){
        mainPage.ClickHrefCreateAccount();

        createAccountPage.ClickTextBoxEmail(constants.registeredEmail);
        createAccountPage.ClickTextBoxPassword(constants.Password);
        createAccountPage.ClickTextBoxConfirmPassword(constants.Password);
        createAccountPage.ClickTextBoxFirstName(constants.FirstName);
        createAccountPage.ClickTextBoxLastName(constants.LastName);

        createAccountPage.ClickButtonCreateAccount();

        assertTrue(createAccountPage.visibleMessengerRegisteredEmail());
    }

    @Test
    public void invalidEmail(){
        mainPage.ClickHrefCreateAccount();

        createAccountPage.ClickTextBoxEmail(constants.invalidEmail);
        createAccountPage.ClickTextBoxPassword(constants.Password);
        createAccountPage.ClickTextBoxConfirmPassword(constants.Password);
        createAccountPage.ClickTextBoxFirstName(constants.FirstName);
        createAccountPage.ClickTextBoxLastName(constants.LastName);

        Selenide.sleep(3000);

        createAccountPage.ClickButtonCreateAccount();

        Selenide.sleep(3000);

        assertTrue(createAccountPage.visibleMessengerInvalidEmail());

    }

}
