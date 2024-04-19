package testCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class TC_001CreateLead extends BaseClass {
	@Test
	public void createLead() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickSubmitButton()
		.verifyCreateLead();
	}
	

}
