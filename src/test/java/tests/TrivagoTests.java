package tests;


import org.testng.annotations.Test;

import screens.CookieConsentScreen;
import screens.DateScreen;
import screens.DestinationScreen;
import screens.HomeTrivagoScreen;
import screens.SearchScreen;
import screens.SettingPrivacy;
import screens.SettingScreen;
import screens.WelcomeScreen;
import util.tests.BaseMobileTest;
	
public class TrivagoTests extends BaseMobileTest{
	private WelcomeScreen welcome;
	private CookieConsentScreen cookie;
	private HomeTrivagoScreen homeTrivago;
	private DestinationScreen destination;
	private DateScreen date;
	private SearchScreen search;
	private SettingScreen setting;
	private SettingPrivacy settingPrivacy;
	/**
	 * Verify text in "Data privacy".
	 * 
	 * @author AnyOne
	 * 
	 */

	@Test(enabled =false)
	public void dataPrivacyTest() {
		
		 welcome= new WelcomeScreen(driver);
		 cookie= welcome.confirmationWelcome();
		 cookie.valideTitleAndBody();
		 homeTrivago =cookie.aceptCookiesConsent();
		 homeTrivago.validateDisplay();
	}
	
	/**
	 * Verify destination and country  in Trivago.
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(enabled =false)
	public void searchHotelTest() {
		
		 welcome= new WelcomeScreen(driver);
		 cookie= welcome.confirmationWelcome();
		 homeTrivago =cookie.aceptCookiesConsent();
		 destination = homeTrivago.selectDestination();
		 date= destination.selectCountry();
		 date.validateAfterSelectDestionation();
		 search = date.selecteDates();
		 search.validateDestinoAndFecha();
	}
	/**
	 * Verify that buttons are enable in home Trivago".
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(enabled =false)
	public void navegationBarTest() {
		
		 welcome= new WelcomeScreen(driver);
		 cookie= welcome.confirmationWelcome();
		 homeTrivago =cookie.aceptCookiesConsent();
		 homeTrivago.validateNavegationBar();
		
	}
	/**
	 * Verify information in setting date privacy".
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(enabled =false)
	public void settingDataPrivacyTest() {
		
		 welcome= new WelcomeScreen(driver);
		 cookie= welcome.confirmationWelcome();
		 homeTrivago =cookie.aceptCookiesConsent();
		 setting = homeTrivago.goToSetting();
		 settingPrivacy = setting.selectOptionSetting();
		 settingPrivacy.validateSettingsPrivacy();
	}
	
	/**
	 * Verify uncheckin setting date privacy".
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(enabled =true)
	public void changeCheckDataPrivacyTest() {
		
		 welcome= new WelcomeScreen(driver);
		 cookie= welcome.confirmationWelcome();
		 homeTrivago =cookie.aceptCookiesConsent();
		 setting = homeTrivago.goToSetting();
		 settingPrivacy = setting.selectOptionSetting();
		 setting =settingPrivacy.unCheckOptionFacebook();
		 settingPrivacy= setting.selectOptionSetting();
		 settingPrivacy.validateUncheckOk();
	}
	
}
