package org.stepdefenition;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.Base;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends Base {
	
	@Before(order=2)
	public void beforeScenario() {
		launchChrome();
		impwait();
		launchUrl("https://en-gb.facebook.com/");
		winmax();
	}
@After(order=1 )
public void afterScenario() {
	quitBrowser();

}
@Before(order=1)
public void startTime() {
	System.out.println(new Date());

}
@After(order=3)
public void endTime() {
	System.out.println(new Date());

	

}
@After
public void screenshot(Scenario s) throws IOException {
	String name = s.getName();
	String sc = name.replace(" ","_");
	screenSnap(sc);
	
	if (s.isFailed()) {
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] sca = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(sca, "image/jpg");
	}
}
}
