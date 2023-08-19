package heal.com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Heal_accountcreate_pageElements {

	@FindBy(xpath = "//*[@id=\"masthead\"]/div[2]/div[3]/ul/li[4]/a/span[1]")
	public WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id=\"masthead\"]/div[2]/div[3]/ul/li[4]/ul/a[1]")
	public  WebElement memberportal;

	/*@FindBy(xpath = "//a[contains(text(),'Create an account')]")
	public WebElement CreateAccount;*/
	
	@FindBy(linkText= "Create an account")
	public WebElement CreateAccount;
	
	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div/div/div[2]/div[1]/div[5]/div/div[2]/div")
	public WebElement ActivateCoverage;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div/div/div[2]/div[1]/button")
	public  WebElement Continuebutton;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div/div/div[2]/div[1]/div[2]/div[2]/input")
	public  WebElement FirstName;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div/div/div[2]/div[1]/div[2]/div[3]/input")
	public WebElement DateOfBirth;

	@FindBy(xpath = "//*[@id=\"mobile\"]")
	public WebElement MobileNumber;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div/div/div[2]/div[1]/div[2]/div[6]/input")
	public WebElement EmailAddress;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div/div/div[2]/div[1]/div[2]/div[7]/input")
	public WebElement ReenterEmail;
	
	@FindBy(xpath = "//*[@id=\"selectCheckbox\"]")
	public WebElement selectackkowlgecheckbox ;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div/div/div[2]/div[1]/div[3]/button")
	public WebElement clickcontinueagain ;
	
	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div[1]/div/div[2]/div/div[2]/div/span[1]")
	public WebElement TickEmailMe ;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div[1]/div/div[2]/div/div[4]/button")
	public WebElement sendcode;

}
