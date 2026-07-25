package utils_Nosipho;
import Pages_Nosipho.DashboardPage;
import Pages_Nosipho.HomePage;
import Pages_Nosipho.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    static final Browsers factory = new Browsers();
    public static final WebDriver driver = factory.openBrowser("chrome" ,"https://ndosisimplifiedautomation.vercel.app/#overview");
       public  HomePage homePage = PageFactory.initElements(driver, HomePage.class);
       public  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        public DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
}
