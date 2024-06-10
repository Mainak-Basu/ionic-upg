package smoke_Suite;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Bonus;
import alchemy_Pages.Branches;
import alchemy_Pages.Orders;
import alchemy_Pages.Plastic_Chain;
import alchemy_Pages.Processors;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Transaction;

@Listeners({AllureTestNg.class})

public class ALC_4357 extends BaseClass {
	
	@Test(priority =0,enabled=true, description = "Verify that the correct KG and bonus values are showing in before transaction completion screen in mobile app | verify  the correct KG, bonus and amount value in Confirm Exchange Page | Verify in Branch 1 that there is no bonus recorded under Exchange ")
	@Description("Verify that the correct KG and bonus values are showing in before transaction completion screen in mobile app also verify  the correct KG, bonus and amount value in Confirm Exchange Page. Also verified in Branch 1 that there is no bonus recorded under Exchange ")
	public void member_Branch1_Transaction_KG_Bonus_App_Assertion() throws InterruptedException, IOException {
		
		Data pn = new Data();
      pn.runNewman(); 
		
		PB_Transaction t1=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		
       lo.login(Data.branch1_Number.replace("+63", ""), password,"+63");
		t1.m1toB1(Data.member_Number);
		
		Thread.sleep(10000);
		lo.logout();
		
	}
	
	@Test(priority =1,enabled=true, description = "1.Check Branch Details if KG Recycled, Members Registered and Active members count are correct. | 2. In branch 1 exchange history, check, Member photo, material name, material amount, money amount , total and bonus amount and associated bonus name. | 3.Check in Bonus search Area, KG promised KG delivered, and pending KG. | 4.Check HDPE and PET KG count in Bonus Summary. Also check bonus progress values. | 5. Check if the start bonus is there for the first branch in  Bonus Approval and Assert Total Bonus/Needing Approval")
	@Description("1.Check Branch Details if KG Recycled, Members Registered and Active members count are correct | 2. In branch 1 exchange history, check,  material name, material amount, money amount , total and bonus amount and associated bonus name | 3. Verify in Bonus search Area, KG promised KG delivered, and pending KG | 4. Verify HDPE and PET KG count in Bonus Summary.. Also check bonus progress values... | 5. Check if the start bonus is there for the first branch in  Bonus Approval and Assert Total Bonus/Needing Approval")
	public void member_Branch1_Transaction_KG_Bonus_Alchmey_Assertion() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Thread.sleep(3000);
		Branches br = new Branches(alcDriver);
		br.firstTransactionApproveExcHisB1(Data.branch1_Number);
		Thread.sleep(1000);
		Orders odr = new Orders(alcDriver);
		odr.bonusCheckPoints(Data.bonusName);
		odr.bonusExchangeHistoryCheckPoint();
		Bonus bon = new Bonus(alcDriver);
		bon.bounusTransaction1ValueVerify();
		
	}
	
	@Test(priority =2,enabled=true,description = "Do Transaction between Branch 1 and Branch 2 and Verify Bonus and Kg Transferred")
	@Description("Do Transaction between Branch 1 and Branch 2 and Verify Bonus and Kg Transferred")
	public void Branch1_Branch2_Transaction_App_Assertions() throws InterruptedException, IOException {
		
		PB_Transaction t2=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(Data.branch2_Number.replace("+63", ""), password,"+63");
		t2.b1toB2(Data.branch1_Number);
		
		Thread.sleep(10000);
		lo.logout();
	}
	
	
	
	@Test(priority =3,enabled=true,description = "Do Transaction between Branch 1 and Branch 3 and Verify Bonus and Kg Transferred")
	@Description("Do Transaction between Branch 1 and Branch 3 and Verify Bonus and Kg Transferred")
	public void Branch1_Branch3_Transaction() throws InterruptedException {
		
		PB_Transaction t3=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(Data.branch3_Number.replace("+63", ""), password,"+63");
		t3.b1toB3(Data.branch1_Number);
		Thread.sleep(10000);
		lo.logout();
		
	}
	
	@Test(priority =4,enabled=true,description = "Do Transaction between Branch 2 and Processor and Verify Bonus and Kg Transferred")
	@Description("Do Transaction between Branch 2 and Processor and Verify Bonus and Kg Transferred")
	public void Branch2_Processor_Transaction() throws InterruptedException {
		PB_Transaction t4=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(Data.processor_Number.replace("+63", ""), password,"+63");
		t4.b2ToP(Data.branch2_Number);
		Thread.sleep(10000);
		lo.logout();
	
	}
	
	@Test(priority =5,enabled=true,description = "Do Transaction between Branch 3 and Processor and Verify Bonus and Kg Transferred")
	@Description("Do Transaction between Branch 3 and Processor and Verify Bonus and Kg Transferred")
	public void Branch3_Processor_Transaction() throws InterruptedException {
		
		PB_Transaction t5=new PB_Transaction(pbDriver);
		PB_LoginPage lo =new PB_LoginPage(pbDriver);
		lo.login(Data.processor_Number.replace("+63", ""), password,"+63");
		t5.b3ToP(Data.branch3_Number);
		Thread.sleep(10000);
		lo.logout();
		
	}
	
	
	@Test(priority =6,enabled=true, description = "Assert Branch Tags Values in Summary in Branch1. | Check approve transaction from Branch 1. | Toggle all required, Verify Values and validate all gets approved.")
	@Description("Assert Branch Tags Values in Summary in Branch1.Check approve transaction from Branch 1. Toggle all required and Approve 1 and validate all gets approved.")
	public void Verify_Bonus_Branch1() throws InterruptedException {
	
		Branches br1= new Branches(alcDriver);
		br1.transactionApproveExcHisB1(Data.branch1_Number);
		
	}
	
	@Test(priority =7,enabled=true, description = "Assert Branch Tags Values in Summary in Branch2 | .Check approve transaction from Branch 2. | Toggle all required, Verify Values and validate all gets approved.")
	@Description("Assert Branch Tags Values in Summary in Branch2 .Check approve transaction from Branch 2. Toggle all required and Approve and validate all gets approved.")
	public void Verify_Bonus_Branch2() throws InterruptedException {
		
		Branches br2= new Branches(alcDriver);
		Thread.sleep(2000);
		br2.transactionApproveExcHisB2(Data.branch2_Number);
	}
	
	@Test(priority =8,enabled=true, description = "Assert Branch Tags Values in Summary in Branch3. | Check approve transaction from Branch 3. | Toggle all required, Verify Vallues and validate all gets approved.")
	@Description("Assert Branch Tags Values in Summary in Branch3.Check approve transaction from Branch 3. Toggle all required and Approve and validate all gets approved.")
	public void Verify_Bonus_Branch3() throws InterruptedException {
	
		Branches br3= new Branches(alcDriver);
		Thread.sleep(2000);
		br3.transactionApproveExcHisB3(Data.branch3_Number);
	}
	
	@Test(priority =9,enabled=true, description = "Verify details of transaction from Processor and validate all gets approved in processor Exchange History.")
	@Description("Verify details of transaction from Processor and validate all gets approved in processor Exchange History.")
	public void Verify_Bonus_Processor() throws InterruptedException {
		
		Thread.sleep(2000);
		Processors p1= new Processors(alcDriver);
		p1.transactionApproveExcHisP1(Data.processor_Number);
	}
	
	@Test(priority =10,enabled=true,description = "Check for plastic chain in the Bonus Order.Verify if it is all in Orange Color as they are pending. Also check Chain is in correct Order")
	@Description("Check for plastic chain in the Bonus Order.Verify if it is all in Orange Color as they are pending. Also check Chain is in correct Order")
	public void Plastic_Chain_Before_Approval() throws InterruptedException {
		
		Plastic_Chain pc1= new Plastic_Chain(alcDriver);
		pc1.plastic_ChainVerificationBefore(Data.bonusName);
	}
	
	@Test(priority =11,enabled=true, description = "In Bonus Approval Check for receipts | qty bonus values from Audit trail | Verify Total Weight/ Bonus in Bonus Approval Page")
	@Description("In Bonus Approval Check for receipts, qty bonus values from Audit trail. Verify Total Weight/ Bonus in Bonus Approval Page")
	public void VerifyBonusOrderRecieptBranchAssertions() throws InterruptedException {
	
		Bonus b1=new Bonus(alcDriver);
		b1.bonusBranch1Verification();
		b1.bonusBranch2Verification();
		b1.bonusBranch3Verification();
			
	}
	
	@Test(priority =12,enabled=true, description = "Verify in Bonus Approval and Assert 1.'Total Bonus'/'Needing Approval' | 2. Assert 'Audit Trail' under which it will Assert all the values in 'Buy/Sell Transactions' of all the Branches and Processor")
	@Description("Verify in Bonus Approval and Assert 1.'Total Bonus'/'Needing Approval' 2. Assert 'Audit Trail' under which it will Assert all the values in 'Buy/Sell Transactions' of all the Branches and Processor")
	public void VerifyBonusOrderBranchValueAssertions() throws InterruptedException {
		
		
		Bonus b2=new Bonus(alcDriver);
		b2.bonusBranch1ValueVerification();
		b2.bonusBranch2ValueVerification();
		b2.bonusBranch3ValueVerification();
		b2.processor1ValueVerification();
	
	}
	@Test(priority =13,enabled=true, description = "Check for transferred label in All the Branch exchange history.")
	@Description("Check for transferred label in All the Branch exchange history.")
	public void BonusTransferedCheck() throws InterruptedException {

		Branches br = new Branches(alcDriver);
		br.verifyBonusTransfered(Data.branch1_Number);
		br.verifyBonusTransfered(Data.branch2_Number);
		br.verifyBonusTransfered(Data.branch3_Number);
			
	}
	
	@Test(priority =14,enabled=true,description = "Verified Check chain turned to green and is in order.")
	@Description("Verified Check chain turned to green and is in order.")
	public void Plastic_Chain_After_Approval() throws InterruptedException {
	
		Plastic_Chain pc2= new Plastic_Chain(alcDriver);
		pc2.plastic_ChainVerificationAfter(Data.bonusName);
	}
	
	@Test(priority =15,enabled=true, description = "Check bonus amount is accurate in Plastic Bank App for member and Branch 1,2,3 ")
	@Description("Check bonus amount is accurate in Plastic Bank App for Member Branch 1,2,3 ")
	public void checkBonusTransferedInApp() throws InterruptedException {

		PB_Transaction bv=new PB_Transaction(pbDriver);
		bv.CheckMemberBonus();
		bv.CheckBranchBonus(Data.branch1_Number.replace("+63", ""), password);
		bv.CheckBranchBonus(Data.branch2_Number.replace("+63", ""), password);
		bv.CheckBranchBonus(Data.branch3_Number.replace("+63", ""), password);

	}
	
}

