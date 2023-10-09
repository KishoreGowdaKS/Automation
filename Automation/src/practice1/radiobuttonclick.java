package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonclick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//label[text()='Female']/../input")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//label[text()='Male']/../input")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//label[text()='Custom']/../input")).click();
	driver.manage().window().maximize();
	
	

}
}
