package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBTN;
	public WebElement setUsername() {
		return username;
	}
	public WebElement setPassword() {
		return password;
	}
	public WebElement clickLogin() {
		return loginBTN;
	}
}