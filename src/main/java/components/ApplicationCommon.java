package components;

import java.util.HashMap;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ApplicationCommon 
{
	public static Properties property;
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public  static String methodname;
	public static HashMap<String, String> exceldata;
}
