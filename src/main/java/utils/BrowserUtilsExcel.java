package utils;

import static components.ApplicationCommon.driver;
import static components.ApplicationCommon.exceldata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilsExcel 
{
	public static void openBrowser()
	{
		String browser=exceldata.get("Browser");
		switch(browser)
		{
		case "chrome":
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		case "firefox":
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		}
		default:
		{
			System.out.println("invalid browser value");
			break;
		}
		}
		driver.manage().window().maximize();
		ReportUtils.updateReport("info",browser+" :Browser launced");
	}
	public static void enterUrl()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String env=exceldata.get("Env");
		String url=exceldata.get("url");
		driver.get(url);
		ReportUtils.updateReport("info",env+" environment created");
		ReportUtils.updateReport("info","url entered");
	}
	public static void closeBrowser()
	{
		driver.quit();
		ReportUtils.updateReport("info","browser closed");
	}
}
