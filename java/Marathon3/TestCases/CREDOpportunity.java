package Marathon3.TestCases;

import org.testng.annotations.Test;

import Marathon3.BaseClass.BaseLoginURLClass;
import Marathon3.Pages.LoginPage;

public class CREDOpportunity extends BaseLoginURLClass{
	@Test(dataProvider="fetchData")
	public void createOpportunity(String username, String password,String firstname,String lastname) {
		new LoginPage().enterUsername(username).enterPassword(password).click().appLauncher().createOpportunityPage(firstname);
	}
	@Test(dataProvider="fetchData")
	public void editOpportunity(String username, String password,String firstname,String lastname) throws InterruptedException {
		new LoginPage().enterUsername(username).enterPassword(password).click().appLauncher().editOpportunityPage(firstname);
	}
	@Test(dataProvider="fetchData")
	public void deleteOpportunity(String username, String password,String firstname,String lastname) throws InterruptedException {
		new LoginPage().enterUsername(username).enterPassword(password).click().appLauncher().deleteOpportunityPage(firstname);
	}

}
