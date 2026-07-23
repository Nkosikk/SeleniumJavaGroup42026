package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    WebDriver driver;

    By userName_id = By.id("login-email");
    By password_id = By.id("login-password");
    By submitButton_id = By.id("login-submit");


    public loginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterUserName(String userName) {
        driver.findElement(userName_id).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(password_id).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton_id).click();
    }
}
