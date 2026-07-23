package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username_id = By.id("login-email");
    By password_id = By.id("login-password");
    By loginButton_name = By.name("loginSubmitSbu");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(username_id).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(password_id).sendKeys(password);
    }

    public void loginButton(){
        driver.findElement(loginButton_name).click();
    }

}
