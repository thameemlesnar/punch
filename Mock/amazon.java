package Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class amazon {
	@Test
	public void str() throws InterruptedException
	{
		
			WebDriver gojo= new FirefoxDriver();
			
			gojo.get("https://www.amazon.in/");
			
			Amazon_test ama = new Amazon_test(gojo);

			ama.ser("redmi note 14");
			ama.cll();
			Thread.sleep(5000);
			ama.tet();
		
		
	}
	

}
