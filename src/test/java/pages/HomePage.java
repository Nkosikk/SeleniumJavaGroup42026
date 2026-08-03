package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;


  //By homeScreen_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/button[1]/span[2]");
   @FindBy(xpath = ("//*[@id=\"app-root\"]/nav/div[1]/div[2]/button[1]/span[2]"))
    WebElement homeScreen_xpath;
    By mainLoginButton_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]");


    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public void verifyHomeScreenContent(){
       new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(homeScreen_xpath));
       homeScreen_xpath.isDisplayed();
       // driver.findElement(homeScreen_xpath).isDisplayed();

    }

    public void clickMainLoginButton(){
        driver.findElement(mainLoginButton_xpath).click();
    }
}
