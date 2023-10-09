package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class southaf {public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/53560/engw-vs-slw-2nd-odi-sri-lanka-women-tour-of-england-2023");
	List<WebElement> allplayers = driver.findElements(By.xpath("//span[text()='South Africa Innings']"));

	List<WebElement> allnames = driver.findElements(By.xpath("(//span[contains(text(),'Innings')])[1]/../../div/div[1]/a"));
	List<WebElement> socre = driver.findElements(By.xpath("(//span[contains(text(),'Innings')])[1]/../../div/div[1]/a/../../div[3]"));
	for (int i = 0; i < allnames.size(); i++) {
		WebElement names = allnames.get(i);
		WebElement runs = socre.get(i);
		String text = names.getText();
		String text1 = runs.getText();
		System.out.println(text+ " has scored "+text1);
		
	}


}}
