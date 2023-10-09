package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class displaydropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kishor/OneDrive/Desktop/hotel.html");
	List<WebElement>ele = driver.findElements(By.id("empire"));
	for (int i = 0; i < ele.size(); i++) {
		WebElement s = ele.get(i);
		String text = s.getText();
		System.out.println(text);
		
		
	}
		
		
	}
}
