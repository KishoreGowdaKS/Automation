package practice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.asynchttpclient.filter.ReleasePermitOnComplete;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInToActiTime {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./Data/commondata.property");
		Properties pro = new Properties();
		pro.load(fis);
		String url = pro.getProperty("url");
		driver.get(url);
		String un = pro.getProperty("username");
		driver.findElement(By.id("username")).sendKeys(un);
		String pwd = pro.getProperty("password");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
