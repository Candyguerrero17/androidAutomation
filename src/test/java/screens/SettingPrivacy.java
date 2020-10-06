package screens;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static util.constant.ValidateInfo.FIRST_BODY_SETTING;
import static util.constant.ValidateInfo.SECOND_BODY_SETTING;
import util.screens.BaseScreen;

/**
 * Description:Screen of SettingPrivacy!
 *
 */
public class SettingPrivacy extends BaseScreen {
	/**
	 * Constructor method.
	 * 
	 * 
	 * @param driver : AndroidDriver
	 */
	public SettingPrivacy(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);

	}

	private static final String FIRST_LOCATOR = "activityDataManagerSaveButton";
	private static final String SECOND_LOCATOR = "activityDataManagerTitleTextView";
	private static final String THIRD_LOCATOR = "activityDataManagerLearnMoreTextView";
	private static final String FOURTH_LOCATOR = "activityDataManagerAppsFlyerCheckbox";
	private static final String SIXTH_LOCATOR = "activityDataManagerFirebaseCheckbox";
	private static final String SEVENTH_LOCATOR = "activityDataManagerFacebookCheckbox";
	private static final String TITLE_SETTING = "Configurar privacidad de datos";
	private static final String TRUE = "true";
	private static final String FALSE = "false";

	// AndroidElements
	@AndroidFindBy(id = FIRST_LOCATOR)
	private AndroidElement buttonGuardar;

	@AndroidFindBy(id = SECOND_LOCATOR)
	private AndroidElement bodyFirst;

	@AndroidFindBy(id = THIRD_LOCATOR)
	private AndroidElement bodySecond;

	@AndroidFindBy(id = FOURTH_LOCATOR)
	private AndroidElement checkBoxFlyer;

	@AndroidFindBy(id = SIXTH_LOCATOR)
	private AndroidElement checkBoxFire;

	@AndroidFindBy(id = SEVENTH_LOCATOR)
	private AndroidElement checkBoxFacebbok;

	/**
	 * Validate title, body, button and checkbox
	 * 
	 * 
	 * 
	 */

	public void validateSettingsPrivacy() {
		customWait.waitAndroidElementVisibility(driver, buttonGuardar, 20);
		assertTrue(getTextElementWithSelector(TITLE_SETTING).isEnabled());
		assertTrue(buttonGuardar.isEnabled());
		assertEquals(getTextElement(bodyFirst), FIRST_BODY_SETTING);
		assertEquals(getTextElement(bodySecond), SECOND_BODY_SETTING);
		assertEquals(getAttributeElement(checkBoxFlyer), TRUE);
		assertEquals(getAttributeElement(checkBoxFire), TRUE);
		assertEquals(getAttributeElement(checkBoxFacebbok), TRUE);

	}

	/**
	 * Returns a SettingScreen afther uncheck option
	 * 
	 * 
	 * @return SettingScreen 
	 */
	public SettingScreen unCheckOptionFacebook() {
		customWait.waitAndroidElementVisibility(driver, buttonGuardar, 20);
		checkBoxFacebbok.click();
		buttonGuardar.click();

		return new SettingScreen(driver);

	}

	public void validateUncheckOk() {
		customWait.waitAndroidElementVisibility(driver, buttonGuardar, 20);
		assertEquals(getAttributeElement(checkBoxFacebbok), FALSE);
	}
}
