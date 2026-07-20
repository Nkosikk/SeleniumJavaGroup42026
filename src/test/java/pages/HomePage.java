package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

WebDriver driver;

By homeScreenXpath = By.xpath("//h1[contains(text(),'Welcome to Ndosis Simplified Automation')]");

By mainLoginButtonXpath = By.xpath("//button[contains(text(),'Main Login')]");

public  HomePage(WebDriver driver) {
    this.driver = driver;

}

public  void verifyHomecreenContent()
{
    driver.findElement(homeScreenXpath).isDisplayed();
}

public void clickMainLoginButton() {
    driver.findElement(mainLoginButtonXpath).click();

}

}
