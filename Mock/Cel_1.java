package Mock;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Cel_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream real =new FileInputStream("./src/test/resources/lesnar.xlsx");
		
		Workbook read = WorkbookFactory.create(real);

		
				Sheet she = read.getSheet("Gojo001");		
		
			int rowcou = she.getLastRowNum();
		
				for(int i=0;i<=rowcou;i++)
				{
					Row pp = she.getRow(i);
						
				
				int cellco = pp.getLastCellNum();
					
				for(int j=0;j<cellco;j++)
				{
						String fin = pp.getCell(j).toString();
						System.out.print(fin+" ");	
				}
					System.out.println();
				}
		
				
		
	}

}
