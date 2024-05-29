package testCases;

import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.DashboardPage;
import testBase.BaseClass;

public class TC_002_OpenNewAccount extends BaseClass{
	
	@Test
	public void NewAccount() throws InterruptedException {
		Thread.sleep(5000);
		DashboardPage dp=new DashboardPage(BasePage.driver);
		dp.click_openaccount();
		logger.info("****Clicked on New Account*****");
		Thread.sleep(5000);
	}

}
