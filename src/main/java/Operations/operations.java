package Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Util.TestBase;

public class operations extends TestBase{

	public static void openbrowser()
	{
//		logobj.info("Opening the browser");
		TestBase.initialization();	
//		String s1=Screenshots.TakeScreenShot("C:\\Self-Auto\\selfPro\\screenshots\\"+System.currentTimeMillis()+".png", TestBase.driver);
		
	}

public static void SendValue(String val, By locator)
{
	WebElement ele=driver.findElement(locator);
	System.out.println("Sending text");
	ele.clear();
	ele.sendKeys(val);
}

public static void clickmethod(By locatorsforClick)
{
	System.out.println("Clicking on search button");
	driver.findElement(locatorsforClick).click();	
}
public static void close()
{
	System.out.println("closing the browser");
	driver.close();
}
}