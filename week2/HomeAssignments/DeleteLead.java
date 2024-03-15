package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//click CRM/SFA
		driver.findElement(By.partialLinkText("SFA")).click();
		//find a lead and delete the lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("5111");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement leadRecord=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//div/a"));
		String leadId= leadRecord.getText();
		System.out.println(leadId);
		leadRecord.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("5111");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String delete = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(delete.contains("display")) {
			System.out.println("Deletion is successful");
		}
		else {
			System.out.println("Deletion is unsuccessful");
		}
		driver.quit();

	}
	

}
