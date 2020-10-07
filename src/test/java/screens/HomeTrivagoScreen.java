package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:Screen TrivagoPrincipalScreen
 *
 */
public class HomeTrivagoScreen extends BaseScreen {

	/**
	 * Constructor method.
	 * 
	 * 
	 * @param driver : AndroidDriver
	 */
	public HomeTrivagoScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);

	}

	private static final String FIRST_LOCATOR = "fragmentHomeLogoImageView";
	private static final String SEGUND_LOCATOR = "fragmentHomeExpandedDealformDestinationTextView";
	private static final String THIRD_LOCATOR = "action_home";
	private static final String FOURTH_LOCATOR = "action_explore";
	private static final String FIFTH_LOCATOR = "action_favourites";
	private static final String SIXTH_LOCATOR = "action_settings";

	// AndroidElements
	@AndroidFindBy(id = FIRST_LOCATOR)
	private AndroidElement iconTrivago;

	@AndroidFindBy(id = SEGUND_LOCATOR)
	private AndroidElement txtDestino;

	@AndroidFindBy(id = THIRD_LOCATOR)
	private AndroidElement optionBusqueda;

	@AndroidFindBy(id = FOURTH_LOCATOR)
	private AndroidElement optionSorprendete;

	@AndroidFindBy(id = FIFTH_LOCATOR)
	private AndroidElement optionFavorito;

	@AndroidFindBy(id = SIXTH_LOCATOR)
	private AndroidElement optionConfiguracion;

	/**
	 * Returns a DestinationScreen after of do click in destination.
	 * 
	 * 
	 * @return DestinationScreen
	 */
	public DestinationScreen selectDestination() {
		customWait.waitAndroidElementVisibility(driver, iconTrivago, 20);
		txtDestino.click();
		return new DestinationScreen(driver);
	}

	/**
	 * 
	 * 
	 * @return true if element is enable.
	 */
	public boolean validateDisplay() {
		customWait.waitInSeconds(3);
		return iconTrivago.isEnabled();
	}


	/**
	 * 
	 * 
	 * @return true if element is enable.
	 */
	public boolean validateIsEnablenableOptionBusqueda() {
		customWait.waitAndroidElementVisibility(driver, iconTrivago, 20);
		return optionBusqueda.isEnabled();
	}

	/**
	 * 
	 * 
	 * @return true if element is enable.
	 */
	public boolean validateIsEnablenableOptionSorprendete() {
		return optionSorprendete.isEnabled();
	}
	/**
	 * 
	 * 
	 * @return true if element is enable.
	 */
	public boolean validateIsEnablenableOptionFavorito() {
		return optionFavorito.isEnabled();
	}

	/**
	 * 
	 * 
	 * @return true if element is enable.
	 */
	public boolean validateIsEnablenableConfiguracion() {
		return optionConfiguracion.isEnabled();
	}

	/**
	 * Returns a DestinationScreen after of do click in "Configuracion"
	 * 
	 * 
	 * @return SettingScreen
	 */
	public SettingScreen goToSetting() {
		customWait.waitInSeconds(3);
		optionConfiguracion.click();
		return new SettingScreen(driver);
	}

}
