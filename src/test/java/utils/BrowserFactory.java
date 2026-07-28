package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BrowserFactory {

    static  WebDriver driver ;

    public static WebDriver launchBrowser(String browserChoice, String url){

            ChromeOptions options= new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);

            driver = new FirefoxDriver();

            driver = new SafariDriver();

        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }
}
