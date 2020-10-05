package util.screens;

import static java.lang.String.format;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.pmw.tinylog.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import util.CustomWait;
import util.PressKey;

/**
 * Base class for all Screen Objects.
 * 
 */
public abstract class BaseScreen {
	/** The driver. */
	protected AndroidDriver<AndroidElement> driver;
	protected CustomWait customWait = new CustomWait();
	protected PressKey action = new PressKey();

	/**
	 * Constructor method for standard screen object.
	 * 
	 * @param driver : AndroidDriver
	 */
	public BaseScreen(AndroidDriver<AndroidElement> pDriver) {
		this.driver = pDriver;
		initElements();
	}

	/**
	 * Page factory.
	 */
	private void initElements() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/**
	 * Tab on back button.
	 */
	public void tapBack() {
		driver.navigate().back();
	}

	/**
	 * Scroll to the text attribute received by parameter.
	 *
	 * @param text : String
	 */
	public void scrollToText(String text) {
	
		String automator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.TextView\").textContains(\"%s\"))";
		AndroidElement textOnElement = driver.findElementByAndroidUIAutomator(format(automator, text));
		Logger.info(textOnElement.getText());
	}

	/**
	 * Scroll to the text attribute received by parameter.
	 *
	 * @param text : String
	 */
	public WebElement getTextElementWithSelector(String text) {
		
		String automator = "new UiSelector().textContains(\"" +text+ "\")";
		AndroidElement textOnElement = driver.findElementByAndroidUIAutomator(format(automator));
		
		return textOnElement;
	}
	
	/**
	 * Get text of element
	 *
	 * @param element : WebElement
	 */
	public String getTextElement(WebElement element) {
	
		return element.getText();
	}
	/**
	 * Get text of element with atrribute checked
	 *
	 * @param element : WebElement
	 */
	public String getAttributeElement(WebElement element) {
		return element.getAttribute("checked");
	}
}
