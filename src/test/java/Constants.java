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
            textBoxCurrentPassword = $x("//*[@id=\"current-password\"]"),
            buttonSaveNewPassword = $x("//*[@id=\"form-validate\"]/div/div[1]/button"),
            messengerSuccessChangePassword = $x("//*[@id=\"maincontent\"]/div[2]"),
            messengerErrorCurrentPassword = $x("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"),
            buttonEdit = $x("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div/div[2]/a[1]"),
            checkBoxChangeEmail = $x("//*[@id=\"change-email\"]"),
            checkBoxChangePassword = $x("//*[@id=\"change-password\"]"),
            textBoxNewEmail = $x("//*[@id=\"email\"]"),
            buttonCategoryWoman = $x("//*[@id=\"ui-id-4\"]"),
            buttonSubcategoryTops = $x("//*[@id=\"ui-id-9\"]"),
            buttonSubcategoryJackets = $x("//*[@id=\"ui-id-11\"]"),
            buttonCartProduct = $x("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a"),
            buttonSize = $x("//*[@id=\"option-label-size-143-item-167\"]"),
            buttonColor = $x("//*[@id=\"option-label-color-93-item-50\"]"),
            buttonAddToCart = $x("//*[@id=\"product-addtocart-button\"]"),
            messengerSuccessAddToCard = $x("//*[@id=\"maincontent\"]/div[1]"),
            buttonAddToWishList = $x("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]"),
            messengeSuccessAddToWishList = $x("//*[@id=\"maincontent\"]/div[1]/div[2]");

    public final ElementsCollection errorClickButtonCreateAccount = $$x("//*[@class=\"mage-error\"]");

    public final String Url = "https://magento.softwaretestingboard.com",
            Email = "sm33@gmail.com",
            Password = "Password56",
            FirstName = "Иван",
            LastName = "Пупкин",
            registeredEmail ="sm999999@gmail.com",
            invalidEmail = "Random56.text",
            invalidPassword = "Invalid56",
            newPassword = "NewPassword56",
            newEmail = "new999999@gmail.com";
}
