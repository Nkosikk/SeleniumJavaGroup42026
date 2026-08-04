package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import utils.takeScreenshots;
import static utils.Base.driver;

public class ExtentReport implements ITestListener {

    private static ExtentSparkReporter sparkReporter; //UI for the report
    private static ExtentReports extent; //To populate information on the report
    private static ExtentTest test; //Create test cases in the report

    public void onStart(ITestContext context){
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/NdosiAutomation.xml");
        //System.out.println(System.getProperty("user.dir")+"/Reports/NdosiAutomation.xml");
        //Configuring the report
        sparkReporter.config().setDocumentTitle("Ndosi Automation");
        sparkReporter.config().setReportName("Functional Test");
        sparkReporter.config().setTheme(Theme.DARK);

        //Populating the information on the report by creating a relationship between extentReports and extentSparkReporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS :",System.getProperty("os.name"));
        extent.setSystemInfo("Execution machine :",System.getProperty("user.name"));
        extent.setSystemInfo("Browser :",System.getProperty("Chrome"));
        extent.setSystemInfo("Environment :",System.getProperty("Staging"));


    }
    @Override
    public void onTestFailure(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.FAIL,"Test case" + result.getMethod().getMethodName() +" Has failed");
        test.log(Status.FAIL, result.getThrowable());
        test.addScreenCaptureFromBase64String(takeScreenshots.getSnapShotBase64(driver), result.getName());

    }
    @Override
    public void onTestSuccess(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Case " + result.getMethod().getMethodName()+" Has passed");
        test.addScreenCaptureFromBase64String(takeScreenshots.getSnapShotBase64(driver), result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.SKIP,"Test Case " + result.getMethod().getMethodName()+" Has been Skipped");

    }
    public void onFinish(ITestContext context){
        extent.flush();
    }
}
