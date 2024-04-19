package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class MyHomePage extends BaseClass{
	public MyLeadsPage  clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
}
