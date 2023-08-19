package heal.com.pageActions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import heal.com.pageElements.Heal_revised_login_pageElements;

public class Heal_Login_pageAction {

	Heal_revised_login_pageElements pageElements;

	public Heal_Login_pageAction() {

		pageElements = new Heal_revised_login_pageElements();
		PageFactory.initElements(DriverSetup.getDriver(), pageElements);//
	}

	@SuppressWarnings("deprecation")
	public void getHealthfirstHomepage() throws InterruptedException {

		DriverSetup.getDriver().get("https://healthfirst.org/");
		DriverSetup.getDriver().manage().window().maximize();
		DriverSetup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void clickonlogin() {
		pageElements.loginbutton.click();
	}

	public void clickonmemberportal() {
		pageElements.memberportal.click();
		new Heal_Login_pageAction().switchWindow();
         
	}

	public void switchWindow() {
		
		String mainWindow = DriverSetup.getDriver().getWindowHandle();//main window
		
		System.out.println("=====================mainWindow============================"+mainWindow);

		Set<String> allWindows = DriverSetup.getDriver().getWindowHandles();//two 
		System.out.println("=======================allWindows=========================="+allWindows);

		for (String window : allWindows) {
			//1
             
			if(!window.equals(mainWindow))
			{
				DriverSetup.getDriver().switchTo().window(window);
			}
		}

	}

	public void inputusername(String Username) {
		pageElements.username.click();
		pageElements.username.clear();
		pageElements.username.sendKeys(Username);
	}// "nikitanarula"

	public void inputpassword(String Password) {
		pageElements.password.sendKeys(Password);
	}

	public void Clickonlogin() {
		pageElements.login.click();
	}

	public void clickskipbutton() {
		pageElements.skipbutton.click();
	}

	public void clickonNoThanks() {
		pageElements.nothanks.click();
	}
}
