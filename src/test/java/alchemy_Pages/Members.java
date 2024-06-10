package alchemy_Pages;


import static org.testng.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import Utilities.Data;
import io.qameta.allure.Allure;
import plastic_Bank_Pages.PB_Member_Profile;

public class Members extends BaseClass{
	
public Members(WebDriver alcDriver) {
		
		PageFactory.initElements(alcDriver, this);
		}

@FindBy(xpath="//div[@class='body']/div/div/div[text()=' Members ']")
public WebElement members_TAB;
@FindBy(xpath="//button[text()='Confirm']")
public WebElement confirm;
@FindBy(xpath="//label[text()='INCLUDE TAGS']/parent::div/div/div/input")
private WebElement includeATag;
@FindBy(xpath="//label[text()='EXCLUDE TAGS']/parent::div/div/div/input")
private WebElement excludeATag;
@FindBy(xpath="//i[@class='export-icon']")
private WebElement export;
@FindBy(xpath="//input[@placeholder='Name']")
private WebElement nameSearchBox;
@FindBy(xpath="//span[@class='pr-2']")
private WebElement memberType;
@FindBy(xpath="//input[@placeholder='Level']") 
private WebElement level;
@FindBy(xpath="//input[@placeholder='Gender']")
private WebElement gender;
@FindBy(xpath="//input[@placeholder='Age']") 
private WebElement age;
@FindBy(xpath="//input[@placeholder='Country']") 
private WebElement country;
@FindBy(xpath="//input[@placeholder='Phone']") 
private WebElement phone;
@FindBy(xpath="//input[@placeholder='Registered By']")
private WebElement registeredBy;
@FindBy(xpath="//input[@placeholder='Email']")
private WebElement email;
@FindBy(xpath="//input[@placeholder='Register Date']")
private WebElement registerDate;
@FindBy(xpath="//input[@placeholder='Tokens in Wallet']") 
private WebElement tokensInWallet;
@FindBy(xpath="//input[@placeholder='Total KG Recycled']") 
private WebElement totalKGRecycled;
@FindBy(xpath="//input[@placeholder='Monthly KG']")
private WebElement monthlyKG;
@FindBy(xpath="//input[@placeholder='Monthly Earnings']")
private WebElement monthlyEarnings;
@FindBy(xpath="//input[@placeholder='Last Active']") 
private WebElement lastActive;
@FindBy(xpath="//div[contains(@class,'pb-add-button')]")
private WebElement addIcon;
@FindBy(xpath="//div[contains(text(),'Gayas')]")
private WebElement memberAdded;

//Locaters of WebElements After selecting  Member

@FindBy(xpath="//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
@CacheLookup private WebElement tableData_FirstRow;

@FindBy(xpath="//div[@class='partner-info name']")
@CacheLookup private WebElement verifyNameText;
@FindBy(xpath="//a[@id='ngb-nav-6']")
@CacheLookup private WebElement detailsTab;
@FindBy(xpath="//input[@id='phone']")
@CacheLookup private WebElement edit_phone;
@FindBy(xpath="//select[@id='country']")
@CacheLookup private WebElement edit_country;
@FindBy(xpath="//input[@id='name']") 
@CacheLookup private WebElement edit_name;
@FindBy(xpath="//input[@id='city']")
@CacheLookup private WebElement edit_city;
@FindBy(xpath="//input[@id='email']") 
@CacheLookup private WebElement edit_email;
@FindBy(xpath="//input[@id='birthDate']")
@CacheLookup private WebElement edit_birthDate;
@FindBy(xpath="//input[@id='regDate']")
@CacheLookup private WebElement edit_registrationDate;
@FindBy(xpath="//select[@id='gender']")
@CacheLookup private WebElement edit_gender;
@FindBy(xpath="//input[@id='reqPin']")
@CacheLookup private WebElement requirePinForSpendingToken;
@FindBy(xpath="//input[@id='bonusEligible']")
@CacheLookup private WebElement bonusEligible;
@FindBy(xpath="//span[text()='Change password']")
@CacheLookup private WebElement changePassword;
@FindBy(xpath="//span[normalize-space()='Direct token transfer']")
@CacheLookup private WebElement directTokenTransfer;
@FindBy(xpath="//span[normalize-space()='Reclaim Tokens']")
@CacheLookup private WebElement reclaimTokens;
@FindBy(xpath="//span[normalize-space()='Delete Account']")
@CacheLookup private WebElement deleteAccount;
@FindBy(xpath="//span[text()='Edit']")
@CacheLookup private WebElement edit;
@FindBy(xpath="//div[text()=' Suspend Account ']/input")
@CacheLookup private WebElement suspendAccount;

@FindBy(xpath="//div[@class='pb-button green']") 
@CacheLookup private WebElement saveButton;
@FindBy(xpath="//div[@class='pb-button grey']")
@CacheLookup private WebElement cancelButton;
@FindBy(xpath="//a[@id='ngb-nav-7']") 
@CacheLookup private WebElement exchangeHistory;
@FindBy(xpath="//a[@id='ngb-nav-8']")
@CacheLookup private WebElement tags;

@FindBy(xpath = "//div[@role='document']/div")
private WebElement popUp_alert;
@FindBy(xpath="//button[normalize-space()='OK']")
@CacheLookup private WebElement alertBoxOkButton;
@FindBy(xpath="//button[normalize-space()='Cancel']") 
@CacheLookup private WebElement alertBoxCancelButton;

	@FindBy(xpath = "//loader/div//table")
	WebElement pageLoader;
	@FindBy(xpath = "//h4") WebElement directTokenTransfer_PopUp;
	@FindBy(xpath = "//input[@id='amount']") WebElement tokenAmount;
	@FindBy(xpath = "//select[@id='type']") WebElement tokenType;
	@FindBy(xpath = "//select[@id='type']/option[text()='EPR Rewards']") WebElement EPRRewards;
	@FindBy(xpath= "//button[text()='Send']") WebElement sendTokenBtn;
	@FindBy(xpath = "//input[@id='smsCode']") WebElement authCode;
	@FindBy(xpath = "//button[@type='button' and text()='Submit']") WebElement authCodeSubmitBtn;
	@FindBy(xpath = "//button[text()='Close']") WebElement closeBtnPopup;
	@FindBy(xpath = "//input[@placeholder='Phone']")
	WebElement phoneSearchBox;

	@FindBy(xpath = "//*[text()='Bonus Eligible']")
	WebElement bonusEligibleText;

	@FindBy(xpath = "//span[text()='Reclaim Tokens']")
	WebElement reclaimtokens;
	@FindBy(xpath = "//option[text()='Other']")
	WebElement other;
	@FindBy(xpath = "//select[@id='type']")
	WebElement reason;
	@FindBy(xpath = "//div[@class='loader circle-loader']") 
	WebElement loader;
	@FindBy(xpath = "//a[text()='Exchange History']") 
    WebElement exchangehistory;
	@FindBy(xpath = "//div[text()='KG Recycled']/following-sibling::div/div/following-sibling::div/div")
    WebElement kgrecycled;
	@FindBy(xpath = "//div[contains(text(),'Total weight:')]")
    WebElement excHisTotalWeight;
	@FindBy(xpath = "//div[text()='Tokens in Wallet']/following::div[5]")
    WebElement tokenInWalletText;
	@FindBy(xpath="//th[text()='No results found.']")
	public WebElement noresults;
	@FindBy(xpath="//tbody/tr/td/div/div[text()=' +628123450000 ']")
	public WebElement gojeknumber;
	@FindBy(xpath="//span[text()='Change password']")
	public WebElement changepassword;
	@FindBy(xpath="//input[@type='password' and @id='new']")
	public WebElement newpassword;
	@FindBy(xpath="//input[@type='password' and @id='confirm']")
	public WebElement confirmpassword;
	@FindBy(xpath="//button[text()='Save']")
	public WebElement save;
	@FindBy(xpath="//button[text()='Close']")
	public WebElement close;
	@FindBy(xpath="//select[@name='countryid']")
	public WebElement phonecode;
	@FindBy(xpath="//select[@name='country']")
	public WebElement countrymember;
	@FindBy(xpath="//option[text()=' (+62) Indonesia ']")
	public static WebElement indonesia;
	@FindBy(xpath="//option[text()=' (+63) Philippines ']")
	public static WebElement philippines;
	@FindBy(xpath="//option[text()='Philippines']")
	public WebElement philippinesm;
	@FindBy(xpath="//input[@id='phone']")
	public WebElement phonemember;
	@FindBy(xpath="//input[@id='name']")
	public WebElement name;
	@FindBy(xpath="//input[@id='birthDate']")
	public WebElement birthdate;
	@FindBy(xpath="//textarea[@id='message']")
	public WebElement message;
	@FindBy(xpath="//div[text()='15']")
	public WebElement date;
	@FindBy(xpath="//input[@id='pin']")
	public WebElement pin;
	@FindBy(xpath="//span[text()='Direct token transfer']")
	public WebElement dtt;
	@FindBy(xpath="//input[@id='amount']")
	public WebElement enteramount;
	@FindBy(xpath="//select[@id='type']")
	public WebElement selectreason;
	@FindBy(xpath="//option[text()='EPR Rewards']")
	public WebElement optionepr;
	@FindBy(xpath="//button[text()='Send']")
	public WebElement send;
	@FindBy(xpath="//input[@id='smsCode']")
	public WebElement smscode;
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submit;
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement tokeninwallet;
	@FindBy(xpath="//button[text()='Create']")
	public WebElement create;
	@FindBy(xpath="//span[text()='PER PAGE:']")
	public WebElement perpage;
	@FindBy(xpath="//tr/td/div/div[contains(text(),'+')]")
	public WebElement searchresult;
	@FindBy(xpath="//tr/td")
	public WebElement firstcell;
	@FindBy(xpath="//div[contains(text(),'Tokens in Wallet')]/following-sibling::div/div/following-sibling::div/div")
	public WebElement tokensinwallet;
	
	//dynamic xpaths:-
	
	String dynamicresult="//tr/td/div/div[contains(text(),'param')]";
	public static String rnewnum;
	
	
	
	
WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
public void searchAddedMember(String memberName) {
	nameSearchBox.sendKeys(memberName);
}

	public void searchAddedMemberByPhone(String memberNumber) {
		WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(pageLoader));
		phoneSearchBox.sendKeys(memberNumber);
		wait.until(ExpectedConditions.invisibilityOf(pageLoader));
	}
	public void searchAddedMemberByPhone380(String memberName) throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.invisibilityOf(pageLoader));
		Thread.sleep(4000);
		phoneSearchBox.sendKeys(memberName);
		//wait.until(ExpectedConditions.invisibilityOf(pageLoader));
	}


public void clickMembersTab() {
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(members_TAB));
	members_TAB.click();
}

public void clickSpecificMember() throws InterruptedException {
	Thread.sleep(15000);
	tableData_FirstRow.click();
	
}
public void suspendAccount() {
	/*
	 * WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	 * wait.until(ExpectedConditions.elementToBeClickable(suspendAccount));
	 */
	suspendAccount.click();
}
private void clickAlertBoxBtnOK() {
	
alertBoxOkButton.click();	
}
public Boolean verfiyAlertBox() {
	Boolean verify = popUp_alert.isDisplayed();	
	return verify;
}
@SuppressWarnings("deprecation")
public void waitforloader() {
	boolean ispresent= true;
	alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	while(ispresent) {
		try {
			loader.isDisplayed();
		}catch(Exception e) {
			ispresent=false;
		}
	}
	alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
}
public void selectAndverifyMember(String pNum) throws InterruptedException {
	
	clickMembersTab();
	waitforloader();
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone));
	phone.clear();
	phone.sendKeys(pNum);
//	clickSpecificMember();
	waitforloader();
	
	String verifyName= tableData_FirstRow.getText();
	System.out.println("Printing after getting Text: "+verifyName);
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
	assert verifyName.contains("Mainak");
	
	}
public void editMemberDetails(String pNumber,String editdetail) throws InterruptedException {
	Thread.sleep(2000);
	members_TAB.click();
	Thread.sleep(10000);
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone));
	//phone.click();
	phone.clear();
	phone.sendKeys(pNumber);
	clickSpecificMember();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(edit));
	edit.click();
	edit_name.clear();
	edit_name.sendKeys(editdetail);
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
	saveButton.click();	
	changepassword.click();
	newpassword.sendKeys("123456a");
	confirmpassword.sendKeys("123456a");
	save.click();
	close.click();
}
public void suspendMember(String suspendPNumber) throws InterruptedException {
	
	clickMembersTab();
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(phone));
	phone.clear();
	phone.sendKeys(suspendPNumber);
	clickSpecificMember();
	Thread.sleep(3000);
	suspendAccount();
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
	Boolean verify = verfiyAlertBox();
	assert verify.equals(true);
	clickAlertBoxBtnOK();
}


public void refresh() {
	members_TAB.click();
}

	private void clickDirectTokenTransfer() {
		directTokenTransfer.click();
	}
	private String verify_DirectTokenTransferTextPopUp() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(pageLoader));
		return directTokenTransfer_PopUp.getText();
	}
	private void enterAmountTransferToken(String amount){
		tokenAmount.clear();
		tokenAmount.sendKeys(amount);
	}
	private void selectTokenTransferType() throws InterruptedException {
		tokenType.click();
		Thread.sleep(2000);
		EPRRewards.click();
//		tokenType.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		tokenType.sendKeys((Keys.ENTER));
//		Thread.sleep(2000);
		tokenType.sendKeys((Keys.ENTER));
	}
	private void clickSendTokenTransferBtn(){
		sendTokenBtn.click();
	}
	
	private void clickBonusEligible() throws InterruptedException {
		Thread.sleep(2000);
		bonusEligibleText.click();
	}
	private void enterAuthCode(String code) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(authCode));
		authCode.sendKeys(code);
		Thread.sleep(2000);
	}

	private void clickSubmitAuthCode(){
		authCodeSubmitBtn.click();
	}

	private void clickCloseBtnPopUp(){
		closeBtnPopup.click();
	}

	public void tokenDirectTransfer(String phone, String TokenHeading, String amount, String code, String successMsg) throws InterruptedException {
		clickMembersTab();
		searchAddedMemberByPhone(phone);
		clickSpecificMember();
		clickDirectTokenTransfer();
		assert verify_DirectTokenTransferTextPopUp().equals(TokenHeading);
		enterAmountTransferToken(amount);
		selectTokenTransferType();
		clickSendTokenTransferBtn();
		enterAuthCode(code);
		clickSubmitAuthCode();
		assert verify_DirectTokenTransferTextPopUp().equals(successMsg);
		Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
		clickCloseBtnPopUp();
	}
	
	public void editMemberUncheckBonus(String pNumber) throws InterruptedException {
		Thread.sleep(2000);
		members_TAB.click();
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(300));
		wait.until(ExpectedConditions.elementToBeClickable(phone));
		//phone.click();
		phone.clear();
		phone.sendKeys(pNumber);
		clickSpecificMember();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
		clickBonusEligible();
		saveButton.click();
	}
	
	 public void memberExcHisBeforeVoid_1711() throws InterruptedException {
	    	
	    	alcDriver.get("https://"+temp+"/#/admin/finder/"+Data.member_Id1711);
	    	Thread.sleep(2000);
	    	kgrecycled.isDisplayed();
	    	System.out.println("-----"+kgrecycled.getText()+"-----");
	    	wait.until(ExpectedConditions.textToBePresentInElement(kgrecycled, "19"));
	    	assertTrue(kgrecycled.getText().equals("19"));
	    	Thread.sleep(2000);
	    	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    		Thread.sleep(2000);
	    	exchangehistory.click();
	    	assertTrue(excHisTotalWeight.isDisplayed());
	    	
	    }
	 public void memberExcHisAfterBonusPaid_1711() throws InterruptedException {
	    	
	    	alcDriver.get("https://"+temp+"/#/admin/finder/"+Data.member_Id1711);
	    	Thread.sleep(2000);
	    	String tokenInWallet=tokenInWalletText.getText();
	    	assertTrue(tokenInWallet.equals("133"));
	    	
	    	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    		Thread.sleep(2000);
	    		
	    }
	 public void memberExcHisAfterVoid_1711() throws InterruptedException {
	    	
	    	alcDriver.get("https://"+temp+"/#/admin/finder/"+Data.member_Id1711);
	    	Thread.sleep(2000);
	 
	    	exchangehistory.click();
	    	assertTrue(excHisTotalWeight.isDisplayed());
	    	
	    	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    		Thread.sleep(2000);
	    	
	    	
	    }
	 @SuppressWarnings("deprecation")
	public void ensureMemberIsPresentWithTokens(String phone, String aname, String pnum, WebElement el, String t) {
		 members_TAB.click();
		 wait300.until(ExpectedConditions.visibilityOf(perpage));
		 phoneSearchBox.clear();
		 phoneSearchBox.sendKeys(phone);
		 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
		 wait300.until(ExpectedConditions.visibilityOf(perpage));
		 alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		 		String checkgjorgc=aname;
		 		if(checkgjorgc.contains("gojek")) {
		 			gojekyn=true;
		 		}
	try {
		waitms.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
			String text=searchresult.getText();
			String textwithnospaces=text.replaceAll("\\s", "");
			assertTrue(textwithnospaces.contains(phone));
			alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String actualphonexpath= dynamicresult.replace("param", phone);
			alcDriver.findElement(By.xpath(actualphonexpath)).click();
			changepassword.click();
			newpassword.sendKeys("123456a");
			confirmpassword.sendKeys("123456a");
			save.click();
			close.click();
			needforpasswordchange = true;
			
		}catch(Exception e) {
			waitms.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(noresults)));
			alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			addIcon.click();
			phonecode.click();
			el.click();
			phonemember.sendKeys(pnum);
			name.sendKeys(aname);
			birthdate.click();
			date.click();
			pin.sendKeys("123456a");
			create.click();
			 wait300.until(ExpectedConditions.visibilityOf(perpage));
			 phoneSearchBox.clear();
			 phoneSearchBox.sendKeys(phone);
			 String actualphonexpath= dynamicresult.replace("param", phone);
			 wait300.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(alcDriver.findElement(By.xpath(actualphonexpath))),
					 ExpectedConditions.visibilityOf(perpage)));
			 String text=searchresult.getText();
				String textwithnospaces=text.replaceAll("\\s", "");
				assertTrue(textwithnospaces.contains(phone));
				alcDriver.findElement(By.xpath(actualphonexpath)).click();
			 
		}
	alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dtt.click();
		enteramount.clear();
		enteramount.sendKeys(t);
		selectreason.click();
		optionepr.click();
		send.click();
		smscode.sendKeys("778899");
		submit.click();
		close.click();
	 }
	 
	 
	public void compareAlchemyAndAppTokens(String phone) throws InterruptedException {
		members_TAB.click();
		wait300.until(ExpectedConditions.visibilityOf(perpage));
		 phoneSearchBox.clear();
		 phoneSearchBox.sendKeys(phone);
		 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
		 wait300.until(ExpectedConditions.visibilityOf(perpage));
		 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
		 firstcell.click();
		 wait300.until(ExpectedConditions.visibilityOf(tokensinwallet));
		 String tokensinAlchemy = tokensinwallet.getText().replace(",", "");
		 assertTrue(tokensinAlchemy.equals(PB_Member_Profile.tokensinend));
		 takescreenshotof(tokensinwallet,"Tokens in account wallet after cashout on Alchemy.");
	 }
	public void createRandomMemberWithTokens(WebElement el, String pcode, String tokens) {
		members_TAB.click();
		 wait300.until(ExpectedConditions.visibilityOf(perpage));
		 addIcon.click();
			phonecode.click();
			el.click();
			rnewnum=RandomStringUtils.randomNumeric(8);
			phonemember.sendKeys(rnewnum);
			
			name.sendKeys("Fleek"+RandomStringUtils.randomAlphabetic(5));
			birthdate.click();
			date.click();
			pin.sendKeys("123456a");
			create.click();
			wait300.until(ExpectedConditions.visibilityOf(perpage));
			 phoneSearchBox.clear();
			 phoneSearchBox.sendKeys(pcode+rnewnum);
			 
			 String actualphonexpath= dynamicresult.replace("param", pcode+rnewnum);
			
				alcDriver.findElement(By.xpath(actualphonexpath)).click();
				dtt.click();
				enteramount.clear();
				enteramount.sendKeys(tokens);
				selectreason.click();
				optionepr.click();
				send.click();
				smscode.sendKeys("778899");
				submit.click();
				close.click();
	}
	
	
	
	public void reclaimtokens() {
		reclaimtokens.click();
		enteramount.sendKeys("1000");
		reason.click();
		other.click();
		message.sendKeys("other");
		send.click();
		//smscode.sendKeys("778899");
		confirm.click();
		close.click();
	}
	public void memberBonus(String memberId,String token) throws InterruptedException {

		alcDriver.get("https://"+temp+"/#/admin/finder/"+memberId);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(tokenInWalletText));
		String tokenInWallet=tokenInWalletText.getText();
		Thread.sleep(2000);
		assertTrue(tokenInWallet.equals(token));

		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Token in wallet for Member in Alchemy", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);

	}
}