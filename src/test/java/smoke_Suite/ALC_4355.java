package smoke_Suite;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Orders;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;

public class ALC_4355 extends BaseClass{

	
	
	@Test(priority=0, description="User is able to create a bonus and save it.")
	@Description("User is able to create a bonus and save it.")
    public void createBonus() throws InterruptedException {
    AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
	loginAlchmey.alc_adminlogin(adminphoneNumber,adminpassword);
	Orders o= new Orders(alcDriver);
	o.clickOrdersTab();
    o.clickBounsTab();
    o.clickBonusCreate_Btn();
    o.enterBonusName(bonusname);
    o.selectCountry();
    o.selectBrand("plas");
    o.selectBonusCategory();
    o.enterTotalWeight("10000");
    o.enterMembersBonus("7");
    o.enterBranchBonus("2");
    o.refid.sendKeys("refid1234");
    o.orderdate.click();
    try {
    o.selectdate();
    }catch(Exception e) {
    	
    }
    o.clickCreateBonusBtn();
    o.enterAuthCode("778899");
    o.clickSubmitAuthCode();
    o.search_byName(bonusname);
    TakesScreenshot ts1 = (TakesScreenshot) alcDriver; byte[] screenshot1 =
    		  ts1.getScreenshotAs(OutputType.BYTES); Allure.addAttachment("Bonus succesfully created and saved",
    		  new ByteArrayInputStream(screenshot1)); Thread.sleep(2000);
}
	
	
	@Test(priority=1, description="User is able to edit a bonus detail and save it.")
	@Description("User is able to edit a bonus detail and save it.")
	public void editbonus() throws InterruptedException {
		Orders o= new Orders(alcDriver);
		o.clickSpecificOrdersBonus();
		o.editbonus(bonusname+"123");
	}
}
