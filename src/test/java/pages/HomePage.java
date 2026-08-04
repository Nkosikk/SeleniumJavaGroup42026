package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

   WebDriver driver;


        //Finding elements
        //By homeScreen_xpath = By.xpath("//button[@class='nav-item active']/span[contains(text(),'Home')]");
        @FindBy(xpath ="//button[@class='nav-item active']/span[contains(text(),'Home')]" )
        WebElement homeScreen_xpath;
        By mainLoginButton = By.xpath("//div[@class='nav-user-section']/button/span[contains(text(),'Login')]");

        //Constructor
            public HomePage(WebDriver driver){
                this.driver = driver;

    }
            public void verifyHomeScreenContent(){
                new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(homeScreen_xpath));
                //driver.findElement(homeScreen_xpath).isDisplayed();
                homeScreen_xpath.isDisplayed();
    }
            public void clickMainLoginButton(){
                driver.findElement(mainLoginButton).click();

    }




}
