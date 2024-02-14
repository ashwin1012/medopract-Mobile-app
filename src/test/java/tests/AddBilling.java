package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericPages.CommonMethod;
import pages.AddBillPage;
import pages.LoginPage;

public class AddBilling extends CommonMethod {
	
public AddBilling() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

Logger log = LogManager.getLogger(AddBilling.class.getName());
	
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
	@Test(priority=1)
	public void addBill() throws Exception {
		test=reports.startTest("TC001 Add Bill");
		AddBillPage ab= new AddBillPage();
		ab.clickMenu();
		log.info("Clicked Menu Btn");
		ab.clickBilling();
		log.info("Clicked Billing Btn");
		ab.clickGenerateBilling();
		log.info("Clicked Generate Billing Btn");
		ab.enterBillingPatientsNameField();
		log.info("Entered Billing Patient Name Field");
		ab.enterBedNumber();
		log.info("Entered Bed Number");
		ab.clickAdmissionDate();
		log.info("Clicked Admission Date");
		ab.clickOkButton();
		log.info("Clicked Ok Btn");
		ab.clickDischargeDate();
		log.info("Clicked Discharge Date");
		ab.clickOkButton();
		log.info("Clicked Ok Btn");
		ab.enterDescription();
		log.info("Entered Description");
		ab.enterQuantity();
		log.info("Entered Quantity");
		ab.enterRate();
		log.info("Entered Rate");
		ab.clickPlusSign();
		log.info("Clicked Plus Sign");
		ab.clickGenerateBillButton();
		log.info("Clicked Generate Bill Btn");
			
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}

}
