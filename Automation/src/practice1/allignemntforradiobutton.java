package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allignemntforradiobutton {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2500);
	WebElement radio1 = driver.findElement(By.xpath("//label[text()='Female']/../input"));
	Point axis1 = radio1.getLocation();
	int yaxis1 = axis1.getY();
	System.err.println(yaxis1);
	WebElement radio2 = driver.findElement(By.xpath("//label[text()='Male']/../input"));
	Point axis2 = radio2.getLocation();
	int yaxis2 = axis2.getY();
	System.out.println(yaxis2);
    WebElement radio3 = driver.findElement(By.xpath("//label[text()='Custom']/../input"));
    Point axis3 = radio3.getLocation();
    int yaxis3 = axis3.getY();
    System.out.println(yaxis3);
    if(yaxis1==yaxis2 &&yaxis2==yaxis3) {
    	System.out.println("properly alligned");
    }else {
    	System.out.println("not alligend properly");
    }
    
    
}
}
