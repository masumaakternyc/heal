package heal.com.stepDefinitions;

import heal.com.pageActions.Heal_Login_pageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Com_heal_revisedlogin_stefDef {
	
	
	Heal_Login_pageAction action =new Heal_Login_pageAction() ;
	
	
	
	@When("user enter user name {string}")
	public void user_enter_user_name(String userName) {
		action.inputusername(userName);
	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
		action.inputpassword(password);
	   
	}
	

	
	
	@Given("user is on healthfirst home page")
	public void user_is_on_healthfirst_home_page() throws InterruptedException
	{
	   action.getHealthfirstHomepage();
	}
	
	@When("user clicks on login")
	public void user_clicks_on_login() 
	{
	  action.clickonlogin();     
	}
	
	@When("user clicks on member portal from the dropdown menu")
	public void user_clicks_on_member_portal_from_the_dropdown_menu() 
	{
	   action.clickonmemberportal();  
	}
	
//	@When("user enter user name {string}")
//	public void userNameField(String Username) 
//	{	
//		action.inputusername(Username);
//	  // action.inputusername(String);    
//	}
//	
//	@When("user enter password")
//	public void passwordField(String Password) 
//	{
//	   action.inputpassword(Password);
//	}
//	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	   action.Clickonlogin();
	}
	
	@Then("user clicks on skip for now")
	public void user_clicks_on_skip_for_now() 
	{
	   action.clickskipbutton();
	}
	
	@Then("user clicks on no thanks")
	public void user_clicks_on_no_thanks()
	{
	   action.clickonNoThanks();
	}
	
}
