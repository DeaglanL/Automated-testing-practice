package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import tests.Wait;

public class Homepage {


    @FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img")
    private WebElement itemFrame;
    @FindBy(css = "div.right-block div.button-container a.button.lnk_view.btn.btn-default span")
    private WebElement moreButton;

    public void open(WebDriver wD)
    {
        wD.navigate().to("http://automationpractice.com/index.php");
    }

    public void mouseOverItem(WebDriver wD)
    {
        Actions a = new Actions(wD);

        Wait.waitToLoad(wD, "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");

        a.moveToElement(itemFrame).perform();

    }

    public void clickMore(WebDriver wD) {
        Wait.waitToLoad(wD, "div.right-block div.button-container a.button.lnk_view.btn.btn-default span");

        moreButton.click();
    }
}
