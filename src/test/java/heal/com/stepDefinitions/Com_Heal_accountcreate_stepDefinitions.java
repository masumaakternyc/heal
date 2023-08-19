package heal.com.stepDefinitions;
import heal.com.pageActions.Heal_accountcreate_pageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Com_Heal_accountcreate_stepDefinitions {

	
	Heal_accountcreate_pageAction action =new Heal_accountcreate_pageAction();
	
@Given("User in on the healthfirst homepage")
public void user_in_on_the_healthfirst_homepage() throws InterruptedException {
   action.gethealthfirsthomepage();
}
@When("I click on login button")
public void i_click_on_login_button() {
      action.clickloginbutton();
}
@When("I click on member portal from the dropdown menu")
public void i_click_on_member_portal_from_the_dropdown_menu() {
	action.clickmemberportal();
}
@Then("I click on create account")
public void i_click_on_create_account() {
	action.clickcreateaccount();
}
@Then("I select and choose I need to activate my coverage")
public void i_select_and_choose_i_need_to_activate_my_coverage() {
	action.selectActivateCoverage();
}
@Then("I click on continue")
public void i_click_on_continue() {
	action.clickcontinue();
}
@Then("i enter first name nikita")
public void i_enter_first_name_nikita() {
	action.enterfirstname();
}
@Then("i enter date of birth {int}")
public void i_enter_date_of_birth(Integer int1) {
	action.enterDateofBirth();
}
@Then("i enter mobile phone number {int}")
public void i_enter_mobile_phone_number(Integer int1) {
	action.enterMobileNumber();
}
@Then("i enter email adress nikita@gmail.com")
public void i_enter_email_adress_nikita_gmail_com() {
	action.enterEmailAdd();
}
@Then("i reenter email address to confirm nikita@gmail.com")
public void i_reenter_email_address_to_confirm_nikita_gmail_com() {
	action.reEnterEmailAdd();
}
@Then("i click checkbox I acknowledge the term of use")
public void i_click_checkbox_i_acknowledge_the_term_of_use() {   
	action.selectAwkknowledbox();
}

@Then("i click on send code button")
public void i_click_on_send_code_button() {
	action.clicksendcodebutton();
}
}

