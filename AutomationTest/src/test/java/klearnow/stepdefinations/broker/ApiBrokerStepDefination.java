package klearnow.stepdefinations.broker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

public class ApiBrokerStepDefination {
	//RequestSpecification request;
	Response response;
	ValidatableResponse validatableResponse;
	
	@Given("User make use of shipment search api")
	public  void user_make_use_of_shipment_search_api() {
		baseURI="https://reqres.in/api";
		JSONObject request=new JSONObject();
		request.put("name", "Raghav");
		
		given().body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
		
		
}
	
	@Given("User make use of shipment search api1")
	public  void user_make_use_of_shipment_search_api1() {
		baseURI="https://api.klearnow.com/";
		JSONObject request=new JSONObject();
		request.put("name", "Raghav");
		
		given().queryParam("axd", "SEARCH_SHIPMENTS_BROKER").body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
		
		
}

	@When("User search for shipmnet id {string}")
	public void user_search_for_shipmnet_id(String string) {
	//	response=request.when().get("/staging-broker/v1/events");
	    
	}

	@Then("Validate the status code is {int}")
	public void validate_the_status_code_is(Integer int1) {
		
		validatableResponse=response.then();
		validatableResponse.assertThat().statusCode(int1);
	}

	@Then("Validate customer is {string}")
	public void validate_customer_is(String string) {
		
		
	    
	}

}
