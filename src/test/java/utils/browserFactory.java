package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class browserFactory {


    static WebDriver driver;

    public static WebDriver launchBrowser(String browserName, String url) {

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new SafariDriver();

        } else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return null;
    }
    @Test
    public void provider(){
        launchBrowser("firefox","https://ndosisimplifiedautomation.vercel.app");
    }
}
