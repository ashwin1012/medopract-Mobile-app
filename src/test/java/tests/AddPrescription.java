package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericPages.CommonMethod;
import pages.AddPrescriptionPage;
import pages.LoginPage;

public class AddPrescription extends CommonMethod{

public AddPrescription() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

Logger log = LogManager.getLogger(AddPrescription.class.getName());
	
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
	
	@Test(priority = 1)
	public void addPrescription() throws Exception {
		test=reports.startTest("TC001 Add Prescription");
		AddPrescriptionPage ap=new AddPrescriptionPage();
		ap.clickMenu();
		log.info("Clicked Menu Btn");
		ap.clickPrescription();
		log.info("Clicked Prescription Btn");
		ap.clickAddPrescription();
		log.info("Clicked Add Prescription Btn");
		ap.enterPatientName();
		log.info("Entered Patient Name");
		ap.clickPrescriptionDateClick();
		log.info("Clicked Prescription Date Btn");
		ap.clickPrescriptionDateOKBtn();
		log.info("Clicked Prescription Date Ok Btn");
		ap.enterEmailField();
		log.info("Entered Email Field");
		ap.enterMedicineNameField1();
		log.info("Entered Medicine Name Field");
		ap.enterTotalNumberDays1();
		log.info("Entered Total Number Of Days Field");
		ap.enterTimingsInput1();
		log.info("Entered Timing Input Field");
		ap.enterAmountInput1();
		log.info("Entered Amount Input Field");
		ap.clickPlusSign();
		log.info("Clicked Plus Sign");
		ap.clickSaveAndPrintButton();
		log.info("Clicked Save And Print Btn");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}
}
