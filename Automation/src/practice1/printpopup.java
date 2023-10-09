package practice1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printpopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_1);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_MINUS);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_2);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
	}

}
