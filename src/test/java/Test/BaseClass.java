package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import static components.ApplicationCommon.*;

public class BaseClass 
{
	@BeforeClass
	public void difine_prop() throws FileNotFoundException, IOException
	{
		String path=System.getProperty("user.dir")+"/src/main/resources/config/global.properties";
		property=new Properties();
		property.load(new FileInputStream(new File(path)));
	}
	@BeforeTest
	public void allPreTest()
	{
		String path=System.getProperty("user.dir")+"\\target\\all_report\\report.html";
		report=new ExtentReports(path);
	}
	@BeforeMethod
	public void preMethod(ITestResult result)
	{
		methodname=result.getMethod().getMethodName();
		System.out.println("Test Method Name : "+methodname);
	}
	@AfterMethod
	public void postMethod()
	{
		report.endTest(test);
		report.flush();
	}
	@AfterTest
	public void allPostTest()
	{
		report.close();
	}
}
