package pages;

import components.Navbar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;

public class HomePage {

    WebDriver driverHome;
    Navbar navbar;
    By homeScreen_xpath = By.xpath("//div[@class='nav-items']/button/span[contains(text(), 'Home')]");


    public HomePage(WebDriver drive){
        this.driverHome= drive;
        this.navbar = new Navbar(driverHome);


    }

    public void homepageVerifyContent(){

        driverHome.findElement(homeScreen_xpath).isDisplayed();

    }

    public void clickMainLoginButton () throws InterruptedException {

     navbar.NavigateToLoginPage();
     Thread.sleep(2000);

    }





}
