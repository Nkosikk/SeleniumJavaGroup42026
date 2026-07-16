package testRunners;

import org.testng.annotations.Test;
import pages.HomePage;
import utils.Base;

public class NdosiWebsiteTests extends Base {

    @Test
    public void verifyHomeContentTest(){
        homePage.verifyHomeScreenContent();
    }
}
