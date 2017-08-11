package tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pages.*;

public class BuyingATshirtTest {

    private static WebDriver cwD;
    private static ChromeOptions chromeOptions = new ChromeOptions();

    private Homepage homePage;
    private ProductPage productPage;
    private Checkout checkOut;
    private Login login;


    @BeforeClass
    public static void beforeClass()
    {
        chromeOptions.addArguments("--start-maximized");

    }
    @Before
    public void beforeTest()
    {

        cwD = new ChromeDriver(chromeOptions);


        homePage = PageFactory.initElements(cwD, Homepage.class);
        productPage = PageFactory.initElements(cwD,ProductPage.class);
        checkOut = PageFactory.initElements(cwD, Checkout.class);
        login = PageFactory.initElements(cwD, Login.class);

    }
    @Test
    public void buyingATShirt()
    {
        homePage.open(cwD);


        homePage.mouseOverItem(cwD);


        homePage.clickMore(cwD);

        productPage.clickAddToCart(cwD);

        productPage.clickContinueToShop(cwD);

        productPage.clickBlue(cwD);

        productPage.clickAddToCart(cwD);

        productPage.continueToCheckout(cwD);

        checkOut.clickContinue(cwD);

        login.enterEmail(cwD, "Dave@gmail.com");

        Wait.waitSeconds(2);

    }
    @After
    public void afterTest()
    {
        cwD.quit();

    }
    @AfterClass
    public static void afterClass()
    {

    }

}
