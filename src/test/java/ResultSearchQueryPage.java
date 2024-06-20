import com.codeborne.selenide.SelenideElement;

/**
 * страница с результатами поиска
 */
public class ResultSearchQueryPage {
    Constants constants = new Constants();
    boolean result;

    /**
     * Проверка содержания ключевого слова в результатах поиска
     * @return
     */
    public boolean containsKeywordInResultQuery(){
        for (SelenideElement element : constants.searchProductsItems) {
            if (!element.getAttribute("alt").contains(constants.searchQuery)) {
                result = false;
                break;
            }
            else{
                result = true;
            }
        }
        return result;
    }
}
