import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchProductByKeywordsTest extends BaseTest{
    /**
     * Поиск по ключевому слову
     */
    @Test
    public void searchProduct(){
        mainPage.ClickHrefSignIn();

        signInPage.fillEmail(constants.registeredEmail);
        signInPage.fillPassword(constants.Password);
        signInPage.clickButtonSignIn();

        mainPage.fullAndClickSearchBar(constants.searchQuery);

        assertTrue(resultSearchQueryPage.containsKeywordInResultQuery());
    }
}
