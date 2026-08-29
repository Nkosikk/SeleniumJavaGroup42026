package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashBoardPage {

    WebDriver driverDash;
    By dashboardNavbar = By.xpath("//button/span[contains(text(), 'My Learning')]");

    By welcomeTitle = By.xpath("//h2[contains(., 'Welcome') and contains(., 'back,')]");

    public DashBoardPage(WebDriver drive){
        this.driverDash=drive;
    }

    public void verifyDashBoardPageContent() {

        Assert.assertTrue(driverDash.findElement(dashboardNavbar).isDisplayed());
        Assert.assertTrue(driverDash.findElement(welcomeTitle).isDisplayed());

    }
}
