package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_page.base_page_driver;

public class step_2 extends base_page_driver{

	@FindBy(xpath ="//div[@data-cy='title-recipe' and contains(.,'iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip, Breakthrough Battery Life, Pro Fusion Camera System with Center Stage Front Camera; Deep Blue')]/../../../..//span[@class='a-price-whole']")
	private WebElement price;
	@FindBy(xpath = "//div[@data-cy='title-recipe' and contains(.,'iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip, Breakthrough Battery Life, Pro Fusion Camera System with Center Stage Front Camera; Deep Blue')]")
	private WebElement name;
	
	public step_2(WebDriver gojo)
	{
		super(gojo);
	}
	
	public void pric()
	{
		String text = price.getText();
		
			System.out.println(text);
		
	}
	public void name()
	{
		String nme = name.getText();
		System.out.println(nme);
	}








}
	









