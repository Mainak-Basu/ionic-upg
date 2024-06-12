package plastic_Bank_Pages;

import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;

import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class PB_Member_Profile extends BaseClass{


    public PB_Member_Profile(AndroidDriver driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    String edited;
    String tokensinbegining;
    int tinb;

    @AndroidFindBy(xpath= "//android.view.View/android.widget.TextView/parent::android.view.View")
    public WebElement tokenValue;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cash out\")")
    public WebElement cashoutbtn;

    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement enterSMS;
    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement amount;
    @AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement email;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
    public WebElement permission;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\")")
    public WebElement storeicon;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\")")
    public WebElement processoricon;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    public WebElement ok;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
    public WebElement menu;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Home\")")
    public WebElement hometab;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Verified\")")
    public WebElement alreadyverified;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"back\")")
    public WebElement back;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Link Account\")")
    public WebElement linkacc;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
    public WebElement logout;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Loading\")")
    public WebElement loading;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your account is verified.\")")
    public WebElement verified;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your account is not verified. Click here to verify.\")")
    public WebElement unverified;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Change\")")
    public WebElement change;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"...\")")
    public WebElement changing;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"+628123450000\")")
    public WebElement gojek;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Verify Phone Number\")")
    public WebElement verifypn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Code sent!\")")
    public WebElement codesent;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Link account\")")
    public WebElement linkaccount;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"back\")")
    public WebElement arrowback;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Activity history\")")
    public WebElement activityhistory;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Profile\")")
    public WebElement profile;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cash outs\")")
    public WebElement cashouts;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public List<WebElement> textfields;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"edit\")")
    public WebElement edit;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"RECENT\")")
    public WebElement recent;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"unlink this account\")")
    public WebElement unlink;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement text;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Image\").instance(1)")
    public WebElement image;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"UNLINK\")")
    public WebElement unlinkcaps;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
    public WebElement save;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Link\")")
    public WebElement link;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"CLOSE\")")
    public WebElement close;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"profile tab\")")
    public WebElement profiletab;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your cash out is currently in progress\")")
    public WebElement cashoutinprogress;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"1000\")")
    public WebElement thousand;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"IDR\")")
    public WebElement idr;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"6.48\")")
    public WebElement sixpoint48;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cash out fee : 0 IDR\")")
    public WebElement cashoutfee;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cash out fee : 0 ₱\")")
    public WebElement cashoutfeegcash;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My Account\")")
    public WebElement myaccount;
    @AndroidFindBy(xpath = "//android.view.View[@text='0IDR'] | //android.view.View[@text='0₱']")
    public WebElement idr0;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Amount to cash out\")")
    public WebElement amounttoco;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"₱\")")
    public WebElement tokeninappgcash;
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'$')] | (//android.view.View[contains(@text,'₱')])[last()]")
    public WebElement firstidr;
    @AndroidFindBy(xpath = "//android.widget.Image[@text='logo-globe-632a2aa0']/following-sibling::android.widget.TextView")
    public WebElement tokensinapp;
    @AndroidFindBy(xpath = "(//android.view.View[contains(@text, 'IDR')])[2] | (//android.view.View[contains(@text, '₱')])[2]")
    public WebElement secondidr;
    @AndroidFindBy(xpath = "//android.view.View[@text='Exchange History']")
    public WebElement exchangehistory;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Successful\")")
    public WebElement latestapproval;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@text ='GCash Cash-Out']/parent::android.view.View/android.view.View)[2]/android.widget.TextView")
    public WebElement latestapprovalgcash;
    @AndroidFindBy(xpath = "//android.view.View[@text='Cashout Request Successful.'] | //android.view.View[@text='Transaction Successful!'] | //android.view.View[@text='Cashout Request has been submitted.']")
    public WebElement successful;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Transaction approved\")")
    public WebElement transacapproved;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pending\")")
    public WebElement waiting;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"YES\")")
    public WebElement yes;
    @AndroidFindBy(xpath = "(//android.widget.Button)[4]")
    public WebElement confirm;
    @AndroidFindBy(xpath = "(//android.widget.Image)[2]")
    public WebElement checkbox;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"₱\").instance(3)")
    public WebElement tokensinappbranch;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"0 (0)\")")
    public WebElement tokensinappbranchlater;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"1,000\")")
    public WebElement tokensinappstoreandprocessor;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"0 (0)\")")
    public WebElement tokensinappstoreandprocessorlater;
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,':')]")
    public WebElement time;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"₱\")")
    public WebElement tokensoncashoutpage;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\")\")")
    public WebElement tokensoncashoutpagegoj;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cash out\")")
    public WebElement cbbtnbranch;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You need a verified phone number to use GoJek\")")
    public WebElement needToVerifyForGojek;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"You need a verified phone number to use GCash\")")
    public WebElement needToVerifyForGcash;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\")")
    public WebElement branchicon;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm cash out\")")
    public WebElement confirmcashout;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your cash out is currently in progress\")")
    public WebElement yourcashoutinprogress;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\")")
    public List<WebElement> buttons;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\")")
    public List<WebElement> viewtags;
    
    
  public static  String tokensinend;
    //xpaths changeable at runtime:-
    public String accountnum = "//android.view.View[contains(@text,'param')]";
public String datexpath="//android.view.View[@text='month date, year']";
String editedday;



    public void tokenValueProfile() throws InterruptedException {
    	Thread.sleep(5000);
       String t=tokensinapp.getText();
       assertTrue(t.equals("1000"));
    }


public void changePasswordOnAppIfNecessary(String phone) throws InterruptedException {
	if(needforpasswordchange==true) {
		Thread.sleep(2000);
	ok.click();
	textfields.get(1).click();
	textfields.get(1).sendKeys("123456a");
	textfields.get(2).click();
	textfields.get(2).sendKeys("123456a");
	change.click();
	menu.click();
	String rtanum = accountnum.replace("param", phone);
	pbDriver.findElement(By.xpath(rtanum)).click();
	
	}
	else {
		//no need.
	}
	needforpasswordchange=false;
}
	


@SuppressWarnings("deprecation")
public void ensureMemberIsVerified() throws InterruptedException {
    Thread.sleep(5000);
	edit.click();
	try {
		Thread.sleep(5000);
		pbDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		verifypn.click();
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		codesent.isDisplayed();
		tap(156,1134);
		tap(147,1927);
		tap(147,1927);
		tap(413,1927);
		tap(413,1927);
		tap(675,1927);
		tap(675,1927);
		Thread.sleep(15000);
		back.click();
		
	}catch(Exception e) {
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		alreadyverified.isDisplayed();	
		back.click();
		
	}
	
}

@SuppressWarnings("deprecation")
public void performDigitalCashOut() throws IOException, InterruptedException {
	Thread.sleep(6000);
	menu.click();
	tap(400,490);
	Thread.sleep(15000);
	tokensinbegining=tokensinapp.getText();
	tinb=Integer.parseInt(tokensinbegining);
	System.out.println("tokens in begining "+tokensinbegining);
	cashoutbtn.click();
	
	pbDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	try {
		wait30.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowback)));
		unlink.isDisplayed();
	}catch(NoSuchElementException e) {
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		link.click();
		close.click();
		
		if(gojekyn==true) {
		email.click();
		email.sendKeys("a@b.com");
		}
		else {
			//no need.
		}
		
		confirm.click();
		ok.click();
		cashoutbtn.click();
		
	}
	pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	String tokensoncop=tokensoncashoutpagegoj.getText().replace(")", "");
	assertTrue(tokensinbegining.equals(tokensoncop));
	amount.click();
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	amounttoco.click();
	cashoutfee.isDisplayed();
	
	takescreenshotofandroid("Cash-Out fee is zero");
	confirm.click();
	/*
	 * thousand.isDisplayed(); sixpoint48.isDisplayed(); idr.isDisplayed();
	 */
	yourcashoutinprogress.isDisplayed();
	tap(550,2018);
	Thread.sleep(5000);
tokensinend=tokensinapp.getText();
	
	int tine=Integer.parseInt(tokensinend);
	assertTrue(tine<tinb);
	takescreenshotofandroid("tokens after cashout");
}


public void performDigitalCashOutBranch() throws IOException, InterruptedException {
	
	Thread.sleep(5000);
	tokensinbegining=tokensinapp.getText().replace("₱", "").replace(",", "");
	tinb=Integer.parseInt(tokensinbegining);
	System.out.println("tokens in begining "+tokensinbegining);
	cbbtnbranch.click();	
	Thread.sleep(6000);
//	buttons.get(2).click();
//	viewtags.get(11).click();
	
	String tokensoncop=tokensoncashoutpage.getText().replace("₱", "").replace(",","").replace("(","");
	System.out.println("toekn on cashout page"+tokensoncop);
	
	//assertTrue(tokensinbegining.equals(tokensoncop));
	tap(500,1980);
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	cashoutfeegcash.isDisplayed();
	confirmcashout.click();
	takescreenshotofandroid("Cash-Out fee is zero");
	yourcashoutinprogress.isDisplayed();
	tap(545,2012);
	
	Thread.sleep(5000);
	
	
	
	
	tokensinend=tokensinapp.getText().replace("₱", "").replace(",", "");
	System.out.println("tokens in end "+tokensinend);
	int tine=Integer.parseInt(tokensinend);
	assertTrue(tine<tinb);
	
	takescreenshotofandroid("Tokens in app after cashout");
}
public void performDigitalCashOutCollector() throws IOException, InterruptedException {
	
	Thread.sleep(10000);
	tokensinbegining=tokensinapp.getText().replace("₱", "").replace(",", "");
	tinb=Integer.parseInt(tokensinbegining);
	System.out.println("tokens in begining "+tokensinbegining);
	cbbtnbranch.click();	
	Thread.sleep(6000);
	
	String tokensoncop=tokensoncashoutpage.getText().replace("₱", "").replace(",","");
	System.out.println("toekn on cashout page"+tokensoncop);
	
	//assertTrue(tokensinbegining.equals(tokensoncop));
	tap(500,1980);
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	cashoutfeegcash.isDisplayed();
	takescreenshotofandroid("Cash-Out fee is zero");
	scroll(500,1700,500,1000);
	confirmcashout.click();
	yourcashoutinprogress.isDisplayed();
	tap(545,2012);
	
	Thread.sleep(5000);
	
	
	
	
	tokensinend=tokensinapp.getText().replace("₱", "").replace(",", "");
	System.out.println("tokens in end "+tokensinend);
	int tine=Integer.parseInt(tokensinend);
	assertTrue(tine<tinb);
	
	takescreenshotofandroid("Tokens in app after cashout");
	
	
}


public void checkexhistory() throws InterruptedException {
	activityhistory.click();
	cashouts.click();
	latestapproval.isDisplayed();
	
	Thread.sleep(2000);
	takescreenshotofandroid("latest transaction is approved");
}
public void checkexhistory4871() throws InterruptedException {
	activityhistory.click();
	cashouts.click();
	waiting.getText();
	
	takescreenshotofandroid("latest transaction is waiting for approval");
}
public void unlink() throws InterruptedException {
	profile.click();
	cashoutbtn.click();
	Thread.sleep(5000);
	unlink.click();
	takescreenshotofandroid("User can unlink");
	tap(500,2007);
	Thread.sleep(10000);
	takescreenshotofandroid("After unlink button pressesd");
	text.sendKeys("abc@mail.com");
	image.click();
	Thread.sleep(4000);
	linkaccount.click();
	codesent.isDisplayed();
	tap(156,1134);
	tap(147,1927);
	tap(147,1927);
	tap(413,1927);
	tap(413,1927);
	tap(675,1927);
	tap(675,1927);
	back.click();
	Thread.sleep(5000);
	menu.click();
	tap(300,1429);
	
	
	
}
public void unlinkgcash4871() throws InterruptedException {
	profile.click();
	cbbtnbranch.click();
	scroll(500,350, 500,1124);
	unlink.click();
	tap(500,2007);
	Thread.sleep(1000);
	takescreenshotofandroid("User is able to unlink GCash account");
	image.click();
Thread.sleep(2000);
	linkaccount.click();
	codesent.isDisplayed();
	tap(156,1134);
	tap(147,1927);
	tap(147,1927);
	tap(413,1927);
	tap(413,1927);
	tap(675,1927);
	tap(675,1927);
	back.click();
	Thread.sleep(5000);
	
	
	
	
}
public void link() {
	
	cashoutbtn.click();
	link.click();
	close.click();
	email.click();
	email.sendKeys("a@b.com");
	confirm.click();
	ok.click();
	
}
public void prove_Unverified_Cant_Use_Gojek() throws InterruptedException {
	needToVerifyForGojek.isDisplayed();
	takescreenshotofandroid("Unverified accounts can't perform Gojek Cashout.");
}

public void prove_Unverified_Cant_Use_GCash() throws InterruptedException {
	needToVerifyForGcash.isDisplayed();
	takescreenshotofandroid("Unverified accounts can't perform GCash Cashout.");
}


public void verifytokensarepresent() throws InterruptedException {
	tokensinapp.isDisplayed();
	assertTrue(tokensinapp.getText().equals("1000"));
	takescreenshotofandroid("tokens are present in app.");
}

public void verifytokensarenotpresent() throws InterruptedException {
	
	tokensinapp.isDisplayed();
	assertFalse(tokensinapp.getText().equals("1000"));
	takescreenshotofandroid("tokens are not present in app.");
	
}

public void verifytokensarepresentbranch() throws InterruptedException {
	tap(130,2070);

	tokensinapp.isDisplayed();
	assertTrue(tokensinapp.getText().equals("1000"));
	takescreenshotofandroid("tokens in app present before being reclaimed.");
}



@SuppressWarnings("deprecation")
public void verifytokensarepresentstore() throws InterruptedException {
	
	Thread.sleep(10000);
	tap(57,235);
	tap(400,665);
	tokensinappstoreandprocessor.isDisplayed();
	takescreenshotofandroid("tokens in app present before being reclaimed.");
}


public void verifytokensarepresentprocessor() throws InterruptedException {
	menu.click();
	tap(400,700);
	tap(150,2060);
	tokensinapp.isDisplayed();
	assertTrue(tokensinapp.getText().equals("1000"));
	takescreenshotofandroid("tokens in app present before being reclaimed.");
}


public void verifytokensarenotpresentbranch() throws InterruptedException {
	
	tap(130,2070);
	assertFalse(tokensinapp.getText().equals("1000"));
	takescreenshotofandroid("tokens in app not present after being reclaimed.");
}

@SuppressWarnings("deprecation")
public void verifytokensarenotpresentstore() throws InterruptedException {
	Thread.sleep(10000);
	tap(57,235);
	tap(400,665);
    
    
	try {
	pbDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	tokensinappstoreandprocessor.isDisplayed();
	}
	catch(Exception e) {
		System.out.println("Tokens are not present after getting reclaimed");
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		takescreenshotofandroid("tokens in app not present after being reclaimed.");
	}
	
}


public void verifytokensarenotpresentprocessor() throws InterruptedException {
	menu.click();
	tap(400,700);
	tap(150,2060);
	tokensinapp.isDisplayed();
	assertFalse(tokensinapp.getText().equals("1000"));
	takescreenshotofandroid("tokens in app not present after being reclaimed.");
	
}



}

