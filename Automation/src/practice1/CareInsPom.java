package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareInsPom {
	@FindBy(xpath = "//select[@data-handler='selectMonth']")
	private WebElement monthDropdown;
	@FindBy(xpath = "//select[@aria-label='Select year']")
	private WebElement yearDropdown;

	public CareInsPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMonthDropdown() {
		return monthDropdown;
	}

	public WebElement getYearDropdown() {
		return yearDropdown;
	}
}
