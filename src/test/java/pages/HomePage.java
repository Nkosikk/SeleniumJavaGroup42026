package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

   WebDriver driver;


        //Finding elements
        By homeScreen_xpath = By.xpath("//button[@class='nav-item active']/span[contains(text(),'Home')]");

        By mainLoginButton = By.xpath("//div[@class='nav-user-section']/button/span[contains(text(),'Logon')]");

        //Constructor
            public HomePage(WebDriver driver){
                this.driver = driver;

    }
            public void verifyHomeScreenContent(){
                driver.findElement(homeScreen_xpath).isDisplayed();

    }
            public void clickMainLoginButton(){
                driver.findElement(mainLoginButton).click();

    }




}
