package heal.com.utitlities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import heal.com.pageActions.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterScenario {

	@After("@chrome")
	public void AfterChromeScenario(Scenario Af_scenario) {
		System.out.println("--- TEST EXECUTION FAIL---");
		System.out.println("---SHUTTING DOWN CHROME BROWSER---");

		try {
			if (Af_scenario.isFailed()) {
				TakesScreenshot takeshot = (TakesScreenshot) DriverSetup.getDriver();// classname.variable name
																							// need chromedriver to take
																							// screeshot when fail
				byte[] imagebytes = takeshot.getScreenshotAs(OutputType.BYTES); // this line will take the screenshot
																				// image has a type like bye, file we
																				// are using byte type array
				// on left side byte array is declared and screenshot will be placed in byte
				// array format
				Af_scenario.attach(imagebytes, "image/png", "After_scenario_Failed_Image_ch");
				// ( add variable name, type of image and and name of image)
			}

		} catch (Exception e) {
			e.printStackTrace();//
		}

		DriverSetup.getDriver().quit();
		System.out.println(">> ChromeDriver Closed! <<");
	}

}
