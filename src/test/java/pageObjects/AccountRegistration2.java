package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration2 extends BasePage2{

	public AccountRegistration2(WebDriver driver) {
		super(driver);
	}

	//Elements
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="telephone")
	WebElement telephone;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirm")
	WebElement cnfrm;
	
	@FindBy(xpath="(//input[@name='newsletter'])[1]")
	WebElement chck;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement chckbox2;
	
	@FindBy(xpath="(//input[@value='Continue'])[1]")
	WebElement continu;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void frstnam(String str) {
		firstname.sendKeys(str);
	}
	
	public void lstnam(String str) {
		lastname.sendKeys(str);
	}
	
	public void mail(String str) {
		email.sendKeys(str);
	}
	
	public void tele(String str) {
		telephone.sendKeys(str);
	}
	
	public void passwrd(String str) {
		password.sendKeys(str);
	}
	
	public void confir(String str) {
		cnfrm.sendKeys(str);
	}
	
	public void check() {
		chck.click();
	}
	
	public void chckbox() {
		chckbox2.click();
	}
	
	public void conti() {
		continu.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e){
			return(e.getMessage());
		}
	}
}
