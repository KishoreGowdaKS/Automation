package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggetion {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	List<WebElement> alllink = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	for (int i = 0; i < alllink.size(); i++) {
		WebElement link = alllink.get(i);
		String links = link.getText();
		System.out.println(links);
		
	}
	alllink.get(alllink.size()-1).click();
	
}
}
