package TestCase;



import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginandEditLead extends BaseClass {

	@Test
	public void EditLeadClass() throws InterruptedException
	{
		new LoginPage(driver)
		.enter_UserName("demosalesmanager")
		.enter_Password("crmsfa")
		.Click_LoginButton()
		.click_link()
		.click_Lead()
		.click_FindLead()
		.click_firstname("Hema")
		.click_FirstCell()
		.click_Editbutton()
		.enter_CompanyName()
		.click_Submit()
		.display();
	}
}
