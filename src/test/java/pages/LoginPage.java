package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage  {

    WebDriver driverLog;
    WebDriverWait wait;

    private final By loginFormTitle = By.id("login-heading");
    private final By loginEmailInput = By.id("login-email");
    private final By loginPasswordInput= By.id("login-password");
    private final By loginSeePassword = By.xpath("//div[@style ='position: relative; width: 100%; margin-bottom: 24px;']/button");
    private final By loginButton = By.id("login-submit");
    private final By forgotPassword = By.id("forgot-password-link");
    private final By signUpPageLink = By.id("signup-toggle");
    //---------------------------------------------------------------------------------------------

    public LoginPage(WebDriver drive){

        this.driverLog = drive;
        wait = new WebDriverWait(driverLog, Duration.ofSeconds(10));
    }

    public void verifyLoginPage(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(loginFormTitle));
        Assert.assertTrue(driverLog.findElement(loginFormTitle).isDisplayed(),"Login page/form verified ");

    }

    public void inputLoginEmail(String email)  {

        driverLog.findElement(loginEmailInput).sendKeys(email);
        System.out.println("Email inserted");
    }

    public void inputLoginPassword(String passWord)  {

        driverLog.findElement(loginPasswordInput).sendKeys(passWord);
        driverLog.findElement(loginSeePassword).click();
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
