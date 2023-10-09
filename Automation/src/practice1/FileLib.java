package practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./Data/commondata.property");
		Properties pos = new Properties();
		pos.load(fis);
		String data = pos.getProperty(key);
		return data;
	}
public String readDataFromexcel(String Sheet,int Row , int Cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis1 = new FileInputStream("./Data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	String data = wb.getSheet(Sheet).getRow(Row).getCell(Cell).getStringCellValue();
	return data;
		
	}
public void writeDataIntoExcel(String sheet,int row , int  cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis2 = new FileInputStream("./Data/testscript.xlsx");
	Workbook wb1 = WorkbookFactory.create(fis2);
	wb1.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos3 = new FileOutputStream("./Data/testscript.xlsx");
	wb1.write(fos3);
	
}


}
