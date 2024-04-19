package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Marathon_3.ReadDataFromExcel;

public class BaseClass {
	public static ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("http://leaftaps.com/opentaps/control/main");
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
