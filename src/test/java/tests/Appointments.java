package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericPages.CommonMethod;
import io.appium.java_client.AppiumBy;
import pages.AppointmentsPage;
import pages.LoginPage;

public class Appointments extends CommonMethod{
	
public Appointments() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

Logger log = LogManager.getLogger(Appointments.class.getName());
	
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
	public void bookAppointmentInHomePage() throws Exception {
		test=reports.startTest("TC001 Book Appointment in HomePage");
		
		AppointmentsPage ap=new AppointmentsPage();
		ap.clickBookAppointment();
		log.info("Clicked Book Appointment");
		ap.enterFullName();
		log.info("Entered Full name");
		ap.enterPhoneNo();
		log.info("Entered Phone Number");
		ap.enterVisitReason();
		log.info("Entered Visit Reason");
		
		 SimpleDateFormat sdf = new SimpleDateFormat("EEE"); 
	     Date currentDate = new Date();
	     String dayAbbreviation = sdf.format(currentDate).toUpperCase();
	     
	     WebElement appointmentDate = driver.findElement(AppiumBy.xpath("//android.widget.TextView[1][@text='" + dayAbbreviation + "']"));
	     appointmentDate.click();
	     log.info("Entered Current Date");
	     ap.clickTimeGreater();
	     ap.clickTimeGreater();
	     log.info("Scrolled the timing to 10:30");
	     ap.clickCalenderTime();
	     log.info("Clicked Timing of Appointment");
	     ap.clickConfrmAppointment();
	     log.info("Clicked Cnfrm Appointment");
	     Thread.sleep(2000);
	   String Actual = getWebElement("AppointmentBookMessage").getText();
	   String Expected="Appointment Booked Successfully!!";
	   
	   Assert.assertEquals(Actual, Expected);
	   log.info("Assertion Passed");
	   
	   ap.clickAppointmentBookOkMsg();
	   log.info("Clicked Success Message OK Btn");
	}
	
	@Test(priority=2)
	public void addAppointmentInMenu() throws Exception {
		test=reports.startTest("TC002 AddAppointment in menu Appointments");
		AppointmentsPage ap=new AppointmentsPage();
		ap.clickMenuBtn();
		log.info("Clicked Menu Btn");
		ap.clickAppointmentsBtn();
		log.info("Clicked Appointments Btn");
		ap.clickAddAppointment();
		log.info("Clicked Add Appointment");
		ap.enterFullName();
		log.info("Entered Full name");
		ap.enterPhoneNo();
		log.info("Entered Phone Number");
		ap.enterVisitReason();
		log.info("Entered Visit Reason");
		
		 SimpleDateFormat sdf = new SimpleDateFormat("EEE"); 
	     Date currentDate = new Date();
	     String dayAbbreviation = sdf.format(currentDate).toUpperCase();
	     
	     WebElement appointmentDate = driver.findElement(AppiumBy.xpath("//android.widget.TextView[1][@text='" + dayAbbreviation + "']"));
	     appointmentDate.click();
	     log.info("Entered Current Date");
	     ap.clickTimeGreater();
	     ap.clickTimeGreater();
	     log.info("Scrolled the timing to 10:30");
	     ap.clickCalenderTime();
	     log.info("Clicked Timing of Appointment");
	     ap.clickConfrmAppointment();
	     log.info("Clicked Cnfrm Appointment");
	     Thread.sleep(2000);
	   String Actual = getWebElement("AppointmentBookMessage").getText();
	   String Expected="Appointment Booked Successfully!!";
	   
	   Assert.assertEquals(Actual, Expected);
	   log.info("Assertion Passed");
	   
	   ap.clickAppointmentBookOkMsg();
	   log.info("Clicked Success Message OK Btn");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}

}
