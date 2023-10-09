package practice1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pib {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Ministry of Health and Family Welfare")).click();
		driver.switchTo().alert().accept();
		Set<String> allwid = driver.getWindowHandles();
		String wid1 = driver.getWindowHandle();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			
		}	
		String title = driver.getTitle();
		System.out.println(title);
	}

}
