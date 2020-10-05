package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static util.constant.ValidateInfo.COUNTRY;
import util.screens.BaseScreen;
/**
 * Description:Screen to select destination
 *
 */

public class DestinationScreen extends BaseScreen  {
	/**
	 * Constructor method.
	 * 
	 * 
	 * @param driver : AndroidDriver
	 */
	public DestinationScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
		
	}
	
	
	
	private static final String FIRST_LOCATOR = "activitySearchDestinationSearchEditText";
	// AndroidElements
	@AndroidFindBy(id = FIRST_LOCATOR)
	private AndroidElement txtDestino;
	

	
	/**
	 * Returns a DateScreen after select country
	 * @return 
	 * 
	 * 
	 * @return DateScreen
	 */
	
	public DateScreen selectCountry() {

		customWait.waitAndroidElementVisibility(driver, txtDestino, 5);
		txtDestino.sendKeys(COUNTRY);		
		action.presskey(driver, AndroidKey.TAB, 4);
		action.presskey(driver, AndroidKey.ENTER, 1);
		return new DateScreen(driver);
		
		
	
}
}
