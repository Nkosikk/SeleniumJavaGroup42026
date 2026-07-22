package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By loginEmail_id = By.id("login-email");
    By loginPassword_id = By.id("login-password");
    By loginSubmitButton_id = By.id("login-submit");
    By forgotPasswordLink_id = By.id("forgot-password-link");
    By signupHereLink_id = By.id("signup-toggle");

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    public void enterEmail(){
        driver.findElement(loginEmail_id).isDisplayed();
    }

    public void enterPassword(){
        driver.findElement(loginPassword_id).isDisplayed();
    }

    public void selectLogin(){
        driver.findElement(loginSubmitButton_id).click();
    }

    public  void clickForgotPasswordLink(){
        driver.findElement(forgotPasswordLink_id);
    }

    public void clickSignUpLink(){
        driver.findElement(signupHereLink_id);
    }

}
