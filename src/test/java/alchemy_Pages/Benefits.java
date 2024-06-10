package alchemy_Pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.BaseClass;
import Utilities.Data;
import Utilities.XLUtility;
import io.qameta.allure.Allure;

public class Benefits extends BaseClass{
	public Benefits(WebDriver alcDriver){
		PageFactory.initElements(alcDriver, this);
    }
		
	@FindBy(xpath="//div[@class='body']/div/div/div[text()=' Benefits ']")
	public WebElement benefits_TAB;
	@FindBy(xpath="//button[text()='Record new benefit ']")
	public WebElement recordnewbenefit;
	@FindBy(xpath="//div[text()='Record new benefit ']")
	public WebElement recordnewbenefitpage;
	@FindBy(xpath="//input[@placeholder='Search members']")
	public WebElement searchmembers;
	@FindBy(xpath="//button[text()='Get started ']")
	public WebElement getstarted;
	@FindBy(xpath="//div[contains(text(),'Philippines')]")
	public WebElement check;
	@FindBy(xpath="//tr/following::div/div")
	public WebElement benefitordernameorderpage;
	@FindBy(xpath="//label[text()='Dependents*']/following-sibling::select/option") 
	public List<WebElement> dependents;
	
	@FindBy(xpath="//select[@formcontrolname='dependent']")
	public WebElement dependent;
	@FindBy(xpath="//input[@formcontrolname='benefitCostUsd']")
	public WebElement benefitcostusd;
	
	
	@FindBy(xpath="//select[@formcontrolname='gender']")
	public List<WebElement> gender;
	@FindBy(xpath="//select[@formcontrolname='birthYear']")
	public List<WebElement> birthYear;
	@FindBy(xpath="//input[@formcontrolname='benefitName']")
	public WebElement benefitName;
	@FindBy(xpath="//select[@formcontrolname='benefitCategory']")
	public WebElement benefitCategory;
	@FindBy(xpath="//select[@formcontrolname='benefitCategory']/option")
	public List<WebElement> benefitCategoryops;
	@FindBy(xpath="//select[@formcontrolname='benefitType']")
	public WebElement benefitType;
	@FindBy(xpath="//select[@formcontrolname='benefitType']/option")
	public List<WebElement> benefitTypeops;
	@FindBy(xpath="//input[@formcontrolname='benefitCost']")
	public WebElement benefitCost;
	@FindBy(xpath="//label[@title='36.85 USD']")
	public WebElement benefitCostus;
	@FindBy(xpath="//input[@title='36.85']")
	public WebElement benefitCostusinput;
	@FindBy(xpath="//label[text()='Benefit order name']/following-sibling::input")
	public WebElement benefitordernamenewrecordpage;
	@FindBy(xpath="//input[@formcontrolname='benefitOrderFunder']")
	public WebElement benefitorderfunder;
	@FindBy(xpath="(//i[@class='calendar-icon-new-grey'])[1]")
	public WebElement calendar;
	@FindBy(xpath="//span[contains(@class,'custom-day')]")
	public List<WebElement> dates;
	@FindBy(xpath="//label[text()='Benefit category']/following-sibling::label")
	public WebElement bencat;
	@FindBy(xpath="//label[text()='Benefit type']/following-sibling::label")
	public WebElement bentype;
	@FindBy(xpath="//textarea")
	public WebElement notes;
	@FindBy(xpath="//input[@id='file-upload']")
	public WebElement uploadfile;
	@FindBy(xpath = "//loader/div//table") 
	WebElement pageLoader;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement save;
	@FindBy(xpath = "//input[@placeholder='Benefit name']") 
	WebElement benefitnamesearchbox;
	@FindBy(xpath = "//label[contains(text(),'Education Programs')]") 
	WebElement benefitcategory;
	
	@FindBy(xpath = "//label[contains(text(),'Education Support')]") 
	WebElement benefittype;
	
	@FindBy(xpath = "//label[contains(text(),'1,000')]") 
	WebElement benefitcost;
	@FindBy(xpath = "//label[text()=' (18.43 USD) ']") 
	WebElement benefitcostus;
	@FindBy(xpath = "//label[contains(text(),'1,001')]") 
	WebElement updatedbenefitcost;
	@FindBy(xpath = "//button[text()='Benefits']") 
	WebElement backtobenefits;
	@FindBy(xpath = "//button[text()='Export table ']") 
	WebElement exportTable;
	@FindBy(xpath = "//td/div/div[contains(text(),'fleek')]") 
	WebElement firstres;
	@FindBy(xpath = "//button[text()='Edit Benefit ']") 
	WebElement edit;
	@FindBy(xpath = "//button[text()='Edit details ']") 
	WebElement editbenord;
	@FindBy(xpath = "//button[text()='Cancel ']") 
	WebElement cancel;
	@FindBy(xpath = "//button[text()='Go back ']") 
	WebElement goback;
	@FindBy(xpath = "//p[text()='Are you sure you want to cancel editing this benefit? Once cancelled, your changes will be deleted. ']") 
	WebElement cancelConfirmationMessage;
	@FindBy(xpath = "//p[text()='Are you sure you want to cancel editing this benefit order? Once cancelled, your changes will be deleted. ']") 
	WebElement cancelConfirmationMessage2;
	@FindBy(xpath = "//button[text()='Delete ']") 
	WebElement delete;
	@FindBy(xpath = "//button[contains(text(),'Void Benefit')]") 
	WebElement voidbenefit;
	@FindBy(xpath = "//button[contains(text(),'Confirm and Void')]") 
	WebElement confirmandvoid;
	@FindBy(xpath = "//input[@type='radio']/following-sibling::div[contains(@class,'active')]") 
	WebElement radiobuttonactive;
	@FindBy(xpath = "//input[@placeholder='Name']") 
	WebElement benordname;
	@FindBy(xpath = "//button[contains(text(),'Benefit orders ')]") 
	WebElement benefitorderbutton;
	@FindBy(xpath = "//p[text()='Are you sure you want to void  ']") 
	WebElement voidbenefitconfirmation;
	@FindBy(xpath = "//p[text()='? You will not be able to undo this action. ']") 
	WebElement voidbenefitconfirmation2;
	@FindBy(xpath = "//ngb-modal-window[@role='dialog']") 
	WebElement dialogwindow;
	@FindBy(xpath = "//button[contains(text(),'All benefits')]") 
	WebElement allbenefits;
	@FindBy(xpath = "//input[@placeholder='Benefit Order Name']") 
	WebElement benefitordernamesearchbox;
	@FindBy(xpath = "//input[@placeholder='Search for funders']") 
	WebElement benordfunder;
	@FindBy(xpath = "//div[text()='Set as new default Master Order for ']") 
	WebElement philirbutton;
	@FindBy(xpath = "//div[@class='loader circle-loader']") 
	WebElement loader;
	@FindBy(xpath = "//button[contains(text(),'Assigned Benefits')]") 
	WebElement assignedbenefits;
	@FindBy(xpath = "//button[contains(text(),'Order details')]") 
	WebElement orderdetails;
	@FindBy(xpath = "//button[contains(text(),'OK')]") 
	WebElement ok;
	@FindBy(xpath = "//span[text()=' Clear all filters']") 
	WebElement clearfilters;
	@FindBy(xpath = "//button[text()='Create new order ']") 
	WebElement createneworderbutton;
	@FindBy(xpath = "//input[@formcontrolname='orderName']") 
	WebElement benefitordernamebox;
	@FindBy(xpath = "//input") 
	List<WebElement> inputs;
	@FindBy(xpath = "//input[@formcontrolname='purchaseOrderNumber']") 
	WebElement benefitordernumberbox;
	@FindBy(xpath = "//input[@formcontrolname='funder']") 
	WebElement funderbox;
	@FindBy(xpath = "//li[contains(text(),'Plastic Bank')]")                  
	WebElement pboptionfunder;
	@FindBy(xpath = "//li[contains(text(),'Social Plastic Foundation')]")                  
	WebElement socialplasticfoundation;
	@FindBy(xpath = "//select[@formcontrolname='country']") 
	WebElement countrydropdown;
	@FindBy(xpath = "//option[text()='Philippines ']") 
	WebElement philippinesoption;
	@FindBy(xpath = "//option[text()='Brazil ']") 
	WebElement braziloption;
	@FindBy(xpath = "//input[@formcontrolname='costLimit']") 
	WebElement costlimitbox;
	@FindBy(xpath = "//select[@formcontrolname='orderType']") 
	WebElement benefitordertypoedropdown;
	@FindBy(xpath = "//select[@formcontrolname='benefitOrderType']") 
	WebElement benefitordertypoedropdown2;
	@FindBy(xpath = "//option[text()='Master Order ']") 
	WebElement masterorderoption;
	@FindBy(xpath = "//option[text()='Partner Order ']") 
	WebElement partnerorderoption;
	@FindBy(xpath = "//input[@formcontrolname='defaultMasterOrder']") 
	WebElement setasdefaultmasterorder;
	@FindBy(xpath = "//select[@formcontrolname='benefitCategory']") 
	WebElement benefitcategorydropdown;
	@FindBy(xpath = "//select[@formcontrolname='benefitCategory']/option") 
	List<WebElement> benefitcategoryoptions;
	@FindBy(xpath = "//select[@formcontrolname='benefitType']") 
	WebElement benefittypedropdown;
	@FindBy(xpath = "//select[@formcontrolname='benefitType']/option") 
	List<WebElement> benefittypeoptions;
	@FindBy(xpath = "//textarea") 
	WebElement notesarea;
	@FindBy(xpath = "//button[text()='Confirm ']") 
	WebElement confirm;
	@FindBy(xpath = "//button[@type='submit' and @disabled]") 
	WebElement disabledsave;
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement enabledsave;
	@FindBy(xpath = "//button[contains(@class,'active') and text()='Benefit orders ']") 
	WebElement activebenefitordersbutton;
	@FindBy(xpath = "//input[@formcontrolname='costLeftToFill' and @disabled and contains(@title,'USD')]") 
	WebElement costleftofillgreyout;
	@FindBy(xpath = "//label[@title='Purchase order number']/following-sibling::label") 
	WebElement verifypon;
	@FindBy(xpath = "//label[@title='Country']/following-sibling::label") 
	WebElement verifycountry;
	@FindBy(xpath = "//label[@title='Cost limit']/following-sibling::label") 
	WebElement verifycostlimit;
	@FindBy(xpath = "//label[@title='Benefit name']/following-sibling::label") 
	WebElement verifybenefitname;
	@FindBy(xpath = "//label[@title='Benefit order type']/following-sibling::label") 
	WebElement verifybenefitordertype;
	@FindBy(xpath = "//label[@title='Benefit category']/following-sibling::label") 
	WebElement verifybenefitcategory;
	@FindBy(xpath = "//label[@title='Benefit type']/following-sibling::label") 
	WebElement verifybenefittype;
	@FindBy(xpath = "//button[contains(text(),'Edit')]") 
	WebElement edituniversal;
	@FindBy(xpath = "//button[contains(text(),'Transfer benefits')]") 
	WebElement transferbenefits;
	@FindBy(xpath = "//button[contains(text(),'Transfer selected benefits')]") 
	WebElement transferselectedbenefits;
	@FindBy(xpath = "//input[@placeholder='Select a benefit order']") 
	WebElement enterbenefitorder;
	@FindBy(xpath = "//span[text()=' Are you sure you want to transfer these benefits from ']") 
	WebElement confirmmessage;
	@FindBy(xpath = "//p[text()=' Where will the benefits be transferred to? ']") 
	WebElement confirmmessage2;
	@FindBy(xpath = "//ngb-typeahead-window/button") 
	WebElement firstoption;
	@FindBy(xpath = "//input[@type='checkbox']") 
	List<WebElement> checkboxes;
	@FindBy(xpath = "(//td/div/div)[6]") 
	WebElement costofselectedbenefit;
	@FindBy(xpath = "(//div[contains(@class,'bolder')])[2]/label") 
	WebElement costofselectedbenefitinbanner;
	@FindBy(xpath = "(//div[contains(@class,'bolder')])[2]/label") 
	WebElement costlimitfilled;
	@FindBy(xpath = "//div[contains(text(),'USD of benefits successfully transferred to')]") 
	WebElement toastmessage;
	@FindBy(xpath = "//div[@class='unverified-icon']") 
	WebElement warning;
	@FindBy(xpath = "//label[text()=' 1,000 USD ']") 
	WebElement costlimits;
	@FindBy(xpath = "//label[text()=' 981.57 USD ']") 
	WebElement costlefts;
	@FindBy(xpath = "//td/div[text()='Loading...']") 
	WebElement loadingtext;
	@FindBy(xpath = "//label[text()='Created by']/following-sibling::label") 
	WebElement creator;
	
	
	
		
					
	String dynamicresult="//div[@title='param']";
	String dynaresult ="//td/div/div[contains(text(),'param')]";
	String dynaresult1 ="//td/div/div[contains(text(),'param')]";
	String result="(//div[contains(text(),'param')])[2]";
	public static String bencatlater;
	public static String decimal1;
	public static String decimal2;
	public static String bentypelater;
	public static String benefitcostUsd;
	public static String purchaseordernumber;
	public static String costlimit;
	public static String benefitordertype;
	public static String benefitcategoryord;
	public static String benefittypeord;
	public static String country;
	public static String s;
	public static String t;
	public static String tbt1;
	public static String tbt2;
	String bon;
	String bof;
	String benefitnameres;
	String benefitnameres1;
	String changingmembername="//div[contains(text(),'param')]";
	String changingbenefitname="//label[contains(text(),'param')]";
	String rtbenefitname;
	String rtmembername;
	
	
	
	public void verifyUserDirectedToRNBForm() throws InterruptedException {
		benefits_TAB.click();
		jsclick(recordnewbenefit);
		System.out.println(Data.member_Name4864);
		searchmembers.sendKeys(Data.member_Name4864);
		System.out.println(Data.member_Name4864);
		String rtsresult = dynamicresult.replace("param", Data.member_Name4864);
		alcDriver.findElement(By.xpath(rtsresult)).isDisplayed();
		WebElement element = alcDriver.findElement(By.xpath(rtsresult));
		takescreenshotof(element,"User should be able to search a member's name.");
		alcDriver.findElement(By.xpath(rtsresult)).click();
		getstarted.click();
		dependent.isDisplayed();
		recordnewbenefitpage.isDisplayed();
		takescreenshotof(recordnewbenefitpage,"and click the 'Get started' button to proceed to the 'Record new benefit' form");
	}
	
	public void verifyandbencreator() throws InterruptedException {
		benefits_TAB.click();
		waitforloader();
		benefitnamesearchbox.clear();
		benefitnamesearchbox.sendKeys(androidbenefitname);
		waitforloader();
		benefitnameres=dynaresult.replace("param",androidbenefitname);
		alcDriver.findElement(By.xpath(benefitnameres)).click();
		waitforloader();
		assertTrue(creator.getText().contains("Ashish Rawat"));
		takescreenshotof(creator,"In source details created by name is the same as the name of the user.");
		
	}
	
	public void fillForm() throws InterruptedException {
		benefitName.sendKeys(randomBenefitName);
		benefitCategory.click();
		Thread.sleep(2000);
		benefitCategoryops.get(1).click();
		benefitType.click();
		Thread.sleep(2000);
		benefitTypeops.get(1).click();
		benefitCost.sendKeys("1000");
		calendar.click();
		dates.get(0).click();
		bof=benefitorderfunder.getAttribute("title");
		System.out.println(bof+" on form fill up page.");
		bon=benefitordernamenewrecordpage.getAttribute("title");
		System.out.println(bon+" on form fill up page.");
		 notes.sendKeys("notes");
	     File file = new File(".\\uploadimage.png");
	     uploadfile.sendKeys(file.getAbsolutePath());
	     save.click();
	     waitforloader();
	   }
	public void verify_benordname_and_benfunder() throws InterruptedException {
		benefitorderbutton.click();
		waitforloader();
		benefitordernamesearchbox.sendKeys(bon);
		waitforloader();
		findAndClickElementWithXpath("//td/div/div[contains(text(),'"+bon+"')]");
		waitforloader();
		 editbenord.click();
	     radiobuttonactive.isDisplayed();
	     Thread.sleep(10000);
	     System.out.println("on benefit order details page "+benordname.getAttribute("title"));
	     System.out.println("on benefit order details page "+benordfunder.getAttribute("title"));
	     assertTrue(bon.equals(benordname.getAttribute("title")));
	     assertTrue(bof.equals(benordfunder.getAttribute("title")));
	     philirbutton.isDisplayed();
	     backtobenefits.click();
	     waitforloader();
	     allbenefits.click();
	}
	
	
	
	public void verifyBenefitIsSaved() throws InterruptedException {
		benefitnamesearchbox.clear();
		benefitnamesearchbox.sendKeys(randomBenefitName);
		
		benefitnameres=dynaresult.replace("param",randomBenefitName);
		alcDriver.findElement(By.xpath(benefitnameres)).isDisplayed();
		System.out.println(benefitnameres);
		System.out.println("verify---"+randomBenefitName);
		 Thread.sleep(3000);
		  TakesScreenshot ts1 = (TakesScreenshot) alcDriver; 
		  byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES); 
		  Allure.addAttachment("User is able to save benefit form.",new ByteArrayInputStream(screenshot1)); 
		  Thread.sleep(2000);
	}
	
	
	
	public void openSavedBenefit() {
		benefitnameres=result.replace("param",randomBenefitName);
		alcDriver.findElement(By.xpath(benefitnameres)).click();
	}
	
	
	public void verifyUserCanSeeDetails() throws InterruptedException {
		benefitcost.isDisplayed();
		benefittype.isDisplayed();
		benefitcategory.isDisplayed();
		rtmembername=changingmembername.replace("param", Data.member_Name4864);
		alcDriver.findElement(By.xpath(rtmembername)).isDisplayed();
		rtbenefitname=changingbenefitname.replace("param",randomBenefitName);
		alcDriver.findElement(By.xpath(rtbenefitname)).isDisplayed();
		benefitcost.isDisplayed();
		benefittype.isDisplayed();
		benefitcategory.isDisplayed();
		 Thread.sleep(3000);
		  TakesScreenshot ts1 = (TakesScreenshot) alcDriver; 
		  byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES); 
		  Allure.addAttachment("User is able to see and access  the recorded benefit information.",new ByteArrayInputStream(screenshot1)); 
		  Thread.sleep(2000);
	}
	
	
	
	public void downloadandverifytable() throws IOException {
		
		backtobenefits.click();
		 String userHome = System.getProperty("user.home");
	        String downloadPath = userHome + File.separator + "Downloads";
	     File directory = new File(downloadPath);

	     // List all files in the directory
	     File[] files = directory.listFiles();

	     if (files != null) {
	         for (File file : files) {
	             // Check if the file name contains the specified string
	             if (file.getName().contains("benefits-report_export")) {
	                 // Delete the file
	                 boolean isDeleted = file.delete();
	                 if (isDeleted) {
	                     System.out.println("File deleted: " + file.getName());
	                 } else {
	                     System.out.println("Failed to delete file: " + file.getName());
	                 }
	             }
	         }
	     } else {
	         System.out.println("No files found in the directory.");
	     }
	     waitforloader();
	     clearfilters.click();
	     waitforloader();
		exportTable.click();
		while (true) {
			 String userHome1 = System.getProperty("user.home");
		        String downloadPath1 = userHome1 + File.separator + "Downloads";
            File directory1 = new File(downloadPath1);
            File[] files1 = directory1.listFiles((dir, name) -> name.contains("benefits-report_export_"));

            if (files1 != null && files1.length > 0) {
                // Open the first file that matches the criteria
              
               String path= files1[0].getAbsolutePath();
            	XLUtility xlutil=new XLUtility(path);
            	String benname = xlutil.getCellData("Sheet1", 1, 1);
            	System.out.println("benefit name in sheet --"+benname);
            	assertTrue(benname.equals(randomBenefitName));
                break; // Exit the loop once a file is found and opened
            }

            try {
                TimeUnit.SECONDS.sleep(1); // Wait for 1 second before checking again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}

	public void checkIfBenefitIsEditable() throws InterruptedException {
		System.out.println("benefit edit start");
		benefitnamesearchbox.clear();
		benefitnamesearchbox.sendKeys(randomBenefitName);
		waitforloader();
		System.out.println(dynaresult1);
		benefitnameres1=dynaresult1.replace("param",randomBenefitName);
		System.out.println(benefitnameres1);
		alcDriver.findElement(By.xpath(benefitnameres1)).click();
		waitforloader();
		edit.click();
		benefitName.clear();
		benefitName.sendKeys(randomBenefitName+"mainak");
		benefitCategory.click();
		benefitCategoryops.get(2).click();
		benefitType.click();
		benefitTypeops.get(2).click();
		benefitCost.clear();
		benefitCost.sendKeys("1001");
		calendar.click();
		dates.get(1).click();
		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("User is able to edit benefit", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);
		notes.clear();
		 notes.sendKeys("edited notes");
		 File file = new File(".\\image.png");
	     uploadfile.sendKeys(file.getAbsolutePath());
	     
	}
	public void click_cancel_and_confirm_message() throws InterruptedException {
	     cancel.click();
	     cancelConfirmationMessage.isDisplayed();
	     takescreenshotof(cancelConfirmationMessage,"A confirmation modal window is displayed.");
	     delete.click();
	}
	public void verifyThatNoChangesWereMade() throws InterruptedException {
		benefitnamesearchbox.clear();
		benefitnamesearchbox.sendKeys(randomBenefitName);
		waitforloader();
		findAndClickElementWithXpath("//tr/td/div/div[contains(text(),'Philippines')]");
		rtmembername=changingmembername.replace("param", Data.member_Name4864);
		alcDriver.findElement(By.xpath(rtmembername)).isDisplayed();
		rtbenefitname=changingbenefitname.replace("param",randomBenefitName);
		alcDriver.findElement(By.xpath(rtbenefitname)).isDisplayed();
		benefitcost.isDisplayed();
		benefittype.isDisplayed();
		benefitcategory.isDisplayed();
		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("No modifications were made.", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);
	}
	public void verifyThatUserAbleToSaveEditedBenefit() throws InterruptedException {
		edit.click();
		Thread.sleep(1000);
		benefitName.clear();
		Thread.sleep(2000);
		String tobesent= "mainak-benefit"+randomBenefitName;
		benefitName.sendKeys(tobesent);
		Thread.sleep(4000);
		benefitCategory.click();
		bencatlater=benefitCategoryops.get(2).getText();
		System.out.println(bencatlater+"--bencatlater");
		benefitCategoryops.get(2).click();
		benefitType.click();
		bentypelater=benefitTypeops.get(2).getText();
		System.out.println(bentypelater+"---bentypelater");
		benefitTypeops.get(2).click();
		benefitCost.clear();
		benefitCost.sendKeys("1001");
		calendar.click();
		dates.get(2).click();
		notes.clear();
		 notes.sendKeys("edited notes");
		 File file = new File(".\\image.png");
	     uploadfile.sendKeys(file.getAbsolutePath());
	     save.click();
	     benefitnamesearchbox.clear();
	     benefitnamesearchbox.sendKeys("mainak-benefit"+randomBenefitName);
	     waitforloader();
	     TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment("User was able to save the edited form.", new ByteArrayInputStream(screenshot1));
			Thread.sleep(2000);
			String rtl= dynaresult.replace("param", "mainak-benefit"+randomBenefitName);
			alcDriver.findElement(By.xpath(rtl)).click();
	}
	
	public void verifyThatUserCanSeeUpdatedInformation() throws InterruptedException {
		waitforloader();
		rtmembername=changingmembername.replace("param", Data.member_Name4864);
		alcDriver.findElement(By.xpath(rtmembername)).isDisplayed();
		rtbenefitname=changingbenefitname.replace("param","mainak-benefit"+randomBenefitName);
		alcDriver.findElement(By.xpath(rtbenefitname)).isDisplayed();
		updatedbenefitcost.isDisplayed();
		System.out.println(bencatlater);
		System.out.println(bentypelater);
		assertTrue(bencatlater.contains(bencat.getText()));
		assertTrue(bentypelater.contains(bentype.getText()));
		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("The benefit reflects updated information.", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);
	}
	
	public void confirmVoidButtonExists() throws InterruptedException {
		voidbenefit.click();
		voidbenefitconfirmation.isDisplayed();
		voidbenefitconfirmation2.isDisplayed();
		takescreenshotof(voidbenefitconfirmation2,"There is a modal window that is displayed after clicking the Void benefit button.");
		
	}
	
	public void verify_User_Returns_To_Details_Page_After_Clicking_Cancel() throws InterruptedException {
		cancel.click();
		rtmembername=changingmembername.replace("param", Data.member_Name4864);
		alcDriver.findElement(By.xpath(rtmembername)).isDisplayed();
		rtbenefitname=changingbenefitname.replace("param","mainak-benefit"+randomBenefitName);
		alcDriver.findElement(By.xpath(rtbenefitname)).isDisplayed();
		updatedbenefitcost.isDisplayed();
		System.out.println(bencatlater);
		System.out.println(bentypelater);
		assertTrue(bencatlater.contains(bencat.getText()));
		assertTrue(bentypelater.contains(bentype.getText()));
		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("User returns to benefit details page after clicking cancel button.", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);
	}
	
	public void confirm_and_void_benefit() throws InterruptedException {
		voidbenefit.click();
		confirmandvoid.click();
		ok.click();
		allbenefits.isDisplayed();
		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("User reverted to All benefits table.", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);
	}

@SuppressWarnings("deprecation")
public void verify_benefit_not_searchable_after_voiding() throws InterruptedException {
	benefitnamesearchbox.clear();
	benefitnamesearchbox.sendKeys("mainak-benefit"+randomBenefitName);
	
	
	alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	try {
		benefitnameres=dynaresult.replace("param","mainak-benefit"+randomBenefitName);
		alcDriver.findElement(By.xpath(benefitnameres)).isDisplayed();
	}catch(Exception e) {
		System.out.println("benefit not searchable after getting voided");
		TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Voided benefit not searchable.", new ByteArrayInputStream(screenshot1));
		Thread.sleep(2000);
	}
	alcDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
}


public void verify_voided_table() throws IOException {
	String userHome = System.getProperty("user.home");
    String downloadPath = userHome + File.separator + "Downloads";
 File directory = new File(downloadPath);

 // List all files in the directory
 File[] files = directory.listFiles();

 if (files != null) {
     for (File file : files) {
         // Check if the file name contains the specified string
         if (file.getName().contains("benefits-report_export")) {
             // Delete the file
             boolean isDeleted = file.delete();
             if (isDeleted) {
                 System.out.println("File deleted: " + file.getName());
             } else {
                 System.out.println("Failed to delete file: " + file.getName());
             }
         }
     }
 } else {
     System.out.println("No files found in the directory.");
 }
 clearfilters.click();
 waitforloader();
exportTable.click();

while (true) {
	String userHome1 = System.getProperty("user.home");
    String downloadPath1 = userHome1 + File.separator + "Downloads";
    File directory1 = new File(downloadPath1);
    File[] files1 = directory1.listFiles((dir, name) -> name.contains("benefits-report_export_"));

    if (files1 != null && files1.length > 0) {
    	String path= files1[0].getAbsolutePath();
    	XLUtility xlutil=new XLUtility(path);
    	String benname = xlutil.getCellData("Sheet1", 1, 1);
    	System.out.println("benefit name in sheet --"+benname);
    	assertFalse(benname.equals("mainak-benefit"+randomBenefitName));
        break; // Exit the loop once a file is found and opened
    }

    try {
        TimeUnit.SECONDS.sleep(1); // Wait for 1 second before checking again
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
public void opennewbenefitorderandsetasdefaultmasterorder() throws InterruptedException {
	benefitorderbutton.click();
	jsclick(createneworderbutton);
	waitforloader();
	waitforloader();
	TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("Create new benefit order screen opened.", new ByteArrayInputStream(screenshot1));
	Thread.sleep(2000);
	benefitordertypoedropdown.click();
	masterorderoption.click();
	JavascriptExecutor executor = (JavascriptExecutor) alcDriver;
    executor.executeScript("arguments[0].click();", setasdefaultmasterorder);
	}
	

@SuppressWarnings("deprecation")
public void fillformandverifysavebuttonenabledonlyafterformfills() throws InterruptedException {
	
	
	 benefitordernamebox.sendKeys(benefitordername);
	 disabledsave.isDisplayed();
	 takescreenshotof(disabledsave,"save is disabled.");
	 benefitordernumberbox.sendKeys("12345");
	 disabledsave.isDisplayed();
	 takescreenshotof(disabledsave,"save is disabled.");
	 funderbox.sendKeys("Plastic Bank");
	 pboptionfunder.click();
	 disabledsave.isDisplayed();
	 takescreenshotof(disabledsave,"save is disabled.");
	 countrydropdown.click();
	 philippinesoption.click();
	 alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			confirm.click();
		}catch(Exception e) {
			
		}
		alcDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	 disabledsave.isDisplayed();
	 takescreenshotof(disabledsave,"save is disabled.");
	 costlimitbox.sendKeys("1000");
	 benefitcategorydropdown.click();
	 benefitcategoryoptions.get(1).click();
	 benefittypedropdown.click();
	 benefittypeoptions.get(1).click();
	 enabledsave.isDisplayed();
	 takescreenshotof(enabledsave,"save is enabled.");
}

public void clicksaveandverifyuserrevertedtobenorderpage() throws InterruptedException {
	enabledsave.click();
	activebenefitordersbutton.isDisplayed();
	TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("User is taken to benefits order page after clicking save button.", new ByteArrayInputStream(screenshot1));
	Thread.sleep(2000);
}

@SuppressWarnings("deprecation")
public void verifyBenefitOrderCanBeEdited() throws InterruptedException {
	waitforloader();
	benefitordernamesearchbox.clear();
	benefitordernamesearchbox.sendKeys(benefitordername);
	waitforloader();
	findAndClickElementWithXpath("(//tr/td/div/div)[2]");
	waitforloader();
	edituniversal.click();
	Thread.sleep(3000);
	inputs.get(0).clear();
	String send = "edited"+benefitordername;
	inputs.get(0).sendKeys(send);
	inputs.get(1).clear();
	inputs.get(1).sendKeys("123456");
	Thread.sleep(3000);
	inputs.get(2).clear();
	inputs.get(2).sendKeys("soc");
	Thread.sleep(3000);
	 socialplasticfoundation.click();
	 countrydropdown.click();
	 braziloption.click();
	 alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			confirm.click();
		}catch(Exception e) {
			
		}
		alcDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		inputs.get(3).clear();
		inputs.get(3).sendKeys("1001");
	 benefitcategorydropdown.click();
	 benefitcategoryord  =  benefitcategoryoptions.get(2).getText();
	 System.out.println(benefitcategoryord);
	 benefitcategoryoptions.get(2).click();
	 benefittypedropdown.click();
	 benefittypeord   =	 benefittypeoptions.get(2).getText();
	 System.out.println(benefittypeord);
	 benefittypeoptions.get(2).click();
	 benefitordertypoedropdown2.click();
	 partnerorderoption.click();
	 costleftofillgreyout.isDisplayed();
	 notesarea.sendKeys("edited notes");
	 takescreenshotof(costleftofillgreyout,"Benefit order can be edited.");
}

public void verifycancelconfirmationmessage() throws InterruptedException {
	cancel.click();
	cancelConfirmationMessage2.isDisplayed();
	takescreenshotof(cancelConfirmationMessage2,"cancel modal window is present.");
	goback.click();
}

public void verifyUserCanSeeUpdatedInformation() throws InterruptedException {
	save.click();
	waitforloader();
	benefitordernamesearchbox.clear();
String send  =	"edited"+benefitordername;
	benefitordernamesearchbox.sendKeys(send);
	waitforloader();
	findAndClickElementWithXpath("(//tr/td/div/div)[3]");
	waitforloader();
	Thread.sleep(5000);
	waitforloader();
	String verifypordnum=verifypon.getText();
	System.out.println("1-----"+verifypon.getText());
	assertTrue(verifypordnum.equals("123456"));
	String vc = verifycountry.getText();
	System.out.println("2---------"+verifycountry.getText());
	assertTrue(vc.equals("Brazil"));
	String vcl = verifycostlimit.getAttribute("title");
	System.out.println("3--------"+verifycostlimit.getAttribute("title"));
	assertTrue(vcl.contains("1001"));
	String vbn = verifybenefitname.getText();
	System.out.println("4--------"+verifybenefitname.getText());
	assertTrue(vbn.equals("edited"+benefitordername));
	String vbot = verifybenefitordertype.getText();
	System.out.println("5--------"+verifybenefitordertype.getText());
	assertTrue(vbot.equals("Partner Order"));
	String vbc= verifybenefitcategory.getText();
	System.out.println("6------------"+verifybenefitcategory.getText());
	assertTrue(benefitcategoryord.contains(vbc));
	String vbt = verifybenefittype.getText();
	System.out.println("7---------"+verifybenefittype.getText());
	assertTrue(benefittypeord.contains(vbt));
	takescreenshotof(verifybenefittype,"Updated infomation reflected on benefit order details page.");
}




public void findAndClickElementWithXpath(String string) {
	WebElement el = alcDriver.findElement(By.xpath(string));
	el.click();
}
















public void jsclick(WebElement el) {
	JavascriptExecutor executor = (JavascriptExecutor) alcDriver;
    executor.executeScript("arguments[0].click();", el);
}

public static void sendKeysUsingJS(WebElement element, String text) {
    JavascriptExecutor jsExecutor = (JavascriptExecutor) alcDriver;
    jsExecutor.executeScript("arguments[0].value = arguments[1];", element, text);
}

public void clickanyways(WebElement el) {
	try {
		el.click();
	}catch(Exception e) {
		clickanyways(el);
	}
}


@SuppressWarnings("deprecation")
public void t1() throws InterruptedException {
	benefits_TAB.click();
	jsclick(benefitorderbutton);
	check.click();
	waitforloader();
	waitforloader();
	editbenord.click();
	Thread.sleep(20000);
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



public void step23() throws InterruptedException {
	benefits_TAB.click();
	jsclick(recordnewbenefit);
	searchmembers.sendKeys(Data.member_Name4864);
	String rtsresult = dynamicresult.replace("param", Data.member_Name4864);
	alcDriver.findElement(By.xpath(rtsresult)).click();
	getstarted.click();
	String seconfbenefit = randomBenefitName+"2";
	benefitName.sendKeys(seconfbenefit);
	benefitCategory.click();
	Thread.sleep(2000);
	benefitCategoryops.get(1).click();
	benefitType.click();
	Thread.sleep(2000);
	benefitTypeops.get(1).click();
	benefitCost.sendKeys("1000");
	benefitcostUsd=benefitcostusd.getAttribute("title");
	System.out.println(benefitcostUsd);
	assertTrue(benefitcostUsd.equals("18.43"));
	calendar.click();
	dates.get(0).click();
	save.click();
	waitforloader();
}

public void step25() throws InterruptedException {
	benefits_TAB.click();
	String seconfbenefit = randomBenefitName+"2";
	benefitnamesearchbox.clear();
	benefitnamesearchbox.sendKeys(seconfbenefit);
	waitforloader();
	WebElement el = alcDriver.findElement(By.xpath(dynaresult.replace("param", seconfbenefit)));
	WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(300));
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(el)));
	el.click();
	benefitcost.isDisplayed();
	benefitcostus.isDisplayed();
	takescreenshotof(benefitcostus,"Benefit cost didn't change after changing conversion rate in country settings.");
}

public void step26() throws InterruptedException {
	edit.click();
	benefitCost.clear();
	benefitCost.sendKeys("2000");
	benefitCostusinput.isDisplayed();
	save.click();
	String seconfbenefit = randomBenefitName+"2";
	benefitnamesearchbox.clear();
	benefitnamesearchbox.sendKeys(seconfbenefit);
	waitforloader();
	findAndClickElementWithXpath("(//tr/td/div/div)[4]");
	benefitCostus.isDisplayed();
	takescreenshotof(benefitCostus,"USD conversion based on previous exchange rate.");
}


@SuppressWarnings("deprecation")
public void createbenordandbenefits() throws InterruptedException {
	benefits_TAB.click();
	jsclick(benefitorderbutton);
	jsclick(createneworderbutton);
	waitforloader();
	waitforloader();
	benefitordertypoedropdown.click();
	masterorderoption.click();
	JavascriptExecutor executor = (JavascriptExecutor) alcDriver;
    executor.executeScript("arguments[0].click();", setasdefaultmasterorder);
     s= "source"+benefitordername;
    benefitordernamebox.sendKeys(s);
	 
	 benefitordernumberbox.sendKeys("12345876");
	 funderbox.click();
	 Thread.sleep(1000);
	 funderbox.sendKeys("p");
	 Thread.sleep(1000);
	 pboptionfunder.click();
	 
	 countrydropdown.click();
	 philippinesoption.click();
	 alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			confirm.click();
		}catch(Exception e) {
			
		}
		alcDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	 
	 costlimitbox.sendKeys("1000");
	 benefitcategorydropdown.click();
	 benefitcategoryoptions.get(1).click();
	 benefittypedropdown.click();
	 benefittypeoptions.get(1).click();
	 enabledsave.click();
	 waitforloader();
	 jsclick(createneworderbutton);
	 waitforloader();
	 waitforloader();
		benefitordertypoedropdown.click();
		partnerorderoption.click();
		
	     t= "target"+benefitordername;
	    benefitordernamebox.sendKeys(t);
		 
		 benefitordernumberbox.sendKeys("12345231");
		 funderbox.click();
		 Thread.sleep(1000);
		 funderbox.sendKeys("p");
		 Thread.sleep(1000);
		 pboptionfunder.click();
		 
		 countrydropdown.click();
		 philippinesoption.click();
		 
		 
		 costlimitbox.sendKeys("1000");
		 benefitcategorydropdown.click();
		 benefitcategoryoptions.get(1).click();
		 benefittypedropdown.click();
		 benefittypeoptions.get(1).click();
		 enabledsave.click();
		 waitforloader();
		Actions action = new Actions(alcDriver);
		action.moveToElement(allbenefits).click().build().perform();		
		//allbenefits.click();
		 jsclick(recordnewbenefit);
			
			searchmembers.sendKeys(Data.member_Name4864);
			
			String rtsresult = dynamicresult.replace("param", Data.member_Name4864);
			alcDriver.findElement(By.xpath(rtsresult)).click();
			getstarted.click();
			dependent.isDisplayed();
			recordnewbenefitpage.isDisplayed();
			tbt1 =randomBenefitName + "tbt1";
			benefitName.sendKeys(tbt1);
			Thread.sleep(2000);
			benefitCategory.click();
			Thread.sleep(2000);
			benefitCategoryops.get(1).click();
			Thread.sleep(2000);
			benefitType.click();
			Thread.sleep(2000);
			benefitTypeops.get(1).click();
			benefitCost.sendKeys("1000");
			calendar.click();
			dates.get(0).click();
			notes.sendKeys("notes");
		    
		     save.click();
		     waitforloader();
		     waitforloader();
		        jsclick(recordnewbenefit);
			    searchmembers.sendKeys(Data.member_Name4864);
				String rtsresult1 = dynamicresult.replace("param", Data.member_Name4864);
				alcDriver.findElement(By.xpath(rtsresult1)).click();
				getstarted.click();
				dependent.isDisplayed();
				recordnewbenefitpage.isDisplayed();
				tbt2 =randomBenefitName + "tbt2";
				benefitName.sendKeys(tbt2);
				Thread.sleep(2000);
				benefitCategory.click();
				Thread.sleep(2000);
				benefitCategoryops.get(1).click();
				Thread.sleep(2000);
				benefitType.click();
				Thread.sleep(2000);
				benefitTypeops.get(1).click();
				benefitCost.sendKeys("1000");
				calendar.click();
				dates.get(0).click();
				notes.sendKeys("notes");
			     
			     save.click();
			     waitforloader();
}



public void stepnumber27() throws InterruptedException {
	benefits_TAB.click();
	jsclick(benefitorderbutton);
	waitforloader();
	waitforloader();
	benefitordernamesearchbox.sendKeys(s);
	benefitnameres=result.replace("param", s);
	alcDriver.findElement(By.xpath(benefitnameres)).click();
	waitforloader();
	waitforloader();
	assignedbenefits.click();
	transferbenefits.isDisplayed();
	takescreenshotof(transferbenefits,"transfer benefits button is present.");
	waitforloader();
	waitforloader();
	transferbenefits.click();
	confirmmessage.isDisplayed();
	cancel.isDisplayed();
	confirm.isDisplayed();
	confirmmessage2.isDisplayed();
    takescreenshotof(confirmmessage2,"Modal window is present");

}

public void stepnumber28() throws InterruptedException {
	enterbenefitorder.isDisplayed();
	enterbenefitorder.clear();
	enterbenefitorder.sendKeys(t);
	firstoption.click();
	TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
    Allure.addAttachment("confirm button is enabled and clickable", new ByteArrayInputStream(screenshot1));
	Thread.sleep(2000);
	confirm.click();
	checkboxes.get(0).isDisplayed();
	
     
}

public void step29() throws InterruptedException {
	checkboxes.get(1).click();
	String cost =costofselectedbenefit.getText();
	 Pattern pattern = Pattern.compile("\\d+\\.\\d+");
     Matcher matcher = pattern.matcher(cost);
     if (matcher.find()) {
         decimal1 = matcher.group();
         System.out.println("Decimal part in table: " + decimal1);
     } else {
         System.out.println("No decimal found.");
     }
     
    String cost2= costofselectedbenefitinbanner.getText();
    System.out.println(cost2);
    Pattern pattern1 = Pattern.compile("\\d+\\.\\d+");
    Matcher matcher1 = pattern1.matcher(cost2);
    if (matcher1.find()) {
        decimal2 = matcher1.group();
        System.out.println("Decimal part in banner: " + decimal2);
    } else {
        System.out.println("No decimal found.");
    }
     assertTrue(decimal1.equals(decimal2));
     warning.isDisplayed();
     transferselectedbenefits.click();
     toastmessage.isDisplayed();
     Thread.sleep(1000);
     takescreenshotof(toastmessage,"Toast message is displayed.");
     wait300.until(ExpectedConditions.invisibilityOf(toastmessage));
     assignedbenefits.isDisplayed();
}

@SuppressWarnings("deprecation")
public void verifycostlimitandcostlefttofill() throws InterruptedException {
	waitforloader();
	waitforloader();
	alcDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	try {
		String toclick=dynaresult1.replace("param",tbt2);
		alcDriver.findElement(By.xpath(toclick)).isDisplayed();
	}catch(Exception e) {
		System.out.println("transfered benefit no longer exists in source order.");
	}
	alcDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	
	String verify = costlimitfilled.getText();
	assertTrue(verify.contains("18.43"));
	warning.isDisplayed();
	takescreenshotof(warning,"Colour of banner is orange.");
	orderdetails.click();
	costlimits.isDisplayed();
	costlefts.isDisplayed();
	takescreenshotof(costlimits,"cost limit and cost left to fill for source benefit order");
	waitforloader();
	waitforloader();
	backtobenefits.click();
	String toclick=dynaresult1.replace("param",t);
	alcDriver.findElement(By.xpath(toclick)).click();
	costlimits.isDisplayed();
	costlefts.isDisplayed();
	takescreenshotof(costlimits,"cost limit and cost left to fill for target benefit order");
	waitforloader();
	waitforloader();
	assignedbenefits.click();
	waitforloader();
	waitforloader();
	String verify1 = costlimitfilled.getText();
	System.out.println(verify1);
	 Pattern pattern = Pattern.compile("\\d+\\.\\d+");
     Matcher matcher = pattern.matcher(verify1);
     if (matcher.find()) {
         String decimal1 = matcher.group();
         System.out.println("Decimal part in table: " + decimal1);
     } else {
         System.out.println("No decimal found.");
     }
	assertTrue(verify1.contains("18.43"));
	takescreenshotof(costlimitfilled,"cost limit filled in target benefit order is what it should be.");
}


}






	

