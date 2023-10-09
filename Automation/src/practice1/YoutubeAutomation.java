package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomation {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.findElement(By.xpath("//a[@id='video-title-link']")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Skip Ads")).click();
}
}
