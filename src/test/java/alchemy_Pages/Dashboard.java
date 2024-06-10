package alchemy_Pages;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import org.testng.Assert;


public class Dashboard extends BaseClass{


	public Dashboard(WebDriver alcDriver){

		PageFactory.initElements(alcDriver, this);
	}

	@FindBy(xpath = "//div[text()=' Dashboard ']")
	public static WebElement dashBoard_tab;
	@FindBy(xpath = "//div[text()='KG by Country']/following::span[@class='total-price']")
	public static WebElement kgByCountry;
	@FindBy(xpath = "//div[text()='Tokens by Country in USD']/following::span[@class='total-price']")
	private WebElement tokensByCountry;
	@FindBy(xpath = "//div[text()='Tokens by Country in USD']/following::span[@class='total-price'][1]")
	private WebElement activeLocations;
	@FindBy(xpath = "//div[text()='Members by Country']/following::span[@class='total-price'][1]")
	private WebElement membersByCountry;
	@FindBy(xpath = "(//div[text()=' Philippines '])[4]/following::div")
	public static WebElement kgByPhilippines;
	public static int kgByCountryValue;
	public static int kgByPhilippinesValue;
	public static List<Integer> result = new ArrayList<>();

	public static void clickDashBoard() {
		WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(dashBoard_tab));
		dashBoard_tab.click();
	}
	public static List<Integer> checkKgByCountry() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(alcDriver, Duration.ofSeconds(50));
		clickDashBoard();
		Thread.sleep(30000);
		Actions action =new Actions(alcDriver);
		action.scrollToElement(kgByCountry).build().perform();
		wait.until(ExpectedConditions.visibilityOf(kgByCountry));
		Thread.sleep(3000);
		String kgCountry = kgByCountry.getText();
		Thread.sleep(2000);
		TakesScreenshot ts11111 = (TakesScreenshot) alcDriver;
		byte[] screenshotsell1 = ts11111.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("kgByCountry Screenshot", new ByteArrayInputStream(screenshotsell1));
		Thread.sleep(2000);

		action.scrollToElement(kgByPhilippines).build().perform();
		wait.until(ExpectedConditions.visibilityOf(kgByPhilippines));
		String kgPhilippines=kgByPhilippines.getText();
		Thread.sleep(2000);
		TakesScreenshot ts1111 = (TakesScreenshot) alcDriver;
		byte[] kgPhilippinesSC = ts1111.getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("kgPhilippines Screenshot", new ByteArrayInputStream(kgPhilippinesSC));
		Thread.sleep(2000);

		String stringWithoutCommas = kgCountry.replace(",", "");
		String stringWithoutCommasSpace = kgPhilippines.replace(",", "").replace(" ","");
		Thread.sleep(3000);
		//List<Integer> result = new ArrayList<>();

		kgByCountryValue = Integer.parseInt(stringWithoutCommas);
		System.out.println("!!!!"+kgByCountryValue);
		kgByPhilippinesValue = Integer.parseInt(stringWithoutCommasSpace);
		System.out.println("!!!!"+kgByPhilippinesValue);
		Thread.sleep(1000);
		result.add(kgByCountryValue);
		result.add(kgByPhilippinesValue);

		return result;

	}


}
