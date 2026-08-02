package Pages_Nosipho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//button[@class='nav-item active']/span[contains(text(),'Home')]")
    WebElement homeScreen_xpath;
    By MainLoginBtn_xpath =By.xpath("//div[@class='nav-user-section']/button/span[contains(text(),'Login')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Verify if home screen is displayed
    public void verifyHomeScreen() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(homeScreen_xpath));
        homeScreen_xpath.isDisplayed();
    }

    public void clickLoginButton() {
        //Click login button
        driver.findElement(MainLoginBtn_xpath).click();
    }

}
