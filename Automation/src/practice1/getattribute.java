package practice1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {
	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.actitime.com/login.do");
		WebElement attribute = Driver.findElement(By.id("keepLoggedInCheckBox"));
		String value = attribute.getAttribute("title");
		System.out.println("attribute value"+value);
		
	}

}
