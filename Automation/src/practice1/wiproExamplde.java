package practice1;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.bouncycastle.its.ITSPublicEncryptionKey.symmAlgorithm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wiproExamplde {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (int i = 0; i <alllinks.size(); i++) {
			WebElement size = alllinks.get(i);
			String link = size.getAttribute("href");
			System.out.println(link);
			
		}
		
	}

}
