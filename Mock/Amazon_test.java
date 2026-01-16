package Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_test {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private  WebElement search;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement Sclick;
	@FindBy(xpath="//span[contains(.,'Redmi Note 14 5G (Titan Black, 8GB RAM 256GB Storage)')]/../../../../..//span[@class='a-price-whole']")
	private WebElement inde;
	
	public Amazon_test(WebDriver gojo)
	{
		PageFactory.initElements(gojo,this);
		
	}
	public void ser(String text)
	{
		search.sendKeys(text);
	}
	public void cll()
	{
		Sclick.click();
	}
	public void tet()
	{
		String paaru = inde.getText();
		System.out.println(paaru);
	}
		
		
	//span[contains(.,'Redmi Note 14 5G (Phantom Purple, 8GB RAM 128GB Storage)')]/../../../../..//span[@class='a-price-whole']

	

}
