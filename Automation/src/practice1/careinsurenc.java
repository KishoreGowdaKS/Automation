package practice1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class careinsurenc {
	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = s.next();
		System.out.println("Enter the month");
		String mon = s.next();
		System.out.println("Enter the year");
		String year = s.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("dob")).click();
		CareInsPom crs = new CareInsPom(driver);
		WebElement month = crs.getMonthDropdown();
		Select s1 = new Select(month);
		ArrayList<String> al1 = new ArrayList<>();
		List<WebElement> allMonth = s1.getOptions();
		for (WebElement ele : allMonth) {
			al1.add(ele.getText());
		}
		int count1 = allMonth.size();
		for (int i = 0; i <= count1; i++) {
			String ele = al1.get(i);
			s1.selectByIndex(i);
			if (ele.equals(mon)) {
				break;
			}
		}
		WebElement yr = crs.getYearDropdown();
		Select s2 = new Select(yr);
		for (int i = 1; i <= s2.getOptions().size(); i++) {
			List<WebElement> allYear = s2.getOptions();
			String ele = allYear.get(i).getText();
			s2.selectByIndex(i);
			if (ele.equals(year)) {
				break;
			}
		}

		driver.findElement(By.linkText(day)).click();
		;

	}
}
