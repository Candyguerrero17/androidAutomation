package screens;

import static util.constant.ValidateInfo.FIRST_BODY;
import static util.constant.ValidateInfo.SECOND_BODY;
import static util.constant.ValidateInfo.THIRD_BODY;
import static util.constant.ValidateInfo.TITLE_DATA_PRIVACY;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:Screen to accept cookies
 *
 */
public class CookieConsentScreen extends BaseScreen {

	/**
	 * Constructor method.
	 * 
	 * 
	 * @param driver : AndroidDriver
	 */
	public CookieConsentScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);

	}

	private static final String FIRST_LOCATOR = "activityCookieConsentContentTitleTextView";
	private static final String SEGUND_LOCATOR = "activityCookieConsentContentBody1TextView";
	private static final String THIRD_LOCATOR = "activityCookieConsentContentBody2TextView";
	private static final String FOURTH_LOCATOR = "activityCookieConsentContentBody3TextView";
	private static final String SIXTH_LOCATOR = "activityCookieConsentContentAcceptButton";
	// AndroidElements

	@AndroidFindBy(id = FIRST_LOCATOR)
	protected AndroidElement titleDataPrivacy;

	@AndroidFindBy(id = SEGUND_LOCATOR)
	private AndroidElement bodyFirst;

	@AndroidFindBy(id = THIRD_LOCATOR)
	private AndroidElement bodySecond;

	@AndroidFindBy(id = FOURTH_LOCATOR)
	private AndroidElement bodyThird;

	@AndroidFindBy(id = SIXTH_LOCATOR)
	private AndroidElement buttonAceptarTodo;

	/**
	 * Returns a DateScreen after select country
	 * @return 
	 * 
	 * 
	 * @return DateScreen
	 */

	public boolean valideTitle() {

		customWait.waitAndroidElementVisibility(driver, titleDataPrivacy, 20);
		return getTextElement(titleDataPrivacy).equals(TITLE_DATA_PRIVACY);

	}
	/**
	 * 
	 * 
	 * @return true if text is equals
	 */
	public boolean valideFirstBody() {

		return getTextElement(bodyFirst).equals(FIRST_BODY);
	}
	/**
	 * 
	 * 
	 * @return true if text is equals
	 */
	public boolean valideSecondBody() {

		return getTextElement(bodySecond).equals(SECOND_BODY);
	}
	/**
	 * 
	 * 
	 * @return true if text is equals
	 */
	public boolean valideThirdBody() {

		return getTextElement(bodyThird).equals(THIRD_BODY);
	}
	/**
	 * Returns a CookieConsentScreen after to do clik in "Aceptar todo".
	 * 
	 * 
	 * @return CookieConsentScreen
	 */

	public HomeTrivagoScreen aceptCookiesConsent() {
		customWait.waitAndroidElementVisibility(driver, buttonAceptarTodo, 20);
		buttonAceptarTodo.click();
		return new HomeTrivagoScreen(driver);

	}
	

}
