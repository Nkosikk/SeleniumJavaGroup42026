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

    By myLearning_element = By.xpath("//button[@class=\"nav-dropdown-trigger  has-active\"]/span[contains(text(), 'My Learning')]");
    By learnDropdown_element = By.xpath("//button[contains(@class,'nav-dropdown-trigger')]/span[text()='Learn']");
    By learningMaterial_element = By.xpath("//button[contains(@class,'nav-dropdown-item')]/span[text()='Learning Materials']");


    //4. Create your methods

    public boolean verifyLoggedIn(){
       return driver.findElement(myLearning_element).isDisplayed();
    }
    public void clickLearnDropdown(){
        driver.findElement(learnDropdown_element).click();
    }
    public void pickLearningMaterial(){
        driver.findElement(learningMaterial_element).click();
    }
}
