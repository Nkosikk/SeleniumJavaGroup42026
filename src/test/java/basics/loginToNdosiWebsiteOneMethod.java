package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginToNdosiWebsiteOneMethod {


    WebDriver driver;


    @Test
    public void loginToNdosiWebsiteTests() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("login-email")).sendKeys("njceles@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();

        Thread.sleep(2000);
        "//span[text()= 'Web Automation Basic Form']"
        driver.quit();

    }
}
