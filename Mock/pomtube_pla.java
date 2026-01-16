package Mock;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pomtube_pla {

	@Test(invocationCount = 2)
		public void main() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
		
		{	WebDriver gojo= new FirefoxDriver();
		
		gojo.get("https://www.youtube.com/");
		
		Pomtub_test_1 nani = new Pomtub_test_1(gojo);		
		//nani.che();
		Thread.sleep(3000);
		nani.saymyname("coolie trailer tamil");
		Thread.sleep(3000);
		nani.methcl();
		Thread.sleep(5000);
		nani.vid();
		Thread.sleep(15000);
		
		Workbook man = WorkbookFactory.create(new FileInputStream(".\\src\\test\\resources\\lesnar.xlsx"));
		Sheet sheet1 = man.getSheet("Gojo001");
		
			int rowcount = sheet1.getLastRowNum();
		
		for(int i=0;i<=rowcount;i++)
		{
				Row row1 = sheet1.getRow(i);
				 if(row1==null)continue;
				 
				 short cellcount = row1.getLastCellNum();
				
				 	for(int c=0;c<cellcount;c++)
				 	{
				 		Cell cell1 = row1.getCell(c);
				 			if(cell1 != null)
				 			{
				 				String one = cell1.toString();
				 				System.out.print(one+"  ");
				 			
				 			}
				 		
				 			
				 		
				 		
				 	}
				 	System.out.println();

		
		
		
		
		}
System.out.println("===============================================================================================");
		gojo.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
