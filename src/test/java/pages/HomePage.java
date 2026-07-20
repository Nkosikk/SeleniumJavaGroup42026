package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;


    // Constructor method.

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    // My custorm x-paths

    By homeScreen_xpath = By.xpath("//button[@class='nav-item active']/span[contains(text(), 'Home')]");
    By mainLoginButton = By.xpath("//button[contains (@class, 'user-pill') and contains (. , 'Login')]");



    // method that verifies if we are on the landing page.

    public void verifiesLandingPageContent(){
        driver.findElement(homeScreen_xpath).isDisplayed();

    }

    // method that clicks on the landing page login button.

    public void MainLoginButtonLogin(){
        driver.findElement(mainLoginButton).click();
    }
}


