package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import tests.Wait;

import java.util.ArrayList;

public class Login {

    @FindBy(css = "#email_create")
    private WebElement emailInput;

    @FindBy(css = "#SubmitCreate > span")
    private WebElement createAcc;

    @FindBys(
            {
                    @FindBy(css = "#SubmitCreate > span"),
                    @FindBy(css = "#SubmitCreate > span"),
                    @FindBy(css = "#SubmitCreate > span"),
                    @FindBy(css = "#SubmitCreate > span"),
                    @FindBy(css = "#SubmitCreate > span")

            }
    )
    private ArrayList<WebElement> fields = new ArrayList<WebElement>();

    public void enterEmail(WebDriver wD, String input)
    {
        Wait.waitToLoad(wD, "#email_create");

        emailInput.sendKeys(input);

        createAcc.click();
    }
}
