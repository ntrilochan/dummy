package pages;

import static components.ApplicationCommon.*;
import objectrepository.LoginPageObject;
import utils.ElementUtils;
import utils.ValidationUtils;

public class LoginPage extends LoginPageObject
{
	public void verifyLoginPage() 
	{
		ValidationUtils.elementDisplayed(link_solutions, "User naviated to login page");
	}
	public void performLogin() throws Exception 
	{
		ElementUtils.enterData(edit_username,exceldata.get("Username"));
		ElementUtils.enterData(edit_pswd, exceldata.get("Password"));
		ElementUtils.clickElement(btn_login,"login button clicked");
	}	
}
