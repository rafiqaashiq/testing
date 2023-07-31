package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "in.amazon.teststeps",
//		dryRun = true
		tags = "@TC_001"
		
//		multiple tags
//		tags = "@product_purchase or @TC_002"
//		tags = "@TC_002 and @login_functionality"
	)

public class TestRunner extends AbstractTestNGCucumberTests {

}
