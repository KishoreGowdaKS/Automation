package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
//	System.setProperty("webdriver.msedge.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//get() is used to get into that particular URL or trigger an URL
	driver.get("https://www.gmail.com");
	//getCurrentUrl() is used to fetch the current URL of the webPage
	String url = driver.getCurrentUrl();
	System.out.println(url);
	//getTitle() is used to fetch the title of current webPage
	String title = driver.getTitle();
	System.out.println(title);
	//getPageSource() is used to fetch the pageSource of current webPage
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	driver.quit();
}
}
