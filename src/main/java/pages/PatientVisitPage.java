package pages;

import genericPages.CommonMethod;

public class PatientVisitPage extends CommonMethod{

	public PatientVisitPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void clickstartPatientVisit() throws Exception {
		click("startPatientVisit");
	}
	
	public void enterPatientName() throws Exception {
		enterData("searchPatient", "firstName1");
	}
	
	public void clickAddNewPatientBtn() throws Exception {
		click("addNewPatient");
	}
	
	public void clickPatientList() throws Exception {
		click("patientList");
	}
	
	public void clickCallOption() throws Exception {
		click("callOption");
	}
	
	public void clickSMSOption() throws Exception {
		click("smsOption");
	}
	
	public void clickPatientVisitBtn() throws Exception {
		click("startPatientVisit");
	}
	
	public void clickPatientVisitDateAndTime() throws Exception {
		click("patientVisitDateAndTime");
	}
	
	public void enterPrimaryComplaint() throws Exception {
		enterData("primaryComplaint", "primaryComplaint");
	}
	
	public void enterSymptomsAndIndication() throws Exception {
		enterData("symptomsAndIndication", "symptoms1");
	}
	
	public void enterClinicalObservation() throws Exception {
		enterData("clinicalObservation", "Clinical_Observation");
	}
	
	public void enterRemarks() throws Exception {
		enterData("remarks", "Remarks");
	}
	
	public void enterBloodPressure() throws Exception {
		enterData("bloodPressure", "bloodPressure");
	}
	
	public void enterSugarLevel() throws Exception {
		enterData("sugarLevel", "sugarLevel");
	}
	
	public void enterHeartRate() throws Exception {
		enterData("heartRate", "heartRate");
	}
	
	public void enterInvestigationsAndTests() throws Exception {
		enterData("investigationsAndTests", "investigations1");
	}
	
	public void clickSaveBtn() throws Exception {
		click("saveBtn");
	}
	
	public void clickViewOrEditBtn() throws Exception {
		click("viewOrEditBtn");
	}
	
	
	
}
