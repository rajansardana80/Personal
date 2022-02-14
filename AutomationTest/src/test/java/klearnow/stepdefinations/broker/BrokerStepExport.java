package klearnow.stepdefinations.broker;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import klearnow.factory.WebDriverFactory;
import klearnow.pages.BrokerDashBoard;

public class BrokerStepExport {

	
	private BrokerDashBoard loginPage=new BrokerDashBoard(WebDriverFactory.getDriver());
	
	

		
	@Given("Login to broker panel1")
	public void login_to_broker_panel1()
	{
		WebDriverFactory.getDriver().get("https://ops-staging.klearnow.com/broker-panel");
	}
	
	

	



}
