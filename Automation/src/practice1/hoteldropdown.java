package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hoteldropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kishor/OneDrive/Desktop/hotel.html");
		WebElement ele = driver.findElement(By.id("empire"));
		Select s = new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("3");
		Thread.sleep(2000);
		s.selectByVisibleText("biriyani");
		Thread.sleep(2000);
		s.deselectAll();
		//s.deselectByIndex(1);
		//Thread.sleep(2000);
		//s.deselectByValue("3");
		
}

}
