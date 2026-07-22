package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashBoardPage {

    WebDriver driver;

    By DashBoard_tag = By.tagName("h2");
    public dashBoardPage(WebDriver driver){
        this.driver = driver;

    }
    public void verifyDashboardPage(){
        driver.findElement(DashBoard_tag).isDisplayed();
    }
}
