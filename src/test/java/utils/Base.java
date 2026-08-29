package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.DashBoardPage;
import pages.HomePage;
import pages.LoginPage;

public class Base {

    public static WebDriver driverBase;
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static DashBoardPage dashboardPage;

    @BeforeClass
    public void setup() {
        driverBase = BrowserFactory.launchBrowser(
                "chrome",
                "https://ndosisimplifiedautomation.vercel.app"
        );

        homePage = PageFactory.initElements(driverBase, HomePage.class);

        loginPage = PageFactory.initElements(driverBase, LoginPage.class);

        dashboardPage=PageFactory.initElements(driverBase, DashBoardPage.class);
    }

    @AfterClass
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

