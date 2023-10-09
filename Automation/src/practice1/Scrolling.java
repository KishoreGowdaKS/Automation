package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// a.scrollByAmount(0, 200).perform();
		WebElement ele = driver.findElement(By.linkText("Sign Up"));
		Actions a = new Actions(driver);
		a.scrollToElement(ele).perform();
	}

}
