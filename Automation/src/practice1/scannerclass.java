package practice1;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class scannerclass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the date");
		int date = s.nextInt();
		System.out.println("Enter the month");
		String month = s.next();
		System.out.println("Enter the year");
		String year = s.next();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		for (int i = 1; i <= s1.getOptions().size(); i++) {
			if (i == date) {
				break;
			}
			s1.selectByIndex(i);
		}
		WebElement mon = driver.findElement(By.id("month"));
		Select s2 = new Select(mon);
		List<WebElement> allMon = s2.getOptions();
		for (int i = 0; i <= s2.getOptions().size(); i++) {
			s2.selectByIndex(i);
			String expMon = allMon.get(i).getText();
			if (expMon.equals(month)) {
				break;
			}

		}
		WebElement yr = driver.findElement(By.id("year"));
		Select s3 = new Select(yr);
		List<WebElement> allYears = s3.getOptions();
		for (int i = 0; i < s3.getOptions().size(); i++) {
			String expYear = allYears.get(i).getText();
			s3.selectByIndex(i);
			if (expYear.equals(year)) {
				break;
			}

		}

	}

}
