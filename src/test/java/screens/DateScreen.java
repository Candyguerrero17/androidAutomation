package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Description:Screen of Date!
 *
 */
public class DateScreen extends BaseScreen {
	/**
	 * Constructor method.
	 * 
	 * 
	 * @param driver : AndroidDriver
	 */
	public DateScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);

	}

	// AndroidElements
	private static final String SELECT_DATE = "Seleccionar fechas";
	private static final String SEGUND_LOCATOR = "new UiSelector().textContains(\"Confirmar fechas\")";
	private static final String THIRD_LOCATOR = "new UiSelector().className(\"android.widget.LinearLayout\").index(0).childSelector(new UiSelector().text(\"1\"))";
	private static final String FOURTH_LOCATOR = "new UiSelector().className(\"android.widget.LinearLayout\").index(0).childSelector(new UiSelector().text(\"5\"))";
	private static final String MOUTH_AFTER = "diciembre de 2020";
	
	@AndroidFindBy(uiAutomator = SEGUND_LOCATOR)
	private AndroidElement buttonConfirmar;

	@AndroidFindBy(uiAutomator = THIRD_LOCATOR)
	private AndroidElement dateFirst;

	@AndroidFindBy(uiAutomator = FOURTH_LOCATOR)
	private AndroidElement dateSecond;

	/**
	 * Validate that "Seleccionar Fechas" and button "Confirmar" are enable
	 * 
	 * 
	 */



	public boolean validateIsEnableDestination() {
		customWait.waitAndroidElementVisibility(driver, buttonConfirmar, 20);
		return getTextElementWithSelector(SELECT_DATE).isEnabled();
		
	}
	
	public boolean validateIsEnableButtonConfirmar() {
		customWait.waitAndroidElementVisibility(driver, buttonConfirmar, 20);
		return buttonConfirmar.isEnabled();
		
	}
	/**
	 * Returns a SearchScreen after select dates and click in "Confirmar"
	 * 
	 * 
	 * @return SearchScreen
	 */

	public SearchScreen selecteDates() {
		scrollToText(MOUTH_AFTER);
		customWait.waitInSeconds(2);
		dateFirst.click();
		dateSecond.click();
		buttonConfirmar.click();
		return new SearchScreen(driver);
	}
}
