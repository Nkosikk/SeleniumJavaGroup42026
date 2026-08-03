package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    By welcomePage_xpath = By.xpath("//H2");

    public DashboardPage(WebDriver driver){
        this.driver = driver;

    }

    public void verifyDashboardContent() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(welcomePage_xpath).isDisplayed();

    }
}
