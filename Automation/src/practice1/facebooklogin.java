package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("8792131473");
	driver.findElement(By.id("pass")).sendKeys("Kgowda@22");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
}
}
