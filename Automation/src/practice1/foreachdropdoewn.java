package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class foreachdropdoewn {
	public class displaydropdown {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Kishor/OneDrive/Desktop/hotel.html");
			WebElement ele = driver.findElement(By.id("empire"));
		Select s =new Select(ele);
		List<WebElement> alloptions = s.getOptions();
		for (WebElement ele1 : alloptions) { 
			System.out.println(ele1.getText());
		
			
		}
	
			
		
		

			
		}
	}

}
