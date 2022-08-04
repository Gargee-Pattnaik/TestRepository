package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import FrameworkConstraints.constraints;



public class PropertiesUtils {
	
	static Properties prop;

	public static void readProperty()
	{
		prop = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream(constraints.getConfigFilePath());
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static String getValue(String key) {
		
		return prop.getProperty(key);
	}

}
