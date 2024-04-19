package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		//enter the source and destination details
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[contains(text(),'Chennai')]")).click();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[contains(text(),'Madurai')]")).click();
		driver.findElement(By.xpath("//input[contains(@title,'View trains running on select date')]")).click();
		//locate the table
		WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']//table"));
		//locate the row and column from table
		List<WebElement> rowList=table.findElements(By.tagName("tr"));
		int rowCount = rowList.size();
		System.out.println(rowCount);
		//to print all data in column 2 that is train name
		for(int i=2;i<rowCount+1;i++) {
			String trainName= driver.findElement(By.xpath("//div[@id='divTrainsList']/table//tr["+i+"]/td[2]")).getText();
			System.out.println(trainName);
		}
		
		

	}

}
