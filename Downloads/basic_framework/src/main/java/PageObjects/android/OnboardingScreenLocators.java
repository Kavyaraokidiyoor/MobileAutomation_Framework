package PageObjects.android;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class OnboardingScreenLocators extends PageDriver {
	String platform = "iOS";

	public OnboardingScreenLocators(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Überspringen']")
	@iOSXCUITFindBy(accessibility = "Überspringen")
	public WebElement skip;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Nutzungsbedingungen')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nutzungsbedingungen\"]")
	public WebElement NutzungsbedingungenHeader;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Ich stimme den Nutzungsbedingungen zu.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name=\"Ich stimme den Nutzungsbedingungen zu.\"]")
	public WebElement NutzungsbedingungenBodyText;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/checkBoxLicenceAgreement")
	@iOSXCUITFindBy(accessibility = "privacy.checkbox")
	public WebElement NutzungsbedingungenChecbox;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.Button[@text='WEITER']")
	@iOSXCUITFindBy(accessibility = "WEITER")
	public WebElement NutzungsbedingungenWeiterButton;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit1")
	@iOSXCUITFindBy(accessibility = "pin.1")
	public WebElement pinDigit1;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit2")
	@iOSXCUITFindBy(accessibility = "pin.2")
	public WebElement pinDigit2;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit3")
	@iOSXCUITFindBy(accessibility = "pin.3")
	public WebElement pinDigit3;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit4")
	@iOSXCUITFindBy(accessibility = "pin.4")
	public WebElement pinDigit4;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit5")
	@iOSXCUITFindBy(accessibility = "pin.5")
	public WebElement pinDigit5;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit6")
	@iOSXCUITFindBy(accessibility = "pin.6")
	public WebElement pinDigit6;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit7")
	@iOSXCUITFindBy(accessibility = "pin.7")
	public WebElement pinDigit7;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit8")
	@iOSXCUITFindBy(accessibility = "pin.8")
	public WebElement pinDigit8;

	@WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/btnDigit9")
	@iOSXCUITFindBy(accessibility = "pin.9")
	public WebElement pinDigit9;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Zurück']")
	public WebElement IAPopUpScreen;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "de.adac.ehealth.mockApi.beta:id/txtTitle")
	public WebElement PIN;

	public void pinDigit1() {
		return;
	}

	public void pinDigit2() {
		return;
	}

	public void pinDigit3() {
		return;
	}

	public void pinDigit4() {
		return;
	}

	public void pinDigit5() {
		return;
	}

	public void pinDigit6() {
		return;
	}

	public void pinDigit7() {
		return;
	}

	public void swipe() throws InterruptedException

	{
		Thread.sleep(3000);
		if (platform.equalsIgnoreCase("iOS")) {
			System.out.println("ios swipe function");
			WebElement Panel = driver.findElementByXPath(
					"//XCUIElementTypeApplication[@name=\"(Mock) Medical\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			Dimension dimension = Panel.getSize();
			int Anchor = Panel.getSize().getHeight() / 2;

			Double ScreenWidthStart = dimension.getWidth() * 0.2;
			int scrollStart = ScreenWidthStart.intValue();

			Double ScreenWidthEnd = dimension.getWidth() * 0.8;
			int scrollEnd = ScreenWidthEnd.intValue();

			new TouchAction(driver).press(PointOption.point(scrollStart, Anchor))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(scrollEnd, Anchor)).release().perform();
			return;
		}

		else {
			WebElement Panel = driver.findElementById("de.adac.ehealth.mockApi.beta:id/container");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			Dimension dimension = Panel.getSize();
			int Anchor = Panel.getSize().getHeight() / 2;

			Double ScreenWidthStart = dimension.getWidth() * 0.2;
			int scrollStart = ScreenWidthStart.intValue();

			Double ScreenWidthEnd = dimension.getWidth() * 0.8;
			int scrollEnd = ScreenWidthEnd.intValue();

			new TouchAction(driver).press(PointOption.point(scrollStart, Anchor))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(scrollEnd, Anchor)).release().perform();
			return;
		}
//	}
	}

	public void swipeiOS() {

		HashMap<String, String> args2 = new HashMap<String, String>();
		args2.put("direction", "left");
		driver.executeScript("mobile:swipe", args2);
		System.out.println("Onboarding screen swipped");
	}

	public void PinScreenAndroid() throws InterruptedException {
		OnboardingScreenLocators pinscreen = new OnboardingScreenLocators(driver);
		pinscreen.pinDigit1.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit4.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit7.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit2.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit5.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit8.click();
		Thread.sleep(3000);
		pinscreen.pinDigit1.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit4.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit7.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit2.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit5.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		pinscreen.pinDigit8.click();
		System.out.println("Enter and confirmed PIN screen");
		OnboardingScreenLocators IApopup = new OnboardingScreenLocators(driver);
		boolean isenabled = IApopup.IAPopUpScreen.isEnabled();

		if (isenabled == true) {
			IApopup.IAPopUpScreen.click();
		}

	}

	public void PinScreeniOS() throws InterruptedException

	{
		OnboardingScreenLocators pinscreen = new OnboardingScreenLocators(driver);
		LoginLocator loginlocator = new LoginLocator(driver);
		pinscreen.pinDigit1.click();
		pinscreen.pinDigit4.click();
		pinscreen.pinDigit7.click();
		pinscreen.pinDigit2.click();
		pinscreen.pinDigit5.click();
		pinscreen.pinDigit8.click();
		Thread.sleep(3000);
		pinscreen.pinDigit1.click();
		pinscreen.pinDigit4.click();
		pinscreen.pinDigit7.click();
		pinscreen.pinDigit2.click();
		pinscreen.pinDigit5.click();
		pinscreen.pinDigit8.click();
		System.out.println("Entered and confirmed data in PIN screen");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		loginlocator.TelemedizinTabSelection.click();
	}

	public void PinScreenThreeDifferentDigit() throws InterruptedException

	{
		OnboardingScreenLocators pinscreen = new OnboardingScreenLocators(driver);
		LoginLocator loginlocator = new LoginLocator(driver);
		Thread.sleep(2000);
		pinscreen.pinDigit3.click();
		pinscreen.pinDigit5.click();
		pinscreen.pinDigit5.click();
		pinscreen.pinDigit3.click();
		pinscreen.pinDigit3.click();
		pinscreen.pinDigit5.click();
		Thread.sleep(3000);

	}

	public void PinScreenSequenceOfDigit() throws InterruptedException

	{
		OnboardingScreenLocators pinscreen = new OnboardingScreenLocators(driver);
		LoginLocator loginlocator = new LoginLocator(driver);
		pinscreen.pinDigit7.click();
		pinscreen.pinDigit3.click();
		pinscreen.pinDigit4.click();
		pinscreen.pinDigit5.click();
		pinscreen.pinDigit6.click();
		pinscreen.pinDigit2.click();
		Thread.sleep(3000);

	}

	public void PinScreenThreeSameDigitsInARow() throws InterruptedException

	{
		OnboardingScreenLocators pinscreen = new OnboardingScreenLocators(driver);
		LoginLocator loginlocator = new LoginLocator(driver);
		pinscreen.pinDigit1.click();
		pinscreen.pinDigit3.click();
		pinscreen.pinDigit4.click();
		pinscreen.pinDigit4.click();
		pinscreen.pinDigit4.click();
		pinscreen.pinDigit5.click();
		Thread.sleep(2000);

	}

	public void PinScreenCombinationEasy() throws InterruptedException

	{
		OnboardingScreenLocators pinscreen = new OnboardingScreenLocators(driver);
		LoginLocator loginlocator = new LoginLocator(driver);
		pinscreen.pinDigit1.click();
		pinscreen.pinDigit2.click();
		pinscreen.pinDigit3.click();
		pinscreen.pinDigit1.click();
		pinscreen.pinDigit2.click();
		pinscreen.pinDigit3.click();
		Thread.sleep(3000);

	}

	public void PinScreenCorrectFormat() throws InterruptedException

	{
		OnboardingScreenLocators pinscreen = new OnboardingScreenLocators(driver);
		LoginLocator loginlocator = new LoginLocator(driver);
		pinscreen.pinDigit1.click();
		pinscreen.pinDigit4.click();
		pinscreen.pinDigit7.click();
		pinscreen.pinDigit2.click();
		pinscreen.pinDigit5.click();
		pinscreen.pinDigit8.click();
		Thread.sleep(2000);

	}

	public void Pin() {
		OnboardingScreenLocators pinscreen = new OnboardingScreenLocators(driver);
		TelemedizinScreenLocators telemedizinscreenlocators = new TelemedizinScreenLocators(driver);
		boolean pin = pinscreen.PIN.isDisplayed();
		if (pin == true) {
			pinscreen.pinDigit1.click();
			pinscreen.pinDigit4.click();
			pinscreen.pinDigit7.click();
			pinscreen.pinDigit2.click();
			pinscreen.pinDigit5.click();
			pinscreen.pinDigit8.click();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			telemedizinscreenlocators.telemedizinscreen_medgateTermin_button();

		} else {
			telemedizinscreenlocators.telemedizinscreen_medgateTermin_button();
		}

	}
}