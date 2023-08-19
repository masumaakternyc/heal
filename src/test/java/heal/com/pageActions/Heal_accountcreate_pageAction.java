package heal.com.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import heal.com.pageElements.Heal_accountcreate_pageElements;


public class Heal_accountcreate_pageAction {

		Heal_accountcreate_pageElements pageElements;
		
		public Heal_accountcreate_pageAction() {
			
			pageElements = new Heal_accountcreate_pageElements();
			PageFactory.initElements(DriverSetup.getDriver(), pageElements);
			
		}
@SuppressWarnings("deprecation")
public void gethealthfirsthomepage() throws InterruptedException {
	DriverSetup.setupChromeDriver();
	DriverSetup.getDriver().manage().window().maximize();
	DriverSetup.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
public void clickloginbutton() {
	pageElements.loginbutton.click();
}

public void clickmemberportal() {
	pageElements.memberportal.click();
}
public void clickcreateaccount() {
	pageElements.CreateAccount.click();
	
}
public void selectActivateCoverage() {
	pageElements.ActivateCoverage.click();
}
public void clickcontinuebutton() {
	pageElements.Continuebutton.click();
}
public void enterfirstname() {
	pageElements.FirstName.sendKeys("nikita");
}	
public void enterDateofBirth() {
	pageElements.DateOfBirth.sendKeys("0820");
}	
public void enterMobileNumber() {
	pageElements.MobileNumber.sendKeys("9172345678");
}
public void enterEmailAdd() {
	pageElements.EmailAddress.sendKeys("nikita@gmail.com");
}	
public void reEnterEmailAdd() {
	pageElements.ReenterEmail.sendKeys("nikita@gmail.com");
}
public void selectAwkknowledbox() {
	pageElements.selectackkowlgecheckbox.click();
}
public void clickcontinue() {
	pageElements.clickcontinueagain.click();
}
public void clickEmailMe() {
	pageElements.TickEmailMe.click();
}
public void clicksendcodebutton() {
	pageElements.sendcode.click();
}
}