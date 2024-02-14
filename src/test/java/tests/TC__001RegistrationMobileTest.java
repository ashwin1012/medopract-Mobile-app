package tests;

import java.net.MalformedURLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericPages.CommonMethod;
import pages.RegistrationPage;

public class TC__001RegistrationMobileTest extends CommonMethod{
	
	public TC__001RegistrationMobileTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	Logger log = LogManager.getLogger(TC__001RegistrationMobileTest.class.getName());

	@BeforeClass
	public void openAndroidApk() throws MalformedURLException, InterruptedException {
		initializeDriver();
		log.debug("Opened Android Apk File");
	}

	@Test(priority=1)
	public void register() throws Exception {
		test=reports.startTest("Register the User");
		RegistrationPage rp=new RegistrationPage();
		rp.clickRegistration();
		log.debug("Clicked Registration");
		rp.enterFirstName();
		log.debug("Entered First Name");
		rp.enterLastName();
		log.debug("Entered Last Name");
		rp.enterEmail();
		log.debug("Entered Email Id");
		rp.enterPhoneNo();
		log.debug("Entered Phone Number");
		rp.enterUserName();
		log.debug("Entered UserName Field");
		rp.enterCnfrmUserName();
		log.debug("Entered Conform UserName Field");
		rp.clickAggreeTermCheckBox();
		log.debug("Clicked Agree Term Check Box");
		rp.clickRegisterBtn();
		log.debug("Clicked Register Btn");
	}
	
	@AfterClass
	public void closeAndroid() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}
}
