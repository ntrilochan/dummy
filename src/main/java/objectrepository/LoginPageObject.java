package objectrepository;

import org.openqa.selenium.By;

public class LoginPageObject 
{
	public By link_solutions = By.xpath("//li[@class='Solutions']");
	public By edit_username = By.xpath("//input[@name='username']");
	public By edit_pswd = By.xpath("//input[@name='password']");
	public By btn_login=By.xpath("//input[@value='Log In']");
}
