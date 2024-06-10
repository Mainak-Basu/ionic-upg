package smoke_Suite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v117.emulation.Emulation;
import org.openqa.selenium.devtools.v117.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v117.emulation.model.ScreenOrientation;
import org.openqa.selenium.devtools.v117.network.Network;
import org.openqa.selenium.devtools.v117.network.model.ConnectionType;
import org.openqa.selenium.devtools.v117.page.model.Viewport;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.ScreenshotListener;
import alchemy_Pages.AlchemyLoginPage;
import alchemy_Pages.Branches;
import alchemy_Pages.Country_Settings;
import alchemy_Pages.Members;
import alchemy_Pages.Reports;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import plastic_Bank_Pages.PB_LoginPage;
import plastic_Bank_Pages.PB_Member_Profile;
@Listeners({AllureTestNg.class, ScreenshotListener.class})
public class ALC_3609 extends BaseClass {
	@Test(priority=0, description="Ensure that GCash is turned on in country settings for Philippines "
			+ "and a valid Philippines branch account linked to gcash having tokens in wallet exists.")
	@Description("Ensure that GCash is turned on in country settings for Philippines and a valid "
			+ "Philippines account linked to gcash having tokens in wallet exists.")
	public void preconditions() throws InterruptedException {
		AlchemyLoginPage loginAlchmey=new AlchemyLoginPage(alcDriver);
		loginAlchmey.alc_adminlogin("+17783844311","778778");
		Country_Settings cs = new Country_Settings(alcDriver);
		cs.ensureDigitalCashOutToggleIsOn("philippines");
		Branches m= new Branches(alcDriver);
		m.ensureBranchIsPresentWithTokens("+639665849021", "fleek gcash account", "9665849021", Branches.philippinesbr, "602");
	}
	@Test(priority=1, description="Login with existing account and perform GCash Transaction.")
	@Description("Login with existing account and perform GCash Transaction.")
	public void gojekTransaction() throws IOException, InterruptedException {
		PB_LoginPage pl = new PB_LoginPage(pbDriver);
		pl.login("9665849021","123456a", "+63");
		PB_Member_Profile pmp = new PB_Member_Profile(pbDriver);
		Thread.sleep(5000);
		pmp.hometab.click();
	}
	
	
	@Test(priority=2, description="Based on the tokens cashed out, Verify Tokens are deducted from Branch's wallet in APP")
	@Description("Based on the tokens cashed out, Verify Tokens are deducted from Branch's wallet in APPs")
	public void verifyTokensInApp() throws IOException, InterruptedException {
		PB_Member_Profile pmp = new PB_Member_Profile(pbDriver);
		pmp.performDigitalCashOutBranch();
	}
	
	
	
	@Test(priority=3,description="Based on the tokens cashed out, Verify Tokens are deducted from Branch's wallet in ALCHEMY")
	@Description("Based on the tokens cashed out, Verify Tokens are deducted from Branch's wallet in ALCHEMY")
	public void verifyTokensInAlchemy() throws InterruptedException {
		Reports r = new Reports(alcDriver);
		r.transactionStatusInAlchemyReportsforgcash();
		Branches m= new Branches(alcDriver);
		m.compareAlchemyAndAppTokens("+639665849021");
	}
}
