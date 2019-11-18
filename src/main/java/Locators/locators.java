package Locators;

import org.openqa.selenium.By;

public class locators {
	public static By UserName=By.xpath("//*[@id='emailfield']");
	public static By password=By.xpath("//*[@id='passfield']");
	public static By LoginBtn=By.xpath("//*[@id='loginFormSubmit']");
	
	public static By mngUserbtn=By.xpath("//*[@id='sidebar-menu2']/div/ul/li[4]/a");
	public static By CRMTab=By.xpath("//*[contains(@href,'SRM')]"); 
	public static By AddNewSRMbtn=By.xpath("//*[contains(text(),'Add New SRM')]");
	
	public static By fName=By.xpath("//*[@placeholder='First Name*']");
	public static By lName=By.xpath("//*[@placeholder='Last Name*']");
	public static By Email=By.xpath("//*[@placeholder='Email Address*']");
	public static By phoneFlag=By.xpath("//*[@class='selected-flag']");
	public static By phoneNum=By.xpath("//*[@id='PhoneNumber']");
	public static By SRMuserpassword=By.xpath("//*[@type='password']");
	public static By SRMuserconfirmPassword=By.xpath("//*[@placeholder='Confirm Password*']");
	public static By userType=By.xpath("//*[@class='mat-select-value']");
	public static By saveBtn=By.xpath("//*[@class='ladda-label']");
	
	
	public static By addedUser=By.xpath("//*[contains(text(),'Test1 User1')]");
	public static By updateuserAction=By.xpath("//*[@id='SRM']/div/div/app-srm-list/app-list-table/div[3]/div/table/tbody[1]/tr[1]/td[5]/div/div/div/button/span");
	public static By clickonEdit=By.xpath("//*[@id='SRM']/div/div/app-srm-list/app-list-table/div[3]/div/table/tbody[1]/tr[1]/td[5]/div/div/div/ul/li[2]/a");
	public static By updateButton=By.xpath("/html/body/app-root/ng-component/div/div[2]/div/div/div/ng-component/div[2]/div/div/button/span[1]");
	
}