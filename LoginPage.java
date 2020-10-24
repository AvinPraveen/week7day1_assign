package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public LoginPage enter_UserName(String uname) throws InterruptedException
	{
		driver.findElementById("username").sendKeys(uname);
		Thread.sleep(5000);
		return this;
		
	}
	public LoginPage enter_Password(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
		return this;
	}
	public HomePage Click_LoginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage(driver);
	}
	
	public LoginPage Click_LoginForInvalid()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return this;
	}

}
