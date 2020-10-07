package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:Screen of Setting!
 *
 */
public class SettingScreen extends BaseScreen {
	/**
	 * Constructor method.
	 * 
	 * 
	 * @param driver : AndroidDriver
	 */
	public SettingScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);

	}

	private static final String OPTION_SETTING= "Configurar privacidad de datos";
	private static final String FIRST_LOCATOR = "fragmentSettingsManageMyDataTextView";
	private static final String AFTER_OPTION="Atención al cliente";

	// AndroidElements
	@AndroidFindBy(id = FIRST_LOCATOR)
	private AndroidElement titleSetting;

	/**
	 * Returns a SettingPrivacy after do click in option "Configuracion de privadiad"
	 * 
	 * 
	 * @return SettingPrivacy 
	 */
	public SettingPrivacy selectOptionSetting() {
		customWait.waitAndroidElementVisibility(driver, titleSetting, 20);
		scrollToText(AFTER_OPTION);
		scrollToTextAndClick(OPTION_SETTING);
		return new SettingPrivacy(driver);
	}


}
