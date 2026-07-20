package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    //1. Instantiate driver on page as global variable

    WebDriver driver;

    //2. create the constructor method

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    //3. Define page elements

    //By myLearning_element = By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]");
    //By learnDropdown_element = By.xpath("");


    //4. Create your methods

    public void verifyLoggedIn(){
        driver.findElement(myLearning_element).isDisplayed();
    }
    public void clickLearnDropdown(){
        driver.findElement()
    }
}
