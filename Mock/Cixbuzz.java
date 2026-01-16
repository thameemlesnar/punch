package Mock;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cixbuzz {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver gojo = new FirefoxDriver();
		
		gojo.get("https://www.cricbuzz.com/");
		
		gojo.findElement(By.xpath("//div[@title='2nd Quarter-Final • Duleep Trophy 2025']")).click();
		
		gojo.findElement(By.xpath("//a[text()='Scorecard']")).click();
		
		List<WebElement> step_one = gojo.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']"));
		
				System.out.println(step_one.size());
		Thread.sleep(5000);
				for(int i=0;i<step_one.size()-9;i++)
		{
						WebElement two = step_one.get(i);
						List<WebElement> three = two.findElements(By.tagName("div"));
								
								Thread.sleep(1000);
							if(three.size()>=3)
							{
							System.out.println(three.get(0).getText());
							System.out.println(three.get(2).getText());
							}
								
		
		}
		
		
				gojo.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
