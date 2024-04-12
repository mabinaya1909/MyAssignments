package Marathon3.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Marathon_3.ReadDataFromExcel;

public class BaseLoginURLClass {
	public static ChromeDriver driver;
		@BeforeMethod
		public void preCondition() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://login.salesforce.com/");
		}
		@DataProvider(name="fetchData")
		public String[][] readExcelData() throws IOException {
			return ReadDataFromExcel.readData();
		}
		@AfterMethod
		public void postCondition() {
			driver.close();
		}

	}

