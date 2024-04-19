package Marathon_3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseClass {
	ChromeDriver driver;
	String marathon;
	@BeforeMethod
	public void loginURL() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://login.salesforce.com/");

	}
	
	@DataProvider(name="fetchData")
	public String[][] readExcelData() throws IOException {
		return ReadDataFromExcel.readData();

	}
	@AfterMethod
	public void close() {
		driver.close();

	}

}
