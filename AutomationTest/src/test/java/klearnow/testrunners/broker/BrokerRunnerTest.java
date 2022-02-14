package klearnow.testrunners.broker;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/klearnow/features/brokerui"},
		glue= {"klearnow.stepdefinations.broker","klearnow.hooks"},
	//	plugin= {"pretty","json:target/ExecutionReport.json"},
				plugin= {"pretty","json:target/cucumber-reports/cucumber.json","rerun:target/rerun.txt"},

		publish=true,
		dryRun=false	
	//	tags= "@Prod"
		)


public class BrokerRunnerTest {
	
	
}
