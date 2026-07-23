package utils;

import org.openqa.selenium.WebDriver;
import pages.homePage;
import org.openqa.selenium.support.PageFactory;
import pages.loginPage;
import utils.browserFactory;

public class base {


    static final browserFactory factory = new browserFactory();

    public static final WebDriver driver = browserFactory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/#overview");

    public homePage homePage = PageFactory.initElements(driver, homePage.class);

    public loginPage loginPage = PageFactory.initElements(driver, loginPage.class);
}
