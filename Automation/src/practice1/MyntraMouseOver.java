package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseOver {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='desktop-navContent']"));
		Actions a = new Actions(driver);
		for (int i = 0; i < ele.size(); i++) {
			WebElement oneele = ele.get(i);
			Thread.sleep(1000);
			a.moveToElement(oneele).perform();

		}
		for (int i = ele.size() - 1; i >= 0; i--) {
			WebElement oneele = ele.get(i);
			Thread.sleep(1000);
			a.moveToElement(oneele).perform();

		}
	}

}
