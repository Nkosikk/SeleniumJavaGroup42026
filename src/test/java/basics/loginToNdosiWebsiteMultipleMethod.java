package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginToNdosiWebsiteMultipleMethod {


    WebDriver driver;


    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        Thread.sleep(2000);

    }

    @Test
    public void clickLogin() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }

    @Test(dependsOnMethods = "clickLogin")
    public void enterEmail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("login-email")).isDisplayed();
        driver.findElement(By.id("login-email")).sendKeys("njceles@gmail.com");
    }

    @Test(dependsOnMethods = "enterEmail")
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
    }

    @Test(dependsOnMethods = "enterPassword")
    public void clickSubmit() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Test(dependsOnMethods = "clickSubmit")
    public void verifyLogin() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
