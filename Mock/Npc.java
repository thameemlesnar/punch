package Mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Npc {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		
		WebDriver gojo = new FirefoxDriver();
		
		gojo.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		Workbook nani =  WorkbookFactory.create(new FileInputStream(".\\src\\test\\resources\\toji.xlsx"));
		
		String ss = nani.getSheet("gojosheet005").getRow(4).getCell(1).toString();
		
				WebElement jj = gojo.findElement(By.xpath("//input[@class='Pke_EE']"));
				jj.sendKeys(ss);
				Thread.sleep(3000);
				gojo.findElement(By.xpath("//button[@class='_2iLD__']")).click();
				Thread.sleep(1000);
				
		
				Sheet one = nani.getSheet("gojosheet005");
						
					int two = one.getLastRowNum();	
			
					for(int i=0;i<=two;i++)
					{
							Row three = one.getRow(i);
						if(three==null) continue;
							int four = three.getLastCellNum();
							
							for(int j=0;j<four;j++)
							{
							
							Cell five = three.getCell(j);
										if(five!=null) {
											String six = five.toString();
											System.out.print(six+ " ");
								}
							}
							System.out.println();
							
					}
		
		gojo.quit();
		
		
		
	}

}
