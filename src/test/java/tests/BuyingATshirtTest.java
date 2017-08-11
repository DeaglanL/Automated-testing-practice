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

    }
    @Test
    public void buyingATShirt()
    {
        homePage.open(cwD);


        homePage.mouseOverItem(cwD);


        homePage.clickMore(cwD);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
