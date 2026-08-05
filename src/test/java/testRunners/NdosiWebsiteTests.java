package testRunners;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testData.ReadFromDataBase;
import utils.Base;

public class NdosiWebsiteTests extends Base {

    @BeforeTest
    public void setup(){
        ReadFromDataBase.dbConnection();
    }
    @Test
    public void verifyHomeContentTest() {
     homePage.verifyHomeScreenContent();
    }

    @Test(priority = 1)
    public void submitLoginScreenTest(){
        homePage.clickMainLoginButton();
        loginPage.enterEmail(ReadFromDataBase.getUsername);
        loginPage.enterPassword(ReadFromDataBase.getPassword);
        loginPage.selectLogin();
    }

    @Test(dependsOnMethods = "submitLoginScreenTest")
    public void verifyLoginFlowSuccessfulTest(){
        dashBoardPage.verifyDashboardPage();
    }

    public void closeBrowser(){
        driver.quit();
    }
}
