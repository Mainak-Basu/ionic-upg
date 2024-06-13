package smoke_Suite;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Data;
import Utilities.ScreenshotListener;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Benefits;
import alchemy_Pages.Country_Settings;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.Chrome_app;
@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_4864 extends BaseClass {

	@Test(enabled=true, priority = 1, description="Create a benefit transaction in mobile's web browser application and verify it's presence in the all benefits table.")
	@Description("Create a benefit transaction in mobile's web browser application and verify it's presence in the all benefits table.")
	public void step5() throws InterruptedException, MalformedURLException {
		Chrome_app ch = new Chrome_app(pbDriver);
		ch.createbenefitonphonebrowser();
	}
	
	@Test(priority=2, description="Create a member for recording benefit transaction under itself.")
	@Description("Create a member for recording benefit transaction under itself.")
	public void createdata() throws IOException {
		Data d = new Data();
		d.createMember4864();
	}
	
	@Test(priority=3, description="Login to alchemy and verify that User should be able to search a member's name and click the 'Get started' button to proceed to the 'Record new benefit' form")
	@Description("Login to alchemy and verify that User should be able to search a member's name and click the 'Get started' button to proceed to the 'Record new benefit' form")
	public void step1() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Benefits ben = new Benefits(alcDriver);
		ben.verifyandbencreator();
		ben.verifyUserDirectedToRNBForm();	
	}
	@Test(priority=4, description="Verify that User should be able to save a completely and correctly filled out Record new benefit form by clicking the Save button."+
	" Verify that the Benefit order funder and Benefit order name are auto-populated based on the default master order of member's country.")
	@Description("Verify that User should be able to save a completely and correctly filled out Record new benefit form by clicking the Save button."+
			" Verify that the Benefit order funder and Benefit order name are auto-populated based on the default master order of member's country.")
	public void step2() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.fillForm();
		ben.verify_benordname_and_benfunder();
		ben.verifyBenefitIsSaved();
	}
	@Test(priority=5, description="User is able to see and access the recorded benefit information.")
	@Description("User is able to see and access the recorded benefit information.")
	public void step3() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.openSavedBenefit();
		ben.verifyUserCanSeeDetails();
	}
	@Test(priority=6, description="Saved benefit is included in the export file.")
	@Description("Saved benefit is included in the export file.")
	public void step4() throws IOException {
		Benefits ben = new Benefits(alcDriver);
		ben.downloadandverifytable();
	}
	
	@Test(priority=7, description="The filled form with the existing details should display and user should be able to edit.")
	@Description("The filled form with the existing details should display and user should be able to edit.")
	public void step6() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.checkIfBenefitIsEditable();
	}
	@Test(priority=8, description="A confirmation modal window should be displayed.")
	@Description("A confirmation modal window should be displayed.")
	public void step7() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.click_cancel_and_confirm_message();
	}
	@Test(priority=9, description="There should be no modifications made on the benefit information.")
	@Description("There should be no modifications made on the benefit information.")
	public void step8() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verifyThatNoChangesWereMade();
	}
	@Test(priority=10, description="User should be able to save a completely and correctly edited form.")
	@Description("User should be able to save a completely and correctly edited form.")
	public void step9() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verifyThatUserAbleToSaveEditedBenefit();
	}
	@Test(priority=11, description="The benefit transaction should reflect the updated information.")
	@Description("The benefit transaction should reflect the updated information.")
	public void step10() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verifyThatUserCanSeeUpdatedInformation();
	}
	@Test(priority=12, description="Verify that void button exists and There is a modal window that is displayed after clicking the Void benefit button.")
	@Description("Verify that void button exists and There is a modal window that is displayed after clicking the Void benefit button.")
	public void step11() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.confirmVoidButtonExists();
	}
	@Test(priority=13, description="User will return to the benefit details page after clicking cancel button")
	@Description("User will return to the benefit details page after clicking cancel button")
	public void step12() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verify_User_Returns_To_Details_Page_After_Clicking_Cancel();
	}
	@Test(priority=14, description="User will be reverted back to the All benefits table")
	@Description("User will be reverted back to the All benefits table")
	public void step13() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.confirm_and_void_benefit();
	}
	@Test(priority=15, description="Voided benefit is no longer searchable")
	@Description("Voided benefit is no longer searchable")
	public void step14() throws IOException, InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verify_benefit_not_searchable_after_voiding();
	}
	@Test(priority=16, description="Voided benefit is no longer displayed on the Export file")
    @Description("Voided benefit is no longer displayed on the Export file")
	public void step15() throws IOException {
		Benefits ben = new Benefits(alcDriver);
		ben.verify_voided_table();
	}
	
	@Test(priority=17, description="The Create new Benefit Order screen will open")
	@Description("The Create new Benefit Order screen will open")
	public void step16() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.opennewbenefitorderandsetasdefaultmasterorder();
	}
	@Test(priority=18, description="Save button is only enabled when all the mandatory fields are completely and correctly field.")
	@Description("Save button is only enabled when all the mandatory fields are completely and correctly field.")
	public void step17() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.fillformandverifysavebuttonenabledonlyafterformfills();
	}
	@Test(priority=19, description="User is reverted back to the Benefit Orders page after clicking the Save button.")
	@Description("User is reverted back to the Benefit Orders page after clicking the Save button.")
	public void step18() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.clicksaveandverifyuserrevertedtobenorderpage();
	}
	@Test(priority=20, description="The filled form with the existing details should display and user should be able to edit.")
	@Description("The filled form with the existing details should display and user should be able to edit.")
	public void step19() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verifyBenefitOrderCanBeEdited();
	}
	@Test(priority=21, description="A confirmation modal window should be displayed.")
	@Description("A confirmation modal window should be displayed.")
	public void step20() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verifycancelconfirmationmessage();
	}
	@Test(priority=22, description="The benefit order details page should reflect the updated information.")
	@Description("The benefit order details page should reflect the updated information.")
	public void step21() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verifyUserCanSeeUpdatedInformation();
	}
	@Test(priority= 23, description="Create a benefit before changing conversion rate in country settings.")
	@Description("Create a benefit before changing conversion rate in country settings.")
	public void step23() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.step23();
		
	}
	@Test(priority= 24, description="User able to change the exchange rate value of the country.")
	@Description("User able to change the exchange rate value of the country.")
	public void step24() throws InterruptedException {
		Country_Settings cs = new Country_Settings(alcDriver);
		cs.changeconversionrate();
	}
	@Test(priority= 26, description="The Benefit cost local and its USD conversion did not change after changing the exchange rate in the Country settings.")
	@Description("The Benefit cost local and its USD conversion did not change after changing the exchange rate in the Country settings.")
	public void step25() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.step25();
	}
	@Test(priority= 27, description="The USD conversion is still based on the previous exchange rate and not based on the updated exchange rate.")
	@Description("The USD conversion is still based on the previous exchange rate and not based on the updated exchange rate.")
	public void step26() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.step26();
		
	}
	
	@Test(priority = 28, description="Create new benefit orders and add benefits to one of the benefit orders for next steps.")
	@Description("Create new benefit orders and add benefits to one of the benefit orders for next steps.")
	public void createtestdata() throws InterruptedException {
		Country_Settings cs = new Country_Settings(alcDriver);
		cs.revertexchrate();
		Benefits ben = new Benefits(alcDriver);
		ben.createbenordandbenefits();
	}
	
	
	@Test(priority = 29, description="A transfer benefit modal window appears.")
	@Description("A transfer benefit modal window appears.")
	public void step27() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.stepnumber27();
	}
	
	@Test(priority = 30, description="A list will show that matches the search, if there's any. Otherwise, no result is shown."+
	"The Confirm button is enabled and clickable.")
	@Description("A list will show that matches the search, if there's any. Otherwise, no result is shown."+
	"The Confirm button is enabled and clickable.")
	public void step28() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.stepnumber28();
	}
	
	@Test(priority = 31, description="Select a benefit to be transfered and verify the banner colour along with 'Transfer Selected Benefits' button getting enabled.")
	@Description("Select a benefit to be transfered and verify the banner colour along with 'Transfer Selected Benefits' button getting enabled.")
	public void step29() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.step29();
	}
	@Test(priority = 32, description="Validations for step 31 to step number 38.")
	@Description("Validations for step 31 to step number 38.")
	public void step30() throws InterruptedException {
		Benefits ben = new Benefits(alcDriver);
		ben.verifycostlimitandcostlefttofill();
	}
	
}
