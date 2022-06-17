package com.juaracodingday21.locator.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracodingday21.locator.driver.DriverSingleton;

public class Register {
	private WebDriver driver;
	
	public Register() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	//locator
	@FindBy(id   = "email_create")
	private WebElement emailcreate;
	@FindBy(id   = "id_gender1")
	private WebElement gender;
	@FindBy(css  = "#SubmitCreate > span")
	private WebElement create;
	@FindBy(id   = "customer_firstname")
	private WebElement firstName;
	@FindBy(id   = "customer_lastname")
	private WebElement lastName;
	@FindBy(id   = "passwd")
	private WebElement pass;
	@FindBy(id   = "days")
	private WebElement day;
	@FindBy(id   = "months")
	private WebElement mont;
	@FindBy(id   = "years")
	private WebElement year;
	@FindBy(id   = "newsletter")
	private WebElement news;
	@FindBy(id   = "firstname")
	private WebElement adress;
	@FindBy(id   = "lastname")
	private WebElement adlast;
	@FindBy(id   = "company")
	private WebElement comp;
	@FindBy(id   = "address1")
	private WebElement ad1;
	@FindBy(id   = "city")
	private WebElement city;
	@FindBy(id   = "id_state")
	private WebElement id_state;
	@FindBy(id   = "postcode")
	private WebElement postcode;
	@FindBy(id   = "id_country")
	private WebElement id_country;
	@FindBy(id   = "other")
	private WebElement other;
	@FindBy(id   = "phone")
	private WebElement phone;
	@FindBy(id   = "phone_mobile")
	private WebElement phone_mobile;
	@FindBy(id   = "alias")
	private WebElement alias;
	@FindBy(id   = "submitAccount")
	private WebElement submitAccount;
	@FindBy(id   = "email")
	private WebElement email;
	@FindBy(css  = "#SubmitLogin > span")
	private WebElement submit;
	
	
	
	
	public void siIn() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(emailcreate));
		scroll(driver);
		emailcreate.click();
		emailcreate.sendKeys("ahmad@gmail.com");
		create.click();
		gender.click();
		firstName.sendKeys("ahmad");
		lastName.sendKeys("maulana yusuf");
		pass.sendKeys("albantani");
		day.sendKeys("1");
		mont.sendKeys("January");
		year.sendKeys("1996");
		news.click();
		adress.sendKeys("tangerang");
		adlast.sendKeys("banten");
		comp.sendKeys("pt pt");
		ad1.sendKeys("himalaya");
		city.sendKeys("nepal");
		id_state.sendKeys("Alaska");
		postcode.sendKeys("08878");
		id_country.sendKeys("United States");
		other.sendKeys("0897878");
		phone.sendKeys("98768");
		phone_mobile.sendKeys("098765678");
		alias.sendKeys("tangerang banten");
		submitAccount.click();
		email.sendKeys("ahmad@gmail.com");
		pass.sendKeys("albantani");
		submit.click();
	}
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,1000)");
	}

}
