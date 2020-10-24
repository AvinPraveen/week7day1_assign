package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class EditLead extends BaseClass{

	public EditLead(ChromeDriver driver)
	{
		this.driver=driver;
		
	}
	public EditLead enter_CompanyName() throws InterruptedException
	{
		driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").clear();
		Thread.sleep(2000);
		//enter new value in company name 
		driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").sendKeys("TEMENOS");
		return this;
	}
	public ViewPage click_Submit()
	{
		driver.findElementByXPath("//input[@class='smallSubmit'and @name='submitButton']").click();
		return new ViewPage(driver);
	}
}
