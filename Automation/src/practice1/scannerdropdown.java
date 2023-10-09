package practice1;

import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class scannerdropdown {

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String item = s.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Kishor/OneDrive/Desktop/hotel.html");
		WebElement ele = driver.findElement(By.id("empire"));
		 Select s1 = new Select(ele);
		 int count=0;
		 List<WebElement> alloption = s1.getOptions();
		 for (int i = 0; i < .length; i++) {
			
		} {
		 text1 = alloption.get(count).getText();
		 
		 }	
			
		}
	
	
	}

	}
