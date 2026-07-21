package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.time.Duration;

public class BrowserFactory {

    WebDriver driver;

    public WebDriver launchBrowser(String browserChoice, String url) {

        if (browserChoice.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
           // options.addArguments("--headless=new");
            driver = new ChromeDriver(options);

        } else if (browserChoice.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        } else if (browserChoice.equalsIgnoreCase("safari")) {

            driver = new SafariDriver();

        } else {

            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        return driver;

    }

}

