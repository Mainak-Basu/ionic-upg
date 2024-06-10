package plastic_Bank_Pages;

import static org.testng.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;

public class Chrome_app extends BaseClass{
public Chrome_app(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Alchemy\").instance(1)")
public WebElement alchemy;
@AndroidFindBy(id = "com.android.chrome:id/header_menu")
public WebElement discover;
@AndroidFindBy(id = "android:id/icon")
public List<WebElement> icons;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"\")")
public WebElement alchemymenu;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"+63\")")
public WebElement firstoption;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"android\")")
public WebElement latestandroidbenefit;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Benefits\")")
public WebElement benefits;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"SELECT\")")
public WebElement select;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Resend Code\")")
public WebElement resendcode;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Admin']")
public WebElement admin;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
public WebElement login;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"All benefits\")")
public WebElement allbenefits;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Record new benefit\")")
public WebElement recordnewbenefit;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Chrome\")")
public WebElement chromeapp;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Next month\")")
public WebElement nextmonth;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Get started\")")
public WebElement getstarted;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"LOGOUT\")")
public WebElement logout;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Beneficiary details\")")
public WebElement details;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Category\")")
public WebElement category;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Additional details\")")
public WebElement adddetails;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Select file(s)\")")
public WebElement selectfiles;
@AndroidFindBy(id = "com.android.chrome:id/menu_button")
public WebElement threedots;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Recent\")")
public WebElement recent;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Type\")")
public WebElement type;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Close\")")
public WebElement close;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Clear browsing data…\")")
public WebElement cleardata;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"New tab\")")
public WebElement newtab;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"New Incognito tab\")")
public WebElement newincognitotab;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"All time\")")
public WebElement alltime;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"History\")")
public WebElement history;
@AndroidFindBy(id = "com.android.chrome:id/spinner")
public WebElement rangedropdown;
@AndroidFindBy(id = "com.android.chrome:id/action_button")
public WebElement closetab;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Date Received\")")
public WebElement datereceived;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
public WebElement save;
@AndroidFindBy(id = "com.android.chrome:id/tab_switcher_button")
public WebElement tabs;
@AndroidFindBy(id = "com.android.chrome:id/close_menu_id")
public WebElement close2;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Education Programs\")")
public WebElement educationprograms;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Education Support\")")
public WebElement educationsupport;
@AndroidFindBy(id= "com.android.chrome:id/search_box_text")
public WebElement searchurlfirst;
@AndroidFindBy(id= "com.android.chrome:id/url_bar")
public WebElement searchurlsecond;
@AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.EditText\")")
public List<WebElement> textboxes;


String xp= "//android.widget.TextView[@text='param']";

@SuppressWarnings("deprecation")
public void createbenefitonphonebrowser() throws InterruptedException {
	pbDriver.terminateApp("org.plasticbank.app");
	pbDriver.activateApp("com.android.chrome");
	threedots.click();
	history.click();
	pbDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	try {
		cleardata.click();
		rangedropdown.click();
		alltime.click();
		tap(880,2034);
		close2.click();
		
		 tabs.click();
		  closetab.click();
		  newtab.click();
		  wait200.until(ExpectedConditions.elementToBeClickable(discover));
	}catch(Exception e) {
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		close2.click();
		tabs.click();
		  closetab.click();
		  newtab.click();
		wait200.until(ExpectedConditions.elementToBeClickable(discover));
	}
	pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	searchurlfirst.click();
	searchurlsecond.sendKeys("https://qa-admin.cognitionfoundry.io/#/login");
	pbDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
	wait200.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(login)));
	
	textboxes.get(0).sendKeys("+919560071590");
	
	textboxes.get(1).sendKeys("123456a");
	login.click();
	wait200.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(resendcode)));
	textboxes.get(0).click();
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_9));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_9));
	Thread.sleep(10000);
	tap(120,400);
	tap(250,960);
	allbenefits.click();
	scroll(1050,550,50,550);
	scroll(1050,550,50,550);
	scroll(1050,550,50,550);
	recordnewbenefit.click();
   tap(404,1235);
   pbDriver.pressKey(new KeyEvent(AndroidKey.F));
  	pbDriver.pressKey(new KeyEvent(AndroidKey.L));
  	pbDriver.pressKey(new KeyEvent(AndroidKey.E));
  	pbDriver.pressKey(new KeyEvent(AndroidKey.E));
  	pbDriver.pressKey(new KeyEvent(AndroidKey.K));
    firstoption.click();
    Thread.sleep(3000);
    pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(5000);
    getstarted.click();
    wait200.until(ExpectedConditions.elementToBeClickable(details));
    Thread.sleep(6000);
     textboxes.get(0).sendKeys(androidbenefitname);
    category.click();
    educationprograms.click();
    scroll(1050,2090,1050,550);
   tap(200,690);
    educationsupport.click();
    tap(200,915);
    Thread.sleep(2000);
    pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	Thread.sleep(2000);
    datereceived.click();
    wait200.until(ExpectedConditions.elementToBeClickable(nextmonth));
    tap(862,1666);
    scroll(1050,2090,1050,550);
    tap(274,1123);
    Thread.sleep(2000);
    pbDriver.pressKey(new KeyEvent(AndroidKey.N));
	pbDriver.pressKey(new KeyEvent(AndroidKey.O));
	pbDriver.pressKey(new KeyEvent(AndroidKey.T));
	pbDriver.pressKey(new KeyEvent(AndroidKey.E));
	pbDriver.pressKey(new KeyEvent(AndroidKey.S));
	Thread.sleep(2000);
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
    selectfiles.click();
    icons.get(2).click();
    wait200.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(recent)));
    tap(105,1075);
    select.click();
    scroll(1050,2090,1050,550);
  tap(745,1882);
  
   Thread.sleep(10000); 
   TakesScreenshot ts1 = (TakesScreenshot) pbDriver; byte[]
	  screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	  Allure.addAttachment("Make sure that "+androidbenefitname+" is present in table at row-1, column-1",new ByteArrayInputStream(screenshot1)); 
	  Thread.sleep(2000);
	 
	
	tap(700,600);
	Thread.sleep(4000);
	TakesScreenshot ts2 = (TakesScreenshot) pbDriver; byte[]
			  screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
			  Allure.addAttachment("Screenshot after opening the newly created benefit",new ByteArrayInputStream(screenshot2)); 
			  Thread.sleep(2000);
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	  tap(900,400); tap(800,920);
}




}
