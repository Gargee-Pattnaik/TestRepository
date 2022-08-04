package DriverFactor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.PropertiesUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	static WebDriver driver;

	public static void initializeBrowser() 
	{
		String browser = PropertiesUtils.getValue("browser");
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get(PropertiesUtils.getValue("url"));
		}
		

}
	
	public static void quitDriver()
	{
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
}
