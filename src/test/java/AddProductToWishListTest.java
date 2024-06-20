import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddProductToWishListTest extends BaseTest{
    @Test
    public void AddToWishList(){
        mainPage.ClickHrefSignIn();

        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.Password);
        signInPage.clickButtonSignIn();

        mainPage.clickCategoryJacket();
        mainPage.clickCardProduct();

        cardProductPage.clickButtonAddToWishList();

        assertTrue(myWishListPage.visibleMessengerSuccessAddToWishList());
    }
}
