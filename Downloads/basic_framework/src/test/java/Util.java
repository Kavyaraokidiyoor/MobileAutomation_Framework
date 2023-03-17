import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Util extends BaseInit {

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Map<String, Object> params = new HashMap<>();
		params.put("direction", "down");
		params.put("element", ((RemoteWebElement) driver.findElementByXPath(
				"//XCUIElementTypeApplication[@name=\"(Mock) Medical\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView"))
				.getId());
		js.executeScript("mobile: scroll", params);
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

	}

	public void swipeiOS() {

		HashMap<String, String> args2 = new HashMap<String, String>();
		args2.put("direction", "left");
		driver.executeScript("mobile:swipe", args2);
		System.out.println("Onboarding screen swipped");
	}

	public static WebElement waitForClickablility(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(null, 0);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
