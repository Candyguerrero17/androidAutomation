package screens;

import static util.constant.ValidateInfo.COUNTRY;
import static util.constant.ValidateInfo.DATES_DESTINATION;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;
/**
 * Description:Screen of search hotel!
 *
 */
public class SearchScreen extends BaseScreen{
	/**
	 * Constructor method.
	 * 
	 * 
	 * @param driver : AndroidDriver
	 */
	public SearchScreen(AndroidDriver<AndroidElement> pDriver) {
		super(pDriver);
		
	}
	private static final String FIRST_LOCATOR = "fragmentHotelSearchResultsExpandedDealformDestinationTextView";
	private static final String SEGUND_LOCATOR = "fragmentHotelSearchResultsExpandedDealformCalendarTextView";

	// AndroidElements
	@AndroidFindBy(id = FIRST_LOCATOR)
	private AndroidElement fieldDestino;
	@AndroidFindBy(id = SEGUND_LOCATOR)
	private AndroidElement fieldFecha;
	
	/**
	 * 
	 * 
	 * @return true if text is equals.
	 */
	
	public boolean validateDestino() {
		customWait.waitAndroidElementVisibility(driver, fieldDestino, 20);
		return getTextElement(fieldDestino).equals(COUNTRY);
	
	}
	
	/**
	 * 
	 * 
	 * @return true if text is equals.
	 */
	public boolean validateDate() {
		return getTextElement(fieldFecha).equals(DATES_DESTINATION);
	
	}

}
