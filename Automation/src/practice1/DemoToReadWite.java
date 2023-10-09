package practice1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoToReadWite {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib f = new FileLib();
//		WebDriver driver = new ChromeDriver();
//		String url = f.readDataFromProperty("url");
//		driver.get(url);
//		String un = f.readDataFromProperty("username");
//		driver.findElement(By.id("username")).sendKeys(un);
//		String pwd = f.readDataFromProperty("password");
//		driver.findElement(By.name("pwd")).sendKeys(pwd);
//		driver.findElement(By.partialLinkText("Login")).click();

//		String data = f.readDataFromexcel( "Sheet1" ,1,5);
//		System.out.println(data);
//		f.readDataFromProperty("url");
//		f.readDataFromProperty("username");
//		f.readDataFromProperty("password");
		f.writeDataIntoExcel("Sheet1" ,1,5,"Kishore");
		String data =f.readDataFromexcel( "Sheet1" ,1,5);
		System.out.println(data);
//		

	}

}
