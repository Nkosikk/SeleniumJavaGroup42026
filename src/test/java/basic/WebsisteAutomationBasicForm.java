import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebsisteAutomationBasicForm{




    WebDriver driver;


    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        Thread.sleep(2000);

    }

    @Test
    public void clickLogin() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }

    @Test(dependsOnMethods = "clickLogin")
    public void enterEmail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("login-email")).isDisplayed();
        driver.findElement(By.id("login-email")).sendKeys("titi@gmail.com");
    }

    @Test(dependsOnMethods = "enterEmail")
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("tlou@97LT");
    }

    @Test(dependsOnMethods = "enterPassword")
    public void clickSubmit() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Test(dependsOnMethods = "clickSubmit")
    public void verifyLogin() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void selectLearnDropDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
    }

    @Test(dependsOnMethods = "selectLearnDropDown")
    public void selectLearningMaterials() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectLearningMaterials")
    public void selectWebAutomationBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectWebAutomationBasicForm")
    public void fillTheForm() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Tiego Tlou");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("tiegotlou@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("age")).sendKeys("29");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gender\"]")).sendKeys("female");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("south africa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"experience\"]")).sendKeys("intermediate(2-5 years)");
        Thread.sleep(2000);
        driver.findElement(By.id("skill-javascript")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("skill-selenium")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"comments\"]")).sendKeys("Test Automation Practice");
        Thread.sleep(2000);
        driver.findElement(By.id("newsletter")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("validate-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("submissions-toggle-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("view-submission-0")).click();
        Thread.sleep(2000);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
