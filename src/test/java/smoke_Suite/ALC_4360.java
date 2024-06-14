package smoke_Suite;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import Utilities.ScreenshotListener;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import alchemy_Pages.Orders;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_4360 extends BaseClass{

	
	@Test(priority=0,description="Transaction between member>branch1>branch2>processor with Bonus")
	public void makeTransaction() throws IOException {
		Data p= new Data();
		p.runonceFor_ALC_4360();
	}
	
	@Test(priority=1,description="verify Kg recycled and Delayed Bonus in Branch1 and Branch2 ")
	public void verifyKgRecycledAndDelayedBonus() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
        loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
        Branches b= new Branches(alcDriver);
        b.verifykgrecycled();
        b.verifyDelayedBonus();
	}
	
        @Test(priority=2,description="verify delayed bonus is appearing in APP for member and branch 1 and branch 2 based on the transaction")
        public void verifyDelayedBonusInApp() throws InterruptedException, IOException {
        	      PB_LoginPage lo =new PB_LoginPage(pbDriver); 
        	      lo.login(Data.mnum4360.replace("+63", ""), password,"+63"); 
        	      PB_Transaction p=new PB_Transaction(pbDriver);
       			  p.verifyMemberBonusPresent(); 
       			  PB_LoginPage lo1 =new PB_LoginPage(pbDriver);
       			  lo1.login(Data.b1number4360.replace("+63", ""), password,"+63"); 
       			  PB_Transaction p1=new PB_Transaction(pbDriver); 
       			  p1.verifyBranch1BonusPresent(); 
       			  PB_LoginPage lo2 = new PB_LoginPage(pbDriver); 
       			  lo2.login(Data.b2number4360.replace("+63", ""), password,"+63");
       			  PB_Transaction p2=new PB_Transaction(pbDriver);
       			  p2.verifyBranch2BonusPresent();                             
       			
       			  
 }
        
    @Test(priority=3,description="Bonus BUY AND SELL transactions are appearing in the Bonus order approval screen")
    public void verifyBuySellTransactionInBonusOrder() throws InterruptedException, IOException {
    
    	Orders o= new Orders(alcDriver);
        o.buySellPresent();
    }
	@Test(priority=4,description="Bonus is disabled and associated bonus is dissapering in Branch1 and Branch2 Exchange History")
	public void disablebonusAndVerifyExchangeHistory() throws InterruptedException {
		
		Branches b= new Branches(alcDriver);
		b.disablebonus();
	}
	@Test(priority=5,description="verify Buy Sell Transaction removed from BonusOrder Approval Screen |Verify after disabling, Bonus progress value in the Bonus order Summary screen is showing zero as value with 0% fulfilled status ")
	public void verifyBuySellRemovedBonusInBonusOrderSummary() throws InterruptedException {
		
		Orders o= new Orders(alcDriver);
		o.verifyBonusOrderSummaryAndApprovalSteps();
	}
	@Test(priority=6,description="Delayed Bonus Is removed in App for Member and Branch1 and Branch2 profile screen")
	public void delayedBonusRemovedInApp() throws InterruptedException {
		
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(Data.mnum4360.replace("+63", ""), password,"+63");
        PB_Transaction p=new PB_Transaction(pbDriver);
        p.verifyMemberBonusNotPresent();
        PB_LoginPage lo1 =new PB_LoginPage(pbDriver);
        lo1.login(Data.b1number4360.replace("+63", ""), password,"+63");
        PB_Transaction p1=new PB_Transaction(pbDriver);
        p1.verifyBranch1BonusNotPresent();
        PB_LoginPage lo2 =new PB_LoginPage(pbDriver);
        lo2.login(Data.b2number4360.replace("+63", ""), password,"+63");
        PB_Transaction p2=new PB_Transaction(pbDriver);
        p2.verifyBranch2BonusNotPresent();
	}
	
	
}
