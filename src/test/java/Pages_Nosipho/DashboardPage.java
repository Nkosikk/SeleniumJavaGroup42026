package Pages_Nosipho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//h2")
    WebElement welcomePage_xpath;
    public DashboardPage(WebDriver driver){

        this.driver = driver;
    }

    public void verifyDashboard(){

        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(welcomePage_xpath));
        welcomePage_xpath.isDisplayed();
    }
}
