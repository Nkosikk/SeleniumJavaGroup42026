package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class Base {

    static final BrowserFactory factory = new BrowserFactory();

    public static final WebDriver driver = factory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homePage = new HomePage(driver);

    public LoginPage loginPage = new LoginPage(driver);

    public DashboardPage dashboardPage = new DashboardPage(driver);


}
