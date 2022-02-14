package klearnow.stepdefinations.broker;

import java.util.List;
import java.util.Map;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import klearnow.factory.WebDriverFactory;
import klearnow.pages.BrokerDashBoard;

public class BrokerStepDefination {
	
	private BrokerDashBoard dashboardPage=new BrokerDashBoard(WebDriverFactory.getDriver());
	
	

	@When("Broker Searches Shipment Id Using Advance Search")
	public void broker_searches_shipment_id_using_advance_search() {
		
	   
	}

	@Then("Shipment Id Gets Displayed To Broker")
	public void shipment_id_gets_displayed_to_broker() {
	   
	}
	
	@Given("Login To Broker Panel Using Below Staging Credentials")
	public void login_to_broker_panel_using_below_staging_credentials(DataTable dataset) {
		
		//DataTable dataset;
//		List<List<String>> userList=dataset.asLists(String.class);
//		for(List<String>listData:userList)
//		System.out.println(listData);
//	  
	}
	
	@Given("Login to broker panel")
	public void login_to_broker_panel()
	{
		WebDriverFactory.getDriver().get("https://broker-staging.klearnow.com/broker-panel");
	}
	
	@Given("Login to broker panel3")
	public void login_to_broker_panel3()
	{
		WebDriverFactory.getDriver().get("https://cob-staging.klearnow.com/broker-panel");
	}
	
	@When("Enter {string}")
	public void enter(String name)
	{
	System.out.println(name);
	}
	
	
	@Given("Login To Broker Panel Using Below Prod Credentials")
	public void login_to_broker_panel_using_below_prod_credentials(DataTable dataset) {
		List<Map<String, String>> userList= dataset.asMaps(String.class, String.class);
		for(Map<String,String> listData:userList)				
					System.out.println(listData.get("name"));
	
				
		
	    
	}
	

	
	@When("User enter below credentials1")
	public void user_enter_below_credentials1(DataTable dataTable) {
		List<Map<String,String>> list=dataTable.asMaps();
		System.out.println(list.get(0).get("Email"));
		System.out.println(list.get(0).get("Pwd"));

	}
	
	@When("User enter below credentials2")
	public void user_enter_below_credentials2(DataTable dataTable) {
		List<String> list=dataTable.asList();
		System.out.println(list);

	}
	
//	---------------------------------
	
	@Given("Login to broker panel with url {string}")
	public void login_to_broker_panel_with_url(String string) {
		WebDriverFactory.getDriver().get(string);
	   
	}
	
	@Then("Print message user is logged in successfully")
	public void print_message_user_is_logged_in_successfully() {
	System.out.println("Success");
	}
	
	@When("User enters below credentials")
	public void user_enters_below_credentials(DataTable dataTable) {
		List<Map<String,String>> maplist=dataTable.asMaps();
		dashboardPage.userEntersBelowCredentials(maplist);
	   
	}

	@When("User email is {string}")
	public void user_email_is(String string) {
	    
	}

	@When("User pwd is {string}")
	public void user_pwd_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}
