package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAnimation {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helloworld");
}
}
