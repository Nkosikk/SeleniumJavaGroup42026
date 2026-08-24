package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class HomePage {

    WebDriver driverHome;
    By homeScreen_xpath = By.xpath("//div[@class='nav-items']/button/span[contains(text(), 'Home')]");
    By navLoginButton = By.xpath("//div[@class='nav-user-section']/button/span[contains(text(), 'Login')]");

    public HomePage(WebDriver drive){
        this.driverHome= drive;

    }

    public void homepageVerifyContent(){

        driverHome.findElement(homeScreen_xpath).isDisplayed();

    }

    public void clickMainLoginButton () throws InterruptedException {

        driverHome.findElement(navLoginButton).click();
        Thread.sleep(2000);

    }





}
