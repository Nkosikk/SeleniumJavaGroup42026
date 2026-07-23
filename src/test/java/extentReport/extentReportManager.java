package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;

public class extentReportManager implements ITestListener {


    private static ExtentSparkReporter sparkReporter; // UI of the report
    private static ExtentReports extent; // populate common information in the report
    private static ExtentTest test; // creates test case in the report


    public void onStart(ITestContext context) {
        // + "/Reports/NdosiExecutionReport.xml"
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir"));



    }
}
