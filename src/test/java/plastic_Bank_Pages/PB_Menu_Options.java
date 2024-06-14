package plastic_Bank_Pages;

import java.time.Duration;
import java.util.List;

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
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Change password\")")
	public WebElement changepw;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Change password\").instance(1)")
	public WebElement changepw2;
	@AndroidFindBy(xpath = "//android.widget.EditText")
	public List<WebElement> textfields;
	
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
	
	
	public void changepw() throws InterruptedException {
		menu.click();
		tap(300,1085);
		changepw.click();
		textfields.get(0).sendKeys("123456a");
		textfields.get(1).sendKeys("123456ab");
		textfields.get(2).sendKeys("123456ab");
		takescreenshotofandroid("User is able to change password");
		changepw2.click();
		
		
	
	
	}

}
