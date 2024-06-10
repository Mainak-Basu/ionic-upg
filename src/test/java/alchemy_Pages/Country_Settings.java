package alchemy_Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class Country_Settings extends BaseClass{
public Country_Settings(WebDriver alcDriver) {
		
		PageFactory.initElements(alcDriver, this);
		}
@FindBy(xpath = "//loader/div//table") 
public WebElement pageLoader;
@FindBy(xpath = "//div[contains(text(),'Country Settings')]")
public WebElement country_Settings;
@FindBy(xpath = "//input[@placeholder='Name']")
public WebElement nameTextField;
@FindBy(xpath = "//tbody")
public WebElement search_result;
@FindBy(xpath = "//input[@formcontrolname='currencyExchangeRate']")
public WebElement exrate;
@FindBy(xpath = "//label[text()='Digital Cash-Out Partner']/following-sibling::div/descendant::span[text()=' ON ']")
public WebElement digitalCashOutToggleON;
@FindBy(xpath = "//span[text()='Edit']")
public WebElement edit;
@FindBy(xpath = "//label[text()='Digital Cash-Out Partner']/following-sibling::div/descendant::div[@class='mdl-switch__thumb']")
public WebElement digitalCashOutToggle;
@FindBy(xpath = "//button[text()='Save']")
public WebElement save;


WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));


@SuppressWarnings("deprecation")
public void ensureDigitalCashOutToggleIsOn(String country) throws InterruptedException {
	country_Settings.click();
	nameTextField.sendKeys(country);
	search_result.click();
	 alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	try {
		wait300.until(ExpectedConditions.visibilityOf(edit));
	digitalCashOutToggleON.isDisplayed();
	}catch(NoSuchElementException e) {
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			edit.click();
			digitalCashOutToggle.click();
	        save.click();
	        wait.until(ExpectedConditions.visibilityOf(edit));
	
	}
	alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
}
//in step23
public void changeconversionrate() {
	country_Settings.click();
	nameTextField.sendKeys("philippines");
	search_result.click();
	edit.click();
	exrate.clear();
	exrate.sendKeys("2");
	save.click();
}

public void revertexchrate() {
	country_Settings.click();
	nameTextField.sendKeys("philippines");
	search_result.click();
	edit.click();
	exrate.clear();
	exrate.sendKeys("0.54273498");
	save.click();
}





}
