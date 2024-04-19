package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class WelcomePage extends BaseClass{
	public WelcomePage verifyHomePage() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;
	}
	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

	

}
