package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import tests.Wait;

public class ProductPage {

    @FindBy(css = "button.exclusive")
    private WebElement addToCart;
    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
    private WebElement continueShop;
    @FindBy(css = "#color_14")
    private WebElement blue;
    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
    private WebElement goToCheckout;


    public void clickAddToCart(WebDriver wD)
    {
        Wait.waitToLoad(wD,"#add_to_cart button span");

        addToCart.click();
    }

    public void clickContinueToShop(WebDriver wD)
    {
        Wait.waitToBeVisble(wD,"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span");

        continueShop.click();
    }

    public void clickBlue(WebDriver wD)
    {
        Wait.waitMilli(500);

        blue.click();
    }

    public void continueToCheckout(WebDriver wD)
    {
        Wait.waitToBeVisble(wD, "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");

        goToCheckout.click();
    }

}
