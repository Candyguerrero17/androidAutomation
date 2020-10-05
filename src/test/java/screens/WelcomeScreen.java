package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:Screen of welcome!
 *
 */
public class WelcomeScreen extends BaseScreen {

	/**
	 * Constructor method.
	 * 
	 * 
	 * @param driver : AndroidDriver
	 */
	public WelcomeScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);

	}

	private static final String FIRST_LOCATOR = "new UiSelector().className(\"android.widget.TextView\").textContains(\"Colombia\")";
	private static final String SEGUND_LOCATOR = "activityPlatformSelectionConfirmButton";
	private static final String COUNTRY_AFTER = "Deutschland";

	// AndroidElements
	@AndroidFindBy(uiAutomator = FIRST_LOCATOR)
	private AndroidElement optionCol;
	@AndroidFindBy(id = SEGUND_LOCATOR)
	private AndroidElement buttonConfirm;
	

	/**
	 * Returns a CookieConsentScreen after to do click in confirm
	 * 
	 * 
	 * @return CookieConsentScreen 
	 */

	public CookieConsentScreen confirmationWelcome() {
		customWait.waitInSeconds(3);
		scrollToText(COUNTRY_AFTER);
		optionCol.click();
		customWait.waitInSeconds(3);
	    buttonConfirm.click();
		return new CookieConsentScreen(driver);

	}
}
