package pages;

import genericPages.CommonMethod;

public class AppointmentsPage extends CommonMethod{

	public AppointmentsPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void clickMenuBtn() throws Exception {
		click("menuBtn");
	}
	
	public void clickAppointmentsBtn() throws Exception {
		click("menuAppointments");
	}
	
	public void clickAddAppointment() throws Exception {
		click("addAppointment");
	}
	
	public void clickBookAppointment() throws Exception {
		click("ClickBookAppointment");
	}
	
	public void enterFullName() throws Exception {
		enterData("FullNameField", "fullName");
	}
	
	public void enterPhoneNo() throws Exception {
		enterData("PhoneNoField", "phoneNumber1");
	}
	
	public void enterVisitReason() throws Exception {
		enterData("VisitReasonField", "VisitReason1");
	}
	
	public void clickCalenderDate() throws Exception {
		click("ClickCalenderDate");
	}
	
	public void clickDateGreater() throws Exception {
		click("dateGreater");
	}
	
	public void clickDateLesser() throws Exception {
		click("dateLesser");
	}
	
	public void clickCalenderTime() throws Exception {
		click("ClickCalenderTime");
	}
	
	public void clickTimeGreater() throws Exception {
		click("timeGreater");
	}
	
	public void clicktimeLesser() throws Exception {
		click("timeLesser");
	}
	
	public void clickConfrmAppointment() throws Exception {
		click("ClickConfirmAppointment");
	}
	
	public void clickAppointmentBookOkMsg() throws Exception {
		click("AppointmentBookOkMessage");
	}

	
}
