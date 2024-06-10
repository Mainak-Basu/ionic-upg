package alchemy_Pages;

	import static org.testng.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
    import Utilities.BaseClass;
import io.qameta.allure.Allure;


	public class Processors  extends BaseClass{
		
	public Processors(WebDriver alcDriver) {
	
		PageFactory.initElements(alcDriver, this);
	}
	@FindBy(xpath ="//div[@class ='loader circle-loader']")
	public WebElement circleLoader;
	@FindBy(xpath="//div[@class='sidebar p-4']/div[contains(text(),'Processors')]")
	public WebElement processors_TAB;
	@FindBy(xpath ="//input[@placeholder='Phone']")
	public WebElement phoneSearch;
	@FindBy(xpath="//span[text()='Edit']") 
	@CacheLookup public WebElement edit;
	@FindBy(xpath ="//input[@name='name']")
	public WebElement editNameField;
	@FindBy(xpath="//div[contains(text(),'Save')]")
	public WebElement save;
	@FindBy(xpath="//div[contains(text(),'Gayas')]")
	public WebElement latestProcessorAdded;
	@FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
	private WebElement tableData_FirstRow;
	@FindBy(xpath = "//a[text()='Exchange History']")
	private WebElement exchangeHistory;
	@FindBy(xpath = "//div[@class='card-header']/div/button")
	List<WebElement> transactions;//div[@class='card-header']
	
	@FindBy(xpath = "//div[@class='text-natural-green']")
	WebElement branchBonusTextInAlchmeyVerify;
	
	@FindBy(xpath = "//*[text()='Plastik-HDPE-Clean-Clear']/parent::div/div[2]")
	WebElement hdpeKgAlcText;
	@FindBy(xpath = "//*[text()='Plastik-PET-Raw-Transparent']/parent::div/div[2]")
	WebElement petKgAlcText;
	@FindBy(xpath = "//div[text()='TOTAL']/following-sibling::div")
	WebElement totalKgAlcText;
	@FindBy(xpath = "//div[@class='disable-btn approve-true-state']")
	WebElement approveButton;

	@FindBy(xpath = "//div[@class='card-header']/div/div[1]/button")
	List<WebElement> approvedConfirm;

	@FindBy(xpath = "//li[contains(@class,'page-item')]")
	WebElement lastItemOnPage;
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
    @FindBy(xpath = "//button[text()='Close']")
    WebElement close;
    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement phoneSearchBox;
    @FindBy(xpath="//span[text()='PER PAGE:']")
    public WebElement perpage;
    @FindBy(xpath="//tr/td/div/div[contains(text(),'+')]")
    public WebElement searchresult;
    @FindBy(xpath="//tr/td")
    public WebElement firstcell;
    @FindBy(xpath = "//loader/div//table")
    WebElement pageLoader;
    @FindBy(xpath = "//div[@class='loader circle-loader']") 
    WebElement loader;
    @FindBy(xpath = "//div[@class='card-header']")
    List<WebElement> cardheaders;
    @FindBy(xpath="//label[contains(text(),'Bonus')]/following-sibling::div/div")
    public WebElement bonus;

    
    
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
	

public void clickSpecificProcessor() throws InterruptedException {
	waitforloader();
	tableData_FirstRow.click();
	
}
public void clickExchangeHistoryButton() {
	exchangeHistory.click();
}
	public void SearchAndEditProcessorInAlchemy(String numberToBeEdited) throws InterruptedException {
		processors_TAB.click();
		wait300.until(ExpectedConditions.visibilityOf(pageLoader));
   	 wait300.until(ExpectedConditions.visibilityOf(perpage));
		phoneSearch.clear();
		phoneSearch.sendKeys(numberToBeEdited);
		wait300.until(ExpectedConditions.visibilityOf(pageLoader));
   	 wait300.until(ExpectedConditions.visibilityOf(perpage));
   	 Thread.sleep(2000);
		latestProcessorAdded.click();
		 Thread.sleep(2000);
		edit.click();
		editNameField.clear();
		editNameField.sendKeys("Mainak processor "+RandomStringUtils.randomAlphabetic(5));
		Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
		save.click();
	}
	
	public void transactionApproveExcHisP1(String pNum) throws InterruptedException {
		processors_TAB.click();
		wait300.until(ExpectedConditions.visibilityOf(pageLoader));
   	 wait300.until(ExpectedConditions.visibilityOf(perpage));
		phoneSearch.clear();
		phoneSearch.sendKeys(pNum);
		clickSpecificProcessor();
		clickExchangeHistoryButton();
		Thread.sleep(2000);
		for (int p=0; p<=1; p++) {		
			transactions.get(p).click();
			Thread.sleep(1000);
		
			String actualAlcBonus= branchBonusTextInAlchmeyVerify.getText();
			String actualAlcKgList[] = {hdpeKgAlcText.getText(),petKgAlcText.getText(),totalKgAlcText.getText()};
			
		
		
		if(p==0) { 
			assertEquals(alc_P_ExngHisBonusVerify[0],actualAlcBonus );
			assertEquals(alc_B3_P_ExngHisKgVerify,actualAlcKgList);
		}
		else if(p==1) {
			assertEquals(alc_P_ExngHisBonusVerify[1],actualAlcBonus );
			assertEquals(alc_B2_P_ExngHisKgVerify,actualAlcKgList);
		}
		transactions.get(p).click();
		Thread.sleep(3000);
		}	
		
		for(int i=0;i<approvedConfirm.size();i++) {
			
			String ac=approvedConfirm.get(i).getText();
			assertEquals(ac, "Approved");	
		}
		  Thread.sleep(2000);
		  Actions actions1 =new Actions(alcDriver);
			actions1.scrollToElement(lastItemOnPage).build().perform();
			Thread.sleep(2000);
		    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
		    Thread.sleep(2000);
	}
	
	
	
	
	
	public void sendtokenstoprocessor(String phone) {
		processors_TAB.click();
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
	
	public void checkprocessorexchangehistory(String phone) throws InterruptedException {
		processors_TAB.click();
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
		 takescreenshotof(bonus,"screenshot of processor transaction details");
		 e.click();
	 }
   	 
	}
}
