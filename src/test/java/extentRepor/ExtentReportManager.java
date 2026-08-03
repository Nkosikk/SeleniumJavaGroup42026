package extentRepor;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import utils.TakeScreenshots;
import static utils.Base.driver;

public class ExtentReportManager implements ITestListener{

    private static ExtentSparkReporter sparkReporter;   //UI of the report

    private static ExtentReports extent; //Populates common information in the report

    private static ExtentTest test; // Create test cases in the test


   @Override
    public void onStart(ITestContext context){
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir"+"Report/NdosiExecutionReport.xml"));
      //  System.out.println(System.getProperty("user.dir")+"Report/NdosiExecutionReport.xml");
        sparkReporter.config().setDocumentTitle("Ndosi Automation");
        sparkReporter.config().setReportName("Functional Test");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Execution machine", System.getProperty("user.name"));
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("Test enviroment", "Staging");
    }
    @Override
    public void onTestFailure(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test case" + result.getMethod().getMethodName() + "has fail");
        test.log(Status.FAIL, result.getThrowable());
        test.addScreenCaptureFromBase64String(TakeScreenshots.getSnapShotBase64(driver),result.getName());

    }
    @Override
    public void onTestSuccess(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test case" + result.getMethod().getMethodName());
        test.addScreenCaptureFromBase64String(TakeScreenshots.getSnapShotBase64(driver));
    }
    @Override
    public void onTestSkipped(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test case" + result.getMethod());

    }

    public void onFinish(ITestResult result){
        extent.flush();
    }
}
