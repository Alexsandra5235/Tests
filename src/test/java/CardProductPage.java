import static com.codeborne.selenide.Condition.visible;

public class CardProductPage {
    Constants constants = new Constants();
    /**
     * Выбор размера и цвета товара
     */
    public void changeSizeAndColor(){
        constants.buttonSize.click();
        constants.buttonColor.click();
    }
    /**
     * Нажатие на кнопку "Add To Card"
     */
    public void clickButtonAddToCard(){
        constants.buttonAddToCart.click();
    }

    /**
     * Проверка сообщения об успешном добавлении товара в корзину
     * @return
     */
    public boolean visibleMessengerSuccessAddToCard(){
        return constants.messengerSuccessAddToCard.shouldBe(visible).isDisplayed();
    }
}
