package Marathon_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001_CreateOpportunity extends BaseClass{
	@Test(dataProvider="fetchData")
	public void createOpportunity(String username,String password,String firstname,String lastname) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[contains(@class,'AppLauncherHeader')]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
		WebElement opportunityTab = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunityTab);
		driver.findElement(By.xpath("//div[contains(@class,'lvmForceActionsContainer')]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		driver.findElement(By.xpath("(//label[text()='Stage']/following::span)[1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String opportunityName = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		if (opportunityName.contains(" was created.")) {
			
			System.out.println("Opportunity Created Successfully");
			
		}
		else {
			
			System.out.println("Opportunity NotCreated");
		}
		

}}
