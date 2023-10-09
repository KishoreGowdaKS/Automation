package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Actions a = new Actions(driver);
		a.clickAndHold(ele).moveByOffset(1, 40).perform();
		
	}

}
