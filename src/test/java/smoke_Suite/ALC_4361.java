package smoke_Suite;


import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.BaseClass;
import Utilities.Data;
import Utilities.ScreenshotListener;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Register_CollectionPoint;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_4361 extends BaseClass{

	@Test(priority =1, description="Create data for testcase ALC_4361")
	@Description("Create data for testcase ALC_4361")
public void createdata() throws IOException {
	Data dt = new Data();
		dt.runNewmanFor_ALC_4361();
	}
	
	@Test(priority=2, description="Perform transactions between member, branch and processor")
	@Description("Perform transactions between member, branch and processor")
	public void doTransactions() throws InterruptedException {
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.values_ALC_4361.get(2).replace("+63", ""), password,"+63");
		PB_Transaction pbt = new PB_Transaction(pbDriver);
		pbt.memberToBranchDonation(Data.values_ALC_4361.get(1));
		PB_LoginPage pblogin1 = new PB_LoginPage(pbDriver);
		pblogin1.login(Data.values_ALC_4361.get(4).replace("+63", ""), password,"+63");
		PB_Transaction pbt1 = new PB_Transaction(pbDriver);
		pbt1.branchToProcessorDonation(Data.values_ALC_4361.get(2));
}
	@Test(priority=3, description="Verify that no bonus is received for donation")
	@Description("Verify that  no bonus is received for donation")
	public void verifyNoBonusForDonations() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Branches b= new Branches(alcDriver);
		b.checknobonus(Data.values_ALC_4361.get(2));
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		pblogin.login(Data.values_ALC_4361.get(2).replace("+63", ""), password,"+63");
		PB_Transaction pbt = new PB_Transaction(pbDriver);
		pbt.verifyNoBonusForDonation();
		PB_LoginPage pblogi = new PB_LoginPage(pbDriver);
		pblogi.login(Data.values_ALC_4361.get(1).replace("+63", ""), password,"+63");
		PB_Transaction pb = new PB_Transaction(pbDriver);
		pb.verifyNoBonusForDonationmem();
	}
	
	
	
}