import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductFilteringTest extends BaseTest{
    /**
     * Фильтрация товаров по цвету и размеру
     */
    @Test
    public void ProductFiltering(){
        mainPage.ClickHrefSignIn();

        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.Password);
        signInPage.clickButtonSignIn();

        mainPage.clickCategoryTops();
        mainPage.clickFilterSize();
        mainPage.clickFilterColor();

        assertTrue(mainPage.checkResultFilter());
    }
}
