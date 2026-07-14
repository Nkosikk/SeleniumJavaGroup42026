package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver launchBrowser(String browserChoice, String url){

        if (browserChoice.equalsIgnoreCase("cHroMe")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--headless=new");
            driver = new ChromeDriver(options);

        }else if (browserChoice.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();

        }else if (browserChoice.equalsIgnoreCase("Safari")){
            driver = new SafariDriver();

        }else {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        return driver;
    }

}
