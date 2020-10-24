package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyHomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyLeadPage click_Lead()
	{
		driver.findElementByLinkText("Leads").click();
		return new MyLeadPage(driver);
	}
	
}
