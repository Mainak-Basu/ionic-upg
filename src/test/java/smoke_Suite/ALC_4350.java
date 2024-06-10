package smoke_Suite;

import Utilities.ScreenshotListener;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Members;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_CollectionPoint;
import plastic_Bank_Pages.PB_Register_Member;
import plastic_Bank_Pages.PB_Transaction;

//ALC-4350 = In App, Member - Create , new user login, edit, check in Alchemy to confirm new user exists , suspend account

@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_4350 extends BaseClass {


	@Test(priority=0, description = "New member account should be successfully created | New member should be successfully logged in")
	@Description("Signing up a member and Login Verification and Logout")
	public void signUp()throws InterruptedException {
		
		System.out.println("Signing up a member and Login Verification and Logout");
		PB_Register_Member pbsignup= new PB_Register_Member(pbDriver);
		pbsignup.signUpCollector();
		Thread.sleep(3000);
		 TakesScreenshot ts1 = (TakesScreenshot) pbDriver; byte[] screenshot1 =
				  ts1.getScreenshotAs(OutputType.BYTES); Allure.addAttachment("collector created",
				  new ByteArrayInputStream(screenshot1)); Thread.sleep(2000);
		pbsignup.logout();	
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(randomPhoneNumber,password,"+63");
		Thread.sleep(5000);
		 TakesScreenshot ts2 = (TakesScreenshot) pbDriver; byte[] screenshot2 =
				  ts2.getScreenshotAs(OutputType.BYTES); Allure.addAttachment("login after newly created collector",
				  new ByteArrayInputStream(screenshot2)); Thread.sleep(2000);
		pblogin.logoutmem();
		
	}

	@Test(priority = 1, description = "Login on alchemy with admin user")
	@Description("Alchmey Login")
	public void loginAlchmey() throws InterruptedException {
		
		System.out.println("Alchmey Login");
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Thread.sleep(3000);
		
	}
	@Test(priority =2, description = "New member account is searchable in Alchemy under the 'Members' section")
	@Description("Verification of member in Alchmey")
	public void VerifyMemberAlchmey() throws InterruptedException {
		System.out.println("Verification of member in Alchmey");
		
		Members alc_mem =new Members(alcDriver);
		alc_mem.selectAndverifyMember(phoneNumber);
		Thread.sleep(5000);
	}

	@Test(priority =3, description = "-New member can be successfully created in app | -New member account is searchable in Alchemy under the 'Members' section")
	@Description("Add Branch and Create Member and LogOut")
	public void createBranchAndMember() throws InterruptedException, IOException {
		System.out.println("Add Branch and Create Member and LogOut");
		Data d = new Data();
		d.createBranch();
		PB_Register_CollectionPoint branchCreate=new PB_Register_CollectionPoint(pbDriver);
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.branchNumber.replace("+63", ""),password,"+63");
		branchCreate.addMemberToCreatedBranch();
		Thread.sleep(5000);
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logoutb();		
	}

	@Test(priority=4, description = "- Data displayed in user will turn into a field that can be edited | -Changes are saved and can be seen in user details")
	@Description("Edit the branch member details in Alchmey")
	public void EditMemberDetails() throws InterruptedException {
		System.out.println("Edit the branch member details in Alchmey");
		Members mem=new Members(alcDriver);
		mem.editMemberDetails(branchMemberphoneNumber,"Gayas Khan");
	}
	@Test(priority=5, description = "User should see the updated data")
	@Description("Login in App with Branch Member Details")
	public void loginBranchMemberPB() throws InterruptedException {
		System.out.println("Login in App with Branch Member Details");
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		lp.login(randomBranchMemberPhoneNumber, password,"+63");
		Thread.sleep(5000);
		TakesScreenshot ts1 = (TakesScreenshot) pbDriver; byte[] screenshot1 =
				  ts1.getScreenshotAs(OutputType.BYTES); Allure.addAttachment("collector created",
				  new ByteArrayInputStream(screenshot1)); Thread.sleep(2000);
		PB_Register_Member pbRegMem=new PB_Register_Member(pbDriver);
		pbRegMem.logout();
	}
	@Test(priority=6, description = "-A pop up confirmation will appear and ask user if they are sure to suspend the account | - Once confirming, user should have suspend checkbox checked")
	@Description("Suspend Member in Alchmey")
	public void suspendMemberALC() throws InterruptedException {
		System.out.println("Suspend Member in Alchmey");
		Members mem=new Members(alcDriver);
		System.out.println("Suspending this member "+branchMemberphoneNumber);
		mem.suspendMember(branchMemberphoneNumber);
		Thread.sleep(4000);
	}
	@Test(priority=7, description = "User should not be able to login because account was suspended")
	@Description("Login in Mobile app with Suspended Member details")
	public void memberSuspendVerify() throws InterruptedException {
		
		System.out.println("Login in Mobile app with Suspended Member details");
		PB_LoginPage lp =new PB_LoginPage(pbDriver);
		lp.login(randomBranchMemberPhoneNumber,password,"+63");
		PB_Register_CollectionPoint cp = new PB_Register_CollectionPoint(pbDriver);
		cp.verifysuspendedmember();
		
		
			
	}
	@Test(priority=8, description = "Suspended member should not appear in the search")
	@Description("Verify Suspended member By Branch Login")
	public void branchSuspendMemberVerification() throws InterruptedException {
	
		System.out.println("Verify Suspended member By Branch Login");
		Thread.sleep(3000);
		PB_LoginPage lp = new PB_LoginPage(pbDriver);
		lp.login(Data.branchNumber.replace("+63", ""),password,"+63");
		Thread.sleep(2000);
		PB_Transaction pt = new PB_Transaction(pbDriver);
		
		pt.verifyaddedmemsuspended(randomBranchMemberPhoneNumber);
		Thread.sleep(2000);
	    TakesScreenshot ts1 = (TakesScreenshot) pbDriver;
	    byte[] screenshot1 = ts1.getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Screenshot1", new ByteArrayInputStream(screenshot1));
	    Thread.sleep(2000);
		
		
	}
}
