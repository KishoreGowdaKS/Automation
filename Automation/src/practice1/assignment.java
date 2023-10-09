package practice1;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
WebDriver web = new EdgeDriver();
	Thread.sleep(2500);
	web.manage().window().maximize();
	Thread.sleep(2500);
	web.get("https://www.google.com");
	Thread.sleep(2500);
	web.navigate().to("https://www.instagram.com");
	Thread.sleep(2500);
	web.navigate().back();
	web.navigate().forward();
	web.navigate().refresh();
	Thread.sleep(2500);
 String url = web.getCurrentUrl();
 	System.out.println(url);
 String title = web.getTitle();
 	System.out.println(title);
 String pgsource = web.getPageSource();
 	System.out.println(pgsource);
 	String id = web.getWindowHandle();
 	System.out.println(id);
 Set<String> ids = web.getWindowHandles();
 	System.out.println(ids);
 	web.manage().window().maximize();
 	Thread.sleep(2500);
 	web.manage().window().fullscreen();
 	Thread.sleep(2500);
 Dimension d = web.manage().window().getSize();
 	int height = d.getHeight();
 	int weidth = d.getWidth();
 	System.out.println("height of the web page"+ height);
 	System.out.println("weidth of the web page"+ weidth);
 Point p = web.manage().window().getPosition();
	int xAxis = p.getX();
	int yAxis = p.getY();
	System.out.println("X axis of the webpage"+ xAxis);
	System.out.println("Y axis of the webpage"+ yAxis);
	web.manage().window().setSize(new Dimension(700, 900));
	web.manage().window().setPosition(new Point(150, 60));
	Thread.sleep(2500);
	web.quit();
 
	}

}
