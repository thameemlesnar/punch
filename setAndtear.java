package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class setAndtear {
WebDriver gojo;
	@BeforeClass
	public void setup()
	{	gojo=new FirefoxDriver();
		gojo.get("https://www.amazon.in/");
		gojo.manage().window().fullscreen();
		
		
	}
	@AfterClass
	public void teardown()
	{
		gojo.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
