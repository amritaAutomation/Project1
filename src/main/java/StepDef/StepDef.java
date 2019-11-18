package StepDef;

import Excel.TestData;
import PageActions.AddSRMUserPage;
import PageActions.LoginPage;
import Util.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef extends TestBase {
	LoginPage login;
	AddSRMUserPage SRMuser;
	TestData data;
	
	public StepDef()
	{
		super();
	}

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		
	 LoginPage.openURL();
	// Thread.sleep(4000);
	}

	@Then("^user enter username$")
	public void user_enter_username() throws Throwable {
	  // Thread.sleep(3000);
	    LoginPage.enterUsername();
	}

	@Then("^user enter password$")
	public void user_enter_password() throws Throwable {
		 LoginPage.enterPassword();
	}

	@Then("^click on Login$")
	public void click_on_Login() throws Throwable {
		SRMuser=LoginPage.clickLogin();
		Thread.sleep(5000);
	}
	//--------------------------------------------ADDSRMUSer
	

	@Then("^click on manage users on left$")
	public void click_on_manage_users_on_left() throws Throwable {
		Thread.sleep(7000);
	    SRMuser.clickonManageUser();
	    
	}

	@Then("^click SRM tab$")
	public void click_SRM_tab() throws Throwable {
		Thread.sleep(4000);
		SRMuser.clickonSRMTab();
	 
	}

	@Then("^click add new SRM button$")
	public void click_add_new_SRM_button() throws Throwable {
		Thread.sleep(3000);
	    SRMuser.clickonAddNewSRMbtn();
	    
	}

	@Then("^fill in all details$")
	public void fill_in_all_details() throws Throwable {
	    SRMuser.fillfname();
	    SRMuser.filllname();
	    SRMuser.fillemail();
	    SRMuser.fillphone();
	    SRMuser.fillpassword();
	    SRMuser.fillconfirmpassword();
	   
	    
	}

	@Then("^click save$")
	public void click_save() throws Throwable {
		 SRMuser.clickOnSave();
	    
	}

	@Then("^navigate to manageUser and SRM tab$")
	public void navigate_to_manageUser_and_SRM_tab() throws Throwable {
		SRMuser.navigate_to_manageUser_and_SRM_tab();
	}

	@Then("^update user from Action menu$")
	public void update_user_from_Action_menu() throws Throwable {
	    SRMuser.update_user_from_Action_menu();
	}

}
