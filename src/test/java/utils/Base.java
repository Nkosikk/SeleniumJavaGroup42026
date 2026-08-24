package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LoginPage;

public class Base {

    public static WebDriver driverBase;
    public static HomePage homePage;
    public static LoginPage loginPage;

    @BeforeTest
    public void setup() {
        driverBase = BrowserFactory.launchBrowser(
                "chrome",
                "https://ndosisimplifiedautomation.vercel.app"
        );

        homePage = PageFactory.initElements(
                driverBase,
                HomePage.class
        );

        loginPage = PageFactory.initElements(
                driverBase,
                LoginPage.class
        );
    }

    @AfterTest
    public void tearDown() {
        BrowserFactory.tearDownBrowser();
    }
}






/*public class Base {


    public static WebDriver driverBase;
    public static HomePage homePage;
    //public static final WebDriver driverBase = BrowserFactory.launchBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app");

    @BeforeTest
    public void setup() {
        driverBase = BrowserFactory.launchBrowser(
                "chrome",
                "https://ndosisimplifiedautomation.vercel.app"
        );



        homePage = PageFactory.initElements(driverBase,HomePage.class);

    //public static HomePage homePage = PageFactory.initElements(driverBase,HomePage.class);
   // public static LoginPage loginPage = PageFactory.initElements(driverBase, LoginPage.class);

    @AfterTest
    public void tearDown() {
        BrowserFactory.tearDownBrowser();
    }

}
}

 */

