package pages;

import genericPages.CommonMethod;

public class AddPatientPage extends CommonMethod{

	public AddPatientPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void clickMenu() throws Exception {
		Thread.sleep(3000);
		click("menuBtn");
	}
	
	public void clickMenuPatientBtn() throws Exception {
		click("menuPatientsBtn");
	}
	
	public void clickAddPatientInPatientPage() throws Exception {
		click("addNewPatient");
	}
	
	public void clickAddPatientBtn() throws Exception {
		click("homePageAddPatientsClick");
	}
	
	public void enterPatientNameField() throws Exception {
		enterData("addPatientNameField", "firstName1");
	}
	
	public void enterPatientPhoneNoField() throws Exception {
		enterData("phoneNoField", "phoneNumber1");
	}
	
	public void dateOfBirth() throws Exception {
		click("patientDOB");
	}
	
	public void dobOKBtn() throws Exception {
	    click("patientDOBOK");	
	}
	
	public void clickGenderMale() throws Exception {
		click("genderMaleRadioBtn");
	}
	
	public void clickGenderfemale() throws Exception {
		click("genderFemaleRadioBtn");
	}
	
	public void clickBloodGroup() throws Exception {
		click("bloodgroup");
	}
	
	public void enterOccupationField() throws Exception {
		enterData("OccupationField", "occupation");
	}
	
	public void enterEmergencyPhoneNoField() throws Exception {
		enterData("emergencyField", "phoneNumber2");
	}
	
	public void enterAddressField() throws Exception {
		enterData("addressField", "Address");
	}
	
	public void enterAllergyField() throws Exception {
		enterData("allergiesField", "Allergy");
	}
	
	public void enterHistoryField() throws Exception {
		enterData("historyField", "History1");
	}
	
	public void enterRemarksField() throws Exception {
		enterData("remarksField", "Remarks");
	}
	
	public void enterHabitsField1() throws Exception {
		enterData("habitsField", "Habit1");
	}
	
	public void enterHabitsField2() throws Exception {
		enterData("habitsField", "Habit2");
	}
	
	public void enterTwoHabbits() throws Exception {
		enterData("habitsField", "TwoHabbits");
	}

	public void clickSaveBtn() throws Exception {
		click("saveButton");
	}
	
	public void clickAddPatientSuccessOkBtn() throws Exception {
		click("AddPatientMessageOKBtn");
	}
	
	
}
