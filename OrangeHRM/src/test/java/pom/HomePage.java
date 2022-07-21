package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="welcome")
	private WebElement profile;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public WebElement clickProfile() {
		return profile;
	}
	public WebElement clickLogout() {
		return logout;
	}
}