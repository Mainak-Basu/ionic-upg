package plastic_Bank_Pages;

import static org.testng.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;

public class PB_LoginPage extends BaseClass{
public PB_LoginPage(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Account Suspended\")")
public WebElement susmem;
@AndroidFindBy(uiAutomator ="new UiSelector().text(\"Log in\").instance(1)")
public WebElement finalLogin;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
public WebElement loginButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
public WebElement logoutButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Settings\")")
public WebElement settingsButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
public WebElement menuButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"English\")")
public WebElement engopt;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Continue\")")
public WebElement continuebtn;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Edit\")")
public WebElement editButton;
@AndroidFindBy(xpath= "(//android.widget.EditText)[2]")
public WebElement phoneNumberTextFeild;
@AndroidFindBy(xpath= "//android.widget.EditText")
public WebElement searchcountries;
@AndroidFindBy(xpath= "(//android.widget.EditText)[3]")
public WebElement passwordTextFeild;
@AndroidFindBy(xpath= "//android.widget.EditText")
public WebElement countrycode;
@AndroidFindBy(id= "org.plasticbank.app:id/action_bar_root")
public WebElement loadedPage;

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Indonesia (+62)\")")
public WebElement indonesiaopt;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"+\").instance(2)")
public WebElement firstoption;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
public WebElement oKButton;

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"MEMBER\")")
public WebElement suspendedMember;

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
public WebElement menu;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
public WebElement logout;

@AndroidFindBy(uiAutomator = "UiSelector().className(\"android.view.View\").instance(20)")
public WebElement nameToBeVerified;

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"\")")
public WebElement branchIcon;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Navigate back\")")
public WebElement navigateBack;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Your account has been suspended\")")
public WebElement accountSuspended;


public void permission() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
	permission.click();
}

public void enterRandomPhoneNumber() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextFeild)));
	phoneNumberTextFeild.clear();
	phoneNumberTextFeild.sendKeys("+63"+randomPhoneNumber);
	}

public void enterPhoneNumber(String phoneNumber) {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextFeild)));
	phoneNumberTextFeild.clear();
	phoneNumberTextFeild.sendKeys(phoneNumber);
	}

public void enterPassword(String password) {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(passwordTextFeild)));
	passwordTextFeild.clear();
	passwordTextFeild.sendKeys(password);
	}
public void clickFinalLogin() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(finalLogin)));
	finalLogin.click();
	}

public void menu() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menuButton)));
	menuButton.click();
	}
public void settings() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menuButton)));
	settingsButton.click();
	}
public void clickloginButton() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loadedPage)));
	try {
		WebDriverWait wait4 = new WebDriverWait(pbDriver,Duration.ofSeconds(3));
		wait4.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loginButton)));
		loginButton.click();
		} 
	
	catch(Exception e)
	{
		WebDriverWait wait1 = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
		wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menuButton)));
		menuButton.click();
		WebDriverWait wait2 = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
		wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logoutButton)));
		logoutButton.click();
		WebDriverWait wait3 = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
		wait3.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(loginButton)));
		loginButton.click();
		
	}
	 
}

@SuppressWarnings("deprecation")
public void loginindonesia(String phoneNumber, String password, String code) {
	try{
		try {
			pbDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		permission.click();
		engopt.click();
		scroll(500,1050,500,800);
		tap(500,2060);
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			
		}
		clickloginButton();
	}catch(Exception e) {
		clickFinalLogin();
	}
	countrycode.click();
	searchcountries.sendKeys(code);
	indonesiaopt.click();
	enterPhoneNumber(phoneNumber);
	enterPassword(password);
	clickFinalLogin();
}
@SuppressWarnings("deprecation")
public void login(String phoneNumber, String password, String code) throws InterruptedException {
	try{
		try {
			pbDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		permission.click();
		engopt.click();
		scroll(500,1050,500,800);
		tap(500,2060);
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		clickloginButton();
	}catch(Exception e) {
		clickFinalLogin();
	}
	countrycode.click();
	Thread.sleep(5000);
	searchcountries.sendKeys(code);
	tap(270,553);
	enterPhoneNumber(phoneNumber);
	enterPassword(password);
	clickFinalLogin();
	/*
	 * try { pbDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * allow.click(); pbDriver.manage().timeouts().implicitlyWait(60,
	 * TimeUnit.SECONDS); }catch(Exception e) {
	 * pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); }
	 */
}

public void loginRandom(String password) {
	try{
		try {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
		permission.click();
		}
		catch(Exception e) {
			
		}
		clickloginButton();
	}catch(Exception e) {
		clickFinalLogin();
	}
	enterRandomPhoneNumber();
	enterPassword(password);
	clickFinalLogin();
}
public void oK() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(oKButton)));
	oKButton.click();
}

public void clickSuspendedMemebr() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(suspendedMember)));
	suspendedMember.click();
}

public void clickmenu() throws InterruptedException {
	tap(60,250);
}

public void clicklogout() throws InterruptedException {
	tap(300,1488);
}
public void logout() throws InterruptedException{
	clickmenu();
	clicklogout();
}


public void clicklogoutmem() throws InterruptedException {
	tap(300,1245);
}
public void logoutmem() throws InterruptedException{
	clickmenu();
	clicklogoutmem();
}
public void nameVerify() throws InterruptedException {
	Thread.sleep(7000);
	PointerInput fingerScroll = new PointerInput(PointerInput.Kind.TOUCH, "fingerScroll");
	Sequence scrollUP = new Sequence(fingerScroll, 1);
	scrollUP.addAction(fingerScroll.createPointerMove(Duration.ofMillis(0),
			PointerInput.Origin.viewport(), 414, 2047));
	scrollUP.addAction(fingerScroll.createPointerDown(0));
	scrollUP.addAction(fingerScroll.createPointerMove(Duration.ofMillis(100),
			PointerInput.Origin.viewport(), 414, 2047));
	scrollUP.addAction(fingerScroll.createPointerUp(0));
	pbDriver.perform(Arrays.asList(scrollUP));

//	PointerInput globetab = new PointerInput(PointerInput.Kind.TOUCH, "globetab");
//    Sequence scrollconfirmpassword = new Sequence(globetab, 1);
//    scrollconfirmpassword.addAction(globetab.createPointerMove(Duration.ofMillis(0),
//        PointerInput.Origin.viewport(), 400, 2050));
//    scrollconfirmpassword.addAction(globetab.createPointerDown(0));
//    scrollconfirmpassword.addAction(globetab.createPointerMove(Duration.ofMillis(1000),
//        PointerInput.Origin.viewport(), 400, 2050));
//    scrollconfirmpassword.addAction(globetab.createPointerUp(0));
//    pbDriver.perform(Arrays.asList(scrollconfirmpassword));
    WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(nameToBeVerified)));
	Thread.sleep(4000);
	String VerifyName=nameToBeVerified.getText();
	Thread.sleep(4000);
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
	assert VerifyName.contains("Ashish");
}
public void suspendAccountBranchVerify() throws InterruptedException {
	
	try {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(navigateBack)));
		//Assertion
		assertTrue(accountSuspended.isDisplayed());
	}
	catch(Exception e){
	
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
	menu.click();
	branchIcon.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(navigateBack)));
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
	//Assertion
	assertTrue(accountSuspended.isDisplayed());
	
	}	
	
}
}
