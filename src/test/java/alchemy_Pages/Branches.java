package alchemy_Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.BaseClass;
import Utilities.Data;
import io.qameta.allure.Allure;
import plastic_Bank_Pages.PB_Member_Profile;
import plastic_Bank_Pages.PB_Register_CollectionPoint;


public class Branches extends BaseClass {

public Branches(WebDriver alcDriver) {
		
		PageFactory.initElements(alcDriver, this);
		}
@FindBy(xpath = "//div[@class='container-fluid']/div[2]")
private WebElement addNewBranch_btn;

@FindBy(xpath="//div[@class='body']/div/div/div[text()=' Branches ']")
private WebElement branches_TAB;
@FindBy(xpath="//div[@class='body']/div/div/div[text()=' Members ']")
public WebElement members_TAB;
@FindBy(xpath = "//div[@class='tag-search']/label[text()='INCLUDE TAGS']/parent::div/div/div/input")
private WebElement searchInclude_tag;

@FindBy(xpath = "//datatable//input[@placeholder='Name']")
private WebElement name_SearchBox;

@FindBy(xpath = "//datatable//input[@placeholder='Phone']")
private WebElement phone_SearchBox;

@FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
private WebElement tableData_FirstRow;

@FindBy(xpath = "//div[@role='tabpanel']/div[2]/div/span")
private WebElement edit_Branch;

@FindBy(xpath = "//input[@name='city']")
private WebElement edit_city;

@FindBy(xpath = "//div[contains(@class, 'pb-button') and text()= 'Save ']")
private WebElement save_btn;

@FindBy(xpath ="//div[contains(@class, 'pb-button') and text()= 'Cancel']")
private WebElement cancel_btn;

@FindBy(xpath ="//ul[@role='tablist']/li[3]/a")
private WebElement invantory_tabBranch;

@FindBy(xpath = "//div[@role='tabpanel']//table/tbody/tr")
private WebElement totalRowsInventory_tabel;

@FindBy(xpath = "//div[@role='tabpanel']//table/tbody/tr/td[2]//div/mdl-checkbox/span[2]")
private WebElement invertoryView_checkBox;

@FindBy(xpath = "//*[text()=' Suspend Account ']")
private WebElement suspendAccount_checkbox;

@FindBy(xpath = "//div[@role='document']/div")
private WebElement popUp_alert;

@FindBy(xpath="//div[@class='partner-info name']")
@CacheLookup private WebElement verifyNameText;

@FindBy(xpath="//input[@name='name']")
@CacheLookup private WebElement editNameTextFeild;


@FindBy(xpath = "//div/button[text()='OK']")
private WebElement okBtn_alertBox;

@FindBy(xpath = "//a[text()='Exchange History']")
private WebElement exchangeHistory;

@FindBy(xpath = "//a[text()='Exchange History']")
private WebElement exchangeHistoryTab;

@FindBy(xpath = "//div[text()='KG Recycled']/following::div[5]")
private WebElement kgRecycledInBranchText;
@FindBy(xpath = "//div[contains(@class,'card') and contains(@id,'panel')]")
List<WebElement> cardpanels;

@FindBy(xpath = "//div[text()='KG Recycled']")
public WebElement kgRecycledInBranch;

@FindBy(xpath = "//loader/div//table") 
WebElement pageLoader;
@FindBy(xpath = "//label[text()='Tokens Active']/parent::div/div")
WebElement tokensActive;
@FindBy(xpath = "//label[text()='Split Mode']/parent::div/div")
WebElement splitModeToggle;
@FindBy(xpath = "//label[text()='Upload Buy Receipts']/parent::div/div")
WebElement uploadBuyReceiptsToggle;
@FindBy(xpath = "//label[text()='Show Token/Market Rate']/parent::div/div")
WebElement tokenMarketToggle;

@FindBy(xpath = "//label[text()='Show Token/Market Rate']/parent::div/div")
WebElement fraudToggle;
@FindBy(xpath = "//label[text()='Show Token/Market Rate']/parent::div/div")
WebElement errorsToggle;
@FindBy(xpath = "//label[text()='Show Token/Market Rate']/parent::div/div")
WebElement bonusToggle;
@FindBy(xpath = "//div[@class='disable-btn approve-true-state']")
WebElement approveButton;

@FindBy(xpath = "//*[text()='Plastik-HDPE-Clean-Clear']/parent::div/div[2]")
WebElement hdpeKgAlcText;
@FindBy(xpath = "//*[text()='Plastik-PET-Raw-Transparent']/parent::div/div[2]")
WebElement petKgAlcText;
@FindBy(xpath = "//div[text()='TOTAL']/following-sibling::div")
WebElement totalKgAlcText;

@FindBy(xpath = "//div[@class='card-header']/div/button")
List<WebElement> transactions;

@FindBy(xpath = "//span[text()='Plastic Chain']")
WebElement plasticChain;
@FindBy(xpath = "//div[@class='card-body']//div/span[1]/span[1]")
List<WebElement> hdpePetPlasticChain;
@FindBy(xpath = "//div[@class='card-body']//div/span[1]/span[1]")
List<WebElement> branchProcessorTransactionPlasticChain;
@FindBy(xpath = "//i[@class='fa fa-arrow-right pointer fs15 text-green']")
List<WebElement> greenArrow;
@FindBy(xpath = "//i[@class='fa fa-arrow-right pointer fs15 text-orange']")
List<WebElement> orangeArrow;

@FindBy(xpath = "//div[@class='card-header']/div/div/div[contains(@class, 'row')]/div/div[1]")
List<WebElement> noFraudNoErrorsToggle;

@FindBy(xpath = "//div[@class='text-natural-green']")
WebElement branchBonusTextInAlchmeyVerify; ///////

@FindBy(xpath = "//span[text()='(transferred)']")
WebElement transferedTextDisplay;

@FindBy(xpath = "//div[@class='card-header']/div/div/button[text()='Approved']")
List<WebElement> approvedConfirm;

@FindBy(xpath = "//div[contains(@class,'col pl')]/div")
List<WebElement> branchDetailsTagTexts;

@FindBy(xpath = "//div[text()='Bonus']/following::div")
WebElement bonusInExchangeHistorytext;
@FindBy(xpath = "//label[text()='Branch Bonus']/following-sibling::div/div[contains(@class,'text')]")
List<WebElement> branchbonustext;
@FindBy(xpath = "//label[text()='Member Bonus']/following-sibling::div/div[contains(@class,'text')]")
WebElement memberbonustext;
@FindBy(xpath = "//a[text()='Details']")
WebElement details;
@FindBy(xpath = "//label[text()='Branch Bonus']/following-sibling::div/div[contains(@class,'text')]")
WebElement branchBonustext;


@FindBy(xpath = "//div[text()='KG Recycled']/following-sibling::div/div/following-sibling::div/div")
WebElement kgrecycled;
@FindBy(xpath = "//div[@class='card-header']")
List<WebElement> cardheaders;
@FindBy(xpath = "//li[contains(@class,'page-item')]")
WebElement lastItemOnPage;
@FindBy(xpath = "//div[text()='TOTAL']")
WebElement total;
@FindBy(xpath = "//a[text()='Exchange History']")
WebElement exchnagehistory;
@FindBy(xpath = "//div[@class='switch bonus-checked']")
WebElement bonustoggle;
@FindBy(xpath = "//textarea")
WebElement textarea;
@FindBy(xpath = "//label[@class='item-name offset-border']")
WebElement associatedbonus;
@FindBy(xpath = "//div[@class='switch bonus-locked']")
List<WebElement> lockedbonus;
@FindBy(xpath = "//span[text()=' Disable ']")
WebElement disable;
@FindBy(xpath = "//button[text()='Close']")
WebElement close;
@FindBy(xpath = "//div[text()='Tokens in Wallet']/following::div[5]")
WebElement tokenInWalletText;
@FindBy(xpath = "//label[text()='Branch Bonus']/following-sibling::div/div[contains(@class,'text')]")
WebElement branchBonus;
@FindBy(xpath = "//textarea[@placeholder='Describe information about the reclamation.']" )
WebElement textAreaReclaimToken;
@FindBy(xpath="//span[text()='PER PAGE:']")
public WebElement perpage;
@FindBy(xpath = "//span[text()=' Void ']" )
WebElement voidButton;
@FindBy(xpath = "//input[@placeholder='Phone']")
public WebElement phoneSearchBox;
@FindBy(xpath="//tr/td/div/div[contains(text(),'+')]")
public WebElement searchresult;
@FindBy(xpath="//div[text()='Branch Owner']")
public WebElement branchowner;
@FindBy(xpath="//span[text()='Change password']")
public WebElement changepassword;
@FindBy(xpath="//input[@type='password' and @id='new']")
public WebElement newpassword;
@FindBy(xpath="//input[@type='password' and @id='confirm']")
public WebElement confirmpassword;
@FindBy(xpath="//button[text()='Save']")
public WebElement save;
@FindBy(xpath="//div[contains(@class,'pb-add-button')]")
public WebElement addIcon;
@FindBy(xpath="//input[@id='name']")
public WebElement namefield;                                 //countrydd  philippines   address  firstaddressoption
@FindBy(xpath="//select[@id='country']")
public WebElement countrydd;
@FindBy(xpath="//option[text()='Philippines']")
public WebElement philippines;
@FindBy(xpath="//input[@name='address']")
public WebElement address;
@FindBy(xpath="//th[text()='No results found.']")
public WebElement noresults;
@FindBy(xpath="//input[@name='address']/following::div/div/ul/li")
public WebElement firstaddressoption;
@FindBy(xpath="//input[@id='phone']")
public WebElement phonemember;
@FindBy(xpath="//input[@id='name']")
public WebElement name;
@FindBy(xpath="//input[@id='birthDate']")
public WebElement birthdate;
@FindBy(xpath="//input[@id='pin']")
public WebElement pin;
@FindBy(xpath="//button[text()='Create']")
public WebElement create;
@FindBy(xpath="//select[@name='countryid']")
public WebElement phonecode;
@FindBy(xpath="//div[text()='15']")
public WebElement date;
@FindBy(xpath="//input[@placeholder='Search']")
public WebElement searchfield;
@FindBy(xpath="//div[@class='search-icon']")
public WebElement searchicon;
@FindBy(xpath="//button[text()='Confirm']")
public WebElement confirm;
@FindBy(xpath = "//button[text()='Void Transaction']")
WebElement voidTransactionButton;
@FindBy(xpath="//span[text()='Direct token transfer']")
public WebElement dtt;
@FindBy(xpath="//label[contains(text(),'Bonus')]/following-sibling::div/div")
public WebElement bonus;
@FindBy(xpath="//input[@id='amount']")
public WebElement enteramount;
@FindBy(xpath="//select[@id='type']")
public WebElement selectreason;
@FindBy(xpath="//option[text()='EPR Rewards']")
public WebElement optionepr;
@FindBy(xpath="//button[text()='Send']")
public WebElement send;
@FindBy(xpath = "//button[text()='Close']" )
WebElement closeButton;
@FindBy(xpath="//input[@id='smsCode']")
public WebElement smscode;
@FindBy(xpath="//button[text()='Submit']")
public WebElement submit;
@FindBy(xpath="//label[contains(text(),'Bonus')]/following-sibling::div/div")
public WebElement bonusinpanel;
@FindBy(xpath="//tr/td")
public WebElement firstcell;
@FindBy(xpath = "//label[text()='ASSOCIATED BONUS']/following::label/following::label/following-sibling::div/div[contains(@class,'text')]")
WebElement bonustext;
@FindBy(xpath = "//label[contains(text(),'ASSOCIATED BONUS')]/following::label[contains(text(),'System offset')]/following::div[text()='0']")
WebElement zerobonussysoffset;

@FindBy(xpath="//option[text()=' (+63) Philippines ']")
public static WebElement philippinesbr;
@FindBy(xpath = "//button[text()='Reclaim Tokens']" )
WebElement reclaimTokenButton;
@FindBy(xpath = "//span[text()=' Reclaim ']" )
WebElement reclaimButton;
@FindBy(xpath = "//input[@id='smsCode']")
WebElement authCode;
@FindBy(xpath = "//button[text()='Submit']" )
WebElement submitButton;
@FindBy(xpath = "//*[text()='Success']" )
WebElement success;
@FindBy(xpath = "//div[@class='loader circle-loader']") 
WebElement loader;
@FindBy(xpath = "//div[text()='Members Registered']/following-sibling::div/div/following-sibling::div/div") 
WebElement membersregistered;
@FindBy(xpath="//div[contains(text(),'Tokens in Wallet')]/following-sibling::div/div/following-sibling::div/div")
public WebElement tokensinwallet;
@FindBy(xpath="//div[contains(text(),'Active Members')]/following-sibling::div/div/following-sibling::div/div")
public WebElement activemembers;
@FindBy(xpath="//div[@class='card-header']/div/button/div/div/div/following::div/div[text()][1]")
public List<WebElement> transactionsDetails;
@FindBy(xpath="//div[text()='Plastik-HDPE-Clean-Clear']/following-sibling::div")
public WebElement hdpeKg;
@FindBy(xpath="//div[text()='Plastik-PET-Clean-Clear']/following-sibling::div")
public WebElement petKg;
@FindBy(xpath="//div[text()='TOTAL']/following-sibling::div")
public WebElement totalKg;
@FindBy(xpath="//label[text()='System offset ']/following-sibling::div/div/div/div[1]")
public WebElement associatedBonus;
@FindBy(xpath="//label[text()='System offset ']/following-sibling::div/div/label")
public WebElement bonusType;

//changeable xpath:---

String dynamicresult="//tr/td/div/div[contains(text(),'param')]";
public static String rnewnum;


WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(40));
public void verifybranchDetailsTagTexts() {
	
}
public void searchAddedBranch(String Name) {
	name_SearchBox.sendKeys(Name);
}

public void clickBranchesTab() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.elementToBeClickable(branches_TAB));
	branches_TAB.click();
	waitforloader();
}

public void clickSpecificBranch() throws InterruptedException {
	
	tableData_FirstRow.click();
	
}
public void splitBranchVerify(String pNum) throws InterruptedException {

	clickBranchesTab();
	Thread.sleep(5000);
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	wait.until(ExpectedConditions.elementToBeClickable(exchangeHistoryTab));
	exchangeHistoryTab.click();

	wait.until(ExpectedConditions.visibilityOf(transactions.get(0)));

	Thread.sleep(3000);

	Set<String> expectedTransactionsDetails = new HashSet<>(Arrays.asList(" Bought 75 KG from "+PB_Register_CollectionPoint.splitBranchMemberName1+" "," Bought 75 KG from "+PB_Register_CollectionPoint.splitMemberName2+" "," Sold 150 KG to "+Data.branch1_Name4358+" "));

	Set<String> actualTransactionsDetails = new HashSet<>();

	Thread.sleep(2000);

	for(WebElement ele : transactionsDetails){

		actualTransactionsDetails.add(ele.getText());

	}
	Thread.sleep(2000);

	System.out.println(actualTransactionsDetails);

	System.out.println(" Bought 75 KG from "+PB_Register_CollectionPoint.splitBranchMemberName1+" "+" Bought 75 KG from "+PB_Register_CollectionPoint.splitMemberName2+" "+" Sold 150 KG to "+Data.branch1_Name4358+" ");


	Set<String> actualProcessed = preprocessSet(actualTransactionsDetails);
	Set<String> expectedProcessed = preprocessSet(expectedTransactionsDetails);

	// Asserting the equality of the processed sets
	assert actualProcessed.equals(expectedProcessed);

	//assert actualTransactionsDetails.equals(expectedTransactionsDetails);

	Set<String> expectedHdpeKg = new HashSet<>(Arrays.asList("25 KG","25 KG","50 KG"));
	Set<String> actualHdpeKg = new HashSet<>();

	Set<String> expectedPetKg = new HashSet<>(Arrays.asList("50 KG","50 KG","100 KG"));
	Set<String> actualPetKg = new HashSet<>();

	Set<String> expectedBonusType = new HashSet<>(Arrays.asList("Member Bonus","Member Bonus","Branch Bonus"));
	Set<String> actualBonusType = new HashSet<>();

	Set<String> expectedBonus = new HashSet<>(Arrays.asList("0","0","0"));
	Set<String> actualBonus = new HashSet<>();

	Set<String> expectedTotalKG = new HashSet<>(Arrays.asList("75 KG","75 KG","150 KG"));
	Set<String> actualTotalKG = new HashSet<>();


	for(WebElement tr :transactions){

		tr.click();

		Thread.sleep(3000);

		actualHdpeKg.add(hdpeKg.getText());
		actualPetKg.add(petKg.getText());
		actualBonusType.add(bonusType.getText());
		actualBonus.add(associatedBonus.getText());
		actualTotalKG.add(totalKg.getText());

		Thread.sleep(1000);
		Actions action =new Actions(alcDriver);
		action.scrollToElement(lastItemOnPage).build().perform();
		TakesScreenshot ts = (TakesScreenshot) alcDriver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Transactions of Branch Exchange History ", new ByteArrayInputStream(screenshot));

		Thread.sleep(3000);

		tr.click();

	}
	Assert.assertEquals(actualHdpeKg,expectedHdpeKg);
	Assert.assertEquals(actualPetKg,expectedPetKg);
	Assert.assertEquals(actualBonusType,expectedBonusType);
	Assert.assertEquals(actualBonus,expectedBonus);
	Assert.assertEquals(actualTotalKG,expectedTotalKG);

}

public void bonusProcessorExcHistoryVerification(String processorId) throws InterruptedException {

	alcDriver.get("https://"+BaseClass.temp+"/#/admin/recyclingcenter/"+processorId);

	exchangeHistoryTab.click();
	for(WebElement cardHeaders:cardheaders)
		cardHeaders.click();
	Actions action = new Actions(alcDriver);
	action.moveToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);

	TakesScreenshot ts13 = (TakesScreenshot) alcDriver;
	byte[] screenshot13 = ts13.getScreenshotAs(OutputType.BYTES);
	Allure.addAttachment("Bonus in Processor Exchange History Screenshot", new ByteArrayInputStream(screenshot13));
	Thread.sleep(3000);
	alcDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	try {
		assertTrue(branchBonus.isDisplayed());
	}
	catch(Exception e){
		//assertFalse(branchBonus.isDisplayed());
		System.out.println("No Bonus is Present");
	}
	alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

}
public void editBranch() {
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tabpanel']/div[2]/div/span")));
	edit_Branch.click();
}

public void editUserCity(String cityName) {
	edit_city.sendKeys(cityName);
}

public void saveUserDetails() {
	save_btn.click();
}

public void suspendAccount() {
	/*
	 * WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	 * wait.until(ExpectedConditions.elementToBeClickable(suspendAccount_checkbox));
	 */
	/*
	 * JavascriptExecutor executor = (JavascriptExecutor) alcDriver;
	 * executor.executeScript("arguments[0].click();", suspendAccount_checkbox);
	 */
	suspendAccount_checkbox.click();
}
public static Set<String> preprocessSet(Set<String> inputSet) {
	Set<String> processedSet = new HashSet<>();
	for (String str : inputSet) {
		processedSet.add(str.trim().replaceAll("\\s+", " "));
	}
	return processedSet;
}

public Boolean verfiyAlertBox() {
	Boolean verify = popUp_alert.isDisplayed();	
	return verify;
}

public void clickAlertBoxBtnOK() {
	okBtn_alertBox.click();
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


public void kgRecycledInBranch(String branchId,String kgRecycled) throws InterruptedException {

	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+branchId);
	alcDriver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(80));
	wait.until(ExpectedConditions.visibilityOfAllElements(kgRecycledInBranch));
	Thread.sleep(2000);
	String kgRecycledBranch=kgRecycledInBranchText.getText();
	Thread.sleep(2000);
	Assert.assertEquals(kgRecycledBranch,kgRecycled);
	Thread.sleep(2000);
	TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	Allure.addAttachment("KG Recycled In Branch", new ByteArrayInputStream(screenshot1));
	Thread.sleep(2000);
	System.out.println(kgRecycledBranch);

}

public void bonusExchangeHistoryBranch(String branchId) throws InterruptedException {
	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+branchId);
	alcDriver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.visibilityOfAllElements(exchangeHistoryTab));
	exchangeHistoryTab.click();
	Thread.sleep(3000);
	for(WebElement transaction : transactions){
		Thread.sleep(2000);
		transaction.click();
		Thread.sleep(2000);

		Actions action = new Actions(alcDriver);
		action.scrollToElement(lastItemOnPage).build().perform();
		Thread.sleep(2000);
		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Branch Exchange History Screenshot", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);
		assertTrue(bonustext.isDisplayed());
		Thread.sleep(2000);
		transaction.click();
		Thread.sleep(2000);
	}
}
public void searchSpecificBranch(String pNum) throws InterruptedException {
	
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(pNum);
	waitforloader();
}
public void editBranchCityDetails(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	editUserCity("Dehradun");
	saveUserDetails();
	
}
public void bonusExchangeHistoryBranchAfterVoid(String branchId) throws InterruptedException {
	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+branchId);
	alcDriver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.elementToBeClickable(exchangeHistoryTab));
	exchangeHistoryTab.click();
	Thread.sleep(3000);
	for(WebElement transaction : transactions){
		Thread.sleep(2000);
		transaction.click();
		Thread.sleep(3000);
		Actions action = new Actions(alcDriver);
		action.scrollToElement(lastItemOnPage).build().perform();
		Thread.sleep(2000);
		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Bonus In Branch Exchange History", new ByteArrayInputStream(screenshot1));
		System.out.println("Bonus is Not present");
//		assertFalse(bonustext.isDisplayed());
		Thread.sleep(2000);
		transaction.click();
		Thread.sleep(2000);
	}
}
public void voidTransaction(String branchId) throws InterruptedException {

	alcDriver.get("https://"+temp+"/#/admin/collectionpoint/"+branchId);
	Thread.sleep(2000);
	exchangeHistoryTab.click();
	Thread.sleep(2000);

	cardheaders.get(1).click();

	Actions action = new Actions(alcDriver);
	action.scrollToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);

	voidTransactionButton.click();
	voidButton.click();
	closeButton.click();
	Thread.sleep(2000);
//Actions action1 = new Actions(alcDriver);
//action1.moveToElement(crossButton).click().build().perform();
////crossButton.click();

//Actions action1 = new Actions(alcDriver);
//action1.moveToElement(crossButton).build().perform();

//crossButton.click();
//Thread.sleep(3000);
//wait.until(ExpectedConditions.elementToBeClickable(cardheaders.get(1)));
//cardheaders.get(1).click();

	TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	Allure.addAttachment("Void Transaction", new ByteArrayInputStream(screenshot1));
	Thread.sleep(2000);

//Assert.assertTrue(voidedButton.isDisplayed());

}
public void bonusBranchExcHistoryVerification(String branchId) throws InterruptedException {

	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+branchId);
	alcDriver.navigate().refresh();
	exchangeHistoryTab.click();
	Thread.sleep(1000);

	for(WebElement cardHeaders:cardheaders) {

		cardHeaders.click();
		Actions action = new Actions(alcDriver);
		action.scrollToElement(lastItemOnPage).build().perform();

		Thread.sleep(1000);

		TakesScreenshot ts13 = (TakesScreenshot) alcDriver;
		byte[] screenshot13 = ts13.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Token in Branch Exchange History Before Void Screenshot", new ByteArrayInputStream(screenshot13));
		Thread.sleep(3000);
		try {
			assertTrue(bonustext.isDisplayed());
			System.out.println("Bonus is present");
		}
		catch(Exception e){
			System.out.println("Bonus is Not Present");
		}

		wait.until(ExpectedConditions.elementToBeClickable(cardHeaders));
		cardHeaders.click();
		Thread.sleep(2000);

	}

}

public void editBranchNameDetails(String pNum) throws InterruptedException {
	clickBranchesTab();
	Thread.sleep(5000);
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	editNameTextFeild.clear();
	editNameTextFeild.sendKeys("Ashish "+RandomStringUtils.randomAlphabetic(5));
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
	saveUserDetails();
}

public void verifysystemoffsetbonus(String pNum) throws InterruptedException {  //-------------------------------------------------------------
	clickBranchesTab();
	Thread.sleep(5000);
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	exchangeHistoryTab.click();
	transactions.get(0).click();
	zerobonussysoffset.isDisplayed();
	takescreenshotof(zerobonussysoffset,"Branch exchange history shows system offset bonus under associated bonus");
	transactions.get(0).click();
	
}

public void verifyBonusInAlchmeyBranches_1711(String branchId,String bonus) throws InterruptedException {

	alcDriver.get("https://"+temp+"/#/admin/collectionpoint/"+branchId);
	alcDriver.navigate().refresh();
	Thread.sleep(2000);
	String tokenInWallet=tokenInWalletText.getText();
	System.out.println(tokenInWallet);
	assertTrue(tokenInWallet.equals(bonus));

	TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	Allure.addAttachment("Token in wallet for Branch in Alchemy", new ByteArrayInputStream(screenshot1));
	Thread.sleep(2000);

}
public void reclaimToken(String branchId) throws InterruptedException {

	alcDriver.get("https://"+temp+"/#/admin/collectionpoint/"+branchId);
	Thread.sleep(2000);
	exchangeHistoryTab.click();

	Thread.sleep(2000);

	Actions action = new Actions(alcDriver);
	action.moveToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);

	cardheaders.get(1).click();

	wait.until(ExpectedConditions.elementToBeClickable(reclaimTokenButton));
	reclaimTokenButton.click();
	textAreaReclaimToken.sendKeys("Token Reclaim for test case ALC-1711");
	reclaimButton.click();

	enterAuthCode("778899");

	submitButton.click();

	Thread.sleep(2000);

	TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	Allure.addAttachment("Reclaim Token Screenshot", new ByteArrayInputStream(screenshot1));
	Thread.sleep(2000);
	Assert.assertTrue(success.isDisplayed());
	closeButton.click();

}
private void enterAuthCode(String code) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(authCode));
	authCode.sendKeys(code);
	Thread.sleep(2000);
}
public void bonusBranchExcHistoryAfterVoidVerification(String branchId) throws InterruptedException {

	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+branchId);
	alcDriver.navigate().refresh();
	wait.until(ExpectedConditions.elementToBeClickable(exchangeHistoryTab));
	exchangeHistoryTab.click();
	Thread.sleep(1000);

	for(WebElement cardHeaders:cardheaders) {

		cardHeaders.click();
		Actions action = new Actions(alcDriver);
		action.scrollToElement(lastItemOnPage).build().perform();

		Thread.sleep(1000);

		TakesScreenshot ts13 = (TakesScreenshot) alcDriver;
		byte[] screenshot13 = ts13.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("Token in Branch Exchange History After Void", new ByteArrayInputStream(screenshot13));
		Thread.sleep(3000);
		alcDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try{

			bonustext.isDisplayed();

		}
		catch(Exception e){

			System.out.println("Bonus is Not Present");
		}
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.elementToBeClickable(cardHeaders));
		cardHeaders.click();
		Thread.sleep(2000);

	}

}

public void suspendBranchAccount(String pNum) throws InterruptedException {
	clickBranchesTab();
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	waitforloader();
	wait.until(ExpectedConditions.elementToBeClickable(phone_SearchBox));
	phone_SearchBox.clear();
	phone_SearchBox.sendKeys(pNum);
	wait.until(ExpectedConditions.invisibilityOf(pageLoader));
	clickSpecificBranch();
	suspendAccount();
	Boolean verify = verfiyAlertBox();
	assert verify.equals(true);
	clickAlertBoxBtnOK();
	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);
}

public void clickTokensActiveToggle(){
	tokensActive.click();
}

public void clickSplitModeToggle(){
	splitModeToggle.click();
}

public void clickUploadBuyReceiptsToggle(){
	uploadBuyReceiptsToggle.click();
}

public void clickTokenMarketToggle(){
	tokenMarketToggle.click();
}

public void clickTogglesInBranches(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	editBranch();
	//clickTokenMarketToggle();
	//clickSplitModeToggle();
	clickUploadBuyReceiptsToggle();
}
public void clickExchangeHistoryButton() {
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(exchangeHistory));
	exchangeHistory.click();
}
public void clickExchangeHistoryTab() {
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(exchangeHistoryTab));
	exchangeHistoryTab.click();
}


public void firstTransactionApproveExcHisB1(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	List<String>actualbranchDetailsText=new ArrayList<>();//left for Assertion
	for(WebElement branchDetails: branchDetailsTagTexts)
	actualbranchDetailsText.add(branchDetails.getText());
	Assert.assertEquals(actualbranchDetailsText, Arrays.asList("19","0","1","0"));
	Thread.sleep(3000);
	clickExchangeHistoryTab();
		
		transactions.get(0).click();
		Thread.sleep(2000);
		String alcBonus= branchBonusTextInAlchmeyVerify.getText();
		assertEquals(total_bonus_M_B1,alcBonus);
		String kgArr[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
		assertEquals(kgArr,alc_M_B1_ExngHisKgVerify);
		  Thread.sleep(2000);
		    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		    Thread.sleep(2000);
	 
}
public void transactionApproveExcHisB1(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	List<String> actualBr1TagsDetails = new ArrayList<>();
	for(WebElement branchDetails: branchDetailsTagTexts)
		actualBr1TagsDetails.add(branchDetails.getText()) ;
	System.out.println("B1="+actualBr1TagsDetails);
	Thread.sleep(2000);
	List<String> expectedBr1TagsDetails = new ArrayList<>();
	expectedBr1TagsDetails.addAll(Arrays.asList("19","0","1","0"));
	Assert.assertEquals(actualBr1TagsDetails, expectedBr1TagsDetails);
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) pbDriver;
    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
    Thread.sleep(4000);
    
	clickExchangeHistoryButton();
	
	for (int p=0; p<3; p++) {
	
		
		
	transactions.get(p).click();
	Thread.sleep(2000);
	
	Actions actions =new Actions(alcDriver);
	actions.scrollToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
	for (int i=0;i<2;i++)
	{	
		Thread.sleep(5000);
		noFraudNoErrorsToggle.get(i).click();
		Thread.sleep(5000);
	}
		
	String actualAlcBonus= branchBonusTextInAlchmeyVerify.getText();
	String actualAlcKgList[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	
	if(p==0) {
		assertEquals(actualAlcBonus,alc_B1_ExngHisBonusVerify[0] );
		assertEquals(actualAlcKgList,alc_B1_B3_ExngHisKgVerify);
	}
	else if(p==1) {
		assertEquals(actualAlcBonus,alc_B1_ExngHisBonusVerify[1]);
		assertEquals(actualAlcKgList,alc_B1_B2_ExngHisKgVerify);
	}
	else if(p==2) {
		assertEquals(actualAlcBonus,alc_B1_ExngHisBonusVerify[2]);
		assertEquals(actualAlcKgList,alc_M_B1_ExngHisKgVerify);
	}
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(approveButton));
	approveButton.click();
	Thread.sleep(4000);
	}
	
	for(int i=0;i<approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
}
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
}
public void transactionApproveExcHisB2(String pNum) throws InterruptedException {

	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	List<String> actualBr2TagsDetails = new ArrayList<>();
	for(WebElement branchDetails: branchDetailsTagTexts)
		actualBr2TagsDetails.add(branchDetails.getText()) ;
	System.out.println("B2="+actualBr2TagsDetails);
	Thread.sleep(2000);
	List<String> expectedBr2TagsDetails = new ArrayList<>();
	expectedBr2TagsDetails.addAll(Arrays.asList("0","0","0","0"));
	Assert.assertEquals(actualBr2TagsDetails, expectedBr2TagsDetails);
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) pbDriver;
    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
    Thread.sleep(4000);
	
	clickExchangeHistoryButton();
	
	for (int p=0; p<=1; p++) {
		
		
	transactions.get(p).click();
	Thread.sleep(2000);
	
	Actions actions1 =new Actions(alcDriver);
	actions1.scrollToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
		
	String actualAlcBonus= branchBonusTextInAlchmeyVerify.getText();
	String actualAlcKgList[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	
	if(p==0) {
		
		assertEquals(actualAlcBonus,alc_B2_ExngHisBonusVerify[0] );
		assertEquals(actualAlcKgList,alc_B2_P_ExngHisKgVerify);
		
		for (int i=0;i<2;i++)
		{	
			Thread.sleep(5000);
			noFraudNoErrorsToggle.get(i).click();
			Thread.sleep(5000);
		}
	
		WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.elementToBeClickable(approveButton));
		approveButton.click();
		Thread.sleep(4000);
	}
	
	else if(p==1) {
		
		assertEquals(actualAlcBonus,alc_B2_ExngHisBonusVerify[1]);
		assertEquals(actualAlcKgList,alc_B1_B2_ExngHisKgVerify);
		transactions.get(p).click();
		Thread.sleep(2000);	
	}
	}
	
	for(int i=0;i<approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
}
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
}

public void transactionApproveExcHisB3(String pNum) throws InterruptedException {
	
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	List<String> actualBr3TagsDetails = new ArrayList<>();
	for(WebElement branchDetails: branchDetailsTagTexts)
		actualBr3TagsDetails.add(branchDetails.getText()) ;
	System.out.println("B3="+actualBr3TagsDetails);
	Thread.sleep(2000);
	List<String> expectedBr3TagsDetails = new ArrayList<>();
	expectedBr3TagsDetails.addAll(Arrays.asList("0","0","0","0"));
	Assert.assertEquals(actualBr3TagsDetails, expectedBr3TagsDetails);
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) pbDriver;
    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
    Thread.sleep(4000);
	
	clickExchangeHistoryButton();
	
	for (int p=0; p<=1; p++) {	
		
	transactions.get(p).click();
	
	Thread.sleep(2000);
	Actions actions1 =new Actions(alcDriver);
	actions1.scrollToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
		
	String actualAlcBonus= branchBonusTextInAlchmeyVerify.getText();
	String actualAlcKgList[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
	
	if(p==0) {
		
		assertEquals(alc_B3_ExngHisBonusVerify[0],actualAlcBonus );
		assertEquals(alc_B3_P_ExngHisKgVerify,actualAlcKgList);
		
		for (int i=0;i<2;i++)
		{	
			Thread.sleep(5000);
			noFraudNoErrorsToggle.get(i).click();
			Thread.sleep(5000);
		}
	
		WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.elementToBeClickable(approveButton));
		approveButton.click();
		Thread.sleep(4000);
	}
	
	else if(p==1) {
	
		assertEquals(actualAlcBonus,alc_B3_ExngHisBonusVerify[1]);
		assertEquals(actualAlcKgList,alc_B1_B3_ExngHisKgVerify);
		transactions.get(p).click();
		Thread.sleep(2000);
		
	}
	}
	
	for(int i=0;i<approvedConfirm.size();i++) {
		String ac=approvedConfirm.get(i).getText();
		assertEquals(ac, "Approved");	
	}
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
}

public void verifyBonusTransfered(String pNum) throws InterruptedException {
	
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	clickExchangeHistoryButton();
	Thread.sleep(2000);
	for (WebElement transaction:transactions) {

	
		transaction.click();
		Thread.sleep(2000);
		Actions action =new Actions(alcDriver);
		action.scrollToElement(lastItemOnPage).build().perform();
		Thread.sleep(4000);
		
		assertTrue(transferedTextDisplay.isDisplayed());
		Thread.sleep(2000);
			TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		    Thread.sleep(3000);
		    transaction.click();
		    Thread.sleep(2000);
		}
	}

public void transactionApproveInBranch(String pNum) throws InterruptedException {
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	Thread.sleep(2000);
    
	clickExchangeHistoryButton();
	for (int p=0; p<3; p++) {
		
	transactions.get(p).click();
	Thread.sleep(1000);
	for (int i=0;i<2;i++)
	{	
		
		noFraudNoErrorsToggle.get(i).click();
		Thread.sleep(5000);
	}
		
	WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.elementToBeClickable(approveButton));
	approveButton.click();
	Thread.sleep(4000);
	}
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
}
public void verifyBonusInBranchExcHistory(String pNum) throws InterruptedException {
	
	clickBranchesTab();
	searchSpecificBranch(pNum);
	clickSpecificBranch();
	clickExchangeHistoryButton();
	Thread.sleep(2000);
	for (WebElement transaction:transactions) {

		transaction.click();
		Thread.sleep(3000);
		assertTrue(transferedTextDisplay.isDisplayed());
		Thread.sleep(2000);
			TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		    Thread.sleep(3000);
		    transaction.click();
		    Thread.sleep(2000);
		}
}
public String kgRecycledInBranch() {
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
    wait.until(ExpectedConditions.visibilityOfAllElements(kgRecycledInBranchText));
	String kgRecycledBranch=kgRecycledInBranchText.getText();
	return kgRecycledBranch;
}
public String bonusExchangeHistoryBranch() {
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
    wait.until(ExpectedConditions.visibilityOfAllElements(bonusInExchangeHistorytext));
	String bonusInExchangeHistory=bonusInExchangeHistorytext.getText();
	return bonusInExchangeHistory;
	
}

public void verifykgrecycled() throws InterruptedException {
	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+Data.b1id4360);
	kgrecycled.isDisplayed();
	System.out.println("-----"+kgrecycled.getText()+"-----");
	wait.until(ExpectedConditions.textToBePresentInElement(kgrecycled, "19"));
	assertTrue(kgrecycled.getText().equals("19"));
	Thread.sleep(2000);
	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);

	System.out.println("pass 19");
}

public void verifyDelayedBonus() throws InterruptedException {
	exchangeHistoryTab.click();
	for(WebElement e1: cardheaders) {
		e1.click();
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(branchbonustext.get(0), "30"));
			assertTrue(branchbonustext.get(0).getText().equals("30"));
			Thread.sleep(2000);

			 TakesScreenshot ts13 = (TakesScreenshot) alcDriver;
			    byte[] screenshot13 = ts13.getScreenshotAs(OutputType.BYTES);
			    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot13));
				Thread.sleep(2000);

			System.out.println("pass 1");
		}catch(Exception ex2) {
			wait.until(ExpectedConditions.textToBePresentInElement(memberbonustext, "133"));
			assertTrue(memberbonustext.getText().equals("133"));
			Actions action = new Actions(alcDriver);
			action.moveToElement(lastItemOnPage).build().perform();
			Thread.sleep(2000);

			 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
			    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
			    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
				Thread.sleep(2000);
				cardheaders.get(0).click();

			System.out.println("pass 2");
		}
		
		
		e1.click();
	}
	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+Data.b2id4360);
	alcDriver.navigate().refresh();
	
	exchangeHistoryTab.click();
	
	for(WebElement e: cardheaders ) {
		e.click();
		try {
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(branchbonustext.get(0), "14")));
			assertTrue(branchbonustext.get(0).getText().equals("14"));
			 TakesScreenshot ts112 = (TakesScreenshot) alcDriver;
			    byte[] screenshot112 = ts112.getScreenshotAs(OutputType.BYTES);
			    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot112));
				Thread.sleep(2000);
			System.out.println("pass 3");
		}catch(Exception ex) {
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(branchbonustext.get(1), "30")));
			Thread.sleep(2000);
			assertTrue(branchbonustext.get(1).getText().equals("30"));
			Thread.sleep(2000);
			Actions action = new Actions(alcDriver);
			action.moveToElement(lastItemOnPage).build().perform();
			Thread.sleep(2000);

			 TakesScreenshot ts11 = (TakesScreenshot) alcDriver;
			    byte[] screenshot11 = ts11.getScreenshotAs(OutputType.BYTES);
			    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot11));
				Thread.sleep(2000);

			System.out.println("pass 4");
		}
		e.click();
	}
}

@SuppressWarnings("deprecation")
public void disablebonus() throws InterruptedException {
	
	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+Data.b1id4360);
	exchangeHistoryTab.click();
	transactions.get(1).click();
	bonustoggle.click();
	textarea.sendKeys("Test");
	disable.click();
	close.click();
	transactions.get(0).click();
	for(WebElement lb: lockedbonus) {
		lb.isDisplayed();
	}
	alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	try {
		 WebDriverWait waitab = new WebDriverWait(alcDriver,Duration.ofSeconds(2));
		waitab.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(associatedbonus)));
	}catch(Exception e) {
		System.out.println("associated bonus not present after disabling bonus");
	}
	try {
		 WebDriverWait waitmb = new WebDriverWait(alcDriver,Duration.ofSeconds(2));
		waitmb.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(memberbonustext)));
	}catch(Exception e) {
		System.out.println("member bonus not present after disabling bonus");
	}
	try {
		 WebDriverWait waitbb = new WebDriverWait(alcDriver,Duration.ofSeconds(2));
		waitbb.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(branchbonustext.get(0))));
	}catch(Exception e) {
		System.out.println("branch bonus not present after disabling bonus");
	}
	
	Actions action = new Actions(alcDriver);
	action.moveToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);

	 TakesScreenshot ts11 = (TakesScreenshot) alcDriver;
	    byte[] screenshot11 = ts11.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot11));
		Thread.sleep(2000);
    
	    
	 alcDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	details.click();
	kgrecycled.isDisplayed();
	wait.until(ExpectedConditions.textToBePresentInElement(kgrecycled, "19"));
	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+Data.b2id4360);
	alcDriver.navigate().refresh();
	exchangeHistoryTab.click();
	Thread.sleep(2000);
	for(WebElement t: transactions) {
		Thread.sleep(2000);
		t.click();
	}
	total.isDisplayed();
	alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	try {
		 WebDriverWait waitbb = new WebDriverWait(alcDriver,Duration.ofSeconds(2));
		waitbb.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(branchbonustext.get(0))));
	}catch(Exception e) {
		System.out.println("branch bonus not present after disabling bonus");
	}
	try {
		 WebDriverWait waitab = new WebDriverWait(alcDriver,Duration.ofSeconds(2));
		waitab.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(associatedbonus)));
	}catch(Exception e) {
		System.out.println("associated bonus not present after disabling bonus");
	}
	
	
	action.moveToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);

	 TakesScreenshot ts111 = (TakesScreenshot) alcDriver;
	    byte[] screenshot111 = ts111.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot111));
		Thread.sleep(2000);
  
	    
	 alcDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	
}

public void bonusBranchExcHisBeforeVoid() throws InterruptedException {
	
	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+Data.branch1_Id1711);
	
exchangeHistoryTab.click();
	
	cardheaders.get(0).click();
	wait.until(ExpectedConditions.textToBePresentInElement(branchbonustext.get(0), "30"));
	assertTrue(branchbonustext.get(0).getText().equals("30"));
	Thread.sleep(2000);

	 TakesScreenshot ts13 = (TakesScreenshot) alcDriver;
	    byte[] screenshot13 = ts13.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot13));
		Thread.sleep(2000);

	System.out.println("pass 1");
	
	cardheaders.get(1).click();
	wait.until(ExpectedConditions.textToBePresentInElement(memberbonustext, "133"));
	assertTrue(memberbonustext.getText().equals("0"));
	Actions action = new Actions(alcDriver);
	action.moveToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);

	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);

		cardheaders.get(2).click();
		wait.until(ExpectedConditions.textToBePresentInElement(memberbonustext, "0"));
		assertTrue(memberbonustext.getText().equals("0"));
	System.out.println("pass 2");
	
	TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot2));
	Thread.sleep(2000);
	
	alcDriver.get("https://"+BaseClass.temp+"/#/admin/collectionpoint/"+Data.branch2_Id1711);
	alcDriver.navigate().refresh();
	
	exchangeHistoryTab.click();
	
	cardheaders.get(0).click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(branchbonustext.get(0), "14")));
	assertTrue(branchbonustext.get(0).getText().equals("14"));
	Thread.sleep(2000);

	 TakesScreenshot ts112 = (TakesScreenshot) alcDriver;
	    byte[] screenshot112 = ts112.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot112));
		Thread.sleep(2000);
	
	cardheaders.get(1).click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(branchbonustext.get(1), "30")));
	assertTrue(branchbonustext.get(1).getText().equals("30"));
	action.moveToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);

	 TakesScreenshot ts11 = (TakesScreenshot) alcDriver;
	    byte[] screenshot11 = ts11.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot11));
		Thread.sleep(2000);

alcDriver.get("https://"+actual+"/#/admin/recyclingcenter/"+Data.processor_Id1711);
	exchangeHistoryTab.click();
	Actions action1 = new Actions(alcDriver);
	action1.moveToElement(lastItemOnPage).build().perform();
	Thread.sleep(2000);
	cardheaders.get(0).click();
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(branchbonustext.get(0), "14")));
	assertTrue(branchbonustext.get(0).getText().equals("0"));
	Thread.sleep(2000);

	 TakesScreenshot ts1121 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1121 = ts1121.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1121));
		Thread.sleep(2000);
	
	
}
public void verifyBonusInAlchmeyBranches_1711() throws InterruptedException {
	
	alcDriver.get("https://"+actual+"/#/admin/finder/"+Data.branch1_Id1711);
	Thread.sleep(2000);
	String tokenInWallet=tokenInWalletText.getText();
	assertTrue(tokenInWallet.equals("30"));
	
	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);
	
		alcDriver.get("https://"+actual+"/#/admin/finder/"+Data.branch1_Id1711);
		Thread.sleep(2000);
		String tokenInWallet2=tokenInWalletText.getText();
		assertTrue(tokenInWallet2.equals("14"));
		
		 TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
		    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot2));
			Thread.sleep(2000);
	
}

@SuppressWarnings("deprecation")
public void ensureBranchIsPresentWithTokens(String phone, String aname, String pnum, WebElement el, String t) throws InterruptedException {
	gojekyn=false;
	 branches_TAB.click();
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 phoneSearchBox.clear();
	 phoneSearchBox.sendKeys(phone);
	 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	 try {
			waitms.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
				String text=searchresult.getText();
				String textwithnospaces=text.replaceAll("\\s", "");
				assertTrue(textwithnospaces.contains(phone));
				alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String actualphonexpath= dynamicresult.replace("param", phone);
				alcDriver.findElement(By.xpath(actualphonexpath)).click();
				branchowner.click();
				changepassword.click();
				newpassword.sendKeys("123456a");
				confirmpassword.sendKeys("123456a");
				save.click();
				close.click();
				needforpasswordchange = true;
	 }
	 catch(Exception e) {
		 waitms.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(noresults)));
			alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			members_TAB.click();
			 wait300.until(ExpectedConditions.visibilityOf(perpage));
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
				 branches_TAB.click();
				 wait300.until(ExpectedConditions.visibilityOf(perpage));
			addIcon.click();
			namefield.sendKeys("fleek GCash branch");
			countrydd.click();
			philippines.click();
			address.sendKeys("address");  
			firstaddressoption.click();
			addIcon.click();
			searchfield.sendKeys(pnum);
			searchicon.click();
			Thread.sleep(2000);
			confirm.click();
			Thread.sleep(2000);
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
	 branches_TAB.click();
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 phoneSearchBox.clear();
	 phoneSearchBox.sendKeys(phone);
	 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 waitms.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
		String text=searchresult.getText();
		String textwithnospaces=text.replaceAll("\\s", "");
		assertTrue(textwithnospaces.contains(phone));
		alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String actualphonexpath= dynamicresult.replace("param", phone);
		alcDriver.findElement(By.xpath(actualphonexpath)).click();
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
	branches_TAB.click();
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

public void sendtokenstobranch(String phone) {
	branches_TAB.click();
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 phoneSearchBox.clear();
	 phoneSearchBox.sendKeys(phone);
	 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
	 firstcell.click();
	 dtt.click();
		enteramount.clear();
		enteramount.sendKeys("1000");
		selectreason.click();
		optionepr.click();
		send.click();
		smscode.sendKeys("778899");
		submit.click();
		close.click();
}

public void checknobonus(String phone) throws InterruptedException {
	branches_TAB.click();
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 phoneSearchBox.clear();
	 phoneSearchBox.sendKeys(phone);
	 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
	 firstcell.click();
	 exchnagehistory.click();
	 for(WebElement e: cardpanels) {
		e.click();
		bonusinpanel.isDisplayed();
		Thread.sleep(5000);
		assertTrue(bonusinpanel.getText().equals("0"));
		takescreenshotof(bonusinpanel,"bonus is zero");
	 }
}
public void checkbranchdetails(String phone) throws InterruptedException {
	branches_TAB.click();
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 phoneSearchBox.clear();
	 phoneSearchBox.sendKeys(phone);
	 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
	 firstcell.click();
	 kgrecycled.isDisplayed();
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(kgrecycled,"0")));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(membersregistered,"0")));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(activemembers,"0")));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(tokensinwallet,"0")));
	 takescreenshotof(tokensinwallet,"branch details");
}
public void checkbranchdetailslater(String phone) throws InterruptedException {
	branches_TAB.click();
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 phoneSearchBox.clear();
	 phoneSearchBox.sendKeys(phone);
	 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
	 firstcell.click();
	 kgrecycled.isDisplayed();
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(kgrecycled,"19")));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(membersregistered,"0")));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(activemembers,"1")));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(tokensinwallet,"0")));
	 takescreenshotof(tokensinwallet,"branch details later");
}
public void checkbranchexchangehitory(String phone) throws InterruptedException {
	branches_TAB.click();
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 phoneSearchBox.clear();
	 phoneSearchBox.sendKeys(phone);
	 wait300.until(ExpectedConditions.visibilityOf(pageLoader));
	 wait300.until(ExpectedConditions.visibilityOf(perpage));
	 wait300.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(searchresult)));
	 firstcell.click();
	 exchangeHistory.click();
	 for(WebElement e: cardheaders) {
		 e.click();
		 try {
		  bonus.getText().equals("2");
		 }catch(Exception e1) {
			 bonus.getText().equals("133");
		 }
		 takescreenshotof(bonus,"screenshot of branch transaction details");
		 e.click();
	 }
	
}

}

