package practice1;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.flipkart.com/");
		drive.findElement(By.name("q")).sendKeys("iphone 14 pro" + Keys.ENTER);
		Thread.sleep(3500);
		List<WebElement> allnames = drive.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		List<WebElement> cost = drive
				.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]/../../div[2]/div[1]/div[1]/div[1]"));
		for (int i = 0; i < allnames.size(); i++) {
			WebElement ele = allnames.get(i);
			String alltext = ele.getText();
			WebElement ele1 = cost.get(i);
			String allcost = ele1.getText();
			System.out.println(alltext + " " + allcost);
		}

	}
}
