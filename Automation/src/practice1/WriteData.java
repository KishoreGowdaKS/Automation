package practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {public class WriteDataIntoExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//We need to convert data into java understandable language
			FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//In order to interact with excel we need to create Workbook interface object
			Workbook wb = WorkbookFactory.create(fis);
		//First we need to get the sheet where we need to enter the data, get the row and
		//get the cell, then to set the value for a cell we use setCellValue(String value)
			wb.getSheet("createCustomer").getRow(1).getCell(2).setCellValue("Dinga@123");
		//In order to convert the data from java understandable to excel format we use FileoutputStream
			FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		//Actually writing data into excel happens here with the help of write(FileOutputStream fos)
			wb.write(fos);
			wb.close();
		}
		}

}
