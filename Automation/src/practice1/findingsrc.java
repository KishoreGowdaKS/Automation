package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingsrc {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement src = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	String value = src.getAttribute("src");
	System.out.println("src"+value);
	driver.quit();
}
}
