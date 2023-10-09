package practice1;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement a = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement b = driver.findElement(By.id("column-2"));
		Actions c = new Actions(driver);
		Thread.sleep(2000);
		c.dragAndDrop(a, b).perform();

	}

}
