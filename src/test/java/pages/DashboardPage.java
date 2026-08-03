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

   // By welcome_xpath = By.xpath("//h2");
    @FindBy(xpath = "//h2")
    WebElement welcome_xpath;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyDashboardContent(){
        new WebDriverWait((driver), Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf((WebElement) welcome_xpath));
        welcome_xpath.isDisplayed();
      //  driver.findElement(welcome_xpath).isDisplayed();
    }
}
