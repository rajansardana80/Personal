package klearnow.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import klearnow.utility.PageObjects;

public class BrokerDashBoard extends PageObjects {
	
	public BrokerDashBoard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;
	
//	private By emailId=By.id("txtInputName123");
//	private By pwd=By.id("txtPassword");
	
//	public BrokerDashBoard(WebDriver driver)
//	{
//		this.driver=driver;
//	}
	
//	public void enterEmailId(String username)
//	{
//		driver.findElement(emailId).sendKeys(username);
//		
//	}
	
//	public void enterPwd()
//	{
//		driver.findElement(pwd).sendKeys("123");
//	}
	
	
	public void userEntersBelowCredentials(List<Map<String,String>> maplist)
	{
		System.out.println(maplist.get(0).get("Email"));
		element("input_email").sendKeys(maplist.get(0).get("Email"));
		element("input_pwd").sendKeys(maplist.get(0).get("Pwd"));

		
	

	}
	

}
