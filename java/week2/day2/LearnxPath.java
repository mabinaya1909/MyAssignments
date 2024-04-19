package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnxPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Launch the Chrome browser
				ChromeDriver driver = new ChromeDriver();
				// Load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				//to maximize the window
				driver.manage().window().maximize();
				//locate the username field and type the username
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				//enter the password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				//Click Login button
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				//to verify the title 
				System.out.println(driver.getTitle());
				//click on crmsfa link
				driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
				//click on leads link
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				//click on createlead link
				driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				//enter companyname
				driver.findElement(By.xpath("(//input[@id='createLeadForm_companyName'])")).sendKeys("TestLeaf");
				//enter firstname
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Abinaya");
				//enter lastname
				driver.findElement(By.xpath("(//input[@id='createLeadForm_lastName'])")).sendKeys("RK");
				
				//close the browser
				driver.close();
				
				
				
			}

		

	}


