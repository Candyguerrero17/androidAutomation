package tests;

import org.testng.Assert;
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

public class TrivagoTests extends BaseMobileTest {
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

	@Test(enabled = true, priority = 1)
	public void dataPrivacyTest() {

		welcome = new WelcomeScreen(driver);
		cookie = welcome.confirmationWelcome();
		Assert.assertTrue(cookie.valideTitle());
		Assert.assertTrue(cookie.valideFirstBody());
		Assert.assertTrue(cookie.valideSecondBody());
		Assert.assertTrue(cookie.valideThirdBody());
		homeTrivago = cookie.aceptCookiesConsent();
		Assert.assertTrue(homeTrivago.validateDisplay());

	}

	/**
	 * Verify destination and country in Trivago.
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(enabled = true, priority = 2)
	public void searchHotelTest() {

		welcome = new WelcomeScreen(driver);
		cookie = welcome.confirmationWelcome();
		homeTrivago = cookie.aceptCookiesConsent();
		destination = homeTrivago.selectDestination();
		date = destination.selectCountry();
		Assert.assertTrue(date.validateIsEnableDestination());
		Assert.assertTrue(date.validateIsEnableButtonConfirmar());
		search = date.selecteDates();
		Assert.assertTrue(search.validateDestino());
		Assert.assertTrue(search.validateDate());
	}

	/**
	 * Verify that buttons are enable in home Trivago".
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(enabled = true, priority = 3)
	public void navegationBarTest() {

		welcome = new WelcomeScreen(driver);
		cookie = welcome.confirmationWelcome();
		homeTrivago = cookie.aceptCookiesConsent();
		Assert.assertTrue(homeTrivago.validateIsEnablenableOptionBusqueda());
		Assert.assertTrue(homeTrivago.validateIsEnablenableOptionSorprendete());
		Assert.assertTrue(homeTrivago.validateIsEnablenableOptionFavorito());
		Assert.assertTrue(homeTrivago.validateIsEnablenableConfiguracion());

	}

	/**
	 * Verify information in setting date privacy".
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(enabled = true, priority = 4)
	public void settingDataPrivacyTest() {

		welcome = new WelcomeScreen(driver);
		cookie = welcome.confirmationWelcome();
		homeTrivago = cookie.aceptCookiesConsent();
		setting = homeTrivago.goToSetting();
		settingPrivacy = setting.selectOptionSetting();
		Assert.assertTrue(settingPrivacy.validateIsEnableTitle());
		Assert.assertTrue(settingPrivacy.validateIsEnableButtonSave());
		Assert.assertTrue(settingPrivacy.validateFirstBody());
		Assert.assertTrue(settingPrivacy.validateSecondBody());
		Assert.assertTrue(settingPrivacy.validateCheckFlyer());
		Assert.assertTrue(settingPrivacy.validateCheckFire());
		Assert.assertTrue(settingPrivacy.validateCheckFacebook());

	}

	/**
	 * Verify uncheck in setting date privacy".
	 * 
	 * @author AnyOne
	 * 
	 */
	@Test(enabled = true, priority = 5)
	public void changeCheckDataPrivacyTest() {

		welcome = new WelcomeScreen(driver);
		cookie = welcome.confirmationWelcome();
		homeTrivago = cookie.aceptCookiesConsent();
		setting = homeTrivago.goToSetting();
		settingPrivacy = setting.selectOptionSetting();
		setting = settingPrivacy.unCheckOptionFacebook();
		settingPrivacy = setting.selectOptionSetting();
		settingPrivacy.validateUncheckOk();
	}

}
