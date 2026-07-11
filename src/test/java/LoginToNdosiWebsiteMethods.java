import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToNdosiWebsiteMethods {
    WebDriver driver;

@BeforeTest
    public void setup() throws InterruptedException {
    driver = new EdgeDriver();

    Thread.sleep(2000);
    driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
    driver.manage().window().maximize();

    Thread.sleep(2000);
}
@Test
public void ClickloginButton()
{
    driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
}
@Test (dependsOnMethods = "ClickloginButton")
public void EnterEmail() throws InterruptedException{
    Thread.sleep(3000);
    driver.findElement(By.id("login-email")).sendKeys("Task1Automtion@gmail.com");
    Thread.sleep(3000);
}
@Test (dependsOnMethods = "EnterEmail")
    public void EnterPassword() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("login-password")).sendKeys("1234@9704");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "EnterPassword")
    public void ClickLogin() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(3000);
    }

    @AfterTest
    public void verifyLogin(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
    }

    @Test
    public void SeleniumManualTask() throws InterruptedException {
    driver.findElement(By.xpath("#app-root > nav > div.nav-container > div.nav-items > div:nth-child(7) > button"));
        Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();
        Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(10000);
    }

    public void Rest(){
        driver.quit();
    }

}

