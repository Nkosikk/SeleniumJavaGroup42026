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


    public static WebDriver launchBrowser(String browserName, String url) {

        System.out.println("Launching Browser.....");

        if (browserName.equalsIgnoreCase("Chrome")) {

            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--disable-notifications");// blocks the alert messages
            options.addArguments("--incognito"); // opens incognito mode

            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();

        } else {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Browser Launched!");

        return driver;
    }


}
