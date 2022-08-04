package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactor.Driver;

public class CurrencyConverterPage {
	static WebDriver driver;
	WebDriverWait wait;

	public CurrencyConverterPage() {
		driver = Driver.getDriver();
		/*wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[contains(@class,'privacy') and contains(text(), 'OK')]")))
		        .click();
		wait.until(ExpectedConditions
		        .elementToBeClickable(
		                By.id("from")))
		        .click();
		wait.until(ExpectedConditions
		        .elementToBeClickable(
		                By.xpath("//span[contains(text(),'GBP')]")))
		        .click();*/
		
		
		
		
	}
	
	
	static By txtBoxAmount = By.xpath("//input[@id='amount']"); ///
	static By dropdownToValues = By.xpath("//ul[@id='midmarketToCurrency-listbox']//following-sibling::span");
	static By dropdownToArrow = By.xpath("//input[@id='midmarketToCurrency']");
	static By dropdownFromValues = By.xpath("//ul[@id='midmarketFromCurrency-listbox']//following-sibling::span");
	static By dropdownFromArrow = By.xpath("//input[@id='midmarketFromCurrency']");
	static By buttonConvert = By.xpath("//button[text()='Convert']");
	static By conversionValue = By.xpath("//div[contains(@class,'unit-rates')]/p");
	static By cookiesVal = By.xpath("//*[@id=\"__next\"]/div[3]/section/div[2]/button[2]");
	
	public static void selectFromCurrency(String Value)
	{
	 driver.findElement(dropdownFromArrow).click();
	 List<WebElement> allValues = driver.findElements(dropdownFromValues);
	 for (WebElement valueElement:allValues)
	 {
		 if (valueElement.getText().equals(Value))
		 {
			 valueElement.click();
			 break;
		 }
	 }
	 
	 }
		
	 public static void selectToCurrency(String Value)
		{
		 driver.findElement(dropdownToArrow).click();
		 List<WebElement> allValues = driver.findElements(dropdownToValues);
		 for (WebElement valueElement:allValues)
		 {
			 if (valueElement.getText().equals(Value))
			 {
				 valueElement.click();
				 break;
			 }
		 } 
		

	}
	 
	 public static void enterAmount(String Value)
	 {
		 driver.findElement(txtBoxAmount).sendKeys(Value);
	 }
	
	 public static void convert()
	 {
		 driver.findElement(buttonConvert).click();
	 }
	
	 public static boolean conversionValue()
	 {
		 boolean status = false;
		 if (driver.findElement(conversionValue).isDisplayed())
		 {
			 status = true;
		 
	 }
		return status;
	 }
		
	public static void acceptCookies()
	{
		driver.findElement(cookiesVal).click();
	}

}

