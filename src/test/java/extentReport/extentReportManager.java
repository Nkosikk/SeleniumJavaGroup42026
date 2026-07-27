package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import jdk.internal.access.JavaLangInvokeAccess;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class extentReportManager implements ITestListener {


    private static ExtentSparkReporter sparkReporter; // UI of the report
    private static ExtentReports extent; // populate common information in the report
    private static ExtentTest test; // creates test case in the report



    public void onStart(ITestContext context) {
        //
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir + /Reports/NdosiExecutionReport.xml"));
        sparkReporter.config().setDocumentTitle("Ndosi Automation Execution Report");
        sparkReporter.config().setReportName("Functional Test Report");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Execution machine", System.getProperty("user.name"));
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("Test Environment", "Staging");

    }

        public void onTestFailure(ITestResult result){
            test = extent.createTest(result.getName());
            test.log(Status.FAIL, "Test Case  " + result.getMethod().getMethodName() + "has failed");
            test.log(Status.FAIL, result.getThrowable());
        }

        public void onTestSuccess(ITestResult result){
            test = extent.createTest(result.getName());
            test.log(Status.PASS, "Test Case  " + result.getMethod().getMethodName());

        }

        public void onTestSkipped(ITestResult result) {
            test = extent.createTest(result.getName());
            test.log(Status.SKIP, "Test Case  " + result.getMethod().getMethodName());
        }

        public void onFinish(ITestContext context) {
            extent.flush();










    }
}
