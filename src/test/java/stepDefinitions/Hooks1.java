package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks1 {

	WebDriver driver;
	Properties p;
	
	@Before
	public void setUp() throws IOException 
	{
		driver = BaseClass.initalizeBrowser();
		
		p=BaseClass.getProperties();
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) 
	{
		driver.quit();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) 
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
}
