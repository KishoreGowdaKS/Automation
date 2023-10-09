package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbcnews {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com/");
	List<WebElement> allNews = driver.findElements(By.xpath("//h2[text()='Latest Business News']/..//h3"));
	for (int i = 0; i < allNews.size(); i++) {
		WebElement news = allNews.get(i);
		String text = news.getText();
		System.out.println(text);
		}
	}
}
