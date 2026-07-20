package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;


    By homeScreen_xpath = By.xpath("//button[@class='nav-item']/span[contains(text(),'Home')]");
    By mainLoginButton_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]");


    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public void verifyHomeScreenContend(){
        driver.findElement(homeScreen_xpath).isDisplayed();

    }

    public void clickMainLoginButton(){
        driver.findElement(mainLoginButton_xpath).click();
    }
}
