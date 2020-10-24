package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyHomePage click_link()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver);
	}
	

}
