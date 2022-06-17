package com.juaracodingday21.locator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracodingday21.locator.driver.DriverSingleton;

public class Login {
	private WebDriver driver;
	
	public Login() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id   = "email")
	private WebElement email;
	@FindBy(id   = "passwd")
	private WebElement pass;
	@FindBy(css  = "#SubmitLogin > span")
	private WebElement submit;
	
	public void logIn() {
		email.sendKeys("ahmad@gmail.com");
		pass.sendKeys("albantani");
		submit.click();
		
	}

}
