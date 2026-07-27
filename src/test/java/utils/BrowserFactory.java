package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver     launchBrowser(String browserChoice, String url) {

        if (browserChoice.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);

        } else if (browserChoice.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserChoice.equalsIgnoreCase("Safari")) {
            // SafariDriver is not supported in Selenium 4, so you may need to use a different approach or library for Safari
            throw new UnsupportedOperationException("Safari browser is not supported in this implementation.");

        } else {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        return driver;
    }

}
