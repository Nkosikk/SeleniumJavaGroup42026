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
    @Test(dependsOnMethods = "verifyHomeContentTest")
    public void clickLoginButton() {
        homePage.MainLoginButtonLogin();
    }


    // LOGIN PAGE TESTS

    @Test(dependsOnMethods = "clickLoginButton")
    public void EnterEmail(){
        loginPage.enterEmail();
    }

    @Test(dependsOnMethods = "EnterEmail")
    public  void EnterPassword(){
        loginPage.enterPassword();
    }

    @Test(dependsOnMethods = "EnterPassword")
    public void ClickLogin(){
        loginPage.clickSubmit();
    }

    // DASHBOARD TESTS


    // BASIC FORM TESTS

}