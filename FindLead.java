package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class FindLead extends BaseClass {
	public FindLead(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public FindLead click_FindLead()
	{
		driver.findElementByLinkText("Find Leads").click();
		return this;
	}
	
	public FindLead click_firstname(String dname)
	{
		driver.findElementByXPath("//input[@name='firstName'][@id='ext-gen248']").sendKeys(dname);
		return this;
	}
	
	
	public FindLead click_phonenumber() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;
	}
	public FindLead enter_phonenumber()
	{
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		return this;
	}
	public ViewLead click_FirstCell()
	
	{
		 driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		 return new ViewLead(driver);
	}
	
}
