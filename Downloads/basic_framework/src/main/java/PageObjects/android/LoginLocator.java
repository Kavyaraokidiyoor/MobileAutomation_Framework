package PageObjects.android;

import java.time.temporal.ChronoUnit;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginLocator extends PageDriver {

	public LoginLocator(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Profil')]")
	@iOSXCUITFindBy(accessibility = "tabBar.item.profile")
	public WebElement ProfileTabSelection;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@iOSXCUITFindBy(accessibility = "tabBar.item.dashboard")
	public WebElement TelemedizinTabSelection;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@iOSXCUITFindBy(accessibility = "tabBar.item.pharmacy")
	public WebElement ApothekeTabSelection;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Loggen Sie sich mit Ihren ADAC Daten ein, um Ihr Profil zu sehen.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Loggen Sie sich mit Ihren ADAC Daten ein, um Ihr Profil zu sehen.\"]")
	public WebElement ProfilePageLoginDescription;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'JETZT EINLOGGEN')]")
	@iOSXCUITFindBy(accessibility = "JETZT EINLOGGEN")
	public WebElement ProfilePageEinloggenButton;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.EditText[0]")
	public WebElement LoginScreenUsername;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(id = "password")
	public WebElement LoginScreenPassword;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Sign in')]")
	@iOSXCUITFindBy(accessibility = "Sign in")
	public WebElement LoginScreenAnmelden;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(className = "android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"E-mail address or membership/customer number\"]")
	public List<WebElement> UserName;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"E-mail address or membership/customer number\"]")
	public WebElement UserNameiOS;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@AndroidFindBy(className = "android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
	public List<WebElement> Password;

	@WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
	public WebElement PasswordiOS;

}
