package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By userName_id = By.id("login-email");
    By password_id = By.id("login-password");
    By loginNameButton_name = By.name("loginSubmit");


  public LoginPage(WebDriver driver) {
      this.driver = driver;
  }


    public void enterUsername(String userName){
        driver.findElement(userName_id).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(password_id).sendKeys(password);

    }

    public void loginButton(){
        driver.findElement(loginNameButton_name).click();
    }

}

