import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginToNdosiWebsite {
    WebDriver driver;

    @Test
    public void LoginToNdosiWebsiteTests() throws InterruptedException {
        driver = new EdgeDriver();

        Thread.sleep(2000);
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("login-email")).sendKeys("Task1Automtion@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("1234@9704");
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
        Thread.sleep(3000);

        driver.quit();
    }
}
