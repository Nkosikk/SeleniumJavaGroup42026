package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener {


    public void onStart(ITestContext context) {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/NdosiExecutionReport.xml");
        sparkReporter.config().setReportName("Functional Test");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("Test Environment", "Staging");

    }

    public void onTestFailure(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, result.getThrowable());
    }

    public void onTestSuccess(ITestResult result){
        test = extent.createTest(result.getName());
    }

    public void onTestSkipped(ITestResult result){
        test = extent.createTest(result.getName());
    }

public void onFinish(ITestContext context){
        extent.flush();
    }

}
