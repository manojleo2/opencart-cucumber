package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage2 {

	WebDriver driver;
	
	public BasePage2(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
