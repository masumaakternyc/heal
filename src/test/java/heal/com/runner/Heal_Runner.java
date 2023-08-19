package heal.com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Heal_Runner {
	
	@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-json.json"},
						features = {"src/test/resources/Features"}, glue= {"heal.com.stepDefinitions"},
						tags = "chrome")
	
	public class RunCucumberTest extends AbstractTestNGCucumberTests{
	
	
	}

	}
	
	
	
	
	


