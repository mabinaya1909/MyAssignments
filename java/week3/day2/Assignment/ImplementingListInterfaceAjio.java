package week3.day2.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterfaceAjio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']/preceding::span[contains(@class,'search')]")).click();
		//to click on men
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label[contains(text(),'Fashion')]")).click();
		//to print the total count of items
		System.out.println("The total items returned is "+driver.findElement(By.xpath("(//div[contains(@class,'container')]//strong)[1]")).getText());
		//to store the brand names in a list
		 List<WebElement> brandsList=driver.findElements(By.xpath("//div[@class='brand']"));
		 //to get the list of values from the list
		 for (int i = 0; i < brandsList.size(); i++) {
			 String text=brandsList.get(i).getText();
			 System.out.println(text);
			
		}
		 

	}

}
