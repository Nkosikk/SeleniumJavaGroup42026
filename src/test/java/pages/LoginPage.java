package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    //1. firstly we instantiate my driver as a global variable in my class

    WebDriver driver;


    //2, Secondly we make my constructor method to  def__init__(self):

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //3. Thirdly we define our elements.

    By email_id = By.xpath("//input[@id='login-email']");
    By password_id = By.xpath("//input[@id='login-password']");
    By submitButton_id = By.xpath("//button[@id='login-submit']");

    //4. We create our methods and name them according to the action the will be doing.





    public void enterEmail(String email) {

        driver.findElement(email_id).sendKeys(email);

    }

    public void enterPassword(String password) {

        driver.findElement(password_id).sendKeys(password);

    }

    public void clickSubmit() {

        driver.findElement(submitButton_id).click();

    }

}
