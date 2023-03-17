import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseInit<Public> {

	public static AppiumDriverLocalService service;
	public AppiumDriver<MobileElement> driver;
	public static String platform = "iOS";

	public AppiumDriver<MobileElement> invokeApp() throws MalformedURLException

	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		if (platform.equalsIgnoreCase("Android"))

		{
			File appDir = new File("src//main//resources");
			File app = new File(appDir, "app-mockApi-beta (4).apk");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "17091JEC200967");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "de.adac.ehealth.screens.*");
			// capabilities.setCapability("appWaitActivity", "de.adac.ehealth.screens.*");
			// capabilities.setCapability("appPackage",
			// "de.adac.ehealth.screens.RouterActivity");
			capabilities.setCapability("appWaitDuration,40000", true);
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "6000");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
			capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		}

		else {
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.1");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14 Pro");
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "6000");
			capabilities.setCapability(MobileCapabilityType.APP, "/Users/kavya.rao.kidiyoor/Downloads/EHealth 5.app");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

			// capabilities.setCapability("bundleId", "de.s2s.EHealth");
			driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		}
		return driver;

	}

//	@BeforeSuite
//	public void setUpSuite() {
//		ExtentReport.initReports();
//	}
//
//	@AfterTest
//	public void tearDownSuite() {
//		ExtentReport.tearDownReports();
//	}
}
