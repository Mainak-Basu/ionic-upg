package alchemy_Pages;

import Utilities.BaseClass;
import io.qameta.allure.Allure;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.time.Duration;


public class Stores extends BaseClass {
	


	public Stores(WebDriver alcDriver){
        PageFactory.initElements(alcDriver, this);
    }
	
	 
	//public String name = " GKStore ";
	
    @FindBy(xpath = "//div[@class='body']/div/div/div[text()=' Stores ']")
    private WebElement stores_tab;
    @FindBy(xpath = "//datatable//input[@placeholder='Name']")
    private WebElement name_SearchBox;
    @FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
    private WebElement tableData_FirstRow;
    @FindBy(xpath = "//div[@role='tabpanel']/div/div[1]/span")
    private WebElement edit_store;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement edit_city;
    @FindBy(xpath = "//div[contains(@class, 'pb-button') and text()= 'Save ']")
    private WebElement save_btn;
    @FindBy(xpath = "//input[@id='reqPin']")
    private WebElement canSeeTokenInWallet;
    @FindBy(xpath = "//label[text()='Tokens Active']/following::mdl-switch")
    private WebElement tokenActiveToggle;
    @FindBy(xpath = "//select[@id='level']/option[text()=' Plastic Bank Operated']")
    private WebElement levelToPlasticBankOperated;
    @FindBy(xpath = "//select[@id='level']")
    private WebElement levelDropDown;
    @FindBy(xpath = "//loader/div//table")
    WebElement pageLoader;
    @FindBy(xpath = "//div[text()='Tokens in Wallet']/following::div[text()][1]")
    WebElement tokenWalletValue;
    @FindBy(xpath="//tr/td")
    public WebElement firstcell;
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
    
    public void clickStoreTab(){
        stores_tab.click();
    }

    public void search_byName(String name) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(tableData_FirstRow));
        name_SearchBox.click();
        name_SearchBox.sendKeys(name);
        Thread.sleep(5000);
    }

    public String verifyCreatedStoreVisble(){
        return tableData_FirstRow.getText();
    }

    public void clickCreatedStoreVisble(){
        tableData_FirstRow.click();
    }
    
    public void clickEditStore() throws InterruptedException {
       WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(120));
       wait.until(ExpectedConditions.invisibilityOf(pageLoader));
       //wait.until(ExpectedConditions.elementToBeClickable(edit_store));
       // Thread.sleep(15000);
       edit_store.click();
    }

    public void editUserCity(String cityName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(edit_city));
        edit_city.clear();
        edit_city.sendKeys(cityName);
        Thread.sleep(2000);
        TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(2000);
    }

    public void saveStoreDetails() {
        save_btn.click();
    }

    public void verifyCreatedStore(String name) throws InterruptedException{
        clickStoreTab();
        search_byName(name);
        Thread.sleep(2000);
        TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(2000);
        assert verifyCreatedStoreVisble().contains(name);
    }

    public void editStore_Details(String cityName) throws InterruptedException{
    	clickCreatedStoreVisble();
    	clickEditStore();
        editUserCity(cityName);
        Thread.sleep(2000);
        TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(2000);
        saveStoreDetails();
        
    }
    public void canSeeTokenInWallet() {

    	 canSeeTokenInWallet.click();   	
    
    }
    public void tokenActiveToggle() {
    	 WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
    	 wait.until(ExpectedConditions.elementToBeClickable(tokenActiveToggle));
     	tokenActiveToggle.click();
    }
    public void levelDropDown() {
    	
     	levelDropDown.click();
    }
    public void levelToPlasticBankOperated() {
    	 WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
    	 wait.until(ExpectedConditions.elementToBeClickable(levelToPlasticBankOperated));
     	levelToPlasticBankOperated.click();
    }
    
    public void editStore_ALC_380(String store_name) throws InterruptedException{
    	
    	clickStoreTab();
        search_byName(store_name);
    	clickCreatedStoreVisble();
    	clickEditStore();
    	Thread.sleep(2000);
    	
    	
    	tokenActiveToggle();
    	canSeeTokenInWallet();
    	levelDropDown();
    	levelToPlasticBankOperated();
    	
    	Thread.sleep(3000);
        TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(2000);
        saveStoreDetails();
    		
    }
    public void verifyTokenInAlchemy() throws InterruptedException {
    	
    	String tokenValue=tokenWalletValue.getText();
    	Thread.sleep(2000);
    	TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(2000);
    	assertEquals(tokenValue, "9,900");
    }
    
    public void sendtokenstostore(String phone) {
    	stores_tab.click();
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
	
}
