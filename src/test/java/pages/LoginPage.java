package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    WebDriver driver;


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    }

    public void enterPassword(String password) {
        driver.findElement(password_id).sendKeys(password);
    }

    }

}
