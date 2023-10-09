package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();

		WebElement ele1 = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		Select s = new Select(ele1);
		s.selectByIndex(18);
		WebElement ele2 = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		Select s1 = new Select(ele2);
		s1.selectByValue("11");
		WebElement ele3 = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select s2 = new Select(ele3);
		s2.selectByVisibleText("2001");

	}
}
