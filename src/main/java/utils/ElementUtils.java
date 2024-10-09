package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static components.ApplicationCommon.*;

public class ElementUtils 
{
	public static void enterData(By locator, String value) throws Exception 
	{
		waitForElement(locator).sendKeys(value);
		ReportUtils.updateReport("info", "data entered");
	}

	private static WebElement waitForElement(By locator) throws InterruptedException 
	{
		WebElement element = null;
		for (int i=0;i<20;i++) 
		{
			try 
			{
				element = driver.findElement(locator);
				break;
			} catch (Exception e) 
			{
				Thread.sleep(500);
			}
		}
		return element;
	}

	public static void clickElement(By locator,String msg) throws Exception 
	{
		waitForElement(locator).click();
		ReportUtils.updateReport("info", msg);
	}
}
