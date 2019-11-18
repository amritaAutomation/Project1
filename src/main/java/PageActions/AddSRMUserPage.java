package PageActions;

import org.openqa.selenium.support.PageFactory;

import Locators.locators;
import Operations.operations;
import Util.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddSRMUserPage extends TestBase{
	
	public AddSRMUserPage() throws Exception
	{
		PageFactory.initElements(driver, this);
		//TestData data=new TestData("C:/Self-Auto/X/src/main/java/com/x/qa/util/Book1.xlsx");
	}

	public static void openURL()
	{
		operations.openbrowser();
		
	}
	
	public void clickonManageUser() throws Exception
	{
		//getData();
		Thread.sleep(6000);
		operations.clickmethod(locators.mngUserbtn);
	}
	
	public  void clickonSRMTab() throws Exception
	{
		//getData();
		Thread.sleep(4000);
		operations.clickmethod(locators.CRMTab);
	}
	public  void clickonAddNewSRMbtn() throws Exception
	{
		//getData();
		Thread.sleep(3000);
		operations.clickmethod(locators.AddNewSRMbtn);
	}
	
	public void fillfname() throws Exception
	{
		getData();
		
		operations.SendValue(data.getCellData(1, 2, 1),locators.fName);
		
	}
	public void filllname() throws Exception
	{
		getData();
		
		operations.SendValue(data.getCellData(1, 2, 2),locators.lName);
	}
	
	public void fillemail() throws Exception
	{
		getData();
		
		operations.SendValue(data.getCellData(1, 2, 3),locators.Email);
	}
	
	public void fillphone() throws Exception
	{
		getData();
		
		operations.SendValue(data.getCellData(1, 2, 4),locators.phoneNum);
	}
	
	public void fillpassword() throws Exception
	{
		getData();
		
		operations.SendValue(data.getCellData(1, 2, 5),locators.SRMuserpassword);
	}
	
	public void fillconfirmpassword() throws Exception
	{
		getData();
		
		operations.SendValue(data.getCellData(1, 2, 6),locators.SRMuserconfirmPassword);
	}
	
	public void clickOnSave() throws Exception
	{
		//getData();
		
		operations.clickmethod(locators.saveBtn);
		
	}
	
	
	public void navigate_to_manageUser_and_SRM_tab() throws Throwable {
		clickonManageUser();
		clickonSRMTab();
	}

	
	public void update_user_from_Action_menu() throws Throwable {
		Thread.sleep(5000);
	   operations.clickmethod(locators.updateuserAction);
	   operations.clickmethod(locators.clickonEdit);
	   operations.SendValue(prop.getProperty("email"),locators.Email);
	   operations.clickmethod(locators.updateButton);
	}
	
	
}
