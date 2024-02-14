package pages;

import genericPages.CommonMethod;

public class RegistrationPage extends CommonMethod{

	public RegistrationPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void clickRegistration() throws Exception {
		click("registerBtn");
	}
	
	public void enterFirstName() throws Exception {
		enterData("registerFirstName", "firstName1");
	}
	
	public void enterLastName() throws Exception {
		enterData("registerLastName", "lastName1");
	}
	
	public void enterEmail() throws Exception {
		enterData("registerEmailID", "emailId1");
	}
	
	public void enterPhoneNo() throws Exception {
		enterData("registerPhoneNo", "phoneNumber1");
	}
	
	public void enterUserName() throws Exception {
		enterData("registerUserName", "userName");
	}
	
	public void enterCnfrmUserName() throws Exception {
		enterData("registerCnfrmUserName", "CnfrmUserName");
	}
	
	public void clickAggreeTermCheckBox() throws Exception {
		click("registerAgreeTermCheckBox");
	}
	
	public void clickRegisterBtn() throws Exception {
		click("registrationBtn");
	}
	
}
