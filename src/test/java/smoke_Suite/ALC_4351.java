package smoke_Suite;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_CollectionPoint;

@Listeners({Utilities.ScreenshotListener.class})
public class ALC_4351 extends BaseClass {

	@Test(priority=0, description = "Create a new branch after creating a member. Log out and login with newly created branch")
	@Description("Create a new branch after creating a member. Log out and login with newly created branch")
	public void openRegisterdBranchInApp() throws InterruptedException, IOException {
		Data d = new Data();
		d.createMember4864();
		PB_LoginPage l=new PB_LoginPage(pbDriver);
		l.login(Data.member_Number4864.replace("+63", ""),"123456a", "+63");
		PB_Register_CollectionPoint pbc = new PB_Register_CollectionPoint(pbDriver);
		pbc.createbranchaftermember();
		l.login(Data.member_Number4864.replace("+63", ""),"123456a", "+63");
		 TakesScreenshot ts1 = (TakesScreenshot) pbDriver; byte[] screenshot1 =
				  ts1.getScreenshotAs(OutputType.BYTES); Allure.addAttachment("new branch log in",
				  new ByteArrayInputStream(screenshot1)); Thread.sleep(2000);
		
		
	}

	@Test(priority=1, description = "Verify branch is searchable under Branches section and edit it's details.")
	@Description("Verify branch is searchable under Branches section and edit it's details.")
	public void branchVerifyAndEdit() throws InterruptedException {
		System.out.println("Edit Branch Details Name");
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Branches alc_branch=new Branches(alcDriver);
		System.out.println("Member Phone number in suspend branch edit "+phoneNumber);
		alc_branch.editBranchNameDetails(Data.member_Number4864);
		Thread.sleep(2000);
	}



	@Test(priority =2, description = "User should see the updated data on app")
	@Description("User should see the updated data on app")
	public void verifyEditInApp() throws InterruptedException {
		PB_LoginPage l=new PB_LoginPage(pbDriver);
		l.logout();
		l.login(Data.member_Number4864.replace("+63", ""),"123456a", "+63");
		PB_Register_CollectionPoint pbc = new PB_Register_CollectionPoint(pbDriver);
		pbc.checkupdateddata();
		
	}

	@Test(priority=3, description = "-A pop up confirmation will appear and ask user if they are sure to suspend the account | - Once confirming, user should have suspend checkbox checked")
	@Description("Suspending the Branch Account")
	public void suspendBranch() throws InterruptedException {
		System.out.println("Suspending the Branch Account");
		Branches alc_branch=new Branches(alcDriver);
		System.out.println("Member Phone number in suspend branch "+phoneNumber);
		alc_branch.suspendBranchAccount(Data.member_Number4864);

	}

	@SuppressWarnings("deprecation")
	@Test(priority =4, description = "User should not be able to login because account was suspended")
	@Description("Verify suspend Account in App")
	public void verifySuspendedAccount() throws InterruptedException {
		System.out.println("Verify suspend Account in App");
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		pbDriver.terminateApp("org.plasticbank.app");
		pbDriver.activateApp("org.plasticbank.app");
		Thread.sleep(20000);
		lp.logout();
		lp.login(Data.member_Number4864.replace("+63", ""),"123456a", "+63");
		pbDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		lp.susmem.isDisplayed();
		takescreenshotofandroid("User seeing the suspended account pop up.");
		lp.oKButton.click();
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	
	
	@Test(priority=6,description="Signup as branch directly from sign up page")
	@Description("Signup as branch directly from sign up page")
	public void signupasbranchdirectly() throws InterruptedException {
		PB_Register_CollectionPoint pbc = new PB_Register_CollectionPoint(pbDriver);
		pbc.createbranchdirectly();
	}
	@Test(priority=7, description = "Verify branch is searchable under Branches section and edit it's details.")
	@Description("Verify branch is searchable under Branches section and edit it's details.")
	public void direct_branchVerifyAndEdit() throws InterruptedException {
		Branches alc_branch=new Branches(alcDriver);
		System.out.println("Member Phone number in suspend branch edit "+phoneNumber);
		alc_branch.editBranchNameDetails(randomPhoneNumber);
		Thread.sleep(2000);
	}
	@Test(priority =8, description = "User should see the updated data on app")
	@Description("User should see the updated data on app")
	public void verifyEditInAppagain() throws InterruptedException {
		PB_LoginPage l=new PB_LoginPage(pbDriver);
		l.login(randomPhoneNumber,"123456a", "+63");
		PB_Register_CollectionPoint pbc = new PB_Register_CollectionPoint(pbDriver);
		pbc.checkupdateddata();
		
	}
	@Test(priority=9, description = "-A pop up confirmation will appear and ask user if they are sure to suspend the account | - Once confirming, user should have suspend checkbox checked")
	@Description("Suspending the Branch Account")
	public void suspendBranchagain() throws InterruptedException {
		System.out.println("Suspending the Branch Account");
		Branches alc_branch=new Branches(alcDriver);
		System.out.println("Member Phone number in suspend branch "+phoneNumber);
		alc_branch.suspendBranchAccount(randomPhoneNumber);

	}
	@SuppressWarnings("deprecation")
	@Test(priority =10, description = "User should not be able to login because account was suspended")
	@Description("Verify suspend Account in App")
	public void verifySuspendedAccountsecondtime() throws InterruptedException {
		System.out.println("Verify suspend Account in App");
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		pbDriver.terminateApp("org.plasticbank.app");
		pbDriver.activateApp("org.plasticbank.app");
		Thread.sleep(20000);
		lp.logout();
		lp.login(randomPhoneNumber,"123456a", "+63");
		pbDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		lp.susmem.isDisplayed();
		takescreenshotofandroid("User seeing the suspended account pop up.");
		lp.oKButton.click();
		pbDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	

}