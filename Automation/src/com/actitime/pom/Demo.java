package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com");
		LogInpage l = new LogInpage(driver);
		l.action("admin1", "manager1");
		Thread.sleep(2000);
		l.action("admin", "manager");
		Homepage l1 = new Homepage(driver);
		l1.action1();
		l.action("admin", "manager");
		l1.action1();
		Thread.sleep(3000);
		driver.quit();
	}

}
