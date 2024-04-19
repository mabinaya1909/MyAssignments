package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class CreateLeadPage extends BaseClass {
	public CreateLeadPage  enterCompanyName() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	return this;
	}
	public CreateLeadPage enterFirstName() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
	return this;
	}
	public CreateLeadPage  enterLastName() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
	return this;
	}
	public ViewLeadsPage clickSubmitButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadsPage ();
	}

}
