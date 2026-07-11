import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebFormTask {
    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new EdgeDriver();

        Thread.sleep(2000);
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @Test
    public void ClickLoginButton()
    {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }
    @Test (dependsOnMethods = "ClickLoginButton")
    public void EnterEmail() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.id("login-email")).sendKeys("Task1Automtion@gmail.com");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "EnterEmail")
    public void EnterPassword() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("login-password")).sendKeys("1234@9704");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "EnterPassword")
    public void ClickLogin() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(3000);
    }

    @Test (dependsOnMethods = "ClickLogin")
    public void Learn() throws InterruptedException {

        WebElement LearnDropDown = driver.findElement(By.cssSelector("#app-root > nav > div.nav-container > div.nav-items > div:nth-child(7) > button"));
        LearnDropDown.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();
        Thread.sleep(3000);
    }

    @Test (dependsOnMethods = "Learn")
    public void BasicPracticeForm() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]")).click();
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "Learn")
    public void EnterFullName() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("John Doe");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "EnterFullName")
    public void EnterEmailT() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("john@test.com");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "EnterEmailT")
    public void Age() throws InterruptedException {
        driver.findElement(By.id("age")).sendKeys("25");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "Age")
    public void SelectGender() throws InterruptedException{
        Thread.sleep(3000);
        WebElement genderDropDown=driver.findElement(By.id("gender"));
        Select select=new Select(genderDropDown);
        select.selectByVisibleText("Male");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "SelectGender")
    public void SelectCountry() throws InterruptedException{
        Thread.sleep(3000);
        WebElement countryDropDown = driver.findElement(By.id("country"));
        Select select=new Select(countryDropDown);
        select.selectByVisibleText("South Africa");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "SelectCountry")
    public void SelectExperienceLevel() throws InterruptedException {
        Thread.sleep(3000);
        WebElement experienceDropDown = driver.findElement(By.id("experience"));
        Select select = new Select(experienceDropDown);
        select.selectByVisibleText("Intermediate (2-5 years)");
        Thread.sleep(3000);
    }
    @Test (dependsOnMethods = "SelectExperienceLevel")
    public void SelectSkills() throws InterruptedException {
        Thread.sleep(3000);
        WebElement JavascriptCheckBox = driver.findElement(By.id("skill-javascript"));
        if (!JavascriptCheckBox.isSelected()) {
            JavascriptCheckBox.click();
        }
        WebElement SeleniumCheckBox = driver.findElement(By.id("skill-selenium"));
        if (!SeleniumCheckBox.isSelected()) {
            SeleniumCheckBox.click();
        }
    }
        @Test (dependsOnMethods = "SelectSkills")
        public void AdditionalComments() throws InterruptedException {
            driver.findElement(By.id("comments")).sendKeys("Test automation practice");
            Thread.sleep(3000);
        }
    @Test (dependsOnMethods = "AdditionalComments")
    public void SelectSubscribeToNewsletter() throws InterruptedException {
        Thread.sleep(3000);
        WebElement SubscribeToNewsletter = driver.findElement(By.id("newsletter"));
        if (!SubscribeToNewsletter.isSelected()) {
            SubscribeToNewsletter.click();
            Thread.sleep(3000);
        }
    }
    @Test (dependsOnMethods = "SelectSubscribeToNewsletter")
    public void SelectAcceptTermsAndConditions() throws InterruptedException {
        Thread.sleep(3000);
        WebElement TermsCheckBox = driver.findElement(By.id("terms"));
        if (!TermsCheckBox.isSelected()) {
            TermsCheckBox.click();
            Thread.sleep(3000);
        }
    }
    @Test (dependsOnMethods = "SelectAcceptTermsAndConditions")
    public void ValidateButton() throws InterruptedException {
        driver.findElement(By.id("validate-btn")).click();
        Thread.sleep(3000);
    }

    @Test (dependsOnMethods = "ValidateButton")
    public void SubmitForm() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"practice-form\"]/details"));
        Thread.sleep(2000);
    }
@Test
public void Rest(){

        driver.quit();
    }
}

