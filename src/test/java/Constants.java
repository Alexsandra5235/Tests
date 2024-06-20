import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class Constants {
    public final SelenideElement textBoxEmail = $x("//*[@id=\"email_address\"]"),
            textBoxPassword = $x("//*[@id=\"password\"]"),
            textBoxConfirmPassword = $x("//*[@id=\"password-confirmation\"]"),
            textBoxFirstName = $x("//*[@id=\"firstname\"]"),
            textBoxLastName = $x("//*[@id=\"lastname\"]"),
            buttonCreateAccount = $x("//*[@id=\"form-validate\"]/div/div[1]/button/span"),
            hrefCreateAccount = $x("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"),
            ItemTextMyAccount = $x("//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span"),
            ItemTextAccountInformation = $x("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[1]/strong"),
            errorEmailRegistered = $x("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"),
            errorInvalidEmail = $x("//*[@id=\"email_address-error\"]"),
            hrefSignIn = $x("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"),
            textBoxEmailSignIn = $x("//*[@id=\"email\"]"),
            textBoxPasswordSignIn = $x("//*[@id=\"pass\"]"),
            buttonSignIn = $x("//*[@id=\"send2\"]"),
            textWelcomeMainPage = $x("/html/body/div[2]/header/div[1]/div/ul/li[1]/span"),
            errorInvalidPassword = $x("//*[@id=\"maincontent\"]/div[2]"),
            buttonOpenDropDownList = $x("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button"),
            buttonOpenMyAccount = $x("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a"),
            buttonChangePassport = $x("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div/div[2]/a[2]"),
            textBoxCurrentPassword = $x("//*[@id=\"current-password\"]"),
            buttonSaveNewPassword = $x("//*[@id=\"form-validate\"]/div/div[1]/button"),
            messengerSuccessChangePassword = $x("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");

    public final ElementsCollection errorClickButtonCreateAccount = $$x("//*[@class=\"mage-error\"]");

    public final String Url = "https://magento.softwaretestingboard.com",
            Email = "sm33@gmail.com",
            Password = "Password56",
            FirstName = "Иван",
            LastName = "Пупкин",
            registeredEmail ="sm999999@gmail.com",
            invalidEmail = "Random56.text",
            invalidPassword = "Invalid56",
            newPassword = "NewPassword56";
}
