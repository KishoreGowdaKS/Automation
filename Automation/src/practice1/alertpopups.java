package practice1;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(1500);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(1500);
		String text1 = driver.findElement(By.id("demo")).getText();
		System.out.println(text1);
		Thread.sleep(1500);
		driver.findElement(By.linkText("Alert with Textbox")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys(" kishore");
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		String text2 = driver.findElement(By.id("demo1")).getText();
		System.out.println(text2);
		Thread.sleep(1500);

	}

}
