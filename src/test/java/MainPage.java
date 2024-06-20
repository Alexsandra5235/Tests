import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;

/**
 * Главная страница сайта
 */
public class MainPage {
    Constants constants = new Constants();
    boolean result = true;
    /**
     * Нажатие на ссылку создания аккаунта
     */
    public CreateAccountPage ClickHrefCreateAccount(){
        constants.hrefCreateAccount.click();
        return new CreateAccountPage();
    }
    /**
     * Нажатие на ссылку авторизации пользователя
     */
    public SignInPage ClickHrefSignIn(){
        constants.hrefSignIn.click();
        return new SignInPage();
    }
    /**
     * Отображение элемента страницы
     * @return
     */
    public boolean visibleItemPage(){
        return constants.textWelcomeMainPage.shouldBe(visible).isDisplayed();
    }

    /**
     * Раскрытие выпадающего списка для перехода в настройки аккаунта
     */
    public void clickDropDownList(){
        constants.buttonOpenDropDownList.click();
    }

    /**
     * Переход в аккаунт пользователя
     * @return
     */
    public MyAccountPage clickMyAccount(){
        constants.buttonOpenMyAccount.click();
        return new MyAccountPage();
    }

    /**
     * Нажатие на подкатегорию "Jackets"
     */
    public void clickCategoryJacket(){
        constants.buttonCategoryWoman.hover();
        constants.buttonSubcategoryTops.hover();
        constants.buttonSubcategoryJackets.click();
    }
    /**
     * Нажатие на подкатегорию "Tops"
     */
    public void clickCategoryTops(){
        constants.buttonCategoryWoman.hover();
        constants.buttonSubcategoryTops.click();
    }
    /**
     * Нажатие на карточку продукта
     */
    public CardProductPage clickCardProduct(){
        constants.buttonCartProduct.click();
        return new CardProductPage();
    }

    /**
     * Ввод поискового запроса
     * @param text
     * @return
     */
    public ResultSearchQueryPage fullAndClickSearchBar(String text){
        constants.searchBar.sendKeys(text,Keys.ENTER);
        return new ResultSearchQueryPage();
    }

    /**
     * Проверка корректной фильтрации товаров
     * @return
     */
    public boolean checkResultFilter(){

        for(SelenideElement elementSize : constants.filterSizeProducts){
            if (!elementSize.getAttribute("option-selected").contains(constants.optionIdSizeXs)){
                result = false;
                break;
            }
            else {
                result = true;
            }
        }
        for(SelenideElement elementColor : constants.filterColorProduct){
            if (!elementColor.getAttribute("option-selected").contains(constants.optionsIdColorBlack)){
                result = false;
                break;
            }
            else {
                result = true;
            }
        }
        return result;
    }

    /**
     * Выбор значения фильтра "Size"
     */
    public void clickFilterSize(){
        constants.buttonOpenFilterSize.click();
        constants.buttonSelectSizeXS.click();
    }
    /**
     * Выбор значения фильтра "Color"
     */
    public void clickFilterColor(){
        constants.buttonOpenFilterColor.click();
        constants.buttonSelectColorBlack.click();
    }







}
