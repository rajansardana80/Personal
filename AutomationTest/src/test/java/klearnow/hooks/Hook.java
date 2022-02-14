package klearnow.hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import klearnow.factory.WebDriverFactory;
import klearnow.utility.ConfigurationReader;

public class Hook {
	private WebDriverFactory driverFactory;
	private ConfigurationReader configReader;
	private WebDriver driver;
	Properties prop;
	
	@Before(order=0)
	public void launchBrowser()
	{
		configReader=new ConfigurationReader();
		driverFactory= new WebDriverFactory();
		prop=configReader.init_prop();
		String browserName=prop.getProperty("browser");
		driver = driverFactory.intitalize_driver(browserName);
	}
	
	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			//take screenshot
			String screenshotName=scenario.getName().replaceAll(" ", "_");
		byte [] sourcePath =	((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}

	
}

