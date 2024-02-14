package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericPages.CommonMethod;
import pages.AddPatientPage;
import pages.LoginPage;

public class AddPatient extends CommonMethod{

	public AddPatient() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	Logger log = LogManager.getLogger(AddPatient.class.getName());
	
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
	public void HomePageAddPatientBtn() throws Exception {
		test = reports.startTest("TC001 Add Patient Through HomePage HomePage Button");
		
		AddPatientPage app=new AddPatientPage();
		app.clickAddPatientBtn();
		log.info("Clicked Add Patient Button");
        app.enterPatientNameField();
        log.info("Entered Patient Name Field");
        app.enterPatientPhoneNoField();
        log.info("Entered Patient Phone Number Field");
        app.clickGenderMale();
        log.info("Clicked Gender male Btn");
        app.dateOfBirth();
        log.info("Clicked Date Of Birth Btn");
        app.dobOKBtn();
        log.info("Clicked DOb OK Btn");
        app.clickBloodGroup();
        log.info("Clicked Blood Group DropDown");
        app.enterOccupationField();
        log.info("Entered Patient Occupation Field");
        app.enterEmergencyPhoneNoField();
        log.info("Entered Emergency PhoneNo Field");
        app.enterAddressField();
        log.info("Entered Patient Address Field");
        app.enterAllergyField();
        log.info("Entered Patient Alergy Field");
        app.enterHistoryField();
        log.info("Entered Patient History Field");
        app.enterTwoHabbits();
        log.info("Entered Patient Habbits Field");
        app.enterRemarksField();
        log.info("Entered Patient Remarks Field");
        app.clickSaveBtn();
        log.info("Clicked Save Button");
        
        Thread.sleep(2000);
        String Actual = getWebElement("AddPatientSuccessMessage").getText();
        String Expected = "Patient Added Successfully!";
        
        Assert.assertEquals(Actual, Expected);
		log.info("Assertion Passed");
		
		Thread.sleep(3000);
		app.clickAddPatientSuccessOkBtn();
		log.info("Clicked OK Button");
	}
	
	@Test(priority=2)
	public void clickAddPatientInMenuByEnteringMandatoryData() throws Exception {
		test=reports.startTest("TC002 Click AddPatients in Menu by entering Mandatory Data");
	
		AddPatientPage app=new AddPatientPage();
		Thread.sleep(10000);
		app.clickMenu();
		log.info("Clicked Menu  Btn");
		app.clickMenuPatientBtn();
		log.info("Clicked Menu Patient Btn");
		app.clickAddPatientInPatientPage();
		log.info("Clicked Add Patient Btn");
		app.enterPatientNameField();
		log.info("Entered Patient Name Field");
        app.enterPatientPhoneNoField();
        log.info("Entered Patient Phone Number Field");
        app.clickGenderMale();
        log.info("Clicked Gender male Btn");
        app.dateOfBirth();
        log.info("Clicked Date Of Birth Btn");
        app.dobOKBtn();
        log.info("Clicked DOb OK Btn");
        app.clickBloodGroup();
        log.info("Clicked Blood Group DropDown");
        app.clickSaveBtn();
        log.info("Clicked Save Button");
        
        String Actual = getWebElement("AddPatientSuccessMessage").getText();
        String Expected = "Patient Added Successfully!";
        
        Assert.assertEquals(Actual, Expected);
		log.info("Assertion Passed");
		
		Thread.sleep(5000);
		app.clickAddPatientSuccessOkBtn();
		log.info("Clicked OK Button");
		
	}
	
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}
}
