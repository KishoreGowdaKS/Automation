package practice1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
				 Sheet s = wb.getSheet("Sheet1");
		 Row r = s.getRow(1);
		 Cell cell = r.getCell(0);
		 int cv = (int)cell.getNumericCellValue();
		 
		 Sheet s1 = wb.getSheet("Sheet1");
		 Row r1 = s1.getRow(1);
		 Cell cell1 = r1.getCell(3);
		 String cv1 = cell1.getStringCellValue();
		 
		 System.out.println(cv);
		System.out.println(cv1);
	}

}



