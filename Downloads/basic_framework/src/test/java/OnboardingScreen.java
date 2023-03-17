import java.net.MalformedURLException;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import PageObjects.android.OnboardingScreenLocators;

public class OnboardingScreen extends BaseInit {

	@BeforeMethod
	public void openApp() throws MalformedURLException {
		driver = invokeApp();

	}

	@Test
	public void verifySkip_Swipe_Nutzungsbedingungen_OnboardingScreen()
			throws InterruptedException, MalformedURLException {

		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("result.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		ExtentTest test = extent.createTest("OnboardingScreen", "first test");

		OnboardingScreenLocators onboardingscreenlocators = new OnboardingScreenLocators(driver);
		onboardingscreenlocators.skip.click();
		test.log(Status.INFO, "Verified Überspringen button ");
		AssertJUnit.assertTrue(
				onboardingscreenlocators.NutzungsbedingungenHeader.getText().contains("Nutzungsbedingungen"));
		test.pass("Verified Nutzungsbedingungen Header");
		AssertJUnit.assertTrue(onboardingscreenlocators.NutzungsbedingungenBodyText.getText()
				.contains("Ich stimme den Nutzungsbedingungen zu."));
		test.log(Status.PASS, "verified nutzungs");

		test.log(Status.PASS, "Verified Nutzungsbedingungen page description");

		// swipe
		OnboardingScreenLocators swipescreen = new OnboardingScreenLocators(driver);
		test.log(Status.INFO, "swipe started ");
		swipescreen.swipe();
		swipescreen.swipe();
		swipescreen.swipe();
		onboardingscreenlocators.NutzungsbedingungenWeiterButton.click();
		onboardingscreenlocators.NutzungsbedingungenWeiterButton.click();
		onboardingscreenlocators.NutzungsbedingungenWeiterButton.click();
		test.log(Status.PASS, "clicked on weiter ");

		boolean isSelected = onboardingscreenlocators.NutzungsbedingungenChecbox.isSelected();

		if (isSelected == false) {
			onboardingscreenlocators.NutzungsbedingungenChecbox.click();
		}

		onboardingscreenlocators.NutzungsbedingungenWeiterButton.isEnabled();
		onboardingscreenlocators.NutzungsbedingungenWeiterButton.click();
		test.log(Status.PASS, "completed ");
		extent.flush();

	}

//    @AfterTest
//    public void tearDown()
//    {
//        driver.quit();
//    }
}
