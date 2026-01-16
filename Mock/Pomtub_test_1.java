package Mock;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomtub_test_1 {

		@FindBy(xpath="//input[@name='search_query']")
		private WebElement search;
		@FindBy(xpath="//button[@aria-label='Search']")
		private WebElement Clic;
		@FindBy(xpath="//a[@id='video-title' and contains(.,'Coolie - Official Trailer | Superstar Rajinikanth | Sun Pictures | Lokesh | Anirudh')]")
		private WebElement vidopl;
		@FindBy(xpath="//yt-formatted-string[contains(.,'Home')]")
		private WebElement check;
		
		public Pomtub_test_1(WebDriver gojo)
		{
			PageFactory.initElements(gojo,this);
		}
		public void saymyname(String txt)
		{
				search.sendKeys(txt);
				boolean jj = search.isDisplayed();
				if(jj)
				{
					System.out.println("home page diplayed");
				}
				else
				{
					System.out.println("not displayed ");
				}
		
		}
		public void methcl()
		{
			Clic.click();
		}
		public void vid()
		{
			vidopl.click();
		}
		public void che()
		{
			boolean jj = check.isDisplayed();
				if(jj)
				{
					System.out.println("home page diplayed");
				}
				else
				{
					System.out.println("not displayed ");
				}
			
				
		}
	
	
	
	
	
	
	
	
	
	
}
