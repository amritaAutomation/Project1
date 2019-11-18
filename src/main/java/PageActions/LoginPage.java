package PageActions;

import org.openqa.selenium.support.PageFactory;

import Excel.TestData;
import Locators.locators;
import Operations.operations;
import Util.TestBase;

public class LoginPage extends TestBase{

	//public static TestData data;
	
	//public TestData data;
	
	public LoginPage() throws Exception
	{
		PageFactory.initElements(driver, this);
		//TestData data=new TestData("C:/Self-Auto/X/src/main/java/com/x/qa/util/Book1.xlsx");
	}
	
	
	public static void openURL()
	{
		operations.openbrowser();
		
	}
	public static void enterUsername() throws Exception
	{
		getData();
		//Thread.sleep(2000);
		//operations.SendValue(prop.getProperty("username"), locators.UserName);
		//data.getCellData(1, 2, 2);
		//getData("C:/Self-Auto/X/src/main/java/com/x/qa/util/Book1.xlsx");
		//util=new TestUtil("C:/Self-Auto/X/src/main/java/com/x/qa/util/Book1.xlsx");
		operations.SendValue(data.getCellData(0, 1, 2),locators.UserName);
	}
	
	public static void enterPassword() throws Exception
	{
		getData();
	//	Thread.sleep(2000);
		
		operations.SendValue(data.getCellData(0, 2, 2), locators.password);
		
	}
	
//	public static CampaignManagerListPage clickLogin()
//	{
//		operations.clickmethod(locators.LoginBtn);
//		return new CampaignManagerListPage();
//	}
	
	public static AddSRMUserPage  clickLogin() throws Exception
	{
		operations.clickmethod(locators.LoginBtn);
		return new AddSRMUserPage();
		
	}
	
	

}
