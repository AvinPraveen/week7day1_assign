package TestCase;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class Logintodelete extends BaseClass {
	@Test
	public void deleteLead() throws InterruptedException
	{
		new LoginPage(driver)
		.enter_UserName("demosalesmanager")
		.enter_Password("crmsfa")
		.Click_LoginButton()
		.click_link()
		.click_Lead()
		.click_FindLead()
		.click_phonenumber()
		.enter_phonenumber()
		.click_FirstCell()
		.click_Delete()
		.degletedisplay();
		
	}
}
