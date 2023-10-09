package practice1;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("Virat123");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		driver.findElement(By.name("remember")).click();
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		String url = link.getAttribute("href");
		System.out.println("Attribute value of href: "+url);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		WebElement errormsg = driver.findElement(By.className("errormsg"));
		String color = errormsg.getCssValue("color");
		System.out.println("Color of the error msg: "+color);
		String text = errormsg.getText();
		System.out.println("Error message is: "+text);
		String tag = errormsg.getTagName();
		System.out.println("Tagname of error message is: "+tag);
		WebElement pwdTbx = driver.findElement(By.name("pwd"));
		org.openqa.selenium.Point p = pwdTbx.getLocation();
		int xAxis = p.getX();
		int yAxis = p.getY();
		System.out.println("X axis of password textbox: "+xAxis);
		System.out.println("Y axis of password textbox: "+yAxis);
		org.openqa.selenium.Dimension d = pwdTbx.getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		System.out.println("Height of password textbox: "+height);
		System.out.println("Width of password textbox: "+width);
		boolean res = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).isDisplayed();
		if(res) {
			System.out.println("Element is displayed");
		}else {
			System.out.println("Element is not displayed");
		}
		boolean res1 = driver.findElement(By.partialLinkText("Login")).isEnabled();
		if(res1) {
			System.out.println("Element is enabled");
		}else {
			System.out.println("Element is disabled");
		}
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		boolean res2 = driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
		if(res2) {
			System.out.println("Checkbox is selected");
		}else {
			System.out.println("Checkbox is not selected");
		}
	
}}

