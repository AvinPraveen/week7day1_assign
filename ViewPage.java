package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class ViewPage extends BaseClass {

	public ViewPage(ChromeDriver driver)
	{
	
		this.driver=driver;
		
	}
	public ViewPage display()
	{
		System.out.println("the title of the page is View Page :"+driver.getTitle());
		return this;
	}
}
