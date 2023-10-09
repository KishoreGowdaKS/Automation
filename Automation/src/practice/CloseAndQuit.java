package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	//getWindowHandle() is used to get window ID of current browser
	String wid = driver.getWindowHandle();
	System.out.println(wid);
	//getWindowHandles() is used to get window ID of all browsers
	Set<String> allWid = driver.getWindowHandles();
	System.out.println(allWid);
	//switchTo() is used to transfer the control from main browser to other elements
	driver.switchTo().window(wid);
	//close() is used to close the current browser
	driver.close();
	//quit() is used to close all the browsers/tabs
	//driver.quit();
}
}
