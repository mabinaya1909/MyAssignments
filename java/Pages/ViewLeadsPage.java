package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class ViewLeadsPage extends BaseClass {
	public ViewLeadsPage verifyCreateLead() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
	return this;
	}

}
