package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class dashBoardPage {

    WebDriver driver;

    //By DashBoard_tag = By.tagName("h2");
    @FindBy(xpath = "//h2")
    WebElement welcomePage_xpath;


    public dashBoardPage(WebDriver driver){
        this.driver = driver;

    }
    public void verifyDashboardPage(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(welcomePage_xpath));
        //driver.findElement(DashBoard_tag).isDisplayed();
        ((WebElement) welcomePage_xpath).isDisplayed();
    }
}
