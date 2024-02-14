package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import genericPages.CommonMethod;
import pages.LoginPage;

public class ViewPrescription extends CommonMethod{

public ViewPrescription() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

Logger log = LogManager.getLogger(ViewPrescription.class.getName());
	
	@BeforeClass
	public void openAndroidApk() throws Exception {
		test=reports.startTest("Open Android Apk");
		initializeDriver();
		log.info("Opened Android Apk File");
		
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
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}
}
