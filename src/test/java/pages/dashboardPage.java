package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {

    WebDriver driver;

    By welcomePage_xpath = By.xpath("//h2");

    public dashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyDashboardPageContent() {
        driver.findElement(welcomePage_xpath).isDisplayed();
    }
}
