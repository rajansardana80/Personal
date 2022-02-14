package klearnow.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	
	public WebDriver driver;
	

	//thread local is java 8 feature , to execute in parallel
	
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	
	public WebDriver intitalize_driver(String browser)
	{
		System.out.println("Browser value is 123:: "+browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
		
	}
	
	public static WebDriver getDriver()
	{
		return tlDriver.get();
	}
}
