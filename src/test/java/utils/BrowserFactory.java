package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserFactory {
    static WebDriver driver;

    //Launch the chosen browser
    @Test
    public static WebDriver launchBrowser(String browserChoice, String url){

        if (browserChoice.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--headless=new");
            driver = new ChromeDriver();

        }else if (browserChoice.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();

        }else if (browserChoice.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();

        }else {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        //driver.manage().window().setSize(new Dimension(1024, 1366));
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
