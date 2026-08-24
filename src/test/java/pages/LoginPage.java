package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {

    WebDriver driverLog;
    By loginFormTitle = By.id("login-heading");
    By loginEmailInput = By.id("login-email");
    By loginPasswordInput= By.id("login-password");
    By loginSeePassword = By.xpath("//div[@style ='position: relative; width: 100%; margin-bottom: 24px;']/button");
    By loginButton = By.id("login-submit");
    By forgotPassword = By.id("forgot-password-link");
    By signUpPageLink = By.id("signup-toggle");

    public LoginPage(WebDriver drive){
        this.driverLog = drive;
    }

    public void verifyLoginPage(){
        driverLog.findElement(loginFormTitle).isDisplayed();
        System.out.println("Login page/form verified");
    }

    public void inputLoginCredentials() throws InterruptedException {

        driverLog.findElement(loginEmailInput).sendKeys("demonslayer@gmail.com");
        driverLog.findElement(loginPasswordInput).sendKeys("Hashira@2026");
        driverLog.findElement(loginSeePassword).click();
        Thread.sleep(2000);
        System.out.println("Email and password inserted");
    }

    public void clickLoginButton(){

        driverLog.findElement(loginButton).click();
    }


}
