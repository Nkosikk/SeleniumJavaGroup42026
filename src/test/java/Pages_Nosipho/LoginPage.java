package Pages_Nosipho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

     WebDriver driver;
    By username_id = By.id("login-email");
    By password_id = By.id("login-password");
    By login_button = By.name("loginSubmit");

    public LoginPage(WebDriver driver){
      this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(username_id).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(password_id).sendKeys(password);
    }

    public void LoginButton()  {
                driver.findElement(login_button).click();
    }

}
