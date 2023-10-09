package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AjioMouseOver {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ajio.com/?gclid=Cj0KCQjwpc-oBhCGARIsAH6ote93h2MfMJb1z7Lcf6IQjYlKVinbiCouMsWSR44MqH4C3BAcv20WbWsaAumpEALw_wcB");
		List<WebElement> ele1 = driver.findElements(By.xpath("//ul[@class='level-first false']/li"));
		Actions a = new Actions(driver);
		for (int i = 0; i < ele1.size(); i++) {
			WebElement all = ele1.get(i);
			Thread.sleep(2000);
			a.moveToElement(all).perform();

		}
		for (int i = ele1.size() - 1; i >= 0; i--) {
			WebElement all = ele1.get(i);
			Thread.sleep(2000);
			a.moveToElement(all).perform();

		}
	}

}
