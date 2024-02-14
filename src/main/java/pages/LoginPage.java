package pages;

import genericPages.CommonMethod;

public class LoginPage  extends CommonMethod{

		
		public LoginPage() throws Exception {
			super();
			// TODO Auto-generated constructor stub
		}

		public void enterUserName() throws Exception {
			enterData("userNameField", "userName");
		}
		
		public void enterPassword() throws Exception {
			enterData("passwordField", "passWord");
		}
		
		public void enterInvalidUserName() throws Exception {
			enterData("userNameField", "invalidUserName");
		}
		
		public void enterInvalidPassword() throws Exception {
			enterData("passwordField", "invalidPassword");
		}
		
		public void clearUserName() throws Exception {
			clearData("userNameField");
		}
		
		public void clearPassword() throws Exception {
			clearData("passwordField");
		}
		
		public void clickSubmit() throws Exception {
			click("submitBtn");
		}
		
		public void clickMenu() throws Exception {
			click("menuBtn");
		}
		
		public void clickLogoutBtn() throws Exception {
			click("logOutBtn");
		}

}
