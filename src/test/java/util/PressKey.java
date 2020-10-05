package util;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class PressKey {

	/**
	 * Pres key in mobile
	 * 
	 * @param driver
	 *            : AndroidDriver
	 * @param AndroidKey
	 *            : key
	 * @param turn
	 *            : int
	 */
	public void presskey(AndroidDriver<AndroidElement>  driver, AndroidKey key, int turn) {

		for (int i = 0; i < turn; i++) {
			driver.pressKey(new KeyEvent(key));
		}

	}

}
