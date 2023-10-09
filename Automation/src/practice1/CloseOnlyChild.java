package practice1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChild {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allid = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		for (String wid : allid) {
			driver.switchTo().window(wid);
			Thread.sleep(2000);
			// to close only parent
			if (wid.equals(parent)) {
				driver.close();

			} else {
				// to close only child driver.close() will shift here
				Thread.sleep(2000);

			}

		}
	}
}
