package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class ViewLead extends BaseClass{
	
	public ViewLead(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public EditLead click_Editbutton()
	{
		driver.findElementByXPath("//a[text()='Edit']").click();
		return new EditLead(driver);
	}
	public MyLeadDelete click_Delete()
	{
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		return new MyLeadDelete(driver);
	}
}
