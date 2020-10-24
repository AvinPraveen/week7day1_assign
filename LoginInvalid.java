package TestCase;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginInvalid extends BaseClass{
	
	@Test
	public void Click_LoginInvalid() throws InterruptedException
	{	
		new LoginPage(driver)		
		.enter_UserName("demo123")
		.enter_Password("crmsfa").
		Click_LoginForInvalid();
		
	}
}
