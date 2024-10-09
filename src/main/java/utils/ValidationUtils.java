package utils;

import static components.ApplicationCommon.driver;
import org.openqa.selenium.By;

public class ValidationUtils 
{
	public static void elementDisplayed(By locator,String msg)
	{
		if(driver.findElement(locator).isDisplayed())
			ReportUtils.updateReport("pass", "element is displaying");
		else
			ReportUtils.updateReport("fail", "element is not displaying");
	}
}
