package smoke_Suite;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Members;
import alchemy_Pages.Processors;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Member_Profile;

public class ALC_4995 extends BaseClass{
	@Test(priority=1, description="Create a processor.")
	@Description("Create a processor.")
	public void createstore() throws IOException {
		Data d= new Data();
		d.createProcessor();
	}
	
	
	
	@Test(priority=2, description="Send 1000 tokens to the newly created processor")
	@Description("Send 1000 tokens to the newly created processor")
	public void sendtokenstobranch() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Processors p = new Processors(alcDriver);
		p.sendtokenstoprocessor(Data.processorNumber);  
	}
	
	@Test(priority=3, description="Verify newly transfered tokens are visble in the processor account wallet in app.")
	@Description("Verify newly transfered tokens are visble in the processor account wallet in app.")
	public void verifytokensinapp() throws InterruptedException {
		PB_LoginPage pl = new PB_LoginPage(pbDriver);
		pl.login(Data.processorNumber.replace("+63", ""),"123456a","+63");
		PB_Member_Profile pmp = new PB_Member_Profile(pbDriver);
		pmp.verifytokensarepresentprocessor();
		
	}
	@Test(priority = 4, description="Reclaim the 1000 tokens from store account on alchemy.")
	@Description("Reclaim the 1000 tokens from store account on alchemy.")
	public void reclaimtokens() {
		Members m = new Members(alcDriver);
		m.reclaimtokens();
	}
	@Test(priority=5, description="Verify reclaimed tokens are not present in the processor account wallet in app.")
	@Description("Verify reclaimed tokens are not present in the processor account wallet in app.")
	public void verifytokensnotinapp() throws InterruptedException {
		PB_LoginPage pl = new PB_LoginPage(pbDriver);
		pl.logout();
		PB_LoginPage pl1 = new PB_LoginPage(pbDriver);
		pl1.login(Data.processorNumber.replace("+63", ""),"123456a","+63");
		PB_Member_Profile pmp = new PB_Member_Profile(pbDriver);
		pmp.verifytokensarenotpresentprocessor();
	}
}
