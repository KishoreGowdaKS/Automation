package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebelements {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/Kishor/OneDrive/Desktop/Demo.html");
WebElement ele1 = driver.findElement(By.partialLinkText("Goo"));
ele1.click();
driver.navigate().back();
WebElement ele2 = driver.findElement(By.linkText("Instagram"));
ele2.click();
driver.navigate().back();
WebElement ele3 = driver.findElement(By.linkText("Facebook"));
ele3.click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[id='d1']")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[name='n2']")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[class='c3']")).click();
driver.navigate().back();
driver.findElement(By.cssSelector("a[href='https://www.instagram.com']")).click();
WebElement ele4 = driver.findElement(By.className("c2"));
ele4.click();
driver.navigate().back();
driver.findElement(By.id("d1")).click();
driver.navigate().back();
driver.findElement(By.name("n3")).click();
driver.navigate().back();
driver.findElement(By.xpath(""));

		



	
}

}
