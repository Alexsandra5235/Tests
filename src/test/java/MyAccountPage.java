import static com.codeborne.selenide.Condition.visible;

/**
 * Страница "My Account"
 */
public class MyAccountPage {
    Constants constants = new Constants();

    /**
     * Проверка отображения элементов на странице
     * @return
     */
    public boolean VisibleItemPage(){
        if (constants.ItemTextMyAccount.shouldBe(visible).isDisplayed() & constants.ItemTextAccountInformation.shouldBe(visible).isDisplayed())
            return true;
        else {
            return false;
        }
    }
}
