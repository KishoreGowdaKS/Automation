package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectall {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kishor/OneDrive/Desktop/hotel.html");
		WebElement ele = driver.findElement(By.id("empire"));
		Select s = new Select(ele);
		List<WebElement> option = s.getOptions();
		for (int i = 0; i < option.size(); i++) {
			s.selectByIndex(i);
			
			
		}
		for (int i = 0; i < option.size(); i++) {
			s.deselectByIndex(i);
			
			
		}
		
	}

}
