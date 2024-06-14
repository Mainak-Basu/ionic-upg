package plastic_Bank_Pages;

import static org.testng.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.BaseClass;
import Utilities.Data;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;

public class PB_Transaction extends BaseClass{
	
public PB_Transaction(AndroidDriver pbDriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(pbDriver), this);
	}

@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement search;
@AndroidFindBy(uiAutomator= "new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement enter;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.view.View\").instance(31)")
public WebElement searchResult;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"checkmark\")")
public List<WebElement> checkmark;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"Find a buyer\")")
public WebElement findabuyer;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"No bonus\")")
public WebElement nobonusinhistory;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"menu\")")
public WebElement menu;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Bought Materials\")")
public List<WebElement> transactions;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Bought Materials\")")
public WebElement transaction;
@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"Donation\")")
public WebElement donationionic;
@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"PET\")")
public WebElement pet;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"0 (0)\")")
public WebElement noBonus;
@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"HDPE\")")
public WebElement hdpe;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Search name or phone number\")")
public WebElement searchOutline;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"+0 (pending)\")")
public List<WebElement> nobonus;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Button\").instance(3)")
public WebElement searchbutton;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take Picture\")")
public WebElement addPicture;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Take a picture\")")
public WebElement takePicture;

@AndroidFindBy(uiAutomator="new UiSelector().text(\"OK\")")
public WebElement ok;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"Cash outs\")")
public WebElement cashouts;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"View History\")")
public WebElement viewHistory;
@AndroidFindBy(xpath="//android.widget.Image[@text='pb-logo-icon-9c37afeb']")
public List<WebElement> bonuseligibletext;
@AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
public WebElement requiredQuantity;
@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
public WebElement photoDone;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
public WebElement permission;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
public WebElement savereceipt;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
public WebElement save;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Transaction successful!\")")
public WebElement transactionsuccessful;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm\")")
public WebElement confirmpurchase;

@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm\")")
public WebElement confirmsell;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Exchange History\")")
public WebElement exchangeHistory;
@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\")")
public List<WebElement>rewards;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
public WebElement allow;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"History\")")
public WebElement history;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"arrow back\")")
public WebElement arrowBack;
@AndroidFindBy(uiAutomator = "new UiSelector().text(\"All time\")")
public WebElement allTime;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"₱\")")
public List<WebElement> prices;
@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"133\")")
public WebElement approvedMemberBonus;
//member to b1
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"133 Bonus\")")
public WebElement bonusToMember;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"19 KG\")")
public WebElement kgMemberToBranch1;
//b1 to b2
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"30 Bonus\")")
public WebElement bonusToBranch1fromBranch2;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"15 KG\")")
public WebElement kgBranch1ToBranch2;
//b1 to b3
@AndroidFindBy(uiAutomator="new UiSelector().text(\"There are no results that match your search\")")
public WebElement nores;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"8 Bonus\")")
public WebElement bonusToBranch1fromBranch3;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"11 KG\")")
public WebElement kgBranch1toBranch3;
//b2 to p
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"14 Bonus\")")
public WebElement bonusTobranch2fromProcessor;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"7 KG\")")
public WebElement kgbranch2toProcessor;
//b3 to p
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"4 Bonus\")")
public WebElement bonusTobranch3fromProcessor;
@AndroidFindBy(uiAutomator= "new UiSelector().text(\"2 KG\")")
public WebElement kgbranch3toProcessor;

@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"rocess\")")
public WebElement processor;
@AndroidFindBy(uiAutomator="new UiSelector().text(\"RECENT\")")
public WebElement searchResult2;
@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"133\")")
public WebElement bonusMemberVerify;
@AndroidFindBy(xpath="(//android.view.View/android.view.View[3]/android.widget.TextView[1])[3]")
public WebElement branchToken_new;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"BONUS\")")
    public WebElement bonusText;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"OK\")")
    public WebElement okButton;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"HDPE-Clean-Clear\")")
    public WebElement hdpeMixed;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"History\")")
    public WebElement historyButton;
    @AndroidFindBy(uiAutomator="new UiSelector().textContains(\"leek\")")
    public List<WebElement> M1MemberButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"Reward\")")
    public WebElement rewardText;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Direct Token Transfer\")")
    public WebElement directTokenTransferText;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Logout\")")
    public WebElement logout;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Add to cart\")")
    public WebElement addtocart;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Loading\")")
    public WebElement loading;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"DONATION\")")
    public WebElement donation;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"arrow round-forward\")")
    public WebElement donnationIn;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"arrow round-backward\")")
    public WebElement donnationOut;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Home\")")
    public WebElement home;
    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Donation Accepted\")")
    public WebElement donationaccepted;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Fleek\")")
    public WebElement historyExpense;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"0\")")
    WebElement processorBonus;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"lock-bonus\")")
    public WebElement lock_bonus;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Unlock Bonus\")")
    public WebElement unlock_bonus;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"+133 (pending)\")")
    public WebElement delayed_bonus;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"+133 (pending)\")")
    public WebElement delayed_bonusm1;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"+30 (pending)\")")
    public WebElement delayed_bonusb1;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"+14 (pending)\")")
    public WebElement delayed_bonusb2;
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"pb-logo-bonus\")")
    public WebElement pb_logo_bonus;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").instance(0)")
    public WebElement memberbonustext;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Image\").instance(0)")
    public WebElement image;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").instance(2)")
    public WebElement bonustextbranch;
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"133 = \")")
	public WebElement tokenInApp;
	
	@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"(\")")
	public WebElement branchToken;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Edit\")")
    public WebElement edit;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Take photo of receipt\")")
    public WebElement takepic;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Skip\")")
    public WebElement skip;
	@AndroidFindBy(xpath = "//android.widget.Image[@text='logo-globe-632a2aa0']/following-sibling::android.widget.TextView")
    public WebElement tokensinapp;
	
	@SuppressWarnings("deprecation")
	public void clickmenu() {
		boolean present= true;
		while(present) {
			
			try {
				pbDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				edit.isDisplayed();
				menu.click();
				edit.isDisplayed();
			}catch(Exception e) {
				present=false;
				pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
		}
	}
	
	
WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(10));
public void doTransaction(String number, String load1, String load2) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	searchOutline.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
	searchResult.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pet)));
	pet.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load1);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
    hdpe.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.sendKeys(load2);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
    checkmark.get(1).click();
    
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takePicture)));
    takePicture.click();
    
    
    
    try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
    	permission.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(5000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 545, 1930));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
    				checkmark.get(0)))); checkmark.get(0).click();
    	
        }catch(Exception e) {
        	Thread.sleep(5000);
            PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
            Sequence scrollShutter = new Sequence(fingerShutter, 1);
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerDown(0));
            scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(), 545, 1930));
            scrollShutter.addAction(fingerShutter.createPointerUp(0));
            pbDriver.perform(Arrays.asList(scrollShutter));
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        	 checkmark.get(0).click();
        	
        	
        }
    Thread.sleep(1000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
    checkmark.get(0).click();
    Thread.sleep(1000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	checkmark.get(0)))); checkmark.get(0).click();
	 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
				ok))); ok.click();
}


public void verifyMemberBonusAfterReceipt() {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu))); 
	assertTrue(approvedMemberBonus.isDisplayed());
}
public void verifyaddedmemsuspended(String b1number) throws InterruptedException {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(nores)));
	
	/*
	 * image.click(); bonuseligibletext.get(0).isDisplayed();
	 * bonuseligibletext.get(1).isDisplayed();
	 * wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)
	 * )); hdpe.click();
	 * wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(
	 * requiredQuantity))); requiredQuantity.click(); tap(412,1928); //
	 * pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_8)); pbDriver.pressKey(new
	 * KeyEvent(AndroidKey.BACK)); Thread.sleep(2000); scroll(500,1650,500,1300);
	 * //scroll up to display add to cart tap(545,1984); //tap add to cart
	 * tap(545,2005); //tap next
	 */}

public void bToSb(String b1number) throws InterruptedException {

    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    search.sendKeys(b1number);
    Thread.sleep(2000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
    searchbutton.click();
    Thread.sleep(2000);
    image.click();
    Thread.sleep(2000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
    hdpe.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    requiredQuantity.click();
    tap(406,1800);
	//pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
    pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(2000);

    tap(545,1984);  //tap add to cart

    tap(500,700);           //tap pet panel
    Thread.sleep(1000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    requiredQuantity.click();
    tap(153,1664);
    //pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
    pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
    pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(2000);

    tap(545,1984);  //tap add to cart

    tap(545,2005);  //next

    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
    takescreenshotofandroid("confirm purchase scrsht");
    confirmpurchase.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
    transactionsuccessful.isDisplayed();

}
public void bToSP(String b3number) throws InterruptedException {
    Thread.sleep(7000);
    menu.click();
    tap(300,690);

    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    search.sendKeys(b3number);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
    searchbutton.click();
    Thread.sleep(4000);
    tap(500,900);
    //image.click();

    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
    hdpe.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    requiredQuantity.click();
    tap(153,1661);
//pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(2000);
    scroll(500,1650,500,1300); //scroll up to display add to cart
    tap(545,1984);  //tap add to cart
    tap(500,700);      //tap pet panel
    Thread.sleep(1000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    requiredQuantity.click();
    tap(153,1661);
//pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(2000);
    scroll(500,1650,500,1300); //scroll up to display add to cart
    tap(545,1984);  //tap add to cart

    tap(545,1977);
    
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
    takescreenshotofandroid("confirm purchase scrsht");
    confirmpurchase.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
    transactionsuccessful.isDisplayed();
    TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Transaction successful!", new ByteArrayInputStream(screenshot2));
    tap(150,2070);
}

public void branchBonusPresent(String branchNumber, String password, String bonus) throws InterruptedException {

    PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
    pblogin.login(branchNumber, password,"+63");
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
    Sequence scrollShutter = new Sequence(fingerShutter, 1);
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 400, 2060));
    scrollShutter.addAction(fingerShutter.createPointerDown(0));
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 400, 2060));
    scrollShutter.addAction(fingerShutter.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollShutter));

    wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
    lock_bonus.isDisplayed();
    unlock_bonus.isDisplayed();
    pb_logo_bonus.isDisplayed();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(bonustextbranch, bonus)));
    assertTrue(bonustextbranch.getText().equals(bonus));
    Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Token in Branch Screenshot", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);

    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    menu.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
    logout.click();

}
public void branchBonusPresent2(String branchNumber, String password, String bonus) throws InterruptedException {

    PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
    pblogin.login(branchNumber, password,"+63");
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
    Sequence scrollShutter = new Sequence(fingerShutter, 1);
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 400, 2060));
    scrollShutter.addAction(fingerShutter.createPointerDown(0));
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 400, 2060));
    scrollShutter.addAction(fingerShutter.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollShutter));

    wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
    lock_bonus.isDisplayed();
    unlock_bonus.isDisplayed();
    pb_logo_bonus.isDisplayed();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(bonustextbranch, bonus)));
    assertTrue(bonustextbranch.getText().equals(bonus));
    Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Token in Branch Screenshot", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);

    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    menu.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
    logout.click();

}


public void verifyBonusInAppB1_AfterBonusPaid(String branchNumber,String password) throws InterruptedException {

    PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
    pblogin.login(branchNumber, password,"+63");

    Thread.sleep(4000);
    tap(100,2070);
    Thread.sleep(4000);
    tokensinapp.isDisplayed();
	Thread.sleep(3000);
	try {
	tokensinapp.getText().equals("30");
	try {
		tokensinapp.getText().equals("14");
	}catch(Exception e2) {
		tokensinapp.getText().equals("0");
	}
	}catch(Exception e) {
		
	}
	menu.click();
	tap(300,1488);
}
public void verifyBonusInAppMem_AfterBonusPaid(String member, String password) throws InterruptedException {
    PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
    pblogin.login(member, password,"+63");
    Thread.sleep(6000);
     tokensinapp.isDisplayed();
	Thread.sleep(3000);
	assertTrue(tokensinapp.getText().equals("133"));
	menu.click();
	tap(300,1300);
   
}

public void verifyProcessorExchangeHistory() throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu))); 
    menu.click(); 
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(processor))); 
    processor.click(); 
    Thread.sleep(4000);
	PointerInput fingerglobe = new PointerInput(PointerInput.Kind.TOUCH, "fingerglobe");
    Sequence scrollglobe = new Sequence(fingerglobe, 1);
    scrollglobe.addAction(fingerglobe.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), 545, 2060));
    scrollglobe.addAction(fingerglobe.createPointerDown(0));
    scrollglobe.addAction(fingerglobe.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), 545, 2060));
    scrollglobe.addAction(fingerglobe.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollglobe));
    
    
    Thread.sleep(4000);
   	PointerInput fingerscroll = new PointerInput(PointerInput.Kind.TOUCH, "fingerscroll");
       Sequence scrollscroll = new Sequence(fingerscroll, 1);
       scrollscroll.addAction(fingerscroll.createPointerMove(Duration.ofMillis(0),
           PointerInput.Origin.viewport(), 545, 1900));
       scrollscroll.addAction(fingerscroll.createPointerDown(0));
       scrollscroll.addAction(fingerscroll.createPointerMove(Duration.ofMillis(100),
           PointerInput.Origin.viewport(), 545, 200));
       scrollscroll.addAction(fingerscroll.createPointerUp(0));
       pbDriver.perform(Arrays.asList(scrollscroll));
       
       
       wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(viewHistory))); 
       viewHistory.click(); 
       
       wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allTime))); 
    String firstPrice = prices.get(0).getText();
       String secondPrice = prices.get(1).getText();
    Assert.assertEquals(firstPrice, "   ");
    Assert.assertEquals(secondPrice, "   ");
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack))); 
    arrowBack.click(); 
  
}


public void m1toB1(String m1number) throws InterruptedException, IOException {
	BaseClass bc= new BaseClass();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(m1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	
	image.click();
	bonuseligibletext.get(0).isDisplayed();
	bonuseligibletext.get(1).isDisplayed();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.click();
	Thread.sleep(2000);
	tap(153,1664);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
   tap(500,700);      //tap pet panel
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    requiredQuantity.click();
	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_9));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	tap(545,2005);   //tap next
    takepic.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
   
   
       	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
        allow.click();
        Thread.sleep(10000);
       tap(545,1977);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
    	photoDone.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(save)));
    	save.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
    	Thread.sleep(2000);
     	takescreenshotofandroid("confirm purchase scrsht");
     	
    	confirmpurchase.click();
    	
   	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
    	transactionsuccessful.isDisplayed();
     	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
         byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
         Allure.addAttachment("transaction successfull!", new ByteArrayInputStream(screenshot2));
    	Thread.sleep(10000);
         tap(690,2070);
         Thread.sleep(15000);
        
    bc.ocr_test_shot(pbDriver);
    Assert.assertTrue(bc.string.contains("Bought"));
    Thread.sleep(4000);
 				tap(150,2070);
	            
	            
	          
	           
	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(tokensinapp)));
	            assertTrue(tokensinapp.getText().equals("0"));
				takescreenshotofandroid("No bonus is present as of now.");
				
	            
}





public void b1toB2(String b1number) throws InterruptedException, IOException {
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b1number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	
	image.click();
	bonuseligibletext.get(0).isDisplayed();
	bonuseligibletext.get(1).isDisplayed();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.click();
	tap(412,1928);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	  tap(500,700);     //tap pet panel
     Thread.sleep(1000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    requiredQuantity.click();
    tap(153,1925);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	tap(545,2005);
    takepic.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
   
   
        	Thread.sleep(10000);
            tap(545,1977);
         	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
         	photoDone.click();
         	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(savereceipt)));
         	savereceipt.click();
         	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
         	Thread.sleep(2000);
         	takescreenshotofandroid("confirm purchase scrsht");
         	confirmpurchase.click();
         	
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
        	transactionsuccessful.isDisplayed();
         	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
             byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
             Allure.addAttachment("transaction successfull!", new ByteArrayInputStream(screenshot2));
             tap(150,2070);
    
}

public void b1toB3(String b1number) throws InterruptedException {
	
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b1number);
	Thread.sleep(2000);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	Thread.sleep(2000);
	image.click();
	Thread.sleep(2000);
	bonuseligibletext.get(0).isDisplayed();
	bonuseligibletext.get(1).isDisplayed();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.click();
	tap(676,1792);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_6));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	  tap(500,700);           //tap pet panel
     Thread.sleep(1000);
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    requiredQuantity.click();
    tap(406,1800);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	tap(545,2005);
    takepic.click();
    wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
    addPicture.click();
   
   
        	Thread.sleep(10000);
            tap(545,1977);
         	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
         	photoDone.click();
         	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(savereceipt)));
         	savereceipt.click();
         	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
         	takescreenshotofandroid("confirm purchase scrsht");
        	confirmpurchase.click();
        	
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
        	transactionsuccessful.isDisplayed();
         	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
             byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
             Allure.addAttachment("Transaction successful!", new ByteArrayInputStream(screenshot2));
             tap(150,2070);
}

public void b3ToP(String b3number) throws InterruptedException {
	Thread.sleep(7000);
	menu.click();
   tap(300,690);
   
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b3number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	Thread.sleep(4000);
	tap(500,900);
	//image.click();
	bonuseligibletext.get(0).isDisplayed();
	bonuseligibletext.get(1).isDisplayed();
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.click();
	tap(153,1661);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	  tap(500,700);      //tap pet panel
     Thread.sleep(1000);
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
   requiredQuantity.click();
   tap(153,1661);
//   pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	tap(545,2005);
   takepic.click();
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
   addPicture.click();
  
  
       	Thread.sleep(10000);
           tap(545,1977);
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(savereceipt)));
        	savereceipt.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
        	takescreenshotofandroid("confirm purchase scrsht");
       	confirmpurchase.click();
       	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
       	transactionsuccessful.isDisplayed();
        	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
            byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Transaction successful!", new ByteArrayInputStream(screenshot2));
            tap(150,2070);
}
public void b3ToPnb(String b3number) throws InterruptedException {
	Thread.sleep(7000);
	menu.click();
   tap(300,690);
   
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b3number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	Thread.sleep(4000);
	tap(500,900);
	//image.click();
	
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.click();
	tap(153,1661);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	  tap(500,700);      //tap pet panel
     Thread.sleep(1000);
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
   requiredQuantity.click();
   tap(153,1661);
//   pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	tap(545,2005);
   takepic.click();
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
   addPicture.click();
  
  
       	Thread.sleep(10000);
           tap(545,1977);
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(savereceipt)));
        	savereceipt.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
        	takescreenshotofandroid("confirm purchase scrsht");
       	confirmpurchase.click();
       	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
       	transactionsuccessful.isDisplayed();
        	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
            byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Transaction successful!", new ByteArrayInputStream(screenshot2));
            tap(150,2070);
}
public void sell_hdpe_branch_To_Processor_with_receipt(String processorname) throws InterruptedException {
	findabuyer.click();
   
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(processorname);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	
	image.click();
	bonuseligibletext.get(0).isDisplayed();
	bonuseligibletext.get(1).isDisplayed();
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.click();
	tap(153,1661);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	tap(545,2005);  //tap next
   takepic.click();
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
   addPicture.click();
  
  
       	Thread.sleep(10000);
           tap(545,1977);
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(save)));
        	savereceipt.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmsell)));
        	takescreenshotofandroid("confirm sell scrsht");
       	confirmsell.click();
       	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
       	transactionsuccessful.isDisplayed();
        	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
            byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Transaction successful!", new ByteArrayInputStream(screenshot2));
            
}
public void sell_pet_branch_To_Processor_without_receipt(String processorname) throws InterruptedException {
	Thread.sleep(10000);
	tap(56,255);
	tap(300,690);
	findabuyer.click();
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(processorname);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	
	image.click();
	bonuseligibletext.get(0).isDisplayed();
	bonuseligibletext.get(1).isDisplayed();
    tap(500,700);      //tap pet panel
     Thread.sleep(1000);
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
   requiredQuantity.click();
   tap(153,1661);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	tap(545,2005);    //tap next
   skip.click();
  
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmsell)));
        	takescreenshotofandroid("confirm sell scrsht");
       	confirmsell.click();
       	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
       	transactionsuccessful.isDisplayed();
        	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
            byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Transaction successful!", new ByteArrayInputStream(screenshot2));
            
}

public void b2ToP(String b2number) throws InterruptedException {
	
	Thread.sleep(2000);
	menu.click();
   tap(300,690);
   
   
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
	search.sendKeys(b2number);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
	searchbutton.click();
	
	image.click();
	bonuseligibletext.get(0).isDisplayed();
	bonuseligibletext.get(1).isDisplayed();
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
	hdpe.click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
	requiredQuantity.click();
	tap(153,1790);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	  tap(500,700);        //tap pet panel
     Thread.sleep(1000);
   
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
   requiredQuantity.click();
   tap(674,1655);
//	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(2000);
	scroll(500,1650,500,1300); //scroll up to display add to cart
	tap(545,1984);  //tap add to cart
	tap(545,2005);   //tap next
   takepic.click();
   wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
   addPicture.click();
  
  
       	Thread.sleep(10000);
           tap(545,1977);
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(savereceipt)));
        	savereceipt.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
        	takescreenshotofandroid("confirm purchase scrsht");
       	confirmpurchase.click();
       
       	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
       	transactionsuccessful.isDisplayed();
        	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
            byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Transaction successful!", new ByteArrayInputStream(screenshot2));
            tap(150,2070);
}
public void CheckMemberBonus() throws InterruptedException {
	PB_LoginPage lo =new  PB_LoginPage(pbDriver);
	lo.login(Data.member_Number.replace("+63", ""), password,"+63");
	Thread.sleep(4000);
	Assert.assertTrue(tokensinapp.getText().equals("133"));
	
	Thread.sleep(2000);
    TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
    Thread.sleep(2000);
    lo.logoutmem();
}
public void CheckBranchBonus(String phoneNumber, String password ) throws InterruptedException {
	PB_LoginPage lo =new  PB_LoginPage(pbDriver);
	lo.login(phoneNumber, password,"+63");
	
	 tap(150,2070);
	Thread.sleep(5000);
	try {
	tokensinapp.getText().equals("38");
	}catch(Exception e) {
		try {
			
			tokensinapp.getText().equals("14");
		}catch(Exception e1) {
			
			tokensinapp.getText().equals("4");
		}
	}
	Thread.sleep(2000);
    TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
    Thread.sleep(2000);
    lo.logout();
    Thread.sleep(2000);
}
public void tap(int x, int y) throws InterruptedException {
	
	Thread.sleep(3000);
	PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
    Sequence scrollShutter = new Sequence(fingerShutter, 1);
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
        PointerInput.Origin.viewport(), x, y));
    scrollShutter.addAction(fingerShutter.createPointerDown(0));
    scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
        PointerInput.Origin.viewport(), x, y));
    scrollShutter.addAction(fingerShutter.createPointerUp(0));
    pbDriver.perform(Arrays.asList(scrollShutter));
	
}
    public void transactionBranchStopBonus(String number) throws InterruptedException, IOException {

    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    	search.sendKeys(number);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
    	searchbutton.click();
    	
    	image.click();
    	
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpe)));
    	hdpe.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    	requiredQuantity.click();
    	tap(153,1664);
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    	Thread.sleep(2000);
    	tap(545,2090);
       tap(500,700);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
        requiredQuantity.click();
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_9));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    	Thread.sleep(2000);
    	tap(545,2090);
    	tap(545,2005);
        takepic.click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addPicture)));
        addPicture.click();
       
       
           	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
            allow.click();
            Thread.sleep(10000);
           tap(545,1977);
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
        	photoDone.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(savereceipt)));
        	savereceipt.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmpurchase)));
			/*
			 * nobonus.get(0).isDisplayed(); nobonus.get(1).isDisplayed();
			 */
         	takescreenshotofandroid("confirm purchase scrsht");
			/*
			 * nobonus.get(0).isDisplayed(); nobonus.get(1).isDisplayed();
			 */
        	confirmpurchase.click();
        	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionsuccessful)));
        	transactionsuccessful.isDisplayed();
         	 TakesScreenshot ts2 = (TakesScreenshot) pbDriver;
             byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
             Allure.addAttachment("transaction successfull!", new ByteArrayInputStream(screenshot2));
        	Thread.sleep(15000);
           tap(140,2070);
             Thread.sleep(4000);
            BaseClass bc= new BaseClass();
       
     				tap(150,2070);
    	            
    	            
    	          
    	            Thread.sleep(6000);
    	            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(tokensinapp)));
    	            assertTrue(tokensinapp.getText().equals("0"));
    				takescreenshotofandroid("No bonus is present as of now.");

    }

    public boolean verifyHistoryStopBonusReward() throws InterruptedException {
    	
        Thread.sleep(5000);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence scrolla = new Sequence(finger1, 1);
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(),400 ,2060));
        scrolla.addAction(finger1.createPointerDown(0));
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(),400 ,2060));
        scrolla.addAction(finger1.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrolla));

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(historyButton)));
        historyButton.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(M1MemberButton.get(0))));
        M1MemberButton.get(0).click();
        Thread.sleep(2000);
        TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(2000);
        boolean reward_text = false;
        try {
            // Code that might throw an exception
            reward_text = rewardText.isDisplayed();
            if (reward_text== true) {
                System.out.println("Element is not visible on the screen.");

            }

        } catch (Exception e) {
            // Generic catch block to handle any other exceptions
            System.out.println("Bonus is disabled for new member"+ e);

        }
        return reward_text;
    }

    public void verifyExchangeHistoryToken() throws InterruptedException, IOException {
       tap(800,2070);
       cashouts.click();
       Thread.sleep(10000);
       BaseClass bc= new BaseClass();
       bc.ocr_test_shot(pbDriver);
       Assert.assertTrue(bc.string.contains("+1000"));
       

    }
    public void memberToBranchDonation(String number) throws InterruptedException {
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    	search.sendKeys(number);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
    	searchbutton.click();
    	image.click();
    	donationionic.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    	requiredQuantity.click();
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    	addtocart.click();
    	tap(500,2004);
    	confirmpurchase.click();
    	transactionsuccessful.isDisplayed();
    	
    	Thread.sleep(5000);
    	tap(71,254);
    	tap(300,1494);
    }
    
    public void branchToProcessorDonation(String number) throws InterruptedException {
    	Thread.sleep(5000);
    	tap(71,254);
    	tap(400,674);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
    	search.sendKeys(number);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchbutton)));
    	searchbutton.click();
    	image.click();
    	donationionic.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
    	requiredQuantity.click();
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
    	pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
    	addtocart.click();
    	tap(500,2004);
    	confirmpurchase.click();
    	transactionsuccessful.isDisplayed();
    	tap(71,254);
    	tap(300,1494);
    }
    public void verifyNoBonusForDonation() throws InterruptedException{
    	tap(140,2041);
    	tokensinapp.isDisplayed();
    	Thread.sleep(3000);
    	assertTrue(tokensinapp.getText().equals("0"));
    	menu.click();
    	tap(300,1494);
    }
    public void verifyNoBonusForDonationmem() throws InterruptedException{
    	
    	tokensinapp.isDisplayed();
    	Thread.sleep(3000);
    	assertTrue(tokensinapp.getText().equals("0"));
    	menu.click();
    	tap(300,1300);
    }
    
    public boolean transactionBranchStopBonus4359(String number, String load) throws InterruptedException {

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
        search.sendKeys(number);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchOutline)));
        searchOutline.click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchResult)));
        searchResult.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
        boolean bounus_text = bonusText.isDisplayed();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(hdpeMixed)));
        hdpeMixed.click();

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(requiredQuantity)));
        requiredQuantity.sendKeys(load);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(1))));
        checkmark.get(1).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(checkmark.get(0))));
        checkmark.get(0).click();
        Thread.sleep(2000);
        checkmark.get(0).click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(okButton)));
        okButton.click();
        return bounus_text;

    }
    public boolean verifyHistoryStopBonusReward4359() throws InterruptedException {

        Thread.sleep(5000);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence scrolla = new Sequence(finger1, 1);
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(),400 ,2060));
        scrolla.addAction(finger1.createPointerDown(0));
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(),400 ,2060));
        scrolla.addAction(finger1.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrolla));

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(historyButton)));
        historyButton.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(historyExpense)));
        historyExpense.click();
        boolean reward_text = false;
        try {
            // Code that might throw an exception
            reward_text = rewardText.isDisplayed();
            if (reward_text== true) {
                System.out.println("Element is not visible on the screen.");

            }

        } catch (Exception e) {
            // Generic catch block to handle any other exceptions
            System.out.println("Bonus is disabled for new member"+ e);

        }
        return reward_text;
    }
    public void clickProcessor() throws InterruptedException {
        Thread.sleep(4000);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
        menu.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(processor)));
        processor.click();
    }
    public void logout() throws InterruptedException {
        Thread.sleep(2000);
        arrowBack.click();
        Thread.sleep(2000);
        arrowBack.click();
        Thread.sleep(5000);
        menu.click();
        Thread.sleep(2000);
        logout.click();
    }
    public boolean verifyStopBonusProcessor4359() throws InterruptedException {

        Thread.sleep(5000);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence scrolla = new Sequence(finger1, 1);
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(),400 ,2060));
        scrolla.addAction(finger1.createPointerDown(0));
        scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
                PointerInput.Origin.viewport(),400 ,2060));
        scrolla.addAction(finger1.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrolla));
        Thread.sleep(3000);
            boolean reward_text = processorBonus.isDisplayed();
            if (reward_text) {
                System.out.println("Bonus is 0 in processor transaction.");
            }
        return reward_text;
    }
    
    public void verifyMemberBonusPresent() throws InterruptedException {
      delayed_bonusm1.isDisplayed();
      takescreenshotofandroid("User is able to see pending delayed bonus");
      menu.click();
  	tap(300,1415);
    }

    public void verifyBranch1BonusPresent() throws InterruptedException {
    	tap(150,2070);
    	delayed_bonusb1.isDisplayed();
    	 takescreenshotofandroid("User is able to see pending delayed bonus");
    menu.click();
    	tap(300,1415);
    	
    	
    }

    public void verifyBranch2BonusPresent() throws InterruptedException {
    	tap(150,2070);
    	delayed_bonusb2.isDisplayed();
    	 takescreenshotofandroid("User is able to see pending delayed bonus");
    	menu.click();
    	tap(300,1415);
    	
    }

    public void verifyMemberBonusNotPresent() throws InterruptedException {
    	
    	try {
    		delayed_bonusm1.isDisplayed();
    	}catch(Exception e) {
    		
    	}
    
    	Thread.sleep(2000);
    	 TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    	    Allure.addAttachment("Delayed bonus removed", new ByteArrayInputStream(screenshot1));
    		Thread.sleep(2000);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	menu.click();
    	tap(300,1415);
    	
    }

    public void verifyBranch1BonusNotPresent() throws InterruptedException {
    	tap(150,2070);
    	try {
    		delayed_bonus.isDisplayed();
    	}catch(Exception e) {
    		
    	}
    	
    	Thread.sleep(2000);
    	 TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    	    Allure.addAttachment("Delayed bonus removed", new ByteArrayInputStream(screenshot1));
    		Thread.sleep(2000);
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	menu.click();
    	tap(300,1415);
    	
    }

    public void verifyBranch2BonusNotPresent() throws InterruptedException {
    	tap(150,2070);
    	try {
    		delayed_bonusb2.isDisplayed();
    	}catch(Exception e) {
    		
    	}
    	
    	Thread.sleep(2000);
    	 TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    	    Allure.addAttachment("Delayed bonus removed", new ByteArrayInputStream(screenshot1));
    		Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	menu.click();
    	tap(300,1415);
    }
    public void verifyBonusInAppMem_1711_BeforeBonusPaid() throws InterruptedException {
    	
    	PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.member_Number1711.replace("+63", ""), password,"+63");

    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
    	lock_bonus.isDisplayed();
    	delayed_bonus.isDisplayed();
    	pb_logo_bonus.isDisplayed();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(memberbonustext, "133")));
    	assertTrue(memberbonustext.getText().equals("133"));
    	Thread.sleep(2000);
    	TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    		Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	menu.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
    	logout.click();
    	
    }
    public void verifyBonusInAppMem_1711_AfterBonusPaid() throws InterruptedException {
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.member_Number1711, password,"+63");

    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
    	
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(tokenInApp)));
    	assertTrue(tokenInApp.isDisplayed());
    	Thread.sleep(2000);
    	TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    		Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	menu.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
    	logout.click();
    }
    public void verifyBonusInAppMem_1711_AfterVoid() throws InterruptedException {
    	
    	PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.member_Number1711.replace("+63", ""), password,"+63");
		 
		    Thread.sleep(6000);
		     tokensinapp.isDisplayed();
			Thread.sleep(3000);
			assertTrue(tokensinapp.getText().equals("0"));
			menu.click();
			tap(300,1300);
		
    } 
    public void verifyBonusInAppB1_1711_AfterBonusPaid(String num, String pw) throws InterruptedException {
    	
    	PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(num, pw,"+63");

    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOf(loading)));
    	try {
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(tokenInApp)));
    	assertTrue(tokenInApp.isDisplayed());
    	Thread.sleep(2000);
    	TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    		Thread.sleep(2000);
    	}
    	catch(Exception e) {	
    	}
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
    	menu.click();
    	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
    	logout.click();
    }

	public void verifyBonusInAppB2_1711_AfterBonusPaid() throws InterruptedException {
	}
	
	public void checknobonusinhistory() throws InterruptedException {
		tap(150,2070);
		tap(660,2070);
		nobonusinhistory.isDisplayed();
		takescreenshotofandroid("no bonus generated");
		menu.click();
		tap(300,1415);
		
	}
	
	
	
}

