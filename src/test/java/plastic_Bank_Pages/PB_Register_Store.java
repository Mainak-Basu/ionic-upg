package plastic_Bank_Pages;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import Utilities.Data;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;

public class PB_Register_Store extends BaseClass {
	
	
	
public PB_Register_Store(AndroidDriver pBriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(pbDriver), this);
		}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Store\")")
	public WebElement store;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Manage Storefront\")")
	public WebElement managestorefront;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CREATE STORE\")")
	public WebElement createStroe;
	@AndroidFindBy(uiAutomator= "new UiSelector().text(\"camera\")")
	public WebElement camera;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"checkmark\")")
	public WebElement finalconfirmation;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Take a picture\")")
	public WebElement takeAPicture;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"While using the app\")")
	public WebElement permission;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Allow\")")
	public WebElement allow;
	@AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Shutter\"]")
	public WebElement shutter;
	@AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Done\"]")
	public WebElement photoDone;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Use Photo\")")
	public WebElement usePhoto;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm\")")
	public WebElement confirmButton;
	@AndroidFindBy(xpath= "(//android.view.View/android.widget.EditText)[1]")
	public WebElement businessName;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save\")")
	public WebElement saveButton;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
	public WebElement okButton;
	@AndroidFindBy(xpath= "(//android.view.View/android.widget.EditText)[1]")
	public WebElement itemName;
	@AndroidFindBy(xpath= "(//android.view.View/android.widget.EditText)[2]")
	public WebElement priceInPhp;
	@AndroidFindBy(xpath= "(//android.view.View/android.widget.EditText)[3]")
	public WebElement amountInStock;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Done\")")
	public WebElement doneButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"arrow back\")")
	public WebElement arrowBack;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add Cash Out Service\")")
	public WebElement addCashOutButton;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add\")")
	public WebElement addButton;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	public WebElement cashOutServiceName;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	public WebElement memberSearch;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"search outline\")")
	public WebElement searchButton;
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Fleek\")")
	public WebElement selectMemeber;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	public WebElement amountTextField;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	public WebElement transactionCodeTextField;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"SUBMIT\")")
	public WebElement submitButton;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Submit\")")
	public WebElement submit;
	@AndroidFindBy(uiAutomator="new UiSelector().textContains(\"tore\")")
	public WebElement storeButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"9,900 = \")")
	public WebElement cashText;
	
	public static String store_name380;
	
	public void clickStore() {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(store)));
		store.click();
	}
	
	public void clickCreateStroe() {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(createStroe)));
		createStroe.click();
	}
	
	public void uploadphoto() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		Thread.sleep(4000);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(camera)));
		camera.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takeAPicture)));
		Thread.sleep(2000);
		takeAPicture.click();
	  wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(permission)));
		permission.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(allow)));
	  allow.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
		shutter.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
		photoDone.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmButton)));
		confirmButton.click();
		
	}
	
	public void uploadPhotoItems() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		Thread.sleep(4000);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(camera)));
		camera.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(takeAPicture)));
		Thread.sleep(2000);
		takeAPicture.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(shutter)));
		shutter.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(photoDone)));
		photoDone.click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmButton)));
		confirmButton.click();
		
	}
	public void typeBusinessName(String bussnessName) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(businessName)));
		businessName.sendKeys(bussnessName);
	}
	public void typeBusinessName380(String store_name) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(businessName)));
		businessName.sendKeys(store_name);
	}
	
	public void clickSaveButton() {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(saveButton)));
		saveButton.click();
	}
	
	public void clickOkButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(okButton)));
	    okButton.click();
	}
	
	public void typeItemName(String item_name) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(itemName)));
		itemName.sendKeys(item_name);
	}
	
	public void typePriceInPhp(String prince_in_php) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(priceInPhp)));
		priceInPhp.sendKeys(prince_in_php);
	}
	
	public void amountInStock(String amount_in_stock) {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(amountInStock)));
		amountInStock.sendKeys(amount_in_stock);
	}
	
	public void clickDoneButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(doneButton)));
	    doneButton.click();
	}
	
	public void fillBusnessData(String bussnessName) throws InterruptedException {
		clickStore();
		clickCreateStroe();
		uploadphoto();
		typeBusinessName(bussnessName);
		clickSaveButton();
		clickOkButton();
	}
	
	public void fillBusnessData380(String store_name) throws InterruptedException {
		clickStore();
		clickCreateStroe();
		uploadphoto();
		Thread.sleep(2000);
		typeBusinessName380(store_name);
		Thread.sleep(1000);
		clickSaveButton();
		clickOkButton();
	}
	
	public void fillItemsData(String firstItem, String PriceInPhp, String amountInStock) throws InterruptedException {
		uploadPhotoItems();
		typeItemName(firstItem);
		typePriceInPhp(PriceInPhp);
		amountInStock(amountInStock);
		clickSaveButton();
		clickDoneButton();
		Thread.sleep(5000);
	}
	
	public void createStore(String store_name) throws InterruptedException {
	    	
	    	PB_Menu_Options pbMenu= new PB_Menu_Options(pbDriver);
			PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
			PB_Register_Store pbStore = new PB_Register_Store(pbDriver);
			pblogin.permission();
			pblogin.login(Data.member_Number, password,"+63");
			Thread.sleep(1000);
			pbMenu.clickCreateBusness();
			pbStore.fillBusnessData(store_name);
			pbStore.fillItemsData("Pizza", "100", "250");

	    	
	    }
	public void createStore380() throws InterruptedException {
    	
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		store_name380="store"+RandomStringUtils.randomAlphabetic(5);
		PB_Menu_Options pbMenu= new PB_Menu_Options(pbDriver);
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.permission();
		pblogin.login(Data.member2_Number380, password,"+63");
		Thread.sleep(1000);
		pbMenu.clickCreateBusness();
		System.out.println(store_name380);
		fillBusnessData380(store_name380);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(arrowBack)));
		arrowBack.click();
		clickDoneButton();
		
    }
	public void cashoutStore() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
	
		pblogin.menu();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(storeButton)));
	    storeButton.click();
		Thread.sleep(3000);
        PointerInput fingerShutter = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter");
        Sequence scrollShutter = new Sequence(fingerShutter, 1);
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 900, 2060));
        scrollShutter.addAction(fingerShutter.createPointerDown(0));
        scrollShutter.addAction(fingerShutter.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 900, 2060));
        scrollShutter.addAction(fingerShutter.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter));
        
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addButton)));
		addButton.click();
		
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(addCashOutButton)));
		addCashOutButton.click();
		
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(cashOutServiceName)));
		cashOutServiceName.sendKeys("PlasticBankCash");
		
		Thread.sleep(1000);
		clickSaveButton();
		
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(managestorefront)));
		
        PointerInput fingerShutter1 = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter1");
        Sequence scrollShutter1 = new Sequence(fingerShutter1, 1);
        scrollShutter1.addAction(fingerShutter1.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 180, 2060));
        scrollShutter1.addAction(fingerShutter1.createPointerDown(0));
        scrollShutter1.addAction(fingerShutter1.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 180, 2060));
        scrollShutter1.addAction(fingerShutter1.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter1));
        
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(memberSearch)));
		memberSearch.sendKeys(Data.member1_Number380);
		Thread.sleep(2000);
		searchButton.click();
		
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(selectMemeber)));
		selectMemeber.click();
		
		Thread.sleep(3000);
		PointerInput fingerShutter2 = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter2");
        Sequence scrollShutter2 = new Sequence(fingerShutter2, 1);
        scrollShutter2.addAction(fingerShutter2.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 550, 2020));
        scrollShutter2.addAction(fingerShutter2.createPointerDown(0));
        scrollShutter2.addAction(fingerShutter2.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 550, 2020));
        scrollShutter2.addAction(fingerShutter2.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter2));
        
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(amountTextField)));
        amountTextField.sendKeys("100");
        
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(confirmButton)));
        confirmButton.click();
        
        Thread.sleep(3000);
        PointerInput fingerShutter3 = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter3");
        Sequence scrollShutter3 = new Sequence(fingerShutter3, 1);
        scrollShutter3.addAction(fingerShutter3.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 550, 2020));
        scrollShutter3.addAction(fingerShutter3.createPointerDown(0));
        scrollShutter3.addAction(fingerShutter3.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 550, 2020));
        scrollShutter3.addAction(fingerShutter3.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter3));
        
        Thread.sleep(5000);
        PointerInput fingerShutter4 = new PointerInput(PointerInput.Kind.TOUCH, "fingerShutter4");
        Sequence scrollShutter4 = new Sequence(fingerShutter4, 1);
        scrollShutter4.addAction(fingerShutter4.createPointerMove(Duration.ofMillis(0),
            PointerInput.Origin.viewport(), 550, 1344));
        scrollShutter4.addAction(fingerShutter4.createPointerDown(0));
        scrollShutter4.addAction(fingerShutter4.createPointerMove(Duration.ofMillis(100),
            PointerInput.Origin.viewport(), 550, 1344));
        scrollShutter4.addAction(fingerShutter4.createPointerUp(0));
        pbDriver.perform(Arrays.asList(scrollShutter4));
        
      //  wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(transactionCodeTextField)));
        //transactionCodeTextField.sendKeys("778899");
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(submit)));
        submit.click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(okButton)));
        okButton.click();
        Thread.sleep(2000);
        TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
        Thread.sleep(3000);
        
		pblogin.logout();
		pblogin.login(Data.member1_Number380, password,"+63");
		Thread.sleep(2000);	
        
	}
	 public void compareValueInApp() throws InterruptedException {
		 
	        String inputString = cashText.getText(); // "9,900 = 5,373.08₱"
	        
	        Thread.sleep(2000);
	        TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
	        byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	        Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	        Thread.sleep(3000);
	        
	        // Define a regular expression pattern to match the numeric part
	        Pattern pattern = Pattern.compile("\\d[\\d,]*");
	        Matcher matcher = pattern.matcher(inputString);

	        int numericValue = 0;

	        // Find the first match
	        if (matcher.find()) {
	            // Remove commas and convert the matched string to an integer
	            String matchedValue = matcher.group(0).replaceAll(",", "");
	            numericValue = Integer.parseInt(matchedValue);
	            System.out.println(numericValue);
	        }

	        // Assert if the numeric value is less than 10,000
	        if (numericValue < 10000) {
	            System.out.println("The cash left is 9900");
	        } else {
	            System.out.println("The cash value is not changed");
	        }
	    }
	 
	 
	 

}