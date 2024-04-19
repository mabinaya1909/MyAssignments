package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[contains(text(),'Alert (Prompt Dialog)')]/following::button")).click();
		driver.switchTo().alert().sendKeys("This is a test");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'Alert (Prompt Dialog)')]/following::span[@id='confirm_result']")).getText());

	}

}
