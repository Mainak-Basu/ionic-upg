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

public class PB_Register_Member extends BaseClass {
	

public PB_Register_Member(AndroidDriver pBriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(pbDriver), this);
		}
//elements:-
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement loginPagePhoneNumberTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement loginPagePasswordTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.CheckBox\").instance(0)")
public WebElement termsAndConditionsCheckBox;
@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Password\"));")
public WebElement passwordTextField;
@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Confirm Password\"));")
public WebElement confirmPasswordTextField;  //new UiScrollable(new UiSelector()).scrollIntoView(text("Continue"));
@AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Shutter\"]")
public WebElement shutter;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(2)")
public WebElement phoneNumberTextField;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
public WebElement signUpButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"English\")")
public WebElement englishopt;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Continue\")")
public WebElement continuebtn;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Show year picker\")")
public WebElement yearpicker;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Hide year picker\")")
public WebElement hideyearpicker;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Use Photo\")")
public WebElement usePhoto;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Skip for now\")")
public WebElement skipButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Gender\")")
public WebElement genderField;

@AndroidFindBy(id= "org.plasticbank.app:id/action_bar_root")
public WebElement loadedPage;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
public WebElement menu;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
public WebElement logout;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Male\")")
public WebElement male;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collector\")")
public WebElement collectorPannel;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(1)")
public WebElement becomeACollectorButton;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement firstNameTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.Image\").instance(0)")
public WebElement image;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(1)")
public WebElement lastNameTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(2)")
public WebElement phoneCountryCodedropdown;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(5)")
public WebElement search_countries;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\")")
public List<WebElement> edittexts;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.Image\")")
public List<WebElement> images;
//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Philippines (+63)\")")
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Philippines (+63)\")")
public WebElement selectPhilipines;
@AndroidFindBy(uiAutomator= "new UiScrollable(new UiSelector().className(\"android.view.View\").instance(52))")
public WebElement countrylist;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
public WebElement oKButton;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"DD/MM/YYYY\")")
public WebElement dateOfBirthTextField;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"Verify Phone\")")
public WebElement  verifyPhoneText;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CANCEL\")")
public WebElement cancel;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Qatar (+974)\")")
public WebElement selectdummycountry;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DONE\")")
public WebElement doneButton;
@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()")
public WebElement scrollablePhilipines;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Gender\")")
public WebElement genders;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"camera\")")
public WebElement takePhoto;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"checkmark\")")
public WebElement finalconfirmation;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(2)")
public WebElement camera;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Edit\")")
public WebElement editButton;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your account is not verified. Click here to verify.\")")
public WebElement verifyAccount;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(2)")
public WebElement enterSMS;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"arrow back\")")
public WebElement arrowBack;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Failed to register member. Sorry, you have already registered with this device ID. Please try again later.\")")
public WebElement registerfailed;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your password needs to be at least 6 characters long and contain at least one letter and one number. Please try again with a stronger password.\")")
public WebElement pwdcriteria;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
public WebElement searchcountries;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"+1\")")
public WebElement plusone;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Register\")")
public WebElement register;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"+\").instance(3)")
public WebElement firstoption;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"DONE\")")
public WebElement done;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Gender\")")
public WebElement gender;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Please enter OTP character\")")
public List<WebElement> verify;

@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.widget.EditText")
public WebElement verify1;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement verify2;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[3]/android.widget.EditText")
public WebElement verify3;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[4]/android.widget.EditText")
public WebElement verify4;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[5]/android.widget.EditText")
public WebElement verify5;
@AndroidFindBy(xpath ="//android.view.View/android.view.View[4]/android.view.View/android.view.View[6]/android.widget.EditText")
public WebElement verify6;


//functions:-

public void clickSignUpButton() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(50));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
	permission.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(englishopt)));
	englishopt.click();
	scroll(500,1050,500,800);
	tap(500,2060);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signUpButton)));
	signUpButton.click();
	
	
}
public void clickSignUpButtonnopermission() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(50));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signUpButton)));
	signUpButton.click();
	Thread.sleep(2000);
	
	
}

public void chooseCollectorPannel() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(collectorPannel)));
	Thread.sleep(2000);
	collectorPannel.click();
}

public void clickBecomeAColectorButton() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(becomeACollectorButton)));
	becomeACollectorButton.click();
}
public void uploadphoto() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePhoto)));
	takePhoto.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(camera)));
	Thread.sleep(2000);
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
  Sequence scrolla = new Sequence(finger1, 1);
  scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
      PointerInput.Origin.viewport(), camera.getLocation().getX() + 400, camera.getLocation().getY() + 50));
  scrolla.addAction(finger1.createPointerDown(0));
  scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
      PointerInput.Origin.viewport(), camera.getLocation().getX() + 400, camera.getLocation().getY() + 50));
  scrolla.addAction(finger1.createPointerUp(0));
  pbDriver.perform(Arrays.asList(scrolla));
  wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
	permission.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
  allow.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
	Thread.sleep(3000);
	shutter.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
	photoDone.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(usePhoto)));
	usePhoto.click();
	
}
public void uploadphotonopermission() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePhoto)));
	takePhoto.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(camera)));
	Thread.sleep(2000);
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
  Sequence scrolla = new Sequence(finger1, 1);
  scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
      PointerInput.Origin.viewport(), camera.getLocation().getX() + 400, camera.getLocation().getY() + 50));
  scrolla.addAction(finger1.createPointerDown(0));
  scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
      PointerInput.Origin.viewport(), camera.getLocation().getX() + 400, camera.getLocation().getY() + 50));
  scrolla.addAction(finger1.createPointerUp(0));
  pbDriver.perform(Arrays.asList(scrolla));
  	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
	shutter.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
	photoDone.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(usePhoto)));
	usePhoto.click();
	
}

public void enterFirstName(String name) {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(firstNameTextField)));
	firstNameTextField.sendKeys(name);
}
public void enterLastName(String lastname) {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(lastNameTextField)));
	lastNameTextField.sendKeys(lastname);
	System.out.println(lastname);
}
public void random_enterLastName() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(lastNameTextField)));
	lastNameTextField.sendKeys(randomLastName);
	System.out.println(randomLastName);
}

public void enterPhoneNumberRandom() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextField)));
	phoneNumberTextField.click();
	phoneNumberTextField.sendKeys(randomPhoneNumber);
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
}

public void enterPhoneNumberRandom2() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextField)));
	phoneNumberTextField.click();
	phoneNumberTextField.sendKeys(randomPhoneNumber+"12");
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
}
public void enterPhoneNumber(String phoneNumber) {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneNumberTextField)));
	phoneNumberTextField.click();
	phoneNumberTextField.sendKeys(phoneNumber);
  
}

public void chosenCountryCode() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(phoneCountryCodedropdown)));
	phoneCountryCodedropdown.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(search_countries)));
	search_countries.click();
	search_countries.sendKeys("+63");
	selectPhilipines.click();  
	oKButton.click();
}


public void enterDOB() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dateOfBirthTextField)));
	dateOfBirthTextField.click();
	
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(cancel)));
	PointerInput fingerYears = new PointerInput(PointerInput.Kind.TOUCH, "fingerYears");
    Sequence scrollYears = new Sequence(fingerYears, 1);
    scrollYears.addAction(fingerYears.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), cancel.getLocation().getX()+100, cancel.getLocation().getY() + 500));
    scrollYears.addAction(fingerYears.createPointerDown(0));
    scrollYears.addAction(fingerYears.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), cancel.getLocation().getX()+100, cancel.getLocation().getY() + 100));
    scrollYears.addAction(fingerYears.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollYears));
Thread.sleep(1000);
    doneButton.click();
	}

public void selectGender() throws InterruptedException {
	Thread.sleep(1000);
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
  Sequence scrolla = new Sequence(finger1, 1);
  scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
      PointerInput.Origin.viewport(), 1000, 1700));
  scrolla.addAction(finger1.createPointerDown(0));
  scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(1000),
      PointerInput.Origin.viewport(), 1000, 200));
  scrolla.addAction(finger1.createPointerUp(0));
  pbDriver.perform(Arrays.asList(scrolla));
  WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(genderField)));
	genderField.click();
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(genders)));
	male.click();
	oKButton.click();
}
public void enterpassword(String password) {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(passwordTextField)));
	passwordTextField.sendKeys(password);
	confirmPasswordTextField.sendKeys(password);
}
public void clicktermsandconditions() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(termsAndConditionsCheckBox)));
	termsAndConditionsCheckBox.click();
}
public void finalconfirm() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(finalconfirmation)));
	finalconfirmation.click();
	}

public void verifyAccount() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(editButton)));
	editButton.click();
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(verifyAccount)));
	verifyAccount.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(enterSMS)));
	enterSMS.sendKeys("778899");
	Thread.sleep(1000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(oKButton)));
    oKButton.click();
    Thread.sleep(2000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(oKButton)));
    oKButton.click();
	
}

public void clickmenu() throws InterruptedException {
		Thread.sleep(4000);
	tap(60,240);
}
public void clickbackarrow() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack)));
	arrowBack.click();
}
public void clicklogout() throws InterruptedException {
	tap(300,1300);
}
public void clicklogoutb() throws InterruptedException {
	tap(300,1480);
}
public void skipForNow() {
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(skipButton)));
   skipButton.click();
}
public void fillDetailsRandom(String name,String password) throws InterruptedException {
	uploadphoto();
	enterFirstName(name);
	random_enterLastName();
	chosenCountryCode();
	enterPhoneNumberRandom();
	enterDOB();
	selectGender();
	enterpassword(password);
	clicktermsandconditions();
	finalconfirm();
	skipForNow();
}
public void fillDetailsRandom2(String name,String password) throws InterruptedException {
	uploadphoto();
	enterFirstName(name);
	random_enterLastName();
	enterPhoneNumberRandom();
	enterDOB();
	selectGender();
	enterpassword(password);
	clicktermsandconditions();
	finalconfirm();
	skipForNow();
}
public void fillDetails(String name,String lastname,String password,String phoneNumber) throws InterruptedException {
	uploadphoto();
	enterFirstName(name);
	enterLastName(lastname);
	chosenCountryCode();
	enterPhoneNumber(phoneNumber);
	enterDOB();
	selectGender();
	enterpassword(password);
	clicktermsandconditions();
	finalconfirm();
	skipForNow();
}


public void signUpRandom(String name,String password) throws InterruptedException {
	clickSignUpButton();
	fillDetailsRandom(name, password);
	verifyAccount();
	
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void signUpCollector() throws InterruptedException {
	clickSignUpButton();
	chooseCollectorPannel();
	tap(685,685);
	Thread.sleep(2000);
	tap(550,1988);
	Thread.sleep(4000);
	tap(538,1977);
	photoDone.click();
	tap(550,2022);
	edittexts.get(1).sendKeys("Mainak "+RandomStringUtils.randomAlphabetic(5));
	tap(200,1280);
	Thread.sleep(2000);
	searchcountries.sendKeys("+63");
	tap(270,553);
	tap(660,1280);
	String textToCopy = randomPhoneNumber;

    // Create a StringSelection object
    StringSelection stringSelection = new StringSelection(textToCopy);

    // Get the system clipboard
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    // Set the contents of the clipboard to the StringSelection
    clipboard.setContents(stringSelection, null);

    System.out.println("String has been copied to clipboard: " + textToCopy);
	
	tap(500,1510);
	
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	edittexts.get(4).click();
	
	scroll(718,1024,718,1800);
	Thread.sleep(4000);
	done.click();
	tap(400,1740);
	tap(140,1201);
	scroll(500,2100,500,1555);
	edittexts.get(5).sendKeys("123456a");
	edittexts.get(6).sendKeys("123456a");
	Thread.sleep(1000);
	images.get(3).click();
	register.click();
	Thread.sleep(10000);
	tap(156,1080);
	tap(147,1927);
	tap(147,1927);
	tap(413,1927);
	tap(413,1927);
	tap(675,1927);
	tap(675,1927);
	
}

public void signUpRandom2(String name,String password) throws InterruptedException {
	clickSignUpButton();
	chooseCollectorPannel();
	clickBecomeAColectorButton();
	fillDetailsRandom2(name, password);
	
	
}
public void logout() throws InterruptedException{
	clickmenu();
	clicklogout();
}
public void logoutb() throws InterruptedException{
	clickmenu();
	clicklogoutb();
}
public void signUp(String name,String lastname,String password,String phoneNumber) throws InterruptedException {
	clickSignUpButtonnopermission();
	chooseCollectorPannel();
	clickBecomeAColectorButton();
	fillDetails(name,lastname,password,phoneNumber);
	verifyAccount();
	clickmenu();
	clicklogout();
}
}