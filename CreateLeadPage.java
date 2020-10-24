package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;
import cucumber.api.java.en.Given;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver)
	{
	
		this.driver=driver;
		
	}	
	
	public CreateLeadPage enter_companyName()

	{
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return this;
		
	}
	public CreateLeadPage enter_FirstName()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Prabhu");
		return this;
		
	}
	public CreateLeadPage enter_sureName()
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
		return this;
		
	}
	public CreateLeadPage enter_source_dropdown() throws InterruptedException
	{
		 WebElement dropdown1 = driver.findElementById("createLeadForm_dataSourceId");
		 Select source= new Select(dropdown1);
		 source.selectByVisibleText("Employee");
		 //Thread.sleep(5000);
		 return this;
	}
	public CreateLeadPage marketing_dropdown()
	{
		WebElement marketingcompain = driver.findElementById("createLeadForm_marketingCampaignId");
		 Select dropdown =new Select(marketingcompain);
		 dropdown.selectByValue("CATRQ_CAMPAIGNS");
		 return this;
	
	}
	public CreateLeadPage enter_industry_dropdown() throws InterruptedException
	{
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		 Select dropdown3=new Select(industry);

		 List<WebElement> options = dropdown3.getOptions();
		 int size= options.size();
		 dropdown3.selectByIndex(size-2);
		 //Thread.sleep(5000);
		 return this;
	}
	
	public CreateLeadPage enter_occupation_dd() throws InterruptedException
	{
		WebElement occupation = driver.findElementById("createLeadForm_ownershipEnumId");
		 Select drowoccupation=new Select(occupation);

		 drowoccupation.selectByValue("OWN_CCORP");
		// Thread.sleep(1000);
		 return this;
	}
	@Given("select the Country as India")
	public CreateLeadPage enter_country_dropdown() throws InterruptedException
	{
		 WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		 Select dropcountry= new Select(country);
		 dropcountry.selectByVisibleText("India");
		// Thread.sleep(8000);
		 return this;
	}
	@Given("click on Submit button for CreateLead")
	public ViewPage click_submit_button()
	{
		driver.findElementByName("submitButton").click();
		 System.out.println("the title of the page: "+driver.getTitle());
		 System.out.println("the current url of the page: "+driver.getCurrentUrl());
		 return new ViewPage(driver);
	}
}
