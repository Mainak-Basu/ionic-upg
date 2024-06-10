package smoke_Suite;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_Member;

public class ALC_4348 extends BaseClass{
	@Test(priority = 0, description="User not able to sign up if he tries to sign up within 3 minutes of first sign up.")
	@Description("User not able to sign up if he tries to sign up within 3 minutes of first sign up.")
	public void verifyUserCanNot() throws InterruptedException {
		PB_Register_Member pbsignup= new PB_Register_Member(pbDriver);
		pbsignup.signUpCollector();
		PB_LoginPage pb= new PB_LoginPage(pbDriver);
		Thread.sleep(5000);
		pb.logoutmem();
		pbsignup.signUpButton.click();
		pbsignup.chooseCollectorPannel();
		Thread.sleep(2000);
		pbsignup.image.click();
		Thread.sleep(2000);
		tap(550,1988);
		Thread.sleep(4000);
		tap(538,1977);
		pbsignup.photoDone.click();
		tap(550,2022);
		pbsignup.edittexts.get(1).sendKeys("Mainak "+RandomStringUtils.randomAlphabetic(5));
		//tap(200,1280);
		pbsignup.images.get(3).click();
		pbsignup.searchcountries.sendKeys("+63");
		tap(270,553);
		tap(660,1280);
		String textToCopy = randomPhoneNumber;

	    // Create a StringSelection object
	    StringSelection stringSelection = new StringSelection(textToCopy);

	    // Get the system clipboard
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

	    // Set the contents of the clipboard to the StringSelection
	    clipboard.setContents(stringSelection, null);

	    System.out.println("String has been copied to clipboard: " + textToCopy);
		
		tap(500,1510);
		
		pbDriver.pressKey(new KeyEvent(AndroidKey.BACK));
		pbsignup.edittexts.get(4).click();
		Thread.sleep(2000);
		
		scroll(718,1024,718,1800);
		Thread.sleep(4000);
		pbsignup.done.click();
		tap(400,1740);
		tap(140,1201);
		scroll(500,2100,500,1555);
		pbsignup.edittexts.get(5).sendKeys("123456a");
		pbsignup.edittexts.get(6).sendKeys("123456a");
		pbsignup.images.get(3).click();
		pbsignup.register.click();
		
		Thread.sleep(4000);
		takescreenshotofandroid("Registration failed if tried within 3 minutes since previous registration");
	}
	
	@Test(priority =1, description="User able to sign up again if he tries after 3 minute window.")
	@Description("User able to sign up again if he tries after 3 minute window.")
	public void verifyUserCanAfter3Min() throws InterruptedException {
		tap(500,400);
		PB_Register_Member pbsignup= new PB_Register_Member(pbDriver);
		Thread.sleep(180000);
		pbsignup.register.click();
		Thread.sleep(10000);
		takescreenshotofandroid("Registration successful if tried after 3 minutes since previous registration");
		tap(500,2025);
		PB_LoginPage pb= new PB_LoginPage(pbDriver);
		Thread.sleep(5000);
		pb.logoutmem();
		
	}

}
