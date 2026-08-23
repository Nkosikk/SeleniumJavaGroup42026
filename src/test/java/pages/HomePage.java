package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class HomePage extends Base {

    WebDriver driver;
    By homeScreen_xpath = By.xpath("//div[@class='nav-items']/button/span[contains(text(), 'Home')]");
    By navLoginButton = By.xpath("//div[@class='nav-user-section']/button/span[contains(text(), 'Login')]");

    public HomePage(WebDriver drive){
        this.driver= drive;

    }

    public void homepageVerifyContent(){

        driver.findElement(homeScreen_xpath).isDisplayed();

    }

    public void clickMainLoginButton (){

        driver.findElement(navLoginButton).click();

    }





}
