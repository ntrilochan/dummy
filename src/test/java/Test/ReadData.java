package Test;

import static components.ApplicationCommon.report;
import static components.ApplicationCommon.test;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BrowserUtilsExcel;
import utils.ExcelTestDataUtils;
import utils.ReportUtils;
public class ReadData extends BaseClass
{
	@Test
	public void tc001() throws Exception
	{
		LoginPage login=new LoginPage();
		ExcelTestDataUtils.loadTestData();
		test = report.startTest("tc001");
		ReportUtils.updateReport("info", "test started");
		BrowserUtilsExcel.openBrowser();
		BrowserUtilsExcel.enterUrl();
		login.verifyLoginPage();
		login.performLogin();
		BrowserUtilsExcel.closeBrowser();
	}
}
