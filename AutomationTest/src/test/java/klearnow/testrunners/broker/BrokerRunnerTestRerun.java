package klearnow.testrunners.broker;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"@target/rerun.txt"},
		glue= {"klearnow.stepdefinations.broker","klearnow.hooks"},
	//	plugin= {"pretty","json:target/ExecutionReport.json"},
				plugin= {"pretty","json:target1/cucumber-reports/cucumber.json"},

		publish=true,
		dryRun=false	
	//	tags= "@Prod"
		)


public class BrokerRunnerTestRerun {
	
	
}
