package pom;

import org.testng.annotations.Test;

import generic.BaseTest;

public class test extends BaseTest{
	@Test
	public void validLogin() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setUsername().sendKeys("Admin");
		lp.setPassword().sendKeys("admin123");
		lp.clickLogin().click();
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.clickProfile().click();
		hp.clickLogout().click();
	}
}