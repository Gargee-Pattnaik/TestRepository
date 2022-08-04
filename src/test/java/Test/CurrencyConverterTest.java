package Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;
import Pages.CurrencyConverterPage;



public class CurrencyConverterTest extends Base{
	
	static WebDriver driver;
	
	@Test
	private void Test1()
	{
		CurrencyConverterPage cp = new CurrencyConverterPage();
		cp.acceptCookies();
		cp.enterAmount("50");
		cp.selectFromCurrency("British Pound");
		cp.selectToCurrency("Euro");
		cp.convert();
		boolean status = cp.conversionValue();
		assertTrue(status);
		
		
	}

}
