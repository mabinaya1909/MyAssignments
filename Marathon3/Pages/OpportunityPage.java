package Marathon3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Marathon3.BaseClass.BaseLoginURLClass;

public class OpportunityPage extends BaseLoginURLClass{
	public OpportunityPage createOpportunityPage(String firstname) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		driver.findElement(By.xpath("(//label[text()='Stage']/following::span)[1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		return this;
	}
	public OpportunityPage editOpportunityPage(String firstname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(firstname, Keys.ENTER);
		Thread.sleep(3000);
		WebElement virtualButton = driver.findElement(By.xpath("(//a[contains(@class,'rowActionsPlaceHolder')])[1]"));
		driver.executeScript("arguments[0].click();", virtualButton);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		WebElement nextDate = driver.findElement(By.xpath("(//td[@class='slds-is-today slds-is-selected']//following::span)[1]"));
//		driver.executeScript("arguments[0].click();", nextDate);
		nextDate.click();
		driver.findElement(By.xpath("(//label[text()='Stage']/following::span)[1]")).click();
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		WebElement deliveryInstall = driver
				.findElement(By.xpath("(//label[contains(text(),'Delivery')]/following::span)[1]"));
		driver.executeScript("arguments[0].click();", deliveryInstall);
		driver.findElement(By.xpath("//span[@title='In progress']")).click();
		WebElement description = driver.findElement(By.xpath("//div[contains(@class, 'textarea-container')]"));
		Actions action = new Actions(driver);
		action.scrollToElement(description).sendKeys("Salesforce").perform();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		return this;

	}
	public OpportunityPage deleteOpportunityPage(String firstname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(firstname, Keys.ENTER);
		Thread.sleep(3000);
		WebElement virtualButton = driver.findElement(By.xpath("(//a[contains(@class,'rowActionsPlaceHolder')])[1]"));
		driver.executeScript("arguments[0].click();", virtualButton);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'uiButton forceActionButton')])[2]")).click();
		return this;
	}
	
	

}
