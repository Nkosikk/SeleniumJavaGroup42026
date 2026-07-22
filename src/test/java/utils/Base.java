package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;
import pages.dashBoardPage;

public class Base {

    static final BrowserFactory factory = new BrowserFactory();
    public static final WebDriver driver = factory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    public dashBoardPage dashBoardPage = PageFactory.initElements(driver, pages.dashBoardPage.class);

}
