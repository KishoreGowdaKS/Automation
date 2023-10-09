package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Kishor/OneDrive/Desktop/Demo.html");
	driver.findElement(By.tagName("a")).click();
	driver.navigate().to("https://www.amazon.in/");
	
}
}
