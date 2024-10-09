package utils;

import static components.ApplicationCommon.driver;
import static components.ApplicationCommon.test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.LogStatus;

public class ReportUtils 
{
	
	public static void updateReport(String reportType,String text)
	{
		switch(reportType)
		{
		case "info":
		{
			test.log(LogStatus.INFO, text);
			break;
		}
		case "pass":
		{
			test.log(LogStatus.PASS, text);
			break;
		}
		case "fail":
		{
			test.log(LogStatus.FAIL, text+test.addScreenCapture(captureSceernshot(text)));
			break;
		}
		default:
			System.out.println("pass correct report status");
		}
	}
	public static String captureSceernshot(String name)
	{
		String temp=name.replace(" ","_");
		String path=System.getProperty("user.dir")+"/target/all_report/"+temp+".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		return path;
	}
}
