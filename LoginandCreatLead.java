package TestCase;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;


public class LoginandCreatLead extends BaseClass {
	
	@Test	
	public void loginCreteLead() throws InterruptedException
	{
		new LoginPage(driver)
		.enter_UserName("demosalesmanager")
		.enter_Password("crmsfa")
		.Click_LoginButton()
		.click_link()
		.click_Lead()
		.click_createLead()
		.enter_companyName()
		.enter_FirstName()
		.enter_sureName()
		.enter_source_dropdown()
		.enter_occupation_dd()
		.enter_industry_dropdown()
		.enter_country_dropdown()
		.click_submit_button();
	}

}