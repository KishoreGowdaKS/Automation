package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickbussindvspak {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/78180/pak-vs-ind-super-fours-3rd-match-asia-cup-2023");
		List<WebElement> allplayers = driver.findElements(By.xpath("//span[text()='India Innings']"));
	
		List<WebElement> allnames = driver.findElements(By.xpath("//span[text()='India Innings']/../../div/div[1]/a"));
		List<WebElement> socre = driver.findElements(By.xpath("//span[text()='India Innings']/../../div/div[1]/a/../../div[3]"));
		for (int i = 0; i < allnames.size(); i++) {
			WebElement names = allnames.get(i);
			WebElement runs = socre.get(i);
			String text = names.getText();
			String text1 = runs.getText();
			System.out.println(text+ " has scored "+text1);
			
	
		}
	
	}
	

}
