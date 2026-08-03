package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username_ID = By.id("login-email");
    By password_ID = By.id("login-password");
    By loginButton_ID = By.id("login-submit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(username_ID).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(password_ID).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton_ID).click();
    }
}
