package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
public RemoteWebDriver driver;
public String fileName;
	
	
	// static parameterization with Pre and Postconditions
	
	@Parameters({"url","username","password","browser"})
	@BeforeMethod
	public void loginProcess(String link, String UN, String pasd,String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver  = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver  = new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		driver.get(link);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(pasd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		

	}
	
	

	@AfterMethod
	public void cose() {
		driver.close();
	}
	
	@DataProvider(name = "fetchData", indices = 1)
		public String[][] sendData() throws IOException{
			
			return ReadData.readData(fileName);
		}
	}
	


