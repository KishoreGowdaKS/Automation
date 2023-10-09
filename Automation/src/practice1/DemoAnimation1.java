package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAnimation1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement ele = driver.findElement(By.xpath("//iframe[contains(@src,'MultipleFrames.html')]"));
		driver.switchTo().frame(ele);
		WebElement ele1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(ele1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("haiworld");
	}
}
