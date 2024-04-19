package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class MyLeadsPage extends BaseClass{
	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}
