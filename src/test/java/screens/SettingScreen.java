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

	private static final String FIRST_LOCATOR = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().className(\"android.widget.TextView\").textContains(\"Configurar privacidad de datos\"))";

	// AndroidElements
	@AndroidFindBy(uiAutomator = FIRST_LOCATOR)
	private AndroidElement optionConfiguracionPrivacidad;

	/**
	 * Returns a SettingPrivacy after do click in option "Configuracion de privadiad"
	 * 
	 * 
	 * @return SettingPrivacy 
	 */
	public SettingPrivacy selectOptionSetting() {
		customWait.waitAndroidElementVisibility(driver, optionConfiguracionPrivacidad, 20);
		optionConfiguracionPrivacidad.click();
		return new SettingPrivacy(driver);
	}
}
