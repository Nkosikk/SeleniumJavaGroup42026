package Pages_Nosipho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    By homeScreen_xpath = By.xpath("//button[@class='nav-item']/span[contains(text(),'Home')]");
    By MainLoginBtn_xpath =By.xpath("//div[@class='nav-user-section']/button/span[contains(text(),'Login')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Verify if home screen is displayed
    public void verifyHomeScreen() {
        driver.findElement(homeScreen_xpath).isDisplayed();
    }

    public void clickLoginButton() {
        // Wait for login button to be clicked

        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(MainLoginBtn_xpath));

        //Click login button
        driver.findElement(MainLoginBtn_xpath).click();
    }

}
