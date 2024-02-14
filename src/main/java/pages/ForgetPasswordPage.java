package pages;

import genericPages.CommonMethod;

public class ForgetPasswordPage extends CommonMethod {

	public ForgetPasswordPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void clickForgetPasswordLink() throws Exception {
		click("forgetPassBtn");
	}
	
	public void enterUserNameField() throws Exception {
         enterData("forgetPassUserNameField", "userName");
	}
	
	public void clickForgetPasswordResetBtn() throws Exception {
		click("forgetPassResetBtn");
	}

}
