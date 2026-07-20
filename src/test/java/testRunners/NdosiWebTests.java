package testRunners;

import org.openqa.selenium.devtools.latest.audits.model.PropertyRuleIssueDetails;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utils.Base;

public class NdosiWebTests extends Base {

    // HOMEPAGE TESTS

    @Test
    public void verifyHomeContentTest() {

        homePage.verifiesLandingPageContent();
    }
    @Test(priority = 1)
    public void clickLoginbutton() {
        homePage.MainLoginButtonLogin();
    }


    // LOGIN PAGE TESTS

    @Test(priority = 2)
    public void EnterEmail(){
        loginPage.enterEmail();
    }
    @Test(priority = 3)
    public  void EnterPassword(){
        loginPage.enterPassword();
    }
    @Test(priority = 4)
    public void ClickLogin(){
        loginPage.clickSubmit();
    }


}