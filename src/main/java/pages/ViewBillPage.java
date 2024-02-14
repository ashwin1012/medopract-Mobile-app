package pages;

import genericPages.CommonMethod;

public class ViewBillPage extends CommonMethod {

	public ViewBillPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void clickMenu() throws Exception {
		click("menuBtn");
	}
	
	public void clickBillingClick() throws Exception {
		click("billingClick");
	}
	
	public void clickViewBillclick() throws Exception {
		click("ViewBillclick");
	}
	
	public void enterPatientsNameField() throws Exception {
		enterData("ViewBillPatientNameField", "firstName1");
	}
	
	public void clickPatientNameSuggestion() throws Exception {
		click("clickPatientNameSuggestion");
	}
	
	public void clickPatientList() throws Exception {
		click("clickPatientList");
	}
}
