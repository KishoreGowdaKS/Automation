package practice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle2 {
	@Test
	public void all() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(title, expectedTitle);
//		SoftAssert s = new SoftAssert();
//		s.assertEquals(title, expectedTitle);
		driver.quit();
//		s.assertAll();
		
	}

}

