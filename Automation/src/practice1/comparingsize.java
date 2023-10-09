package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.runtime.model.WebDriverValue;

public class comparingsize {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement textbox1 = driver.findElement(By.id("email"));
	Dimension size = textbox1.getSize();
	int height1 = size.getHeight();
	int width1 = size.getWidth();
	WebElement passbox =driver.findElement(By.id("passContainer"));
    Dimension size1 = passbox.getSize();
    int height2 = size1.getHeight();
    int width2 = size1.getWidth();
    if (height1==height2&&width1 == width2) {
    	System.out.println("both the height are same");
    	System.out.println("both the width are same");
    	
    
    }else {
    	System.out.println("both the height are not same");
    	System.out.println("both the width are not same");
    }
    
	
}
}
