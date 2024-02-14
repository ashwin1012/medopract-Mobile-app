package pages;

import genericPages.CommonMethod;

public class AddPrescriptionPage extends CommonMethod{

	public AddPrescriptionPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void clickMenu() throws Exception {
		click("menuBtn");
	}
	
	public void clickPrescription() throws Exception {
		click("prescriptionsClick");
	}
	
	public void clickAddPrescription() throws Exception {
		click("addPrescription");
	}
	
	public void enterPatientName() throws Exception {
		enterData("PrescriptionPatientNameField", "firstName1");
	}
	
	public void clickPrescriptionDateClick() throws Exception {
		click("prescriptionsClick");
	}
	
	public void clickPrescriptionDateOKBtn() throws Exception {
		click("prescriptionDateOKBtn");
	}
	
	public void enterEmailField() throws Exception {
		enterData("emailField", "emailId2");
	}
	
	public void enterMedicineNameField1() throws Exception {
		enterData("medicineNameField", "medicineName1");
	}
	
	public void enterTotalNumberDays1() throws Exception {
		enterData("totalNumberDays", "noOfDays1");
	}
	
	public void enterTimingsInput1() throws Exception {
		enterData("timingsInput", "instructions1");
	}
	
	public void enterAmountInput1() throws Exception {
		enterData("amountInput", "amountToTake1");
	}
	
	public void enterMedicineNameField2() throws Exception {
		enterData("medicineNameField", "medicineName2");
	}
	
	public void enterTotalNumberDays2() throws Exception {
		enterData("totalNumberDays", "noOfDays2");
	}
	
	public void enterTimingsInput2() throws Exception {
		enterData("timingsInput", "instructions2");
	}
	
	public void enterAmountInput2() throws Exception {
		enterData("amountInput", "amountToTake2");
	}
	
	public void clickPlusSign() throws Exception {
		click("PlusSign");
	}
	
	public void enterNotesForDoctor() throws Exception {
		enterData("notesForDoctor", "notesForDoctor");
	}
	
	public void clickSaveAndPrintButton() throws Exception {
		click("saveAndPrintButton");
	}

}
