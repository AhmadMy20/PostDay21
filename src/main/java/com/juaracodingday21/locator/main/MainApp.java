package com.juaracodingday21.locator.main;

import org.openqa.selenium.WebDriver;

import com.juaracodingday21.locator.driver.DriverSingleton;
import com.juaracodingday21.locator.pages.Register;


public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		 Register register = new Register();
		 register.siIn();
	}

}
