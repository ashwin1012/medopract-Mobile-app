package pages;

import genericPages.CommonMethod;

public class ViewPrescriptionPage extends CommonMethod{

	public ViewPrescriptionPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void clickMenu() throws Exception {
		click("menuBtn");
	}
	
	public void clickPrescription() throws Exception {
		click("prescriptionsClick");
	}
	
	public void clickViewPrescription() throws Exception {
		click("viewPrescriptionTab");
	}
	
	public void enterPatientName() throws Exception {
		enterData("ViewPrescriptionPatientNameField", "firstName1");
	}


}
