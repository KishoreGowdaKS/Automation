package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kishor/OneDrive/Desktop/t1.html");
		WebElement ele = driver.findElement(By.id("f1"));
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("d");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("e");
		driver.switchTo().frame(ele);
		driver.findElement(By.id("t2")).sendKeys("f");
	
	}

}
