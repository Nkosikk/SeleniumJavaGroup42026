package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BrowserFactory {

    static WebDriver driverFact;


    public static WebDriver launchBrowser(String browserName, String url) {

        System.out.println("Launching Browser.....");

        if (browserName.equalsIgnoreCase("Chrome")) {

            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--disable-notifications");// blocks the alert messages
            options.addArguments("--incognito"); // opens incognito mode

            driverFact = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driverFact = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("Safari")) {
            driverFact = new SafariDriver();

        } else {
            driverFact = new EdgeDriver();
        }
        driverFact.manage().window().maximize();
        driverFact.get(url);
        driverFact.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Browser Launched!");

        return driverFact;
    }

    public static void tearDownBrowser() {

        if (driverFact != null) {
            driverFact.quit();
        }
    }




}
