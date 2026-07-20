package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;



public class BrowserFactory {

    static  WebDriver driver ;

    public static WebDriver launchBrowser(String browserChoice, String url){

        if(browserChoice.equalsIgnoreCase("Chrome")){

            ChromeOptions options= new ChromeOptions();

            //options.addArguments("--incognito");

            driver = new ChromeDriver(options);
        }
        else if (browserChoice.equalsIgnoreCase("Firefox")){

            //FirefoxOptions options=new FirefoxOptions();
            //options.addArguments("--incognito");
            driver = new FirefoxDriver();
        }
        else if (browserChoice.equalsIgnoreCase("safari")){

            driver = new SafariDriver();
        }
        else{
            EdgeOptions options = new EdgeOptions();

            options.addArguments("--in-private");

            driver = new EdgeDriver(options);
        }

        driver.manage().window().maximize();

        driver.get(url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
}
