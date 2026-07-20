package testRunners;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utils.Base;

public class NdosiWebTests extends Base {

    @Test
    public void verifyHomeContentTest() {

        homePage.verifiesLandingPageContent();
    }

    @Test
    public void clickLoginbutton() {
        homePage.MainLoginButtonLogin();
    }
}