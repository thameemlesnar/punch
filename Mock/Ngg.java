package Mock;

import java.awt.JobAttributes.SidesType;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ngg {

	@Test(invocationCount=2)
	public void playyt() throws InterruptedException
	{
		WebDriver gojo = new FirefoxDriver();
		
		gojo.get("https://www.youtube.com/");
	
		WebElement sea = gojo.findElement(By.xpath("//input[@name='search_query']"));
		sea.sendKeys("judas gojo vs sukuna");
		Thread.sleep(7000);	
		List<WebElement> nani = gojo.findElements(By.xpath("//div[@id='i0']/div"));
		Thread.sleep(7000);	
		System.out.println(nani.size());
			for(int i=0;i<nani.size();i++)
			{
				WebElement ma = nani.get(i);				
						String mm = ma.getText();		
						System.out.println(mm);
			}
			WebElement bb = nani.get(nani.size()-6);
		System.out.println(bb.getText());
			bb.click();
			Thread.sleep(3000);
			WebElement play = gojo.findElement(By.xpath("//a[@id='video-title' and contains(.,'JUDAS x GOJO vs SUKUNA | EPIC BATTLE + ANIME VOICES [Jujutsu Kaisen MMV]')]"));
			
			play.click();
			
			System.out.println(bb);
		Thread.sleep(10000);
		gojo.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
