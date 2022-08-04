package FrameworkConstraints;

public class constraints {

	private static final String USERDIR=System.getProperty("user.dir");
	private static final String CONFIGFILE = USERDIR +"/src/main/resources/config.properties";
	
	public static String getConfigFilePath()
	{
		return CONFIGFILE;
	}

}
