package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_page.base_page_driver;


public class step_1 extends base_page_driver{

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement search;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchClick;
	
	public step_1(WebDriver gojo)
	{
		super(gojo);
		
	}
	
	public void search(String text)
	{
		search.sendKeys(text);
		
	}
	public void searchclick()
	{
		searchClick.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
