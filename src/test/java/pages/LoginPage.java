package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //1. firstly we instantiate my driver as a global variable in my class

    WebDriver driver;


    //2, Secondly we make my constructor method to  def__init__(self):

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //3. Thirdly we define our elements.

    By emailField = By.xpath("//input[@id='login-email']");
    By passwordField = By.xpath("//input[@id='login-password']");
    By submitButton = By.xpath("//button[@id='login-submit']");

    //4. We create our methods and name them according to the action the will be doing.

    public void enterEmail(){
        driver.findElement(emailField).sendKeys("segwe.bz@gmail.com");
    }

    public void enterPassword(){
        driver.findElement(passwordField).sendKeys("rA!ny@$14");
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

}
