package smoke_Suite;

import java.io.IOException;
import java.util.Collections;

import alchemy_Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import plastic_Bank_Pages.PB_Transaction;

public class ALC_1711 extends BaseClass {

	public int kgByCountryAfterVoid;
	public int kgByCountryBeforeVoid;
	public int kgByPhilippinesBeforeVoid;
	public int kgByPhilippinesAfterVoid;
	public int totalKGByCountry;
	public int totalKGByPhilippines;


	@Test(priority =0,enabled=true, description = "Create Data and do Transaction with delayed Bonus")
	public void createAndPerformTransaction() throws IOException {
		Data p= new Data();
		p.runNewman1711();
	}
	@Test(priority =1,enabled=true, description = "Verify KG Recycled in Branch | Bonus Exchange History In Branch And Processor Before Bonus Pay")
	public void kgRecycledAndBonusInBranchExcHistoryBeforeVoid() throws InterruptedException {

		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Thread.sleep(3000);
		Branches b1= new Branches(alcDriver);
		b1.kgRecycledInBranch(Data.branch1_Id1711,"19");
		b1.kgRecycledInBranch(Data.branch2_Id1711,"0");
		b1.bonusExchangeHistoryBranch(Data.branch1_Id1711);
		b1.bonusExchangeHistoryBranch(Data.branch2_Id1711);
		b1.bonusProcessorExcHistoryVerification(Data.processor_Id1711);

	}
	@Test(priority =2,enabled=true, description = "Verify Kg By Country and Kg In Philippines Before Void")
	public void dashBoardVerificationsBeforeVoid() throws InterruptedException {

		Dashboard d1= new Dashboard(alcDriver);
		Dashboard.checkKgByCountry();

		kgByCountryBeforeVoid=Dashboard.kgByCountryValue;
		kgByPhilippinesBeforeVoid=Dashboard.kgByPhilippinesValue;

		System.out.println("Kg By Country before void: " + kgByCountryBeforeVoid);
		System.out.println("Kg By Philippines before void: " + kgByPhilippinesBeforeVoid);

	}

	@Test(priority =3,enabled=true, description = "Bonus Order's Exchange history | BUY/SELL transaction from Bonus order approval screen before Void")
	public void bonusOrderExcHisVerificationBeforeVoid() throws InterruptedException {

		Orders o1= new Orders(alcDriver);
		o1.bonusExcHisVerification(Data.bonusOrderId1711);
		o1.buySellVerification_1711beforeVoid(Data.bonusOrderId1711);

	}
	
	//pbapp-1526
	
	@Test(priority =4,enabled=true, description = "Check member exchange history | Associated bonus from branch and Processor exchange history")
	public void ExcHisBonusVerificationBeforeVoid() throws InterruptedException {

		Members m1= new Members(alcDriver);
		Branches b1= new Branches(alcDriver);
		m1.memberExcHisBeforeVoid_1711();
		b1.bonusBranchExcHistoryVerification(Data.branch1_Id1711);
		b1.bonusBranchExcHistoryVerification(Data.branch2_Id1711);
		b1.bonusProcessorExcHistoryVerification(Data.processor_Id1711);

	}
	//@Test(priority =5,enabled=true, description = "Verify Tokens in app for Member, Branch 1 & 2 before Void")
	public void verifyTokenInAppBeforeBonusPaid() throws InterruptedException {

		PB_Transaction p1 =new PB_Transaction(pbDriver);
		p1.verifyBonusInAppMem_1711_BeforeBonusPaid();
		p1.branchBonusPresent2(Data.branch1_Number1711,password,"30");
		p1.branchBonusPresent2(Data.branch2_Number1711,password,"14");



	}
	@Test(priority =6,enabled=true, description = "Approve Bonus For member and Branches")
	public void approveBonus() throws InterruptedException {

		Bonus b1= new Bonus(alcDriver);
		b1.payBonus1711();



	}
	@Test(priority =7,enabled=true, description = " Member should get the correct bonus in Alchemy | Branch 1 & 2 should get the correct bonus in Alchemy " )
	public void verifyBonusInAlchmeyAfterBonusPaid() throws InterruptedException {

		Branches b2= new Branches(alcDriver);
		Members m2= new Members(alcDriver);
		m2.memberBonus(Data.member_Id1711,"133");
		b2.verifyBonusInAlchmeyBranches_1711(Data.branch1_Id1711,"30");
		b2.verifyBonusInAlchmeyBranches_1711(Data.branch2_Id1711,"14");

	}
	@Test(priority =8,enabled=true, description = " Member should get the correct bonus in App | Branch 1 & 2 should get the correct bonus in App")
	public void verifyBonusInAppAfterBonusPaid() throws InterruptedException {

		PB_Transaction p2 =new PB_Transaction(pbDriver);
		p2.verifyBonusInAppMem_AfterBonusPaid(Data.member_Number1711.replace("+63",""),password);
		p2.verifyBonusInAppB1_AfterBonusPaid(Data.branch1_Number1711.replace("+63",""),password);
		p2.verifyBonusInAppB1_AfterBonusPaid(Data.branch2_Number1711.replace("+63",""),password);


	}
	@Test(priority =9,enabled=true, description = "Void Transaction")
	public void voidTransaction() throws InterruptedException {
		Branches b1=new Branches(alcDriver);
		b1.voidTransaction(Data.branch1_Id1711);

	}
	@Test(priority =10,enabled=true, description = "Verify Kg recycled in Branch 1 & 2 | Verify Associated bonus from branch 1 & 2 exchange history ")
	public void kgRecycledInBranchAfterVoid() throws InterruptedException {


		Branches b1= new Branches(alcDriver);
		b1.kgRecycledInBranch(Data.branch1_Id1711,"0");
		b1.kgRecycledInBranch(Data.branch2_Id1711,"0");
		b1.bonusExchangeHistoryBranchAfterVoid(Data.branch1_Id1711);
		b1.bonusExchangeHistoryBranchAfterVoid(Data.branch2_Id1711);


	}
	@Test(priority =11,enabled=true, description = " Verify total KG and KG by Country for the specific country will be deducted based on the voided KG in Dashboard ie. 19 KG ")
	public void dashBoardVerificationsAfterVoid() throws InterruptedException {

		Dashboard d1= new Dashboard(alcDriver);

		Dashboard.checkKgByCountry();

		Thread.sleep(2000);
		kgByCountryAfterVoid=Dashboard.kgByCountryValue;
		kgByPhilippinesAfterVoid=Dashboard.kgByPhilippinesValue;

		System.out.println("Kg By Country before void: " + kgByCountryBeforeVoid);
		System.out.println("Kg By Philippines before void: " + kgByPhilippinesBeforeVoid);

		System.out.println("Kg By Country after void: " + kgByCountryAfterVoid);
		System.out.println("Kg By Philippines after void: " + kgByPhilippinesAfterVoid);

		Thread.sleep(1000);
		totalKGByCountry=kgByCountryBeforeVoid-kgByCountryAfterVoid;
		System.out.println("Total Kg transaction Country Wise"+totalKGByCountry);
		totalKGByPhilippines=kgByPhilippinesBeforeVoid-kgByPhilippinesAfterVoid;
		System.out.println("Total Kg transaction in phillipenes"+totalKGByPhilippines);

		try {
			Thread.sleep(30000);
			Assert.assertEquals(totalKGByCountry,19);
			Assert.assertEquals(totalKGByPhilippines,19);
		}
		catch (Exception e){
			System.out.println("Some Transaction happend while execution of the code");
		}
	}
	@Test(priority =12,enabled=true, description = "In Bonus Order's Exchange history, transaction will be removed ")
	public void bonusOrderExcHisVerificationAfterVoid() throws InterruptedException {

		Orders o1= new Orders(alcDriver);
		o1.bonusExcHisVerification(Data.bonusOrderId1711);
		o1.buySellVerification_1711AfterVoid(Data.bonusOrderId1711);

	}
	@Test(priority =13,enabled=true, description = " KG from voided transaction is deducted in Bonus Progress under the Bonus Order Summary tab.")
	public void bonusProgressInSummaryTabAfterVoid() throws InterruptedException {

		Orders o1= new Orders(alcDriver);
		o1.bonusProgressInSummaryTab("0 KG");

	}

	@Test(priority =14,enabled=true, description = "Reclaim the Token")
	public void reclaimToken() throws InterruptedException {

		Branches b1= new Branches(alcDriver);
		b1.reclaimToken(Data.branch1_Id1711);

	}
	@Test(priority =15,enabled=true, description = " Verify Bonus will be reclaimed from APP member profile and In Branch 1 & 2 Profile ")
	public void verifyBonusInAppAfterReclaimToken() throws InterruptedException {

		PB_Transaction p2 =new PB_Transaction(pbDriver);
		p2.verifyBonusInAppMem_1711_AfterVoid();
		p2.verifyBonusInAppB1_AfterBonusPaid(Data.branch1_Number1711.replace("+63", ""),password);
		p2.verifyBonusInAppB1_AfterBonusPaid(Data.branch2_Number1711.replace("+63", ""),password);


	}
	@Test(priority =16,enabled=true, description = "Verify Bonus will be reclaimed from Alchemy member profile and In Branch 1 & 2 Profile ")
	public void verifyBonusInAlchmeyAfterReclaimToken() throws InterruptedException {

		Branches b2= new Branches(alcDriver);
		Members m2= new Members(alcDriver);
		m2.memberBonus(Data.member_Id1711,"0");
		b2.verifyBonusInAlchmeyBranches_1711(Data.branch1_Id1711,"0");
		b2.verifyBonusInAlchmeyBranches_1711(Data.branch2_Id1711,"0");

	}

	@Test(priority =17,enabled=true, description = "In Bonus Order's Exchange history, following transactions :  branch 1 -> branch 2 transaction and branch2  to Processor transactions is also automatically removed ")
	public void bonusExchangeHistoryTransaction() throws InterruptedException {

		Orders o1= new Orders(alcDriver);
		o1.bonusExcHisVerification(Data.bonusOrderId1711);

	}
	@Test(priority =18,enabled=true, description = "Associated bonus from branch exchange history and processor exchange history will be removed for transactions")
	public void branchExchangeHistoryBonus() throws InterruptedException {
		Branches b1= new Branches(alcDriver);
		b1.bonusBranchExcHistoryAfterVoidVerification(Data.branch1_Id1711);
		b1.bonusBranchExcHistoryAfterVoidVerification(Data.branch2_Id1711);
		b1.bonusProcessorExcHistoryVerification(Data.processor_Id1711);
	}


}