package smoke_Suite;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import alchemy_Pages.Processors;
import io.qameta.allure.Description;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Transaction;

public class ALC_258 extends BaseClass{
@Test(priority=0, description="Create a member, branch, processor and a bonus with the same branch and processor")
@Description("Create a member, branch, processor and a bonus with the same branch and processor")
public void createdata() throws IOException {
	Data d = new Data();
	d.runNewman_1Branch();
}
@Test(priority=1, description="Go the branch and take note of branch details:- 1) KG recycled, 2) Active members, 3) Members Registered and 4) Tokens in wallet.")
@Description("Go the branch and take note of branch details:- 1) KG recycled, 2) Active members, 3) Members Registered and 4) Tokens in wallet.")
public void checkalchemy() throws InterruptedException {
	AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
	loginAlchmey.alc_adminlogin("+17783844311","778778");
	Branches b = new Branches(alcDriver);
	b.checkbranchdetails(Data.branch1_Number4359);
}
@Test(priority=2, description="Login into branch and buy materials from member")
@Description("Login into branch and buy materials from member")
public void dotransactions() throws InterruptedException, IOException {
	PB_Transaction t1=new PB_Transaction(pbDriver);
	PB_LoginPage lo =new PB_LoginPage(pbDriver);
	lo.login(Data.branch1_Number4359.replace("+63", ""), password,"+63");
	t1.m1toB1(Data.member_Number4359);
	lo.logout();
}
@Test(priority=3,description="Sell material 1 to processor with receipt and material 2 to processor without receipt.")
@Description("Sell material 1 to processor with receipt and material 2 to processor without receipt.")
public void selltoprocessor() throws InterruptedException {
	PB_Transaction pbt = new PB_Transaction(pbDriver);
	PB_LoginPage lo =new PB_LoginPage(pbDriver);
	lo.login(Data.branch1_Number4359.replace("+63", ""), password,"+63");
	pbt.sell_hdpe_branch_To_Processor_with_receipt(Data.processor_Name4359);
	pbt.sell_pet_branch_To_Processor_without_receipt(Data.processor_Name4359);
}
@Test(priority=4, description="Go to branch and processor one by one to check transaction details.")
@Description("Go to branch and processor one by one to check transaction details.")
public void verifytransactions() throws InterruptedException {
	Branches b= new Branches(alcDriver);
	b.checkbranchexchangehitory(Data.branch1_Number4359);
	Processors p= new Processors(alcDriver);
	p.checkprocessorexchangehistory(Data.processor_Number4359);
	b.checkbranchdetailslater(Data.branch1_Number4359);
}
}
