package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Excel.TestData;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static TestData data;
	
	FileInputStream fis=null;
	public TestBase()
	{
		
		prop=new Properties();
		
		//FileInputStream fis=null;
		try {
			fis = new FileInputStream("./src/main/java/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getData() throws Exception
	{
		data=new TestData("C:/Amrita/MiMeeting/MiMeetingPOM/Test.xlsx");
	}
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/company/cucumberPOM/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FF"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:/company/cucumberPOM/chromedriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}

	
	
	

