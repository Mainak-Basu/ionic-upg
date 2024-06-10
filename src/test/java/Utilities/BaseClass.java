package Utilities;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.qameta.allure.Allure;
import static org.bytedeco.javacpp.lept.pixDestroy;
import static org.bytedeco.javacpp.lept.pixRead;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.lept.PIX;
import org.bytedeco.javacpp.tesseract.TessBaseAPI;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class BaseClass {
		
	public String string;
	public static String benefitordername;
	public static String androidbenefitname;
	public static String bonusname;
public static String password ="123456a"; 
public static String devicetime;
public static WebDriverWait wait3;
public static WebDriverWait wait30;
public static WebDriverWait wait10 ;
public static WebDriverWait wait300;
public static WebDriverWait wait200;
public static WebDriverWait wait2s;
public static WebDriverWait waitms;
public static boolean needforpasswordchange;
public static boolean gojekyn;
	public String memberBonus = "7";
	public String branchBonus = "2";
	
	public String hdpe_M_B1 = "10";
	public String pet_M_B1 = "9";
	public String kgdelivered = "19";///////// 76 -19
	public String kgpromised = "50,000";
	public String kgpending = "19";//////////// 76-19-0

	public String hdpe_B1_B2 = "8";
	public String pet_B1_B2 = "7";

	public String hdpe_B1_B3 = "6";
	public String pet_B1_B3 = "5";

	public String hdpe_B2_P = "4";
	public String pet_B2_P = "3";

	public String hdpe_B3_P = "1";
	public String pet_B3_P = "1";

	public String total_bonus_M_B1 = "133";
	public String hdpe_bonus_M_B1 = "70";
	public String pet_bonus_M_B1 = "63";
	public String hdpe_KG_M_B1 = "10";
	public String pet_KG_M_B1 = "9";

	public String total_bonus_B1_B2 = "30";
	public String hdpe_bonus_B1_B2 = "16";
	public String pet_bonus_B1_B2 = "14";
	public String hdpe_KG_B1_B2 = "8";
	public String pet_KG_B1_B2 = "7";

	public String total_bonus_B1_B3 = "8";
	public String hdpe_bonus_B1_B3 = "4";
	public String pet_bonus_B1_B3 = "4";
	public String hdpe_KG_B1_B3 = "6";
	public String pet_KG_B1_B3 = "5";

	public String total_bonus_B2_P = "14";
	public String hdpe_bonus_B2_P = "8";
	public String pet_bonus_B2_P = "6";
	public String hdpe_KG_B2_P = "4";
	public String pet_KG_B2_P = "3";

	public String total_bonus_B3_P = "4";
	public String hdpe_bonus_B3_P = "2";
	public String pet_bonus_B3_P = "2";
	public String hdpe_KG_B3_P = "1";
	public String pet_KG_B3_P = "1";

	public String alc_B1_ExngHisBonusVerify[] = { "8", "30", "133" };// B1-B3,B1-B2,M-B1
	public String alc_B2_ExngHisBonusVerify[] = { "14", "30" };// B2-P,B2-B1
	public String alc_B3_ExngHisBonusVerify[] = { "4", "8" };// B3-P,B3-B1
	public String alc_P_ExngHisBonusVerify[] = { "4", "14" };

	// HDPE Kg, PET Kg, Total Kg
	public String alc_M_B1_ExngHisKgVerify[] = { "10 KG", "9 KG", "19 KG" };
	public String alc_B1_B2_ExngHisKgVerify[] = { "8 KG", "7 KG", "15 KG" };
	public String alc_B1_B3_ExngHisKgVerify[] = { "6 KG", "5 KG", "11 KG" };
	public String alc_B2_P_ExngHisKgVerify[] = { "4 KG", "3 KG", "7 KG" };
	public String alc_B3_P_ExngHisKgVerify[] = { "1 KG", "1 KG", "2 KG" };

	public static WebDriver alcDriver;
	public static AndroidDriver pbDriver;

	
	  protected static String randomPhoneNumber;
	  protected static String randomBusinessName;
	  protected static String randomBenefitName;
	  protected static String randomBranchMemberPhoneNumber;
	  protected static String randomBranchMemberName;
	  
	  protected static String randomLastName;
	  
	 
	public String memberName;
	public String branchmemberName;
	public String phoneNumber;
	public String branchMemberphoneNumber;
	public String adminphoneNumber;
	public String adminpassword;
	public String branchName;
	
	public static String temp= "upgrade-admin.cognitionfoundry.io";
	public static String actual = "qa-admin.cognitionfoundry.io";

	@Parameters({"udid"})
	@BeforeClass

	public void setup() throws IOException {
          
		
		//  WebDriverManager.chromedriver().setup(); 
		  alcDriver = new ChromeDriver();
		  alcDriver.manage().window().maximize();
		  alcDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
		  alcDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		  wait300 = new WebDriverWait(alcDriver,Duration.ofSeconds(300)); 
		  wait2s = new WebDriverWait(alcDriver,Duration.ofSeconds(2)); 
		  waitms = new WebDriverWait(alcDriver,Duration.ofMillis(100));
		  alcDriver.get("https://upgrade-admin.cognitionfoundry.io/#/login");
		  
		 
		
			  DesiredCapabilities caps = new DesiredCapabilities();
			  caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
			 caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			  //caps.setCapability("udid", udid);
			  caps.setCapability("newCommandTimeout", 9000);
			  caps.setCapability("appPackage", "org.plasticbank.app");
			  caps.setCapability("appActivity", "org.plasticbank.app.MainActivity");
	          URL url = new URL("http://0.0.0.0:4723/wd/hub");
			  
			  pbDriver = new AndroidDriver(url, caps);
			  pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); wait10 =
			  new WebDriverWait(pbDriver,Duration.ofSeconds(10)); wait3 = new
			  WebDriverWait(pbDriver,Duration.ofSeconds(3)); wait30 = new
			  WebDriverWait(pbDriver,Duration.ofSeconds(30)); wait200 = new
			  WebDriverWait(pbDriver,Duration.ofSeconds(200));
			 
		 
		 
		 
		 
		  memberName = "Gayas"; 
		  branchmemberName = "Gayas " + randomBranchMemberName;
		  password= "123456a"; 
		  phoneNumber = "+63" + randomPhoneNumber;
		  branchMemberphoneNumber = "+63" + randomBranchMemberPhoneNumber;
		  
		  adminphoneNumber = "+919560071590"; 
		  adminpassword = "123456a"; 
		  branchName = randomBusinessName;       
		 
	}

	
	
	  public void tap(int x, int y) throws InterruptedException {
	  Thread.sleep(4000); PointerInput fingert = new
	  PointerInput(PointerInput.Kind.TOUCH, "fingert"); Sequence scrollt = new
	  Sequence(fingert, 1);
	  scrollt.addAction(fingert.createPointerMove(Duration.ofMillis(0),
	  PointerInput.Origin.viewport(), x, y));
	  scrollt.addAction(fingert.createPointerDown(0));
	  scrollt.addAction(fingert.createPointerMove(Duration.ofMillis(100),
	  PointerInput.Origin.viewport(), x, y));
	  scrollt.addAction(fingert.createPointerUp(0));
	  pbDriver.perform(Arrays.asList(scrollt)); 
	  }
	  
	  
	  public void scroll(int x, int y,
	  int p, int q) throws InterruptedException { Thread.sleep(4000); PointerInput
	  fingert = new PointerInput(PointerInput.Kind.TOUCH, "fingert"); Sequence
	  scrollt = new Sequence(fingert, 1);
	  scrollt.addAction(fingert.createPointerMove(Duration.ofMillis(0),
	  PointerInput.Origin.viewport(), x, y));
	  scrollt.addAction(fingert.createPointerDown(0));
	  scrollt.addAction(fingert.createPointerMove(Duration.ofMillis(2000),
	  PointerInput.Origin.viewport(), p, q));
	  scrollt.addAction(fingert.createPointerUp(0));
	  pbDriver.perform(Arrays.asList(scrollt)); 
	  }
	  public void scrollfast(int x, int y,
			  int p, int q) throws InterruptedException { Thread.sleep(4000); PointerInput
			  fingert = new PointerInput(PointerInput.Kind.TOUCH, "fingert"); Sequence
			  scrollt = new Sequence(fingert, 1);
			  scrollt.addAction(fingert.createPointerMove(Duration.ofMillis(0),
			  PointerInput.Origin.viewport(), x, y));
			  scrollt.addAction(fingert.createPointerDown(0));
			  scrollt.addAction(fingert.createPointerMove(Duration.ofMillis(20),
			  PointerInput.Origin.viewport(), p, q));
			  scrollt.addAction(fingert.createPointerUp(0));
			  pbDriver.perform(Arrays.asList(scrollt)); 
			  }
	  public void ocr_test_shot(AndroidDriver driver) throws IOException{
			BaseClass.pbDriver=driver;
			File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Date d=new Date();
			String scrFile2name=d.toString().replace(":","_").replace(" ", "_");

			FileUtils.copyFile(scrFile2, new File(".\\"+scrFile2name+".png"));
			File destFile=new File(".\\"+scrFile2name+".png");

			String fileName=destFile.getName();
			BytePointer outText;
	        TessBaseAPI api = new TessBaseAPI();
	     // Initialize tesseract-ocr with English, without specifying tessdata path
	        if (api.Init(".", "ENG") != 0) {
	            System.err.println("Could not initialize tesseract.");
	            System.exit(1);
	        }
			// Open input image with leptonica library
	        PIX image = pixRead(fileName);
	        api.SetImage(image);
	        // Get OCR result
	        outText = api.GetUTF8Text();
	        this.string = outText.getString();
	        System.out.println("OCR output:\n" + string);
	     // Destroy used object and release memory
	        api.End();
	        outText.deallocate();
	        pixDestroy(image);  
	        destFile.delete();
		}
	 
	public void takescreenshotof(WebElement element, String Scrnsht_message) throws InterruptedException {
		Actions action = new Actions(alcDriver);
		action.moveToElement(element).build().perform();
	   	 TakesScreenshot ts1 = (TakesScreenshot) alcDriver;
		    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
		    Allure.addAttachment(Scrnsht_message, new ByteArrayInputStream(screenshot1));
			Thread.sleep(2000);
	}
	
	  public void takescreenshotofandroid(String
	  Scrnsht_message) throws InterruptedException { 
	  TakesScreenshot ts1 = (TakesScreenshot) pbDriver; byte[] screenshot1 =
	  ts1.getScreenshotAs(OutputType.BYTES); Allure.addAttachment(Scrnsht_message,
	  new ByteArrayInputStream(screenshot1)); Thread.sleep(2000); }
	 
	
	  @BeforeSuite 
	  public void generateRandomNumber() { 
		  randomPhoneNumber =RandomStringUtils.randomNumeric(8); 
		  System.out.println("Member Number :+63" +randomPhoneNumber); }
	  
	  protected String getRandomPhoneNumber() {
		  
		  return randomPhoneNumber;
		  }
	  
	  
	  @BeforeSuite 
	 
	
	  public void generateRandomLastName() {
		  
	  randomLastName = RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Member Name : Gayas " + randomLastName); }
	  
	  protected String getRandomLastName() {
		  return randomLastName; 
		  }
	  
	  @BeforeSuite 
	  public void generateBranchMemberName() {
	  randomBranchMemberName = "Gayas " + RandomStringUtils.randomAlphabetic(5);
	  System.out.println("Branch Member Name :" + randomBranchMemberName);
	  }
	  
	  protected String getBranchMemberNumber() { 
	
		  return randomBranchMemberName; 
		  }
	  
	  @BeforeSuite public void generateRandomBranchMemberNumber() {
	  randomBranchMemberPhoneNumber = RandomStringUtils.randomNumeric(8);
	  System.out.println("Branch Member Number : +63" +
	  randomBranchMemberPhoneNumber); }
	  
	  protected String getRandomBranchMemberNumber() { 
		  return randomBranchMemberPhoneNumber; }
	  
	  @BeforeSuite 
	  public void generateBranchName() { 
		  randomBusinessName = "Gayas "+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Branch Name :" +randomBusinessName);
		  }
	  
	  protected String getBranchName() { 
		  return randomBusinessName; 
		  }
	  @BeforeSuite 
	  public void generateBenefitName() { 
		  randomBenefitName = "fleek"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Benefit Name :" +randomBenefitName);
		  }
	  
	  protected String getBenefitName() { 
		  return randomBenefitName; 
		  }
	  @BeforeSuite 
	  public void generateBenefitOrderName() { 
		  benefitordername = "mainakfleek"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Benefit Order Name :" +benefitordername);
		  }
	  
	  protected String getBenefitOrderName() { 
		  return benefitordername; 
		  }
	  @BeforeSuite 
	  public void generateAndroidBenefitname() { 
		  androidbenefitname = "android"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Android benefit Name :" +androidbenefitname);
		  }
	  
	  protected String getAndroidBenefitname() { 
		  return androidbenefitname; 
		  }
	  @BeforeSuite 
	  public void generateBonusName() { 
		  bonusname = "FleekBonus"+ RandomStringUtils.randomAlphabetic(5); 
		  System.out.println("Bonus Name :" +bonusname);
		  }
	  
	  protected String getBonusName() { 
		  return bonusname; 
		  }

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			TakesScreenshot ts = (TakesScreenshot) alcDriver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
			TakesScreenshot pb_ts = (TakesScreenshot)pbDriver;
			byte[] screenshot_pb = pb_ts.getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Screenshot_pb", new ByteArrayInputStream(screenshot_pb));
		}
	}
	@AfterClass
	public void teardownalchemy() {

		try {
			
			alcDriver.quit();
		}
		catch (NoSuchSessionException e){
			System.out.print("No such session exception call"+e.getMessage());
		}

	}
	@AfterClass
	public void teardownapp() {

		try {
			pbDriver.quit();
			
		}
		catch (NoSuchSessionException e){
			System.out.print("No such session exception call"+e.getMessage());
		}

	}
}
