package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

   // By WelcomePage_xpath = By.xpath("//h2");
@FindBy(xpath = "//h2")
   WebElement WelcomePage_xpath;
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyDashboardContent() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(WelcomePage_xpath));
 //       driver.findElement(homeScreen_xpath).isDisplayed();
        WelcomePage_xpath.isDisplayed();
    }
}