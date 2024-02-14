package pages;

import genericPages.CommonMethod;

public class AddBillPage extends CommonMethod{

	public AddBillPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void clickMenu() throws Exception {
		click("menuBtn");
	}
	
	public void clickBilling() throws Exception {
		click("billingClick");
	}
	
	public void clickGenerateBilling() throws Exception {
		click("generateBillingClick");
	}
	
	public void enterBillingPatientsNameField() throws Exception {
		enterData("BillingPatientsNameField", "firstName1");
	}
	
	public void enterBedNumber() throws Exception {
		enterData("BedNumber", "BedNo");
	}
	
	public void clickAdmissionDate() throws Exception {
		click("AdmissionDate");
	}
	
	public void clickDischargeDate() throws Exception {
		click("DischargeDate");
	}
	
	public void clickOkButton() throws Exception {
		click("OkButton");
	}
	
	public void enterDescription() throws Exception {
		enterData("Description", "BillDescription");
	}
	
	public void enterQuantity() throws Exception {
		enterData("Quantity", "Qty");
	}
	
	public void enterRate() throws Exception {
		enterData("Rate", "Rate");
	}
	
	public void enterInvaliedBillDescription() throws Exception {
		enterData("Description", "InvaliedBillDescription");
	}
	
	public void enterInvalidQuantity() throws Exception {
		enterData("Quantity", "invalidQty");
	}
	
	public void enterInvalidRate() throws Exception {
		enterData("Rate", "InvalidRate");
	}
	
	public void clickPlusSign() throws Exception {
		click("PlusSign");
	}
	
	public void clickCancelButton() throws Exception {
		click("CancelButton");
	}
	
	public void clickGenerateBillButton() throws Exception {
		click("GenerateBillButton");
	}
	
	

}
