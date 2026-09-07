package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BrowserFactory {

    static WebDriver driverFact;


    public static WebDriver launchBrowser(String browserName, String websiteUrl) {

        if (browserName.equalsIgnoreCase("Chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--disable-notifications");
            options.addArguments("--headless=new");

            driverFact = new ChromeDriver(options);
            //driverFact.manage().window().maximize()
            driverFact.manage().window().setSize(new Dimension(1920, 1080));


            driverFact.get(websiteUrl);
            driverFact.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } else if (browserName.equalsIgnoreCase("safari")) {

            driverFact = new SafariDriver();
            driverFact.manage().window().maximize();
            driverFact.get(websiteUrl);
            driverFact.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } else if (browserName.equalsIgnoreCase("firefox")) {

            FirefoxOptions fireOptions = new FirefoxOptions();
            fireOptions.addArguments("--incognito");
            fireOptions.addArguments("--disable-notifications");

            driverFact = new FirefoxDriver(fireOptions);
            driverFact.manage().window().maximize();
            driverFact.get(websiteUrl);
            driverFact.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } else {
            EdgeOptions edgeOpt = new EdgeOptions();
            edgeOpt.addArguments("--incognito");
            edgeOpt.addArguments("--disable-notifications");

            driverFact = new EdgeDriver(edgeOpt);
            driverFact.manage().window().maximize();
            driverFact.get(websiteUrl);
            driverFact.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        return driverFact;
    }

    public static void tearDownBrowser() {

        if (driverFact != null) {
            driverFact.quit();
        }
    }




}
