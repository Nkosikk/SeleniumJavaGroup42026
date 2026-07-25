package Pages_Nosipho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    By email_xpath = By.id("login-email");
    By password_xpath = By.id("login-password");

    public void enterLoginDetails(WebDriver driver) {

        this.driver = driver;
        driver.findElement(email_xpath).sendKeys("Task1Automtion@gmail.com");
        driver.findElement(password_xpath).sendKeys("1234@9704");

    }

    public void ClickOnLoginButton()  {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(password_xpath));
        driver.findElement(By.id("login-submit")).click();

    }

    public void verifyLoginPage() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
    }
}
