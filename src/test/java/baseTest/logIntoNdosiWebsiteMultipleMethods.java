package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class logIntoNdosiWebsiteMultipleMethods {
    WebDriver driver;

    @BeforeTest  //Pre-requisite to the test
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(4000);
    }
     @Test
     public void clickLogin() throws InterruptedException {
         Thread.sleep(400);
         driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
     }

     @Test(priority = 1)
     public void enterEmail() throws InterruptedException {
         Thread.sleep(4000);
         driver.findElement(By.id("login-email")).sendKeys("ngceboDev@gmail.com");
     }
     @Test(priority = 2)
    public void enterPassword() throws InterruptedException {
         Thread.sleep(4000);
         driver.findElement(By.id("login-password")).sendKeys("Doublehelix93?");
     }
     @Test(priority = 3)
     public void Login() throws InterruptedException {
         Thread.sleep(4000);
         driver.findElement(By.id("login-submit")).click();
     }
     @Test (priority = 4)
             public void verifyLogin() throws InterruptedException {
         Thread.sleep (4000);
         driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2")).isDisplayed();
     }


    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }




    }


