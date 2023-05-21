package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultileData {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	//Read multiple data by using for loop 
	FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
	Workbook wb2 = WorkbookFactory.create(fis2);
	Sheet sheet2 = wb2.getSheet("IPL");
	int rc = sheet2.getLastRowNum();
for(int i=1;i<rc;i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(0);
		  String data = cell.getStringCellValue();
		  Thread.sleep(2000);
		  System.out.println(data);
		  
		  
	
		}
		
		
		
	}

}
