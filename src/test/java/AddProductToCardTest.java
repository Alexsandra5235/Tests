import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddProductToCardTest extends BaseTest{
    /**
     * Добавление товара в корзину
     */
    @Test
    public void AddToCard(){
        mainPage.ClickHrefSignIn();

        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.Password);
        signInPage.clickButtonSignIn();

        mainPage.clickCategoryJacket();
        mainPage.clickCardProduct();

        cardProductPage.changeSizeAndColor();
        cardProductPage.clickButtonAddToCard();

        assertTrue(cardProductPage.visibleMessengerSuccessAddToCard());
    }
}
