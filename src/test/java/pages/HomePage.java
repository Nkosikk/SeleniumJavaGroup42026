package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //define
    WebDriver driver;

    By homescreen_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/button[1]/span[1]");
    By mainLoginButton_xpath = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button");

   //constuctor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    //methods
    public void verifiyHomeScreen(){
        driver.findElement(homescreen_xpath).isDisplayed();
    }
    public void clickLogin(){
        driver.findElement(mainLoginButton_xpath).click();
    }
}
