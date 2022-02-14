package klearnow.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	/**
	 * This method is used to load properties from config.properties file
	 */
	private Properties prop;
	
	public Properties init_prop()
	{
		prop=new Properties();
		try {
			FileInputStream ip= new FileInputStream("src/test/resources/klearnow/config/Configuration.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		

	}

}
