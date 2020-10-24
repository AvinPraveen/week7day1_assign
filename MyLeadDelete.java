package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class MyLeadDelete extends BaseClass{
	
	public MyLeadDelete(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void degletedisplay()
	{
		System.out.println("deleted successfully :"+driver.getTitle());
	}

}
