package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		//driver.findElement(By.xpath("//div[@id='search-container']//button[text()='Search']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[contains(@id,'service-operator-agent-name-')]/h5")).getText());
		driver.findElement(By.xpath("//div[@id='seat-filter-bus-type']/a[4]/span[text()='Sleeper']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@id,'service-operator-select-seat')]//small")).getText());
		driver.findElement(By.xpath("//div[contains(@id,'service-operator-select-seat')]//button")).click();
		driver.findElement(By.xpath("(//button[@class='seat sleeper']//*[@fill='white'])[1]")).click();
		driver.findElement(By.xpath("//div[@id='place-container']/div/div/div/input")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'container checkbox-container')]//input)[2]")).click();
		driver.findElement(By.xpath("//div[contains(@id,'seating-selected-seat-details')]/following::span[text()='Continue']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Add Passenger for :']/span")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='fare-details-net-paid']/h6")).getText());
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
