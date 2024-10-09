package utils;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static components.ApplicationCommon.*;

public class BrowserUtils 
{
	public static void openBrowser() throws Exception
	{
		String browser=property.getProperty("browser");
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
	public static void enterUrl(Properties property) throws IOException 
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String env=property.getProperty("env");
		String url=property.getProperty(env+"_url");
		driver.get(url);
		ReportUtils.updateReport("info","url entered");
	}
	public static void closeBrowser() throws IOException
	{
		driver.quit();
		ReportUtils.updateReport("info","browser closed");
	}
}
