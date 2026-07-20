package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class Base {

     static final BrowserFactory factory=new BrowserFactory();

    public static final WebDriver driver = factory.launchBrowser("edge","https://ndosisimplifiedautomation.vercel.app");


   //
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    public DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

}
