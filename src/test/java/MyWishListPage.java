import static com.codeborne.selenide.Condition.visible;

/**
 * Страница "My Wish List"
 */
public class MyWishListPage {
    Constants constants = new Constants();

    /**
     * Проверка вывода сообщения об успешном добавлении товара в избранное
     * @return
     */
    public boolean visibleMessengerSuccessAddToWishList(){
        return constants.messengeSuccessAddToWishList.shouldBe(visible).isDisplayed();
    }
}
