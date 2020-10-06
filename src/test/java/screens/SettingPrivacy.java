package screens;

import static util.constant.ValidateInfo.FIRST_BODY_SETTING;
import static util.constant.ValidateInfo.SECOND_BODY_SETTING;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
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
	 * 
	 * 
	 * @return true if element is enabled.
	 */

	public boolean validateIsEnableTitle() {
		customWait.waitAndroidElementVisibility(driver, buttonGuardar, 20);
		return getTextElementWithSelector(TITLE_SETTING).isEnabled();
	}
	/**
	 * 
	 * 
	 * @return true if element is enabled.
	 */
	public boolean validateIsEnableButtonSave() {
		return buttonGuardar.isEnabled();
	}
	/**
	 * 
	 * 
	 * @return true if text is equals.
	 */
	public boolean validateFirstBody() {
		return getTextElement(bodyFirst).equals(FIRST_BODY_SETTING);
	}
	/**
	 * 
	 * 
	 * @return true if text is equals.
	 */
	public boolean validateSecondBody() {
		return getTextElement(bodySecond).equals(SECOND_BODY_SETTING);
	}
	/**
	 * 
	 * 
	 * @return true if text is equals.
	 */
	public boolean validateCheckFlyer() {
		return getAttributeElement(checkBoxFlyer).equals(TRUE);
	}
	/**
	 * 
	 * 
	 * @return true if text is equals.
	 */
	public boolean validateCheckFire() {
		return getAttributeElement(checkBoxFire).equals(TRUE);
	}
	/**
	 * 
	 * 
	 * @return true if text is equals.
	 */
	public boolean validateCheckFacebook() {
		return getAttributeElement(checkBoxFacebbok).equals(TRUE);
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

	/**
	 * 
	 * 
	 * @return true if text is equals.
	 */
	public boolean validateUncheckOk() {
		customWait.waitAndroidElementVisibility(driver, buttonGuardar, 20);
		return  getAttributeElement(checkBoxFacebbok).equals(FALSE);
	}
}
