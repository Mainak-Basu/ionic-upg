package plastic_Bank_Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PB_Menu_Options extends BaseClass {
	
public PB_Menu_Options(AndroidDriver pBriver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(pbDriver), this);
		}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
	public WebElement menu;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Create Business\")")
	public WebElement createBusiness;
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Create Business\"));")
	public WebElement createBusiness_scroll;
	
	
	
	public void clickmenu() throws InterruptedException {
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(pbDriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
	}
	
	public void clickCreateBusiness() {
		try {
			WebDriverWait wait = new WebDriverWait(pbDriver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(createBusiness)));
			createBusiness.click();
		}
		catch (Exception e){
			createBusiness_scroll.click();
		}
	}

	public void clickCreateBusness() throws InterruptedException {
		clickmenu();
        clickCreateBusiness();
    }

}
