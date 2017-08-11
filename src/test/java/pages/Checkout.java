package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.Wait;

public class Checkout {

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span")
    private WebElement cont;

    public void clickContinue(WebDriver wd)
    {
        Wait.waitToLoad(wd,"#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");

        cont.click();
    }


}
