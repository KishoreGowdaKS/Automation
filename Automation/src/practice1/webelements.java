package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/ref=nav_logo");
	driver.manage().window().maximize();
	List<WebElement> allopt = driver.findElements(By.tagName("a"));
	for(int i=0;i<allopt.size();i++) {
		WebElement element = allopt.get(i);
		String text = element.getText();
		System.out.println(text);
	}
int count = allopt.size();
System.out.println(count);
	driver.quit();
}
}
