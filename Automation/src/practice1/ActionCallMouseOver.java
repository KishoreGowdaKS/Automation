package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCallMouseOver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("navbarPages"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.linkText("Login"));
		a.contextClick(ele1).perform();
		Thread.sleep(5000);
		
	
	}

}
