package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AccountRegistration2;
import pageObjects.HomePage;

public class Registration1 {
	
	WebDriver driver;
	HomePage hp;
	AccountRegistration2 ar;
	
	@Given("open the registration page")
	public void open_the_registration_page() {
	   hp= new HomePage(BaseClass.getDriver());
		hp.clickMyAccount();
	    hp.clickRegister();
	}

	@Given("enter the below details")
	public void enter_the_below_details(DataTable dataTable) {
		
	    Map<String,String>mp = dataTable.asMap(String.class,String.class);
	    
	    ar=new AccountRegistration2(BaseClass.getDriver());
	    ar.frstnam(mp.get("firstname"));
	    ar.lstnam(mp.get("lastname"));
	    ar.mail(mp.get("email"));
	    ar.tele(mp.get("telephone"));
	    ar.passwrd(mp.get("password"));
	    ar.confir(mp.get("confirm"));
	    
	}

	@Then("click on the radio button and checkbox")
	public void click_on_the_radio_button_and_checkbox() {
		ar.check();
	    ar.chckbox();
	    
	}

	@Then("click on continue button")
	public void click_on_continue_button() {
		ar.conti();
	}

}
