package Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import DriverFactor.Driver;
import Utils.PropertiesUtils;

public class Base {
	
	@BeforeMethod
		protected void setup()
	{
		PropertiesUtils.readProperty();
		Driver.initializeBrowser();
	}
		
	@AfterMethod
	protected void tearDown()
	{
		Driver.quitDriver();
	}

}
