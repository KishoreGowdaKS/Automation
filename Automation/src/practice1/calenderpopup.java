package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calenderpopup {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("policynumber")).sendKeys("12345678z");
		driver.findElement(By.id("dob")).click();
WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s = new Select(month);
		s.selectByIndex(10);
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s1 = new Select(year);
		s1.selectByValue("2001");
		
		driver.findElement(By.linkText("19")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8310276751");
	
	}

}
