package utils_Nosipho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


import java.time.Duration;

public class Browsers {
    static WebDriver driver;
    public static WebDriver openBrowser(String browser , String url) {
       if  (browser.equalsIgnoreCase("chrome")) {
           driver = new ChromeDriver();
       } else if (browser.equalsIgnoreCase("firefox")) {
           driver = new FirefoxDriver();
       }
       else if (browser.equalsIgnoreCase("safari")) {
           driver = new SafariDriver();
       }
       else
       {
           driver = new EdgeDriver();
       }
       driver.manage().window().maximize();
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       return driver;
    }

}