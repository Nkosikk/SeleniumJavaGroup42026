package pages;

import components.Navbar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class HomePage {

    WebDriver driverHome;
    WebDriverWait wait;
    Navbar navbar;
    By homepageNavbar = By.xpath("//button[@class ='nav-item active']/span[contains(text(), 'Home')]");


    public HomePage(WebDriver drive){
        this.driverHome= drive;
        wait = new WebDriverWait(driverHome, Duration.ofSeconds(10));
        this.navbar = new Navbar(driverHome);


    }

    public void homepageVerifyContent(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(homepageNavbar));
        Assert.assertTrue(driverHome.findElement(homepageNavbar).isDisplayed(),"Homepage Verified");// redundant, i know

    }

    public void clickMainLoginButton ()  {

     navbar.NavigateToLoginPage();


    }





}
