package plastic_Bank_Pages;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PB_Register_Processor extends BaseClass{
	
public PB_Register_Processor(AndroidDriver pbDriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(pbDriver), this);
	}

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
public WebElement loginButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
public WebElement logoutButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Settings\")")
public WebElement settingsButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
public WebElement menuButton;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement phoneNumberTextFeild;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(1)")
public WebElement passwordTextFeild;
@AndroidFindBy(id= "org.plasticbank.app:id/action_bar_root")
public WebElement loadedPage;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Finish\")")
public WebElement finishButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Create Business\")")
public WebElement createBusinessButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Recycling Business\")")
public WebElement recyclingBusinessPanel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collection Point\")")
public WebElement collectionPointPanel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CREATE BUSINESS\")")
public WebElement createBUSINESSbutton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"camera\")")
public WebElement cameraButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Take a picture\")")
public WebElement takeA_PictureOption;
@AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Shutter\"]")
public WebElement shutter;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"confirm\")")
public WebElement confirmButton;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(0)")
public WebElement crossButton;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement businessNameTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement addressTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(0)")
public WebElement mondayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(1)")
public WebElement tuesdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(2)")
public WebElement wednesdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(3)")
public WebElement thursdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(4)")
public WebElement fridayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(5)")
public WebElement saturdayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.CheckBox\").instance(6)")
public WebElement sundayCheckBox;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
public WebElement saveButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
public WebElement OKButton;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement cashValuePerKgTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement currentInventoryTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add\")")
public WebElement addButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DONE\")")
public WebElement doneButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Next\")")
public WebElement nextButton;
@AndroidFindBy(id = "tab-t1-2")
public WebElement membersTab;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(2)")
public WebElement addmember;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement branchMemberNameTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement branchMemberPhoneNumberTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Gender\")")
public WebElement genderButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Male\")")
public WebElement maleOption;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"REGISTER MEMBER\")")
public WebElement registerUser;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Recycling business\")")
public WebElement recyclingbusiness;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\")")
public List<WebElement> edittexts;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Link account\")")
public WebElement linkaccount;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Processor\")")
public WebElement processor;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add new material\")")
public WebElement addnewmaterial;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Do this later\")")
public WebElement dothislater;
//processor elements:-
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
public WebElement signUpButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Processor\")")
public WebElement processorPanel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CREATE BUSINESS\")")
public WebElement createBusiness;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.Image\").instance(0)")
public WebElement image;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Show year picker\")")
public WebElement yearpicker;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Hide year picker\")")
public WebElement hideyearpicker;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DONE\")")
public WebElement done;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.Image\").instance(2)")
public WebElement tickimage;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Register\")")
public WebElement register;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save material\")")
public WebElement savematerial;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Re-send\")")
public WebElement resend;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"kg\")")
public WebElement kg;
@AndroidFindBy(xpath= "//android.widget.EditText")
public WebElement searchcountries;



WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));

public void createprocessoraftermember() throws InterruptedException {
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menuButton)));
	    menuButton.click();
	    tap(373,848);
	    recyclingbusiness.click();
	    processor.click();
	    edittexts.get(1).sendKeys("Gayas"+RandomStringUtils.randomAlphabetic(5));
	    linkaccount.click();
	    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dothislater)));
	    tap(537,2005);
	    tap(975,1400);
	    edittexts.get(0).sendKeys("10");
	    tap(551,2000);
	    tap(550,2010);
	    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addnewmaterial)));
	   menuButton.click();
	   tap(330,1432);	    
}


public void createprocessordirectly() throws InterruptedException {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signUpButton)));
	Thread.sleep(2000);
	signUpButton.click();
	Thread.sleep(2000);
	recyclingbusiness.click();
	Thread.sleep(2000);
	processor.click();
	Thread.sleep(2000);
	image.click();
	Thread.sleep(2000);
	tap(550,1988);
	Thread.sleep(4000);
	tap(538,1977);
	photoDone.click();
	tap(550,2022);
	//
	tap(500,860);
	String textToCopy1 = "Mainak "+RandomStringUtils.randomAlphabetic(5);

    // Create a StringSelection object
    StringSelection stringSelection1 = new StringSelection(textToCopy1);

    // Get the system clipboard
    Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();

    // Set the contents of the clipboard to the StringSelection
    clipboard1.setContents(stringSelection1, null);

    System.out.println("String has been copied to clipboard: " + textToCopy1);
	
	tap(500,1510);
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	tap(200,1100);
	Thread.sleep(3000);
	searchcountries.sendKeys("+63");
	tap(270,553);
	tap(660,1100);
	String textToCopy = randomPhoneNumber;
	System.out.println(randomPhoneNumber);

    // Create a StringSelection object
    StringSelection stringSelection = new StringSelection(textToCopy);

    // Get the system clipboard
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    // Set the contents of the clipboard to the StringSelection
    clipboard.setContents(stringSelection, null);

    System.out.println("String has been copied to clipboard: " + textToCopy);
	
	tap(500,1510);
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	edittexts.get(3).click();
	
	scroll(718,1024,718,1800);
	scroll(718,1024,718,1800);
	
	done.click();
	tap(400,1540);
	tap(140,983);
	scroll(500,2100,500,1555);
	edittexts.get(4).sendKeys("123456a");
	edittexts.get(5).sendKeys("123456a");
	scroll(500,2100,500,555);
	edittexts.get(2).sendKeys("Gayas "+RandomStringUtils.randomAlphabetic(5));
	tickimage.click();
	tap(540,2020);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(resend)));
	tap(156,1080);
	tap(147,1927);
	tap(147,1927);
	tap(413,1927);
	tap(413,1927);
	tap(675,1927);
	tap(675,1927);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(savematerial)));
	 tap(975,1400);
	    tap(400,1661);
	    String textToCopy2 = "10";
		System.out.println("10");

	    // Create a StringSelection object
	    StringSelection stringSelection2 = new StringSelection(textToCopy2);

	    // Get the system clipboard
	    Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();

	    // Set the contents of the clipboard to the StringSelection
	    clipboard2.setContents(stringSelection2, null);

	    System.out.println("String has been copied to clipboard: " + textToCopy2);
		
		tap(500,1510);
		pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	    
	    
	    tap(551,2000);
	    savematerial.click();
	    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(kg)));
	   menuButton.click();
	   tap(330,1432);	    
}


}