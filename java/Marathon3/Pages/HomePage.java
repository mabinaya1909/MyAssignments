package Marathon3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Marathon3.BaseClass.BaseLoginURLClass;

public class HomePage extends BaseLoginURLClass{
	public OpportunityPage appLauncher() {
		driver.findElement(By.xpath("//button[contains(@class,'AppLauncherHeader')]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
		WebElement opportunityTab = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunityTab);
		driver.findElement(By.xpath("//div[contains(@class,'lvmForceActionsContainer')]")).click();
		return new OpportunityPage();
	}
	
	
	
	

}
