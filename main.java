package amazon;

import java.time.Duration;
import org.testng.annotations.Test;


public class main extends setAndtear {
	@Test
	public void mai()
	{
		step_1 s =new step_1(gojo);
		step_2 ss = new step_2(gojo);
		
		s.search("iPhone 17 Pro");
		gojo.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		s.searchclick();
		gojo.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ss.pric();
		gojo.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ss.name();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
