package Marathon_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_003_DeleteOpportunity extends BaseClass{
	@Test(dataProvider="fetchData")
	public void deleteLead(String username,String password,String firstname,String lastname) throws InterruptedException {
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//button[contains(@class,'AppLauncherHeader')]")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
	driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
	WebElement opportunityTab = driver.findElement(By.xpath("//a[@title='Opportunities']"));
	driver.executeScript("arguments[0].click();", opportunityTab);

	driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(firstname, Keys.ENTER);
	Thread.sleep(3000);
	WebElement virtualButton = driver.findElement(By.xpath("(//a[contains(@class,'rowActionsPlaceHolder')])[1]"));
	driver.executeScript("arguments[0].click();", virtualButton);
	driver.findElement(By.xpath("//a[@title='Delete']")).click();
	driver.findElement(By.xpath("(//button[contains(class, 'uiButton forceActionButton')])[2]")).click();
	String opportunityName = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
	if (opportunityName.contains(" was deleted.")) {

		System.out.println("Opportunity was deleted Successfully");

	} else {

		System.out.println("Opportunity was not deleted");
	}

}


}
