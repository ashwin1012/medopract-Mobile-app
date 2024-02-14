package tests;

import java.net.MalformedURLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericPages.CommonMethod;
import pages.LoginPage;

public class TC__002LoginMobileTest extends CommonMethod {

	public TC__002LoginMobileTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	Logger log = LogManager.getLogger(TC__002LoginMobileTest.class.getName());

	@BeforeClass
	public void openAndroidApk() throws MalformedURLException, InterruptedException {
		initializeDriver();
		log.info("Opened Android Apk File");
	}

	@Test(priority = 1)
	public void login() throws Exception {
		test = reports.startTest("TC001 Login with UserName and Password");
		LoginPage l = new LoginPage();
		Thread.sleep(3000);
		l.enterUserName();
		log.info("Entered Username");
		l.enterPassword();
		log.info("Entered Password");
		l.clickSubmit();
		log.info("Clicked Submit Button");
		Thread.sleep(3000);

		String actual = null;

		if (l.getWebElement("homePage").isDisplayed()) {
			actual = "success";
			log.info("HomePage is Displayed");
		} else {
			actual = "failure";
			log.info("HomePage is not Displayed");
		}

		Assert.assertTrue(actual.equals("success"));
		log.info("Assertion Passed");
		l.clickMenu();
		log.info("Clicked Menu Button");
		l.clickLogoutBtn();
		log.info("Clicked Logout Button");

		Thread.sleep(3000);

		String actual1 = null;

		if (l.getWebElement("loginPage").isDisplayed()) {
			actual1 = "success";
			log.info("LoginPage is Displayed");
		} else {
			actual1 = "failure";
			log.info("LoginPage is not Displayed");
		}

		Assert.assertTrue(actual1.equals("success"));
		log.info("Assertion Passed");
	}

	@Test(priority = 2)
	public void withInvalidUserName() throws Exception {
		test=reports.startTest("TC_002 Login With Invalid UserName");
		LoginPage l=new LoginPage();
		l.enterInvalidUserName();
		log.info("Entered InValid UserName");
		l.enterPassword();
		log.info("Entered Password");
		l.clickSubmit();
		log.info("Clicked Submit Button");

	}

	@Test(priority = 3)
	public void withInvalidPassword() throws Exception {
		test=reports.startTest("TC_003 Login With Invalid Password");
		LoginPage l=new LoginPage();
		l.clearUserName();
		log.info("Cleared UserName");
		l.enterUserName();
		log.info("Entered UserName");
		l.clearPassword();
		log.info("Cleared Password");
		l.enterInvalidPassword();
		log.info("Entered InValid Password");
		l.clickSubmit();
		log.info("Clicked Submit Button");
	}
	
	@Test(priority = 4)
	public void withoutUserNameAndPassword() throws Exception {
		test=reports.startTest("TC_004 Login without UserName and Password");
		LoginPage l=new LoginPage();
		l.clearUserName();
		log.info("Cleared UserName");
		l.clearPassword();
		log.info("Cleared Password");
		l.clickSubmit();
		log.info("Clicked Submit Button");
	}

	@AfterClass
	public void closeAndroid() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}



}
