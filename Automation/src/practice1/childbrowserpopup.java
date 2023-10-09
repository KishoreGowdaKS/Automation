package practice1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("login-google-button")).click();
		Set<String> windowid = driver.getWindowHandles();
		for (String wid : windowid) {
			driver.switchTo().window(wid);

		}
		driver.findElement(By.id("identifierId")).sendKeys("kishoregowdaks");

	}
}
