package alchemy_Pages;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.BaseClass;
import Utilities.Data;
import io.qameta.allure.Allure;

public class Bonus extends BaseClass {
	
	public Bonus(WebDriver alcDriver){
        PageFactory.initElements(alcDriver, this);
    }

@FindBy(xpath="//div[text()=\"Bonus Approval \"]")
public WebElement 	bonusApprovalButton ;

@FindBy(xpath="//div[@class='card-header']//button")
public List<WebElement> branchButton;

@FindBy(xpath="(//div[contains(@class,\"section-white-container\")])[3]//div/span")
public List<WebElement> totalBonusValues;

@FindBy(xpath="//transaction-item//div[@class=\"row\"]/div[3]//div[contains(translate(text(),'kg','KG'),'KG')]")
public List<WebElement> kgTransactions;

@FindBy(xpath="//transaction-item//div[@class=\"row\"]/div[3]//span")
public List<WebElement> bonusBuyTransactions;


@FindBy(xpath="//a[contains(text(),\"Sell Transactions\")]")
public WebElement  sellTransactionsButton ;

@FindBy(xpath="//div[contains(text(),\"Sell Transactions\")]")
public WebElement  sellTransactionsTagAuditTrail ;


@FindBy(xpath="//div[text()=\" Total Bonus \"]")
public WebElement totalBonusTitle ;

@FindBy(xpath="//button/span[text()=\"View Audit Trail\"]")
public WebElement viewAuditTrail ;

@FindBy(xpath="//span[contains(text(),\"Verify Receipts\")]")
public WebElement verifyReceiptsButton ;
@FindBy(xpath="//div[text()=\"Approve\"]")
public List<WebElement> approveRecipt;

@FindBy(xpath="//button[text()=\"Cancel\"]")
public WebElement cancelButton ;

@FindBy(xpath="//button[text()=\"OK\"]")
public WebElement okButton ;

@FindBy(xpath="//button[text()=\"Confirm\"]")
public WebElement confirmButton ;

@FindBy(xpath="//div[text() = \" Total Branch Bonus \"]")
public WebElement totalBranchBonus ;

@FindBy(xpath="//label[text()=\"Bonuses Paid\"]")
public WebElement bonusPaidText ;

@FindBy(xpath="//button[@aria-label=\"Close\"]/span")
public WebElement closeButton ;

@FindBy(xpath="//button/span[text()=\"Start Approval\"]")
public WebElement startApprovalButton ;

@FindBy(xpath="//div[@class='card-header']/descendant::input[@type='checkbox']/following-sibling::span")
public List<WebElement> checkMarkButton ;

@FindBy(xpath="//span[text()=\"Pay Bonuses\"]")
public WebElement payBonusButton ;

@FindBy(xpath="//li/a[contains(text(),\"Buy Transactions\")]")
public WebElement buyTransactionsButton;

//
@FindBy(xpath="//div[contains(text(),' Total Bonus')]/following-sibling::div/div/span")
public List<WebElement> bonusApprovalTotalBonusAssertion;

@FindBy(xpath="//div[contains(text(),' Needing Approval')]/following-sibling::div/div/span")
public List<WebElement> bonusApprovalNeedingApprovalAssertion;

@FindBy(xpath = "//div[text()='Exchange History ']") 
WebElement excHisHdpeKG;
//HDPE-Clean-Clear / 10.00 kg
@FindBy(xpath = "//div[text()='PET-Raw-Transparent / 9.00 kg']") 
WebElement excHisPetKG;
//PET-Raw-Transparent / 9.00 kg

@FindBy(xpath = "//div[text()='HDPE-Clean-Clear / 10.00 kg']/following-sibling::div/span") 
WebElement excHisHdpeBonus;
//Bonus 70
@FindBy(xpath = "//div[text()='PET-Raw-Transparent / 9.00 kg']/following-sibling::div/span") 
WebElement excHisPetBonus;
//Bonus 63

@FindBy(xpath = "(//div[contains(text(),'Total Weight')])") 
WebElement excHisTotalKg;
//Total Weight: 19.00 KG
@FindBy(xpath = "//div[text()='Bonus']") 
WebElement excHisTotalBonus;

@FindBy(xpath="//transaction-item//div[contains(@class,\"row\")]//div[contains(text(),'HDPE')or(contains(text(),'PET'))or(contains(text(),'Total Weight'))]")
public List<WebElement> kgVerifyUnverifiedReciept;

@FindBy(xpath="//span[contains(@class,'text-green')]")
public List<WebElement> bonusVerifyUnverifiedReciept;

@FindBy(xpath="//div[text()=\"Bonus\"]/following-sibling::div")
public List<WebElement> bonusBuyTotalValue ;

@FindBy(xpath="(//div[contains(@class,\"section-white-container\")])[3]/div[contains(text(),\"kg\")]")
public List<WebElement> sellTransactionsWeight ;

@FindBy(xpath="(//div[contains(@class,\"section-white-container\")])[4]/div/div/parent::div")
public List<WebElement> sellTransactionsBonus ;
@FindBy(xpath = "//button[text()=' Bonus & Impact Program']/following-sibling::button[1]") 
WebElement bonusNameLink;
@FindBy(xpath = "//loader/div//table")
WebElement pageLoader;
@FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
WebElement tableData_FirstRow;
@FindBy(xpath = "//datatable//input[@placeholder='Name']")
WebElement name_SearchBox;
@FindBy(xpath = "//div[@class='body']/div/div/div[text()=' Orders ']")
WebElement orders_tab;
@FindBy(xpath = "//a[@role='tab' and text()='Bonus']")
WebElement ordersTab_bonus;
@FindBy(xpath = "//a[text()='Buy Transactions (0)']")
WebElement buyTransactionTag;
@FindBy(xpath = "//label[text()=' Select Equivalent ']/input")
WebElement selectEquivalentCheckBox;
@FindBy(xpath="//button[text()='Approved']")
public List<WebElement> approvedTextInBonusApproval ;
@FindBy(xpath = "//div[@class='loader circle-loader']") 
WebElement loader;


public static String expectedexcHisHdpeKG="HDPE-Clean-Clear / 10.00 kg";
public static String expectedexcHisPetKG="PET-Raw-Transparent / 9.00 kg";
public static String expectedexcHisHdpeBonus="Bonus 70";
public static String expectedexcHisPetBonus="Bonus 63";
public static String expectedexcHisTotalKg="Total Weight: 19.00 KG";
public static String expectedexcHisTotalBonus="133";


private void clickOrdersTab() throws InterruptedException {
    Thread.sleep(4000);
    WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
    wait.until(ExpectedConditions.elementToBeClickable(orders_tab));
    orders_tab.click();
}
private void clickBounsTab() throws InterruptedException {
    Thread.sleep(2000);
    ordersTab_bonus.click();
}

@SuppressWarnings("deprecation")
public void waitforloader() {
	boolean ispresent= true;
	alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	while(ispresent) {
		try {
			loader.click();
		}catch(Exception e) {
			ispresent=false;
		}
	}
	alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
}
private void search_byName(String name) throws InterruptedException {
   waitforloader();
    name_SearchBox.click();
    name_SearchBox.clear();
    name_SearchBox.sendKeys(name);
    Thread.sleep(8000);
}
private void clickSpecificOrdersBonus() {
   waitforloader();
    tableData_FirstRow.click();
}

public void bounusTransaction1ValueVerify() throws InterruptedException {
	
	/*clickOrdersTab();
	clickBounsTab();
	search_byName(bonusName);
	clickSpecificOrdersBonus();*/
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
	Orders.clickBonusApprovalTab();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(0).click();
	
	
	ArrayList<String>expectedBonusApprovalTotalBonusArray =new ArrayList<>();
	expectedBonusApprovalTotalBonusArray.add("0 %");
	expectedBonusApprovalTotalBonusArray.add("1");
	expectedBonusApprovalTotalBonusArray.add("0 KG");
	expectedBonusApprovalTotalBonusArray.add("0 KG");
	expectedBonusApprovalTotalBonusArray.add("0 = $0.00");
	expectedBonusApprovalTotalBonusArray.add("0 = $0.00");
	
	
	ArrayList<String>expectedBonusApprovalNeedingApprovalArray =new ArrayList<>();
	expectedBonusApprovalNeedingApprovalArray.add("0%");
	expectedBonusApprovalNeedingApprovalArray.add("1");
	expectedBonusApprovalNeedingApprovalArray.add("19 KG");//////////76-38
	expectedBonusApprovalNeedingApprovalArray.add("0 KG");
	expectedBonusApprovalNeedingApprovalArray.add("133 = $1.33");
	expectedBonusApprovalNeedingApprovalArray.add("0 = $0.00");
	
	
	ArrayList<String> actualBonusApprovalTotalBonusArray = new ArrayList<>(); // branch one all 6 bonus values
	ArrayList<String> actualBonusApprovalNeedingApprovalArray = new ArrayList<>();
	
	for (WebElement element1 :bonusApprovalTotalBonusAssertion) {
		actualBonusApprovalTotalBonusArray.add(element1.getText());
	}
	Assert.assertEquals(actualBonusApprovalTotalBonusArray, expectedBonusApprovalTotalBonusArray);
	
	for (WebElement element2 :bonusApprovalNeedingApprovalAssertion) {
		actualBonusApprovalNeedingApprovalArray.add(element2.getText());
	}
	Assert.assertEquals(actualBonusApprovalNeedingApprovalArray, expectedBonusApprovalNeedingApprovalArray);
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
}


public void bonusBranch1Verification() throws InterruptedException {
	
	clickOrdersTab();
	clickBounsTab();
	search_byName(Data.bonusName);
	clickSpecificOrdersBonus();
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(bonusApprovalButton));
	bonusApprovalButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(0).click();
	

	wait.until(ExpectedConditions.elementToBeClickable(verifyReceiptsButton));
	verifyReceiptsButton.click();
	Thread.sleep(3000);
	//wait.until(ExpectedConditions.elementToBeClickable(approveRecipt.get(0)));
	
	Set<String>expectedBranchOneRecieptKgB1 = new HashSet<>(Arrays.asList("PET- / 5.00 kg", "HDPE- / 6.00 kg",  "Total Weight: 11.00 KG","PET- / 7.00 kg","HDPE- / 8.00 kg","Total Weight: 15.00 KG","PET- / 9.00 kg","HDPE- / 10.00 kg","Total Weight: 19.00 KG"));
	Set<String>expectedBranchOneReciptBonusB1 = new HashSet<>(Arrays.asList("Bonus 4", "Bonus 4","Bonus 16","Bonus 14","Bonus 63","Bonus 70"));
	ArrayList<String>expectedBranchOneReciptTotalBonusB1 = new ArrayList<>(Arrays.asList("8", "30", "133"));

	
	Set<String> actualBranchOneRecieptKgB1 = new HashSet<>();   // branch one all 9 kg values
	Set<String> actualBranchOneRecieptBonusB1 = new HashSet<>(); 
	ArrayList<String> actualBranchOneRecieptTotalBonusB1 = new ArrayList<>(); 
	
	
	for (WebElement element : kgVerifyUnverifiedReciept) {
		actualBranchOneRecieptKgB1.add(element.getText());
	}

	for (WebElement element : bonusVerifyUnverifiedReciept) {
		actualBranchOneRecieptBonusB1.add(element.getText());
	}
	
	for (WebElement element : bonusBuyTotalValue) {
		actualBranchOneRecieptTotalBonusB1.add(element.getText());
	}
	
	Assert.assertEquals(actualBranchOneRecieptKgB1, expectedBranchOneRecieptKgB1);
	Assert.assertEquals(actualBranchOneRecieptBonusB1, expectedBranchOneReciptBonusB1);
	Assert.assertEquals(actualBranchOneRecieptTotalBonusB1, expectedBranchOneReciptTotalBonusB1);
	  Thread.sleep(2000);
	
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
	

	// for all receipts
	try {
		for (int i = 1; i <= 3; i++) {
			approveRecipt.get(0).click();
			Thread.sleep(2000);
			okButton.click();
			Thread.sleep(2000);
		}
	} catch (Exception e) {
		System.out.println("Exception caught: " + e.getMessage());
	}


	wait.until(ExpectedConditions.elementToBeClickable(closeButton));
	closeButton.click();

	
	ArrayList<String>expectedBranchOnesellTransactionsWeightB1 = new ArrayList<>(Arrays.asList("0 kg", "19 kg"));
	ArrayList<String>expectedBranchOnesellTransactionsBonusB1 = new ArrayList<>(Arrays.asList("0", "38", "38"));
	ArrayList<String>expectedOneBuyTransactionsWeightB1 = new ArrayList<>(Arrays.asList("19 kg", "19 kg"));
	ArrayList<String>expectedOneBuyTransactionsBonusB1 = new ArrayList<>(Arrays.asList("133", "38", "171"));
	
	ArrayList<String> actualBranchOnesellTransactionsWeightB1 = new ArrayList<>(); 
	ArrayList<String> actualBranchOnesellTransactionsBonusB1 = new ArrayList<>(); 
	
	ArrayList<String> actualBranchOneBuyTransactionsWeightB1 = new ArrayList<>(); 
	ArrayList<String> actualBranchOneBuyTransactionsBonusB1 = new ArrayList<>(); 

	
	wait.until(ExpectedConditions.elementToBeClickable(startApprovalButton));
	startApprovalButton.click();
	
	Thread.sleep(10000);
	wait.until(ExpectedConditions.elementToBeClickable(buyTransactionsButton));
	buyTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(sellTransactionsButton));
	sellTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfAllElements(checkMarkButton));
	for(WebElement checkMarkButtons :checkMarkButton ) {
		 Actions actions = new Actions(alcDriver);
	     actions.moveToElement(checkMarkButtons).click().build().perform();	
	}
	
	Thread.sleep(3000);
	
//	sellTransactionsWeight

	for (WebElement element : sellTransactionsWeight) {
		actualBranchOnesellTransactionsWeightB1.add(element.getText());
	}
	
	for (WebElement element : sellTransactionsBonus) {
		actualBranchOnesellTransactionsBonusB1.add(element.getText());
	}
	
	Assert.assertEquals(actualBranchOnesellTransactionsWeightB1, expectedBranchOnesellTransactionsWeightB1);
	Assert.assertEquals(actualBranchOnesellTransactionsBonusB1, expectedBranchOnesellTransactionsBonusB1);
	
	  Thread.sleep(2000);
	    TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
	    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot2));
	    Thread.sleep(2000);
	    
    buyTransactionsButton.click();
    Thread.sleep(2000);
    Actions actions1 = new Actions(alcDriver);
    actions1.moveToElement(selectEquivalentCheckBox).click().build().perform();
   	 
    Thread.sleep(3000);
	
	for (WebElement element3 : sellTransactionsWeight) {
		actualBranchOneBuyTransactionsWeightB1.add(element3.getText());
	}
	
	for (WebElement element4 : sellTransactionsBonus) {
		actualBranchOneBuyTransactionsBonusB1.add(element4.getText());
	}
	
	Assert.assertEquals(actualBranchOneBuyTransactionsWeightB1, expectedOneBuyTransactionsWeightB1);
	Assert.assertEquals(actualBranchOneBuyTransactionsBonusB1, expectedOneBuyTransactionsBonusB1);

	
	   	 
	  Thread.sleep(2000);
	    TakesScreenshot ts3 = (TakesScreenshot) alcDriver;
	    byte[] screenshot3 = ts3.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot3", new ByteArrayInputStream(screenshot3));
	    Thread.sleep(2000);
	    
	wait.until(ExpectedConditions.elementToBeClickable(payBonusButton));
	payBonusButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
	confirmButton.click();
	
	wait.until(ExpectedConditions.visibilityOf(bonusPaidText));
	
	Actions actions = new Actions(alcDriver);
    actions.moveToElement(bonusNameLink).click().build().perform();	
	Thread.sleep(2000);
	bonusNameLink.click();
	
	wait.until(ExpectedConditions.visibilityOf(bonusApprovalButton));
	bonusApprovalButton.click();

}

public void bonusBranch2Verification() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(60));

	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(1)));
	branchButton.get(1).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(verifyReceiptsButton));

	verifyReceiptsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(approveRecipt.get(0)));
	
	Set<String>expectedBranchTwoReciptKgB2 = new HashSet<>(Arrays.asList("PET- / 3.00 kg", "HDPE- / 4.00 kg", "Total Weight: 7.00 KG"));
	Set<String>expectedBranchTwoReciptBonusB2 = new HashSet<>(Arrays.asList("Bonus 6", "Bonus 8"));
	ArrayList<String>expectedBranchTwoReciptTotalBonusB2 = new ArrayList<>(Arrays.asList("14"));
	ArrayList<String>expectedBranchTwosellTransactionsWeightB2 = new ArrayList<>(Arrays.asList("0 kg", "7 kg"));
	ArrayList<String>expectedBranchTwosellTransactionsBonusB2 = new ArrayList<>(Arrays.asList("0", "14", "14"));
	
	Set<String> actualBranchTwoReciptKgB2 = new HashSet<>();   // branch Two all 3 kg values
	Set<String> actualBranchTwoReciptBonusB2 = new HashSet<>(); 
	ArrayList<String> actualBranchTwoReciptTotalBonusB2 = new ArrayList<>(); //1 value
	
	ArrayList<String> actualBranchTwosellTransactionsWeightB2 = new ArrayList<>(); 
	ArrayList<String> actualBranchTwosellTransactionsBonusB2 = new ArrayList<>(); 

	
	for (WebElement element11 : kgVerifyUnverifiedReciept) {
		actualBranchTwoReciptKgB2.add(element11.getText());
	}

	for (WebElement element22 : bonusVerifyUnverifiedReciept) {
		actualBranchTwoReciptBonusB2.add(element22.getText());
	}
	
	for (WebElement element : bonusBuyTotalValue) {
		actualBranchTwoReciptTotalBonusB2.add(element.getText());
	}
	Thread.sleep(2000);
	Assert.assertEquals(actualBranchTwoReciptKgB2, expectedBranchTwoReciptKgB2);
	Assert.assertEquals(actualBranchTwoReciptBonusB2, expectedBranchTwoReciptBonusB2);
	Assert.assertEquals(actualBranchTwoReciptTotalBonusB2, expectedBranchTwoReciptTotalBonusB2);
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
	try {
			approveRecipt.get(0).click();
			Thread.sleep(2000);
			okButton.click();
			Thread.sleep(2000);
			
	} catch (Exception e) {
		System.out.println("Exception caught: " + e.getMessage());
	}


	wait.until(ExpectedConditions.elementToBeClickable(closeButton));
	closeButton.click();
	
	wait.until(ExpectedConditions.elementToBeClickable(startApprovalButton));
	startApprovalButton.click();
	
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfAllElements(checkMarkButton));
	for(WebElement checkMarkButtons :checkMarkButton ) {
		 Actions actions = new Actions(alcDriver);
	     actions.moveToElement(checkMarkButtons).click().build().perform();		
	}
	
	for (WebElement element5 : sellTransactionsWeight) {
		actualBranchTwosellTransactionsWeightB2.add(element5.getText());
	}
	
	for (WebElement element6 : sellTransactionsBonus) {
		actualBranchTwosellTransactionsBonusB2.add(element6.getText());
	}
	Thread.sleep(2000);
	
	Assert.assertEquals(actualBranchTwosellTransactionsWeightB2, expectedBranchTwosellTransactionsWeightB2);
	Assert.assertEquals(actualBranchTwosellTransactionsBonusB2, expectedBranchTwosellTransactionsBonusB2);

	
	   	 
	  Thread.sleep(2000);
	    TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
	    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
	    Thread.sleep(2000);
	    
	wait.until(ExpectedConditions.elementToBeClickable(payBonusButton));
	payBonusButton.click();

	wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
	confirmButton.click();


	wait.until(ExpectedConditions.visibilityOf(bonusPaidText));
	
	Actions actions = new Actions(alcDriver);
    actions.moveToElement(bonusNameLink).click().build().perform();	
	Thread.sleep(2000);
	bonusNameLink.click();
	Thread.sleep(4000);
	//wait.until(ExpectedConditions.invisibilityOf(pageLoader));
	bonusApprovalButton.click();

}
public void bonusBranch3Verification() throws InterruptedException {
	
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
	
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(2)));
	branchButton.get(2).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(verifyReceiptsButton));

	verifyReceiptsButton.click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(approveRecipt.get(0)));
	
	Set<String>expectedBranchThreeReciptKgB3 = new HashSet<>(Arrays.asList("PET- / 1.00 kg", "HDPE- / 1.00 kg", "Total Weight: 2.00 KG"));
	ArrayList<String>expectedBranchThreeReciptBonusB3 = new ArrayList<>(Arrays.asList("Bonus 2", "Bonus 2"));
	ArrayList<String>expectedBranchThreeReciptTotalBonusB3 = new ArrayList<>(Arrays.asList("4"));
	ArrayList<String>expectedBranchThreesellTransactionsWeightB3 = new ArrayList<>(Arrays.asList("0 kg", "2 kg"));
	ArrayList<String>expectedBranchThreesellTransactionsBonusB3 = new ArrayList<>(Arrays.asList("0", "4", "4"));
	
	Set<String> actualBranchThreeReciptKgB3 = new HashSet<>();   // branch Two all 3 kg values
	ArrayList<String> actualBranchThreeReciptBonusB3 = new ArrayList<>(); 
	ArrayList<String> actualBranchThreeReciptTotalBonusB3 = new ArrayList<>(); //1 value
	
	ArrayList<String> actualBranchThreesellTransactionsWeightB3 = new ArrayList<>(); 
	ArrayList<String> actualBranchThreesellTransactionsBonusB3 = new ArrayList<>();  

	Thread.sleep(2000);
	for (WebElement element111 : kgVerifyUnverifiedReciept) {
		actualBranchThreeReciptKgB3.add(element111.getText());
}

	for (WebElement element222 : bonusVerifyUnverifiedReciept) {
		actualBranchThreeReciptBonusB3.add(element222.getText());
	}
	
	for (WebElement element : bonusBuyTotalValue) {
	actualBranchThreeReciptTotalBonusB3.add(element.getText());
	}
	Thread.sleep(2000);
	Assert.assertEquals(actualBranchThreeReciptKgB3, expectedBranchThreeReciptKgB3);
	Assert.assertEquals(actualBranchThreeReciptBonusB3, expectedBranchThreeReciptBonusB3);
	Assert.assertEquals(actualBranchThreeReciptTotalBonusB3, expectedBranchThreeReciptTotalBonusB3);
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
		approveRecipt.get(0).click();
		Thread.sleep(2000);
		okButton.click();
		Thread.sleep(2000);
		

	wait.until(ExpectedConditions.elementToBeClickable(closeButton));
	closeButton.click();
	
	wait.until(ExpectedConditions.elementToBeClickable(startApprovalButton));
	startApprovalButton.click();
	Thread.sleep(7000);
	wait.until(ExpectedConditions.elementToBeClickable(buyTransactionsButton));
	Thread.sleep(7000);
	buyTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(sellTransactionsButton));
	sellTransactionsButton.click();
	
	wait.until(ExpectedConditions.visibilityOfAllElements(checkMarkButton));
	
	for(WebElement checkMarkButtons :checkMarkButton ) {
	 Actions actions = new Actions(alcDriver);
     actions.moveToElement(checkMarkButtons).click().build().perform();	
	}
	
	for (WebElement element7 : sellTransactionsWeight) {
		actualBranchThreesellTransactionsWeightB3.add(element7.getText());
	}
	
	for (WebElement element8 : sellTransactionsBonus) {
		actualBranchThreesellTransactionsBonusB3.add(element8.getText());
	}
	Thread.sleep(2000);
	Assert.assertEquals(actualBranchThreesellTransactionsWeightB3, expectedBranchThreesellTransactionsWeightB3);
	Assert.assertEquals(actualBranchThreesellTransactionsBonusB3, expectedBranchThreesellTransactionsBonusB3);

	  Thread.sleep(2000);
	    TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
	    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot2));
	    Thread.sleep(2000);

	wait.until(ExpectedConditions.elementToBeClickable(payBonusButton));
	payBonusButton.click();

	wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
	confirmButton.click();


	wait.until(ExpectedConditions.visibilityOf(bonusPaidText));
	
	Actions actions = new Actions(alcDriver);
    actions.moveToElement(bonusNameLink).click().build().perform();	
	Thread.sleep(2000);
	//wait.until(ExpectedConditions.visibilityOf(bonusNameLink));
	bonusNameLink.click();
	Thread.sleep(4000);
	
}



public void bonusBranch1ValueVerification() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(bonusApprovalButton));
	bonusApprovalButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(0).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOf(totalBonusTitle));
	
	ArrayList<String>expectedBonusApprovalTotalBonusArrayB1 =new ArrayList<>();
	expectedBonusApprovalTotalBonusArrayB1.add("100 %");
	expectedBonusApprovalTotalBonusArrayB1.add("1");
	expectedBonusApprovalTotalBonusArrayB1.add("19 KG");
	expectedBonusApprovalTotalBonusArrayB1.add("19 KG");
	expectedBonusApprovalTotalBonusArrayB1.add("133 = $1.33");
	expectedBonusApprovalTotalBonusArrayB1.add("38 = $0.38");
	
	
	ArrayList<String>expectedBonusApprovalNeedingApprovalArrayB1 =new ArrayList<>();
	expectedBonusApprovalNeedingApprovalArrayB1.add("0%");
	expectedBonusApprovalNeedingApprovalArrayB1.add("0");
	expectedBonusApprovalNeedingApprovalArrayB1.add("0 KG");//////////76-38
	expectedBonusApprovalNeedingApprovalArrayB1.add("0 KG");
	expectedBonusApprovalNeedingApprovalArrayB1.add("0 = $0.00");
	expectedBonusApprovalNeedingApprovalArrayB1.add("0 = $0.00");
	
	
	ArrayList<String> actualBonusApprovalTotalBonusArrayB1 = new ArrayList<>(); // branch one all 6 bonus values
	ArrayList<String> actualBonusApprovalNeedingApprovalArrayB1 = new ArrayList<>();
	
	for (WebElement element1 :bonusApprovalTotalBonusAssertion) {
		actualBonusApprovalTotalBonusArrayB1.add(element1.getText());
	}
	Assert.assertEquals(actualBonusApprovalTotalBonusArrayB1, expectedBonusApprovalTotalBonusArrayB1);
	
	for (WebElement element2 :bonusApprovalNeedingApprovalAssertion) {
		actualBonusApprovalNeedingApprovalArrayB1.add(element2.getText());
	}
	Assert.assertEquals(actualBonusApprovalNeedingApprovalArrayB1, expectedBonusApprovalNeedingApprovalArrayB1);
	
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
	Set<String>expectedBranchOneAuditTrailBuyKgB1 = new HashSet<>(Arrays.asList("PET-Raw-Transparent / 9.00 kg", "HDPE-Clean-Clear / 10.00 kg", "Total Weight: 19.00 KG"));
	Set<String>expectedBranchOneAuditTrailBuyBonusB1 = new HashSet<>(Arrays.asList("Bonus 63", "Bonus 70"));
	ArrayList<String>expectedBranchOneAuditTrailBuyTotalBonusB1 = new ArrayList<>(Arrays.asList("133"));
	
	Set<String>expectedBranchOneAuditTrailSellKgB1 = new HashSet<>(Arrays.asList("HDPE-Clean-Clear / 6.00 kg", "PET-Raw-Transparent / 5.00 kg","Total Weight: 11.00 KG","PET-Raw-Transparent / 7.00 kg","HDPE-Clean-Clear / 8.00 kg","Total Weight: 15.00 KG"));
	Set<String>expectedBranchOneAuditTrailSellBonusB1 = new HashSet<>(Arrays.asList("Bonus 4", "Bonus 4","Bonus 14", "Bonus 16"));
	Set<String>expectedBranchOneAuditTrailSellTotalBonusB1 = new HashSet<>(Arrays.asList("8", "30"));
	
	
	Set<String> actualBranchOneAuditTrailBuyKgB1 = new HashSet<>();   // branch one all 6 bonus values
	Set<String> actualBranchOneAuditTrailBuyBonusB1 = new HashSet<>(); // view audit Buy Transactions all Kg values
	ArrayList<String> actualBranchOneAuditTrailBuyTotalBonusB1 = new ArrayList<>(); // view audit Buy Transactions bonus

	Set<String> actualBranchOneAuditTrailSellKgB1 = new HashSet<>(); //Sell Transactions all Kg value
	Set<String> actualBranchOneAuditTrailSellBonusB1 = new HashSet<>(); // view audit Buy Transactions bonus
	Set<String> actualBranchOneAuditTrailSellTotalBonusB1 = new HashSet<>(); // view audit Buy Transactions bonus


	viewAuditTrail.click();
	
	//Buy Transaction
	
	wait.until(ExpectedConditions.visibilityOf(kgTransactions.get(0)));
	for (WebElement ele : kgTransactions) {
		actualBranchOneAuditTrailBuyKgB1.add(ele.getText());
	}

	for (WebElement element : bonusBuyTransactions) {
		actualBranchOneAuditTrailBuyBonusB1.add(element.getText());
	}
	for (WebElement element : bonusBuyTotalValue) {
		actualBranchOneAuditTrailBuyTotalBonusB1.add(element.getText());
	}
	  Thread.sleep(2000);
	    TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
	    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
	    Thread.sleep(2000);
	Assert.assertEquals(actualBranchOneAuditTrailBuyKgB1, expectedBranchOneAuditTrailBuyKgB1);
	Assert.assertEquals(actualBranchOneAuditTrailBuyBonusB1, expectedBranchOneAuditTrailBuyBonusB1);
	Assert.assertEquals(actualBranchOneAuditTrailBuyTotalBonusB1, expectedBranchOneAuditTrailBuyTotalBonusB1);
	
	wait.until(ExpectedConditions.elementToBeClickable(sellTransactionsTagAuditTrail));
	
	sellTransactionsTagAuditTrail.click();
	Thread.sleep(2000);
	
	wait.until(ExpectedConditions.visibilityOf(kgTransactions.get(0)));
	for (WebElement ele : kgTransactions) {
		actualBranchOneAuditTrailSellKgB1.add(ele.getText());
	}

	for (WebElement element : bonusBuyTransactions) {
		actualBranchOneAuditTrailSellBonusB1.add(element.getText());
	}
	for (WebElement element : bonusBuyTotalValue) {
		actualBranchOneAuditTrailSellTotalBonusB1.add(element.getText());
	}
	  Thread.sleep(2000);
	    TakesScreenshot ts3 = (TakesScreenshot) alcDriver;
	    byte[] screenshot3 = ts3.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot3", new ByteArrayInputStream(screenshot3));
	    Thread.sleep(2000);
	Assert.assertEquals(actualBranchOneAuditTrailSellKgB1, expectedBranchOneAuditTrailSellKgB1);
	Assert.assertEquals(actualBranchOneAuditTrailSellBonusB1, expectedBranchOneAuditTrailSellBonusB1);
	Assert.assertEquals(actualBranchOneAuditTrailSellTotalBonusB1, expectedBranchOneAuditTrailSellTotalBonusB1);
	
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(closeButton));
	closeButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(0).click();
	Thread.sleep(1000);
	
}

public void bonusBranch2ValueVerification() throws InterruptedException {
		
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(1)));
	branchButton.get(1).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOf(totalBonusTitle));
	
	ArrayList<String>expectedBonusApprovalTotalBonusArrayB2 =new ArrayList<>();
	expectedBonusApprovalTotalBonusArrayB2.add("214.29 %");
	expectedBonusApprovalTotalBonusArrayB2.add("0");
	expectedBonusApprovalTotalBonusArrayB2.add("15 KG");
	expectedBonusApprovalTotalBonusArrayB2.add("7 KG");
	expectedBonusApprovalTotalBonusArrayB2.add("0 = $0.00");
	expectedBonusApprovalTotalBonusArrayB2.add("14 = $0.14");
	
	
	ArrayList<String>expectedBonusApprovalNeedingApprovalArrayB2 =new ArrayList<>();
	expectedBonusApprovalNeedingApprovalArrayB2.add("0%");
	expectedBonusApprovalNeedingApprovalArrayB2.add("0");
	expectedBonusApprovalNeedingApprovalArrayB2.add("0 KG");
	expectedBonusApprovalNeedingApprovalArrayB2.add("0 KG");
	expectedBonusApprovalNeedingApprovalArrayB2.add("0 = $0.00");
	expectedBonusApprovalNeedingApprovalArrayB2.add("0 = $0.00");
	
	
	ArrayList<String> actualBonusApprovalTotalBonusArrayB2 = new ArrayList<>(); // branch one all 6 bonus values
	ArrayList<String> actualBonusApprovalNeedingApprovalArrayB2 = new ArrayList<>();
	for (WebElement element1 :bonusApprovalTotalBonusAssertion) {
		actualBonusApprovalTotalBonusArrayB2.add(element1.getText());
	}
	Assert.assertEquals(actualBonusApprovalTotalBonusArrayB2, expectedBonusApprovalTotalBonusArrayB2);
	
	for (WebElement element2 :bonusApprovalNeedingApprovalAssertion) {
		actualBonusApprovalNeedingApprovalArrayB2.add(element2.getText());
	}
	Thread.sleep(2000);
	Assert.assertEquals(actualBonusApprovalNeedingApprovalArrayB2, expectedBonusApprovalNeedingApprovalArrayB2);
	    Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);

	Set<String>expectedBranchOneAuditTrailSellKgB2 = new HashSet<>(Arrays.asList("PET-Raw-Transparent / 3.00 kg", "HDPE-Clean-Clear / 4.00 kg","Total Weight: 7.00 KG"));
	Set<String>expectedBranchOneAuditTrailSellBonusB2 = new HashSet<>(Arrays.asList("Bonus 6", "Bonus 8"));
	ArrayList<String>expectedBranchOneAuditTrailSellTotalBonusB2 = new ArrayList<>(Arrays.asList("14"));
	

	Set<String> actualBranchOneAuditTrailSellKgB2 = new HashSet<>(); //Sell Transactions all Kg value
	Set<String> actualBranchOneAuditTrailSellBonusB2 = new HashSet<>(); // view audit Buy Transactions bonus
	ArrayList<String> actualBranchOneAuditTrailSellTotalBonusB2 = new ArrayList<>(); // view audit Buy Transactions bonus


	viewAuditTrail.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(sellTransactionsTagAuditTrail));
	sellTransactionsTagAuditTrail.click();
	
	wait.until(ExpectedConditions.visibilityOf(kgTransactions.get(0)));
	for (WebElement ele : kgTransactions) {
		actualBranchOneAuditTrailSellKgB2.add(ele.getText());
	}

	for (WebElement element : bonusBuyTransactions) {
		actualBranchOneAuditTrailSellBonusB2.add(element.getText());
	}
	for (WebElement element : bonusBuyTotalValue) {
		actualBranchOneAuditTrailSellTotalBonusB2.add(element.getText());
	}
	Thread.sleep(2000);
	
	Assert.assertEquals(actualBranchOneAuditTrailSellKgB2, expectedBranchOneAuditTrailSellKgB2);
	Assert.assertEquals(actualBranchOneAuditTrailSellBonusB2, expectedBranchOneAuditTrailSellBonusB2);
	Assert.assertEquals(actualBranchOneAuditTrailSellTotalBonusB2, expectedBranchOneAuditTrailSellTotalBonusB2);
	  Thread.sleep(2000);
	    TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
	    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
	    Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(closeButton));
	closeButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(1)));
	branchButton.get(1).click();
	Thread.sleep(1000);

}

public void bonusBranch3ValueVerification() throws InterruptedException {
	

	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));

	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(2).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOf(totalBonusTitle));
	
	ArrayList<String>expectedBonusApprovalTotalBonusArrayB3 =new ArrayList<>();
	expectedBonusApprovalTotalBonusArrayB3.add("200 %");
	expectedBonusApprovalTotalBonusArrayB3.add("0");
	expectedBonusApprovalTotalBonusArrayB3.add("4 KG");
	expectedBonusApprovalTotalBonusArrayB3.add("2 KG");
	expectedBonusApprovalTotalBonusArrayB3.add("0 = $0.00");
	expectedBonusApprovalTotalBonusArrayB3.add("4 = $0.04");
	
	
	ArrayList<String>expectedBonusApprovalNeedingApprovalArrayB3 =new ArrayList<>();
	expectedBonusApprovalNeedingApprovalArrayB3.add("0%");
	expectedBonusApprovalNeedingApprovalArrayB3.add("0");
	expectedBonusApprovalNeedingApprovalArrayB3.add("0 KG");
	expectedBonusApprovalNeedingApprovalArrayB3.add("0 KG");
	expectedBonusApprovalNeedingApprovalArrayB3.add("0 = $0.00");
	expectedBonusApprovalNeedingApprovalArrayB3.add("0 = $0.00");
	
	
	ArrayList<String> actualBonusApprovalTotalBonusArrayB3 = new ArrayList<>(); // branch one all 6 bonus values
	ArrayList<String> actualBonusApprovalNeedingApprovalArrayB3 = new ArrayList<>();
	
	for (WebElement element1 :bonusApprovalTotalBonusAssertion) {
		actualBonusApprovalTotalBonusArrayB3.add(element1.getText());
	}
	Assert.assertEquals(actualBonusApprovalTotalBonusArrayB3, expectedBonusApprovalTotalBonusArrayB3);
	
	for (WebElement element2 :bonusApprovalNeedingApprovalAssertion) {
		actualBonusApprovalNeedingApprovalArrayB3.add(element2.getText());
	}
	Thread.sleep(2000);
	Assert.assertEquals(actualBonusApprovalNeedingApprovalArrayB3, expectedBonusApprovalNeedingApprovalArrayB3);
	
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
	Set<String>expectedBranchOneAuditTrailSellKgB3 = new HashSet<>(Arrays.asList("PET-Raw-Transparent / 1.00 kg", "HDPE-Clean-Clear / 1.00 kg","Total Weight: 2.00 KG"));
	ArrayList<String>expectedBranchOneAuditTrailSellBonusB3 = new ArrayList<>(Arrays.asList("Bonus 2", "Bonus 2"));
	ArrayList<String>expectedBranchOneAuditTrailSellTotalBonusB3 = new ArrayList<>(Arrays.asList("4"));
	
	Set<String> actualBranchOneAuditTrailSellKgB3 = new HashSet<>(); //Sell Transactions all Kg value
	ArrayList<String> actualBranchOneAuditTrailSellBonusB3 = new ArrayList<>(); // view audit Buy Transactions bonus
	ArrayList<String> actualBranchOneAuditTrailSellTotalBonusB3 = new ArrayList<>(); // view audit Buy Transactions bonus


	viewAuditTrail.click();
	
	Thread.sleep(2000);
	
	sellTransactionsTagAuditTrail.click();
	
	wait.until(ExpectedConditions.visibilityOf(kgTransactions.get(0)));
	for (WebElement ele : kgTransactions) {
		actualBranchOneAuditTrailSellKgB3.add(ele.getText());
	}

	for (WebElement element : bonusBuyTransactions) {
		actualBranchOneAuditTrailSellBonusB3.add(element.getText());
	}
	for (WebElement element : bonusBuyTotalValue) {
		actualBranchOneAuditTrailSellTotalBonusB3.add(element.getText());
	}
	  Thread.sleep(2000);
	    TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
	    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot2", new ByteArrayInputStream(screenshot2));
	    Thread.sleep(2000);
	
	Assert.assertEquals(actualBranchOneAuditTrailSellKgB3, expectedBranchOneAuditTrailSellKgB3);
	Assert.assertEquals(actualBranchOneAuditTrailSellBonusB3, expectedBranchOneAuditTrailSellBonusB3);
	Assert.assertEquals(actualBranchOneAuditTrailSellTotalBonusB3, expectedBranchOneAuditTrailSellTotalBonusB3);
	
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(closeButton));
	closeButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(2)));
	branchButton.get(2).click();
	Thread.sleep(1000);
	
}

public void processor1ValueVerification() throws InterruptedException {
	
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(3)));
	branchButton.get(3).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOf(totalBonusTitle));
	
	ArrayList<String>expectedBonusApprovalTotalBonusArrayP1 =new ArrayList<>();
	expectedBonusApprovalTotalBonusArrayP1.add("0 %");
	expectedBonusApprovalTotalBonusArrayP1.add("0");
	expectedBonusApprovalTotalBonusArrayP1.add("9 KG");
	expectedBonusApprovalTotalBonusArrayP1.add("0 KG");
	expectedBonusApprovalTotalBonusArrayP1.add("0 = $0.00");
	expectedBonusApprovalTotalBonusArrayP1.add("0 = $0.00");
	
	
	ArrayList<String>expectedBonusApprovalNeedingApprovalArrayP1 =new ArrayList<>();
	expectedBonusApprovalNeedingApprovalArrayP1.add("0%");
	expectedBonusApprovalNeedingApprovalArrayP1.add("0");
	expectedBonusApprovalNeedingApprovalArrayP1.add("0 KG");
	expectedBonusApprovalNeedingApprovalArrayP1.add("0 KG");
	expectedBonusApprovalNeedingApprovalArrayP1.add("0 = $0.00");
	expectedBonusApprovalNeedingApprovalArrayP1.add("0 = $0.00");
	
	
	ArrayList<String> actualBonusApprovalTotalBonusArrayP1 = new ArrayList<>(); // branch one all 6 bonus values
	ArrayList<String> actualBonusApprovalNeedingApprovalArrayP1 = new ArrayList<>();
	
	for (WebElement element1 :bonusApprovalTotalBonusAssertion) {
		actualBonusApprovalTotalBonusArrayP1.add(element1.getText());
	}
	Assert.assertEquals(actualBonusApprovalTotalBonusArrayP1, expectedBonusApprovalTotalBonusArrayP1);
	
	for (WebElement element2 :bonusApprovalNeedingApprovalAssertion) {
		actualBonusApprovalNeedingApprovalArrayP1.add(element2.getText());
	}
	Thread.sleep(2000);
	Assert.assertEquals(actualBonusApprovalNeedingApprovalArrayP1, expectedBonusApprovalNeedingApprovalArrayP1);
	  Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
	
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(3)));
	branchButton.get(3).click();
	Thread.sleep(3000);

}

public void bonusVerifyInBonusApproval(String Name) throws InterruptedException {
	
	clickOrdersTab();
	clickBounsTab();
	search_byName(Name);
	clickSpecificOrdersBonus();
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(bonusApprovalButton));
	bonusApprovalButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(0).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(startApprovalButton));
	startApprovalButton.click();
	
	  Thread.sleep(3000);
	    TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
	    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot2));
	    Thread.sleep(2000);
	    ArrayList<String> approvedText = new ArrayList<>(); // branch one all 6 bonus values
		ArrayList<String>expectedApproved = new ArrayList<>(Arrays.asList("Approved", "Approved"));

	for (WebElement element : approvedTextInBonusApproval) {
		approvedText.add(element.getText());
	}
	
	Assert.assertEquals(approvedText, expectedApproved);
	
}

public void bonusApproval(String Name) throws InterruptedException {

	clickOrdersTab();
	clickBounsTab();
	search_byName(Name);
	clickSpecificOrdersBonus();
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(bonusApprovalButton));
	bonusApprovalButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(0).click();
	

	wait.until(ExpectedConditions.elementToBeClickable(verifyReceiptsButton));
	verifyReceiptsButton.click();

	// for all receipts
	try {
		for (int i = 1; i <= 3; i++) {
			approveRecipt.get(0).click();
			Thread.sleep(2000);
			okButton.click();
			Thread.sleep(2000);
		}
	} catch (Exception e) {
		System.out.println("Exception caught: " + e.getMessage());
	}


	wait.until(ExpectedConditions.elementToBeClickable(closeButton));
	closeButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(startApprovalButton));
	startApprovalButton.click();

	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(buyTransactionsButton));
	buyTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(sellTransactionsButton));
	sellTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfAllElements(checkMarkButton));
	for(WebElement checkMarkButtons :checkMarkButton ) {
		 Actions actions = new Actions(alcDriver);
	     actions.moveToElement(checkMarkButtons).click().build().perform();	
	}
	
	Thread.sleep(2000);
	    
    buyTransactionsButton.click();
    Thread.sleep(2000);
    Actions actions1 = new Actions(alcDriver);
    actions1.moveToElement(selectEquivalentCheckBox).click().build().perform();
   	 
	  Thread.sleep(1000);
	  
	    
	wait.until(ExpectedConditions.elementToBeClickable(payBonusButton));
	payBonusButton.click();

	wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
	confirmButton.click();

	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);

	wait.until(ExpectedConditions.visibilityOf(bonusPaidText));
	Actions actions = new Actions(alcDriver);
    actions.moveToElement(bonusNameLink).click().build().perform();	
	Thread.sleep(2000);
	
}
public void payBonus1711() throws InterruptedException {
	
	alcDriver.get("https://"+temp+"/#/admin/ordersoffsets/offset/"+Data.bonusOrderId1711);
	
	
	
	WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(bonusApprovalButton));
	bonusApprovalButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(0).click();
	
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(startApprovalButton));
	startApprovalButton.click();

	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(buyTransactionsButton));
	buyTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(sellTransactionsButton));
	sellTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfAllElements(checkMarkButton));
	for(WebElement checkMarkButtons :checkMarkButton ) {
		 Actions actions = new Actions(alcDriver);
	     actions.moveToElement(checkMarkButtons).click().build().perform();	
	}
	
	Thread.sleep(2000);
	    
    buyTransactionsButton.click();
    Thread.sleep(2000);
    for(WebElement checkMarkButtons :checkMarkButton ) {
		 Actions actions = new Actions(alcDriver);
	     actions.moveToElement(checkMarkButtons).click().build().perform();	
	}
	  Thread.sleep(1000);
	  
	    
	wait.until(ExpectedConditions.elementToBeClickable(payBonusButton));
	payBonusButton.click();

	wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
	confirmButton.click();

	Thread.sleep(2000);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    Thread.sleep(2000);

	wait.until(ExpectedConditions.visibilityOf(bonusPaidText));
	Actions actions = new Actions(alcDriver);
    actions.moveToElement(bonusNameLink).click().build().perform();	
	Thread.sleep(2000);
	bonusNameLink.click();
	Thread.sleep(4000);
	bonusApprovalButton.click();
	
	
	wait.until(ExpectedConditions.elementToBeClickable(bonusApprovalButton));
	bonusApprovalButton.click();
	wait.until(ExpectedConditions.elementToBeClickable(branchButton.get(0)));
	branchButton.get(1).click();
	
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(startApprovalButton));
	startApprovalButton.click();

	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(buyTransactionsButton));
	buyTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(sellTransactionsButton));
	sellTransactionsButton.click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfAllElements(checkMarkButton));
	for(WebElement checkMarkButtons :checkMarkButton ) {
		 Actions actions2 = new Actions(alcDriver);
	     actions2.moveToElement(checkMarkButtons).click().build().perform();	
	}
	
	Thread.sleep(2000);
	    
	wait.until(ExpectedConditions.elementToBeClickable(payBonusButton));
	payBonusButton.click();

	wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
	confirmButton.click();

	Thread.sleep(2000);
    TakesScreenshot ts2 = (TakesScreenshot) alcDriver;
    byte[] screenshot2 = ts2.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot2));
    Thread.sleep(2000);

	wait.until(ExpectedConditions.visibilityOf(bonusPaidText));
	Actions actions3 = new Actions(alcDriver);
    actions3.moveToElement(bonusNameLink).click().build().perform();	
	Thread.sleep(2000);
	bonusNameLink.click();
	
}
	
}

