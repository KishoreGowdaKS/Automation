package practice1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeContextClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement rightclick = driver.findElement(By.linkText("actiTIME Inc."));
		Actions a = new Actions(driver);
		a.contextClick(rightclick).perform();
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_W);
	}

}
