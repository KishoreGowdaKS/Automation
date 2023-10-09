package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PibAllLinks {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class='col-md-4 col-xs-12 firstulfooter']"));
		for (int i = 0; i < alllinks.size(); i++) {
			String text = alllinks.get(i).getText();
			System.out.println("All links"+text);
		}
	}

}
