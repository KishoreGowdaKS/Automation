package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		List<WebElement> drag1 = driver
				.findElements(By.xpath("//div[@class='dragableBox' and not(contains(@id,'DHTMLgo'))]"));
		List<WebElement> drag2 = driver.findElements(By.xpath("//div[@class='dragableBoxRight']"));
		Actions a = new Actions(driver);
		for (int i = 0; i < drag1.size(); i++) {
			WebElement ele = drag1.get(i);
			WebElement ele2 = drag2.get(i);
			a.dragAndDrop(ele, ele2).perform();

		}
	}

}
