package smoke_Suite;

import Utilities.BaseClass;
import Utilities.Data;
import Utilities.ScreenshotListener;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Orders;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Transaction;

//ALC-4350 = In App, Member - Create , new user login, edit, check in Alchemy to confirm new user exists , suspend account

@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_4365 extends BaseClass {
	

	@Test(priority=0, description = "Bonus order should be  stopped")
    @Description("Login on alchemy and create new bonus")
    public void createNewBonusAndSuspendedBonus() throws InterruptedException, IOException {
		
		Data d2= new Data();
		d2.createMemberBranch();
		
        AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
        loginAlchmey.alc_adminlogin("+17783844311","778778");
		
		Orders alc_orders = new Orders(alcDriver);
        alc_orders.createBonus("Fleek_Bonus_22_1", "plastic", "10000", "7", "2", "778899", Data.branch1_NameMB);
        alc_orders.changeBranchBonusDetails();
        alc_orders.checkOrderStopped("Fleek_Bonus_22_1");
    }


	@Test(priority=1, description = "New member transaction with the branch in the stopped bonus order DOES NOT generate bonus once the Bonus order is stopped")
	@Description("Signing up a member and Login Verification and Logout")
	public void verifyTransactionStoppedBonus()throws InterruptedException, IOException {
		PB_LoginPage pblogin = new PB_LoginPage(pbDriver);
		PB_Transaction pbTransaction = new PB_Transaction(pbDriver);

		pblogin.login(Data.branch1_NumberMB.replace("+63", ""),password,"+63");
		Thread.sleep(5000);
		 pbTransaction.transactionBranchStopBonus(Data.member_NumberMB);
		
		
	}


}
