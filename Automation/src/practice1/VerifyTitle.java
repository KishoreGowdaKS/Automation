package practice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.testng.annotations.Test;

public class VerifyTitle {
	@Test
	public void all() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		String expectedTitle = "Googly";
		if (title.equals(expectedTitle)) {
			
			System.out.println("Both the Titles are same");
			
		}else {
			System.out.println("Both the Titles Are not same");
		}
		driver.quit();
	}

}
