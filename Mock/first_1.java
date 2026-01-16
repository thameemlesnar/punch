package Mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class first_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream real =new FileInputStream("./src/test/resources/lesnar.xlsx");
		
					Workbook read = WorkbookFactory.create(real);
		//row 0
		String one = read.getSheet("Sheet1").getRow(0).getCell(0).toString();
		
		String two = read.getSheet("Sheet1").getRow(0).getCell(1).toString();
					System.out.println(one+" "+two);

					String three = read.getSheet("Sheet1").getRow(1).getCell(0).toString();
					String four = read.getSheet("Sheet1").getRow(1).getCell(1).toString();
					System.out.println(three+" "+four);		
							
			
						
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
