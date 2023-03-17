import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static ExtentReports extent;

	public static void initReports() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./test-output/kavya.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent reports");
		extent.attachReporter(spark);

	}

	public static void tearDownReports() {

		extent.flush();
	}

}
