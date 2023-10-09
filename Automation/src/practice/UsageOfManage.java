package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class UsageOfManage {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	Dimension d = driver.manage().window().getSize();
	int height = d.getHeight();
	int width = d.getWidth();
	System.out.println("Height of the webpage"+height);
	System.out.println("Width of the webpage"+width);
	Point p = driver.manage().window().getPosition();
	int xAxis = p.getX();
	int yAxis = p.getY();
	System.out.println("X axis of the webpage"+xAxis);
	System.out.println("Y axis of the webpage"+yAxis);
	Thread.sleep(2000);
	driver.manage().window().setSize(new Dimension(500, 800));
	Thread.sleep(2000);
	driver.manage().window().setPosition(new Point(80, 20));
	driver.get("https://www.fb.com");
	Thread.sleep(2000);
	driver.manage().window().minimize();
//	driver.quit();
}
}
