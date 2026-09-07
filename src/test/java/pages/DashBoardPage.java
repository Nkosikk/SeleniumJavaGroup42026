package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DashBoardPage {

    WebDriver driverDash;
    WebDriverWait wait;
    private final By dashboardNavbar = By.xpath("//button/span[contains(text(), 'My Learning')]");
    private final By welcomeTitle = By.xpath("//h2[contains(., 'Welcome') and contains(., 'back,')]");


    public DashBoardPage(WebDriver drive) {
        this.driverDash = drive;
        wait = new WebDriverWait(driverDash, Duration.ofSeconds(10));
    }

    public void verifyDashBoardPageContent() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardNavbar));
        wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeTitle));

        Assert.assertTrue(driverDash.findElement(dashboardNavbar).isDisplayed());
        Assert.assertTrue(driverDash.findElement(welcomeTitle).isDisplayed());
    }
}
