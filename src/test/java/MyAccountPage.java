import static com.codeborne.selenide.Condition.visible;

public class MyAccountPage {
    Constants constants = new Constants();

    public boolean VisibleItemPage(){
        if (constants.ItemTextMyAccount.shouldBe(visible).isDisplayed() & constants.ItemTextAccountInformation.shouldBe(visible).isDisplayed())
            return true;
        else {
            return false;
        }
    }
}
