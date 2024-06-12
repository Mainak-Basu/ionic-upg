package alchemy_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import Utilities.Data;
import io.qameta.allure.Allure;

import static org.testng.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
;

public class Orders extends BaseClass{
    public Orders(WebDriver alcDriver){
        PageFactory.initElements(alcDriver, this);
    }

    @FindBy(xpath = "//div[@class='body']/div/div/div[text()=' Orders ']") WebElement orders_tab;
    @FindBy(xpath = "//a[@role='tab' and text()='Bonus']") WebElement ordersTab_bonus;
    @FindBy(xpath = "//a[@role='tab' and text()='Transfers']") WebElement ordersTab_transfer;
    @FindBy(xpath = "//datatable//input[@placeholder='Name']") WebElement name_SearchBox;
    @FindBy(xpath = "//div//datatable//table/tbody/tr[1]/td/div/div") List <WebElement> table_firstRowData;
    @FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[1]/div/div")
    WebElement tableData_FirstRow;
    @FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[5]/div/div")
    WebElement tableData_FirstRow_KGDelivered;
    @FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[4]/div/div")
    WebElement tableData_FirstRow_KGPromised;
    @FindBy(xpath = "//div[@class='container-fluid']//datatable//table/tbody/tr[1]/td[8]/div/div")
    WebElement tableData_FirstRow_PendingKG;
    @FindBy(xpath = "//div[text()=' Emergency Stop ']") WebElement emergency_stopBtn;
    @FindBy(xpath = "//div[@role='document']/div") WebElement popUp_alert;
    @FindBy(xpath = "//div/button[text()='Confirm'] | //div/button[text()='OK']") WebElement okBtn_alertBox;
    @FindBy(xpath = "//*[text()=' This offset has been stopped. ']") WebElement offer_stopText;

    //today changes
    @FindBy(xpath = "//div[@class='container-fluid']/offsets/div[2]") WebElement newBonus_btn;
    @FindBy(xpath = "//label[text()='Bonus name']/parent::div/input[@id='name']") WebElement bonusName;
    @FindBy(xpath = "//label[text()='Country']/parent::div/select[@id='country']") WebElement country;
    @FindBy(xpath = "//label[text()='Country']/parent::div/select[@id='country']/option[text()='Philippines']") WebElement selectPhilippines;
    @FindBy(xpath = "//label[text()='Brand']/parent::div/input[@id='brand']") WebElement brandName;
    @FindBy(xpath = "//div[contains(@class, 'dropdown-content')]//li[contains(text(), 'Plastic Bank')]") WebElement selectBrandName;
    @FindBy(xpath = "//label[text()='Category']/parent::div/select")
    WebElement categoryDropDown;
    @FindBy(xpath = "//label[text()='Category']/parent::div/select/option[text()=' All eligible materials  ']")
    WebElement selectCate_AllEligible;
    @FindBy(xpath = "//label[text()='Total Weight (kg)']/parent::div/input[@id='name']")
    WebElement selectTotalWeight;
    @FindBy(xpath = "//label[text()='Members bonus/kg']/parent::div/input[@id='name']")
    WebElement membersBonusKg;
    @FindBy(xpath = "//label[text()='Branch bonus/kg']/parent::div/input[@id='name']")
    WebElement branchBonusKg;
    @FindBy(xpath = "//*[text()='Create']")
    WebElement createBtn;
    @FindBy(xpath = "//input[@id='smsCode']")
    WebElement authCode;
    @FindBy(xpath = "//button[@type='button' and text()='Submit']") 
    WebElement authCodeSubmitBtn;
    @FindBy(xpath = "//*[text()='Bonus Approval ']")
	public static WebElement bonusApprovalTab;
    @FindBy(xpath = "//button/span[text()=' Add Branch ']") WebElement addBranchBtn;
    @FindBy(xpath = "//datatable//table/tbody/tr[1]/td[1]/div/div")
    WebElement branchInBonus;
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement confirmBtn;
    @FindBy(xpath = "//loader/div//table")
    WebElement pageLoader;

    @FindBy(xpath = "//div[text()=' Bonus Progress ']/following-sibling::div[1]") 
    WebElement summary_bonusProgressText;
    @FindBy(xpath = "//span[text()='HDPE']/following-sibling::span[1]") 
    WebElement summary_HDPE_KG_Text;
    @FindBy(xpath = "//span[text()='PET']/following-sibling::span[1]") 
    WebElement summary_PET_KG_Text;
    @FindBy(xpath = "//div[normalize-space()='TOTAL:']/following-sibling::span") 
    WebElement summary_Total_KG_Text;
    
    @FindBy(xpath = "//div[text()='Exchange History ']") 
    WebElement exchangeHistoryTab;
    
    @FindBy(xpath = "//div[text()='HDPE-Clean-Clear / 10.00 kg']") 
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
    @FindBy(xpath = "//div[text()='Bonus']/following-sibling::div") 
    WebElement excHisTotalBonus;
    //133
    @FindBy(xpath = "//div[@role='tab']/div/button") WebElement selectAddedBranchInBonus;
    @FindBy(xpath = "//button/span[text()=' Edit Bonus Options']") WebElement editBonusOpt;
    @FindBy(xpath = "//span[text()='Branch to Branch bonus']/parent::div/select") WebElement branchBonusOpt;
    @FindBy(xpath = "//span[text()='Branch to Branch bonus']/parent::div//option[text()='Any']") WebElement selectAnyOpt;
    @FindBy(xpath = "//button[text()=' Confirm new participants']") WebElement confirmNewParticipants;
    @FindBy(xpath = "//button[text()='Close']") WebElement closeBtnPopup;
    @FindBy(xpath = "//button[text()='Save']") WebElement saveBonusInfoBtn;
    @FindBy(xpath = "//div[text()='Summary']") 
    WebElement summary;
    @FindBy(xpath = "//span[text()='Start Approval']") 
    WebElement startApproval;
    @FindBy(xpath = "//span[@class='expanded-entity-icon']")
    List<WebElement> expander;
    
    @FindBy(xpath = "//div[@class='col text-dark-grey d-flex align-items-center']/descendant::div[@class='row']") 
    WebElement bonusinBAtext;
    @FindBy(xpath = "//div[@class='col-auto d-flex align-items-center']") 
    WebElement dp;
    @FindBy(xpath = "//div[text()='133 ']") 
    WebElement bonus133;
    @FindBy(xpath = "//div[text()='Exchange History ']") 
    WebElement exchangehistory;
    @FindBy(xpath = "//div[@class='card-header']") 
    WebElement pccardheader;
    @FindBy(xpath = "//i[@class='fa fa-circle text-green']") 
    WebElement greencircle;
    @FindBy(xpath = "//div[text()='Bonus Approval ']") 
    WebElement bonusApproval;
    @FindBy(xpath = "//li[contains(@class,'page-item')]")
    WebElement lastItemOnPaage;
    @FindBy(xpath = "//a[contains(text(),'Sell Transactions')]")
    WebElement selltransactions;   
    @FindBy(xpath = "//a[contains(text(),'Buy Transactions')]")
    WebElement buytransactions;
    @FindBy(xpath = "//div[text()=' 0% fulfilled ']") 
    WebElement fulfilledbonus;
    @FindBy(xpath = "//button[@disabled]/descendant::span[text()='Start Approval']")
    WebElement disabledStartApproval;
    @FindBy(xpath = "//div[text()='Bonus']")
    WebElement bonusExcHisBonus;
    @FindBy(xpath = "//div[text()='Bonus']/following::div")
    WebElement bonusExcHisBonusText;
    @FindBy(xpath = "//div[text()='KG Recycled']/following-sibling::div/div/following-sibling::div/div")
    WebElement kgrecycled;
    @FindBy(xpath = "//button[contains(text(),'Fleek')]")
    WebElement bonusname;
    @FindBy(xpath = "//div[contains(@class,'delete')]")
    WebElement deleteicon;
    @FindBy(xpath = "//tr/td")
    WebElement firstresult;
    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    WebElement checkbox;
    @FindBy(xpath = "//span[text()='Pay Bonuses']")
    WebElement paybonuses;
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement confirm;
    @FindBy(xpath = "//div[@class='loader circle-loader']") 
    WebElement loader;
    @FindBy(xpath = "//a[text()=' 1 ']") 
    WebElement firstpage;
    @FindBy(xpath = "//div[text()='Settings ']") 
    WebElement settings;
    @FindBy(xpath = "//span[contains(text(),'Edit')]") 
    WebElement editbonus;
    @FindBy(xpath = "//button[contains(text(),'Save Changes')]") 
    WebElement savechanges;
    @FindBy(xpath = "//label[text()='Bonus Name']/following-sibling::input[@id='name']") 
    WebElement editbonusname;
    @FindBy(xpath = "//span[text()='View Audit Trail']")
    WebElement viewAuditTrail;
    @FindBy(xpath = "(//div[text()=' Total KG Sold '])[1]/span")
    WebElement verifyKgVoided;
    @FindBy(xpath = "//div[@role='gridcell']") 
    public List<WebElement> dates;
    @FindBy(xpath = "//input[@id='referenceID']") 
    public WebElement refid;
    @FindBy(xpath = "//input[@id='orderDate']") 
    public WebElement orderdate;
    
    public static String expectedexcHisHdpeKG="HDPE-Clean-Clear / 10.00 kg";
    public static String expectedexcHisPetKG="PET-Raw-Transparent / 9.00 kg";
    public static String expectedexcHisHdpeBonus="Bonus 70";
    public static String expectedexcHisPetBonus="Bonus 63";
    public static String expectedexcHisTotalKg="Total Weight: 19.00 KG";
    public static String expectedexcHisTotalBonus="133";

    public void clickOrdersTab() throws InterruptedException {
		/*
		 * WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.invisibilityOf(pageLoader));
		 */
    	orders_tab.click();
    }

    public void clickBounsTab() throws InterruptedException {
		
		 WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(firstpage));
		 ordersTab_bonus.click();
		 wait.until(ExpectedConditions.visibilityOf(firstpage));
    }

    public void search_byName(String name) throws InterruptedException {
       waitforloader();
        wait.until(ExpectedConditions.elementToBeClickable(name_SearchBox));
        name_SearchBox.click();
        name_SearchBox.clear();
        name_SearchBox.sendKeys(name);
        waitforloader();
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
    public void clickSpecificOrdersBonus() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(tableData_FirstRow));
        tableData_FirstRow.click();
    }
    public void buySellVerification_1711beforeVoid(String bonusId) throws InterruptedException {

        alcDriver.get("https://"+temp+"/#/admin/ordersoffsets/offset/"+bonusId);
        bonusApproval.click();
        Thread.sleep(2000);

        bonusApproval.click();
        expander.get(0).click();
        startApproval.click();
//    			wait.until(ExpectedConditions.textToBePresentInElement(buytransactions, "Buy Transactions (1)"));
//    			buytransactions.click();
//    			wait.until(ExpectedConditions.textToBePresentInElement(selltransactions, "Sell Transactions (1)"));
//    			selltransactions.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(dp));
        dp.click();

        Thread.sleep(3000);

        assertTrue(bonusinBAtext.isDisplayed());
        Thread.sleep(2000);
        TakesScreenshot ts111 = (TakesScreenshot) alcDriver;
        byte[] screenshotsell = ts111.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Buy Sell Verification  Screenshot", new ByteArrayInputStream(screenshotsell));
        Thread.sleep(2000);

        buytransactions.click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dp)));
        dp.click();

        Thread.sleep(3000);

        assertTrue(bonusinBAtext.isDisplayed());
        Thread.sleep(2000);
        TakesScreenshot ts1111 = (TakesScreenshot) alcDriver;
        byte[] screenshotbuy = ts1111.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshotbuy));
        Thread.sleep(2000);
        bonusname.click();
        Thread.sleep(2000);
        bonusApproval.click();
        Thread.sleep(3000);
        expander.get(1).click();
        startApproval.click();
        Thread.sleep(5000);
        buytransactions.click();
        Thread.sleep(3000);
        selltransactions.click();
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(dp)));
        dp.click();

        Thread.sleep(3000);

        assertTrue(bonusinBAtext.isDisplayed());
        Thread.sleep(2000);
        TakesScreenshot ts11111 = (TakesScreenshot) alcDriver;
        byte[] screenshotsell1 = ts11111.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshotsell1));
        Thread.sleep(2000);

    }
    public void buySellVerification_1711AfterVoid(String bonusId) throws InterruptedException {

        alcDriver.get("https://"+BaseClass.temp+"/#/admin/ordersoffsets/offset/"+bonusId);
        bonusApproval.click();
        Thread.sleep(2000);
        for(WebElement ele : expander) {

            ele.click();

            Actions action= new Actions(alcDriver);
            action.scrollToElement(viewAuditTrail).build().perform();
            Thread.sleep(2000);

            String voidedKg = verifyKgVoided.getText();
            Assert.assertEquals(voidedKg,"0 KG");

            Thread.sleep(2000);
            TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
            byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Token in Buy/Sell Bomnus Exchange History", new ByteArrayInputStream(screenshot1));
            Thread.sleep(2000);
            ele.click();
            Thread.sleep(2000);

        }

    }

    public void bonusProgressInSummaryTab(String bonusProgress) throws InterruptedException {

        alcDriver.get("https://"+temp+"/#/admin/ordersoffsets/offset/"+Data.bonusOrderId1711);
        alcDriver.navigate().refresh();
        try {
            Thread.sleep(15000);
            String bonusProgressActual = summary_bonusProgressText.getText();
            System.out.println(bonusProgressActual);
            assertTrue(bonusProgressActual.contains(bonusProgress));
            Thread.sleep(2000);
            TakesScreenshot ts11 = (TakesScreenshot) alcDriver;
            byte[] screenshot11 = ts11.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Bonus in Summary tab in Bonus Progress", new ByteArrayInputStream(screenshot11));
            Thread.sleep(2000);

        }
        catch (Exception e)
        {
            System.out.println(" Bonus is Not Present ");
            Thread.sleep(2000);
            TakesScreenshot ts11 = (TakesScreenshot) alcDriver;
            byte[] screenshot11 = ts11.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Bonus in Summary tab in Bonus Progress", new ByteArrayInputStream(screenshot11));
            Thread.sleep(2000);

        }
    }
    public void clickExchangeHistory() {
    WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
    //wait.until(ExpectedConditions.invisibilityOf(pageLoader));
    wait.until(ExpectedConditions.elementToBeClickable(exchangeHistoryTab));
    exchangeHistoryTab.click();
    }
    public void clickEmergencyStopBtn(){
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(emergency_stopBtn));
        emergency_stopBtn.click();
    }

    public Boolean verifyAlertBox() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(popUp_alert));
        return popUp_alert.isDisplayed();
    }

    public void clickAlertBoxBtnOK() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(okBtn_alertBox));
        okBtn_alertBox.click();
    }
    public void bonusExcHisVerification(String bonusId) throws InterruptedException {

        alcDriver.get("https://"+temp+"/#/admin/ordersoffsets/offset/"+bonusId);

        WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(exchangeHistoryTab));
        exchangeHistoryTab.click();
        Thread.sleep(4000);
        alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try{
            Actions action = new Actions(alcDriver);
            action.scrollToElement(lastItemOnPaage).build().perform();
            Thread.sleep(2000);
            TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
            byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Bonus In Exchange History ScreenShot", new ByteArrayInputStream(screenshot1));
            Thread.sleep(2000);
            assertTrue(bonusExcHisBonusText.isDisplayed());

        }

        catch(Exception e){
            Thread.sleep(2000);
            TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
            byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Token in Bonus Exchange History ", new ByteArrayInputStream(screenshot1));
            Thread.sleep(2000);
            //Assert.assertFalse(bonusExcHisBonusText.isDisplayed());
            System.out.println("No Bonus Found");
        }
        alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }


    public Boolean verifyOffer_stopText() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(offer_stopText));
        return offer_stopText.isDisplayed();
    }

    public void clickBonusCreate_Btn() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(firstpage));
        newBonus_btn.click();
    }

    public void enterBonusName(String name){
       waitforloader();
        bonusName.sendKeys(name);
    }

    public void selectCountry(){
        country.click();
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(selectPhilippines));
        selectPhilippines.click();
    }

    public void selectBrand(String name){
        brandName.sendKeys(name);
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(selectBrandName));
        selectBrandName.click();
    }

    public void selectBonusCategory(){
        categoryDropDown.click();
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(selectCate_AllEligible));
        selectCate_AllEligible.click();
    }

    public void enterTotalWeight(String weight){
        selectTotalWeight.sendKeys(weight);
    }

    public void enterMembersBonus(String MemWeight){
        membersBonusKg.sendKeys(MemWeight);
    }

    public void enterBranchBonus(String BranchBonus){
        branchBonusKg.sendKeys(BranchBonus);
    }

    public void clickCreateBonusBtn(){
        createBtn.click();
    }

    public void enterAuthCode(String code) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(authCode));
        authCode.sendKeys(code);
    }

    public void clickSubmitAuthCode(){
        authCodeSubmitBtn.click();
    }

    public static void clickBonusApprovalTab() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.elementToBeClickable(bonusApprovalTab));
        Thread.sleep(3000);
        bonusApprovalTab.click();
    }

    public void clickAddBranchBtn(){
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(addBranchBtn));
        addBranchBtn.click();
    }

    private void clickAddBranchInBonus() throws InterruptedException{
    	Thread.sleep(10000);
        branchInBonus.click();
    }

    public void clickConfirmBtn() throws InterruptedException {
        Thread.sleep(3000);
        confirmBtn.click();
    }

    public void clickAddedBranch() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(selectAddedBranchInBonus));
        selectAddedBranchInBonus.click();
    }

    public void clickEditBonusOptions() throws InterruptedException {
        Thread.sleep(4000);
        editBonusOpt.click();
    }

    public void clickBranchBonus(){
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(branchBonusOpt));
        branchBonusOpt.click();
    }

    public void clickConfirmNewParticipants(){
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(confirmNewParticipants));
        confirmNewParticipants.click();
    }

    public void selectAnyOption_branchBonus() {
        WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(branchBonusOpt));
        branchBonusOpt.sendKeys((Keys.ARROW_UP));
        branchBonusOpt.sendKeys((Keys.ENTER));
    }

    public void saveBonusInformation(){
        saveBonusInfoBtn.click();
    }

    public void clickCloseBtnPopUp(){
        closeBtnPopup.click();
    }
    private void clickOrdersTransferTab() throws InterruptedException {
        Thread.sleep(5000);
        ordersTab_transfer.click();
        Thread.sleep(15000);
    }
    private String verifySenderName(){
        return table_firstRowData.get(1).getText();
    }
    private String verifyRecipientName(){
        return table_firstRowData.get(2).getText();
    }
    private String verifyReason(){
        String text = table_firstRowData.get(3).getText();
        String[] split = text.split(":");
        return split[1];
    }
    private String verifyTokenTransferType(){
        return table_firstRowData.get(4).getText();
    }
    private String verifyAmount(){
        return table_firstRowData.get(5).getText();
    }

    public void checkOrderStopped(String createdBonusName) throws InterruptedException {
        clickOrdersTab();
        System.out.println("32");
        clickBounsTab();
        System.out.println("33");
        search_byName(createdBonusName);
        System.out.println("34");
        clickSpecificOrdersBonus();
        System.out.println("35");
        clickEmergencyStopBtn();
        System.out.println("36");
        assert verifyAlertBox().equals(true);
        System.out.println("37");
        clickAlertBoxBtnOK();
        System.out.println("38");
        assert verifyOffer_stopText().equals(true);
        System.out.println("39");
    }
    public void selectdate() {
    	Date currentDate = new Date();

        SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
        String month = monthFormat.format(currentDate);
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
        String day = dayFormat.format(currentDate);
        if(day.charAt(0)=='0') {
        	day= day.replace("0", "");
        }
        System.out.println("date-"+day);
		System.out.println("month-"+month);
    	for(WebElement e: dates) {
    		String check = e.getAttribute("aria-label");
    		if(check.contains(month) && check.contains(day)) {
    			System.out.println(e.getAttribute("aria-label"));
    			e.click();
    		}
    	}
    }


    public void createBonus(String createBonusName, String brandName, String totalWeight, String membersBonus, String branchBonus, String authCode, String bonusName) throws InterruptedException {
        clickOrdersTab();
        System.out.println("1");
        clickBounsTab();
        System.out.println("2");
        clickBonusCreate_Btn();
        System.out.println("3");
        enterBonusName(createBonusName);
        System.out.println("4");
        selectCountry();
        System.out.println("5");
        selectBrand(brandName);
        System.out.println("6");
        selectBonusCategory();
        System.out.println("7");
        enterTotalWeight(totalWeight);
        System.out.println("8");
        enterMembersBonus(membersBonus);
        System.out.println("9");
        enterBranchBonus(branchBonus);
        System.out.println("10");
        refid.sendKeys("refid1234");
        orderdate.click();
        try {
        selectdate();
        }catch(Exception e) {
        	
        }
        clickCreateBonusBtn();
        System.out.println("11");
        enterAuthCode(authCode);
        System.out.println("12");
        clickSubmitAuthCode();
        System.out.println("13");
        search_byName(createBonusName);
        System.out.println("14");
        clickSpecificOrdersBonus();
        System.out.println("15");
        clickBonusApprovalTab();
        System.out.println("16");
        clickAddBranchBtn();
        System.out.println("17");
        search_byName(bonusName);
        System.out.println("18");
        clickAddBranchInBonus();
        System.out.println("19");
        clickConfirmBtn();
        System.out.println("20");
        clickConfirmNewParticipants();
        System.out.println("21");
        clickAlertBoxBtnOK();
        System.out.println("22");
        System.out.println("23");
        closeBtnPopup.click();
        System.out.println("24");
    }

    public void changeBranchBonusDetails() throws InterruptedException {
        clickAddedBranch();
        System.out.println("25");
        clickEditBonusOptions();
        System.out.println("26");
        clickBranchBonus();
        System.out.println("27");
        selectAnyOption_branchBonus();
        System.out.println("28");
        saveBonusInformation();
        System.out.println("29");
        clickConfirmBtn();
        System.out.println("30");
        clickCloseBtnPopUp();
        System.out.println("31");
    }

    public void verifyOrdersTransferData(String senderName, String recipientName, String reason, String type, String amount) throws InterruptedException {
        clickOrdersTab();
        clickOrdersTransferTab();
        assert verifySenderName().equals(senderName);
        assert verifyRecipientName().equals(recipientName);
        assert verifyReason().equals(reason);
        assert verifyTokenTransferType().equals(type);
        assert verifyAmount().equals(amount);

    }
    public void searchBonus(String bonusName) throws InterruptedException {
    	
    	clickOrdersTab();
        clickBounsTab();
        search_byName(bonusName);
    	
    }
    public void verifyDetailsInBonusSearch(String bonusName) throws InterruptedException {
    	searchBonus(bonusName);
    	Thread.sleep(2000);
        TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(2000);
    	String kgd=tableData_FirstRow_KGDelivered.getText();
    	Assert.assertEquals(kgd, kgdelivered);
    	String kgpr =tableData_FirstRow_KGPromised.getText();
    	Assert.assertEquals(kgpr, kgpromised);
    	String kgpd =tableData_FirstRow_PendingKG.getText();
    	Assert.assertEquals(kgpd, kgpending);
  	
    }
    
    public void verifyDetailsInBonusSummary() throws InterruptedException {
    	//searchBonus(bonusName);
    	Thread.sleep(1000);
    	clickSpecificOrdersBonus();
    	Thread.sleep(3000);
    	 List<String> lst= new ArrayList<>();
    		 lst.addAll(Arrays.asList(summary_HDPE_KG_Text.getText(),summary_PET_KG_Text.getText(),summary_Total_KG_Text.getText()));
    		 Thread.sleep(2000);
    		    TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    		    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    		    Thread.sleep(2000);
          Assert.assertEquals(lst,Arrays.asList("10kg","9kg","19 Kg")); 	 	
    }
    public void bonusExchangeHistoryCheckPoint() {
    	clickExchangeHistory();
    	String actualexcHisHdpeKG=excHisHdpeKG.getText();
    	String actualexcHisPetKG=excHisPetKG.getText();
    	String actualexcHisHdpeBonus=excHisHdpeBonus.getText();
    	String actualexcHisPetBonus=excHisPetBonus.getText();
    	String actualexcHisTotalKg=excHisTotalKg.getText();
    	String actualexcHisTotalBonus=excHisTotalBonus.getText();
    	Assert.assertEquals(actualexcHisHdpeKG, expectedexcHisHdpeKG);
    	Assert.assertEquals(actualexcHisPetKG, expectedexcHisPetKG);
    	Assert.assertEquals(actualexcHisHdpeBonus, expectedexcHisHdpeBonus);
    	Assert.assertEquals(actualexcHisPetBonus, expectedexcHisPetBonus);
    	Assert.assertEquals(actualexcHisTotalKg, expectedexcHisTotalKg);
    	Assert.assertEquals(actualexcHisTotalBonus, expectedexcHisTotalBonus);
    }
    
    public void bonusApprovalCheckPoints() throws InterruptedException {
    	
    	clickBonusApprovalTab();
    	
    	
    }
    public void bonusCheckPoints(String bonusName) throws InterruptedException {
    	verifyDetailsInBonusSearch(bonusName);
    	verifyDetailsInBonusSummary();
          
    	
    }
    
  WebDriverWait wait = new WebDriverWait(alcDriver,Duration.ofSeconds(20));
    
  public void buySellPresent() throws InterruptedException, IOException {
  	alcDriver.get("https://"+BaseClass.actual+"/#/admin/ordersoffsets/offset/"+Data.bonusid4360);
  	exchangehistory.click();
  	pccardheader.isDisplayed();
  	Actions action = new Actions(alcDriver);
  	action.moveToElement(lastItemOnPaage).build().perform();
  	Thread.sleep(2000);

  	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
  	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
  	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
  		Thread.sleep(2000);
  		bonusApproval.click();
  		expander.get(0).click();
  			startApproval.click();
  			wait.until(ExpectedConditions.textToBePresentInElement(buytransactions, "Buy Transactions (1)"));
  			buytransactions.click();
  			Thread.sleep(2000);
  			wait.until(ExpectedConditions.textToBePresentInElement(selltransactions, "Sell Transactions (1)"));
  			selltransactions.click();
  			Thread.sleep(2000);
  			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dp)));
  			dp.click();
  			
  			try {
  			Thread.sleep(5000);
  			System.out.println("sell transac   --"+bonusinBAtext.getText()+"---");
  			wait.until(ExpectedConditions.textToBePresentInElement(bonusinBAtext, "30"));
  			assertTrue(bonusinBAtext.getText().equals("30"));
  			Thread.sleep(2000);
  			TakesScreenshot ts111 = (TakesScreenshot) alcDriver;
			    byte[] screenshotsell = ts111.getScreenshotAs(OutputType.BYTES);
			    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshotsell));
			    Thread.sleep(2000);
  			}
  			
  			catch(Exception e) {
					
  			}
  				
  		alcDriver.navigate().refresh();
  		wait.until(ExpectedConditions.textToBePresentInElement(buytransactions, "Buy Transactions (1)"));
  		buytransactions.click();
  		Thread.sleep(2000);
  		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dp)));
  		dp.click();
  		
  		try {
  		Thread.sleep(5000);
  		System.out.println("buy transac   ---"+bonusinBAtext.getText()+"---");
  		wait.until(ExpectedConditions.textToBePresentInElement(bonusinBAtext, "133"));
  		assertTrue(bonusinBAtext.getText().equals("133"));
  		Thread.sleep(2000);
 		 TakesScreenshot ts1111 = (TakesScreenshot) alcDriver;
 		    byte[] screenshotbuy = ts1111.getScreenshotAs(OutputType.BYTES);
 		 Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshotbuy));
 		Thread.sleep(2000);
  		}
  		
  		catch(Exception e) {
				
  		}
  		
  		
  		bonusname.click();
  		bonusApproval.click();
  		expander.get(1).click();
  			startApproval.click();
  			wait.until(ExpectedConditions.textToBePresentInElement(selltransactions, "Sell Transactions (1)"));
  			selltransactions.click();
  			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dp)));
  			dp.click();
  			
  			try {
  			Thread.sleep(5000);
  			System.out.println("sell transac   --"+bonusinBAtext.getText()+"---");
  			wait.until(ExpectedConditions.textToBePresentInElement(bonusinBAtext, "14"));
  			assertTrue(bonusinBAtext.getText().equals("14"));
  			Thread.sleep(2000);
  			TakesScreenshot ts111 = (TakesScreenshot) alcDriver;
			    byte[] screenshotsell = ts111.getScreenshotAs(OutputType.BYTES);
			    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshotsell));
			    Thread.sleep(2000);
  			}
  			
  			catch(Exception e) {
					
  			}
  		
  }   
    
    @SuppressWarnings("deprecation")
	public void verifyBonusOrderSummaryAndApprovalSteps() throws InterruptedException {
    	alcDriver.get("https://"+BaseClass.actual+"/#/admin/ordersoffsets/offset/"+Data.bonusid4360);
    	bonusApproval.click();
    	Thread.sleep(2000);
		expander.get(0).click();
		Thread.sleep(2000);
		disabledStartApproval.isDisplayed();
		Thread.sleep(2000);
   	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
   	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
   	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
   		Thread.sleep(2000);
		summary.click();
		Thread.sleep(1000);
		fulfilledbonus.isDisplayed();
		Thread.sleep(2000);
   	 TakesScreenshot ts11 = (TakesScreenshot) alcDriver;
   	    byte[] screenshot11 = ts11.getScreenshotAs(OutputType.BYTES);
   	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot11));
   		Thread.sleep(2000);
    	exchangehistory.click();
    	alcDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    	try {
    		 WebDriverWait waitpc = new WebDriverWait(alcDriver,Duration.ofSeconds(2));
    		waitpc.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pccardheader)));
    	}catch(Exception e) {
    		System.out.println("plastic chain not present after disabling bonus");
    	}
    	Actions action = new Actions(alcDriver);
    	action.moveToElement(greencircle).build().perform();
    	Thread.sleep(2000);
    	 TakesScreenshot ts111 = (TakesScreenshot) alcDriver;
    	    byte[] screenshot111 = ts111.getScreenshotAs(OutputType.BYTES);
    	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot111));
    		Thread.sleep(2000);
    	 alcDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }
    
    public String bonusHisExcHisVerification(String bonusName ) throws InterruptedException {
    	
    	alcDriver.get("https://"+actual+"/#/admin/ordersoffsets/offset/"+Data.bonusOrderId1711);
    	Actions action = new Actions(alcDriver);
    	action.moveToElement(bonusExcHisBonus).build().perform();
    	String bonus= bonusExcHisBonusText.getText();
    	System.out.println(bonus);
    	return bonus;
    	
    }
   
    public void buySellVerificationBeforeVoid() throws InterruptedException {
    	
    	alcDriver.get("https://"+actual+"/#/admin/ordersoffsets/offset/"+Data.bonusOrderId1711);
    	exchangehistory.click();
    	pccardheader.isDisplayed();
    	Actions action = new Actions(alcDriver);
    	action.moveToElement(lastItemOnPaage).build().perform();
    	Thread.sleep(2000);

    	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
    		Thread.sleep(2000);
    		bonusApproval.click();
    		expander.get(0).click();
    			startApproval.click();
    			wait.until(ExpectedConditions.textToBePresentInElement(buytransactions, "Buy Transactions (1)"));
    			buytransactions.click();
    			wait.until(ExpectedConditions.textToBePresentInElement(selltransactions, "Sell Transactions (1)"));
    			selltransactions.click();
    			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dp)));
    			dp.click();
    
    			Thread.sleep(5000);
    			System.out.println("sell transac   --"+bonusinBAtext.getText()+"---");
    			wait.until(ExpectedConditions.textToBePresentInElement(bonusinBAtext, "30"));
    			assertTrue(bonusinBAtext.getText().equals("30"));
    			Thread.sleep(2000);
    			TakesScreenshot ts111 = (TakesScreenshot) alcDriver;
			    byte[] screenshotsell = ts111.getScreenshotAs(OutputType.BYTES);
			    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshotsell));
			    Thread.sleep(2000);	
    				
    		alcDriver.navigate().refresh();
    		wait.until(ExpectedConditions.textToBePresentInElement(buytransactions, "Buy Transactions (1)"));
    		buytransactions.click();
    		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(dp)));
    		dp.click();
   
    		Thread.sleep(5000);
    		System.out.println("buy transac   ---"+bonusinBAtext.getText()+"---");
    		wait.until(ExpectedConditions.textToBePresentInElement(bonusinBAtext, "133"));
    		assertTrue(bonusinBAtext.getText().equals("133"));
    		Thread.sleep(2000);
   		 TakesScreenshot ts1111 = (TakesScreenshot) alcDriver;
   		    byte[] screenshotbuy = ts1111.getScreenshotAs(OutputType.BYTES);
   		 Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshotbuy));
   		Thread.sleep(2000);
    		 	
    }
   
    public void approvebonus(String string) throws InterruptedException {
    	orders_tab.click();
    	wait.until(ExpectedConditions.visibilityOf(deleteicon));
    	ordersTab_bonus.click();
    	wait.until(ExpectedConditions.visibilityOf(deleteicon));
    	name_SearchBox.click();
    	name_SearchBox.clear();
    	name_SearchBox.sendKeys(string);
    	Thread.sleep(1000);
    	wait.until(ExpectedConditions.visibilityOf(deleteicon));
    	firstresult.click();
    	bonusApproval.click();
    	expander.get(0).click();
    	startApproval.click();
    	wait.until(ExpectedConditions.textToBePresentInElement(buytransactions, "Buy Transactions (1)"));
		buytransactions.click();
		checkbox.click();
		paybonuses.click();
		confirm.click();
		try {
			orders_tab.click();
		}catch(Exception e) {
			orders_tab.click();
		}
    }
    public void editbonus(String name) throws InterruptedException {
    	settings.click();
    	editbonus.click();
    	editbonusname.sendKeys(name);
    	savechanges.click();
    	confirm.click();
    	editbonus.isDisplayed();
    	takescreenshotof(editbonus,"User able to edit bonus.");
    }
    

}
