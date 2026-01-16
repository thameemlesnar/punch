package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Second {

	
	
		@DataProvider
		public Object[][] mma() throws InterruptedException
		{
			
			Object[][] fight= new Object[2][2];
			
			fight[0][0]="gojosaturo005@gmail.com";
			fight[0][1]="12356";
			Thread.sleep(8000);
			fight[1][0]="tojifushiguro@gmail.com";
			fight[1][1]="majiku001";
			return fight;
			
			}
		
		@Test(dataProvider="mma")
		
		public void login(String email,String password) throws InterruptedException
		{
			WebDriver gojo = new FirefoxDriver();
		
			gojo.get("https://www.facebook.com/");
			Thread.sleep(5000);
		gojo.findElement(By.id("email")).sendKeys(email);	
		gojo.findElement(By.id("pass")).sendKeys(password);
		gojo.findElement(By.xpath("//button[contains(@id,'u_0_')]")).click();
		gojo.quit();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

