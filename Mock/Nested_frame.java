package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nested_frame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver gojo = new FirefoxDriver();
				gojo.get("https://the-internet.herokuapp.com/nested_frames");
				
				gojo.switchTo().frame(0);
			Thread.sleep(2000);
				gojo.switchTo().frame(0);
				Thread.sleep(2000);
				String kk = gojo.findElement(By.xpath("//body[contains(.,'LEFT')]")).getText();
				System.out.println(kk);
				gojo.switchTo().defaultContent();
				
				gojo.switchTo().frame("frame-top");
				gojo.switchTo().frame("frame-middle");
	
				String ll = gojo.findElement(By.xpath("//body[contains(.,'MIDDLE')]")).getText();
				System.out.println(ll);
				gojo.switchTo().defaultContent();
				gojo.switchTo().frame(1);
				String fina = gojo.findElement(By.xpath("//body[contains(.,'BOTTOM')]")).getText();
				System.out.println(fina);
				
	}

}
