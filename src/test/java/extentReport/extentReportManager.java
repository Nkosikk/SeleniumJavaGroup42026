package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;


public class extentReportManager implements ITestListener {

    private static ExtentSparkReporter sparkReporter; //UI of the report

    private static ExtentReports extent; //Generate the report. Populate the report with all the test cases and their status (pass/fail/skip). Populate common information like OS, Browser, Environment, etc. in the report.

    private static ExtentTest test; //Test case. Create a test node/cases in the report


    public void onStart(ITestContext context) {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "Reports/NdosiAutomationReport.xml");
        //System.out.println(System.getProperty("user.dir")+ "Reports/NdosiAutomationReport.xml");
        sparkReporter.config().setReportName("Ndosi Automation Test Report");
        sparkReporter.config().setDocumentTitle("Ndosi Automation Report");
        sparkReporter.config().setEncoding("utf-8");
        sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Execution machine", System.getProperty("user.name"));
        extent.setSystemInfo("browser", "Chrome");
        extent.setSystemInfo("Test Environment", "Staging");
    }
    public void onTestFailure(ITestResult result){
    test = extent.createTest(result.getName());
    test.log(Status.FAIL,"Test case" +result.getMethod().getMethodName() + "has failed");
    test.log(Status.FAIL, result.getThrowable());
    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test case " + result.getMethod().getMethodName() + "has passed");
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test case " + result.getMethod().getMethodName() + "has been skipped");
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
