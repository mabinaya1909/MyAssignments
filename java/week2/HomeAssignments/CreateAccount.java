package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser window
		driver.manage().window().maximize();
		//enter the credentials and click on login button
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//click CRM/SFA
		driver.findElement(By.partialLinkText("SFA")).click();
		//go to Accounts tab and create an account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test Selenium Account4");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		//for static dropdown automation for industry,ownership,Marketing campaign and source fields
		WebElement Industry=driver.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(Industry);
		dropdown.selectByValue("IND_SOFTWARE");
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select dropdown1 = new Select(ownership);
		dropdown1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select dropdown2=new Select(source);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown3=new Select(marketingCampaign);
		dropdown3.selectByIndex(5);
		WebElement stateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown4= new Select(stateProvince);
		dropdown4.selectByValue("TX");
		//click on create account and close the window
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span")).getText()); //used absolute xpath for understanding the concept
		driver.quit();
		
		
		
		
		

	}

}
