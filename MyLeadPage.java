package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class MyLeadPage extends BaseClass {
	
	public MyLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public CreateLeadPage click_createLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage(driver);
	}
	public FindLead click_FindLead()
	{
		driver.findElementByLinkText("Find Leads").click();
		return new FindLead(driver);
	}
}
