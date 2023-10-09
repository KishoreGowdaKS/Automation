package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelemets2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=Nml_U4mNAoqFuATbnoDIBg");
	driver.findElement(By.id("APjFqb")).sendKeys("java");
	Thread.sleep(3000);
	List<WebElement> allSug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	for(int i=0;i<allSug.size();i++) {
		WebElement ele = allSug.get(i);
		String text = ele.getText();
		System.out.println(text);
	}
	int count = allSug.size();
	System.out.println(count);
	driver.quit();
	
}
}
