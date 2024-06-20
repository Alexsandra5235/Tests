import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.its.etsi102941.Url;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {

    MainPage mainPage = new MainPage();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    SignInPage signInPage = new SignInPage();
    Constants constants = new Constants();

    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "edge";
        Configuration.browserSize="1920x1080";
        Configuration.headless=false;
    }

    @BeforeEach
    public void Init(){
        SetUp();
        Selenide.open(constants.Url);
    }

    @AfterEach()
    public void TernDown(){
        Selenide.closeWebDriver();
    }
}
