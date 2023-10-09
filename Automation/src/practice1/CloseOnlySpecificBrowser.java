package practice1;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlySpecificBrowser {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Please enter the title");
		String expectedTitle = S.next();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			String actualTitle = driver.getTitle();
			if(actualTitle.contains(expectedTitle)) {
				driver.close();
			}
		}
	}
}
