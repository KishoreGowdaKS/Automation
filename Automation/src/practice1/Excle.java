package practice1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excle {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 int data = (int) wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		 
		System.out.println(data);
	}

}
