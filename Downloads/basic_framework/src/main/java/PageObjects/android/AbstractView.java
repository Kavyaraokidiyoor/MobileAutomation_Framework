package PageObjects.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

class PageDriver {

    protected AppiumDriver<MobileElement> driver;

    public PageDriver(AppiumDriver<MobileElement> driver2) {
        this.driver = driver2;
        PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
    }
}
