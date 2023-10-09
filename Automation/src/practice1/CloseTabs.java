package practice1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		Set<String> allwind = driver.getWindowHandles();
	for (String wid : allwind) {
		Thread.sleep(2000);
		driver.switchTo().window(wid);
		Thread.sleep(2000);
		driver.close();
		
	}
	}

}
