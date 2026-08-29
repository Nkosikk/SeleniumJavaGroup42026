package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
        Assert.assertTrue(driverLog.findElement(loginFormTitle).isDisplayed(),"Login page/form verified ");

    }

    public void inputLoginEmail(String email) throws InterruptedException {

        driverLog.findElement(loginEmailInput).sendKeys(email);

        Thread.sleep(2000);
        System.out.println("Email inserted");
    }

    public void inputLoginPassword(String passWord) throws InterruptedException {

        driverLog.findElement(loginPasswordInput).sendKeys(passWord);
        driverLog.findElement(loginSeePassword).click();
        Thread.sleep(2000);
        System.out.println("Password inserted");

    }



    public void clickLoginButton(){

        driverLog.findElement(loginButton).click();
    }

    public void forgotPasswordNav(){

        driverLog.findElement(forgotPassword).click();

    }

    public void navigateToSignup(){

        driverLog.findElement(signUpPageLink).click();

    }

}
