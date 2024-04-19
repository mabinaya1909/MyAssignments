package week4.day1.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationUsingActionsClassInSelenium {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//Launch Amazon site
		driver.get("https://www.amazon.in");
		//maximize the window
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//enter given text in search bar
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		//instantiate Actions class and perform enter operation
		//Actions a=new Actions(driver);
		//a.moveToElement(search).sendKeys("oneplus 9 pro").keyDown(Keys.ENTER).build();
		//Print the price of the first resulting product
		String iprice=driver.findElement(By.xpath("//span[@class='a-price']")).getText();
		System.out.println("Price of the first product is: "+driver.findElement(By.xpath("//span[@class='a-price']")).getText());
		//print the rating of first resulting product
		System.out.println("Rating of the first product is: "+driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText());
		String pwindow=driver.getWindowHandle();
		//Click first test link of first product
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> handlesList=new ArrayList<String>(windowHandles);
		driver.switchTo().window(handlesList.get(1));
		System.out.println(driver.getTitle());
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("./SnapShots/Result.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span/input")).click();
		//Print the subtotal of price
		String oprice=driver.findElement(By.xpath("//span[contains(text(),'Subtotal')]/following-sibling::span")).getText();
		System.out.println("The total price in cart is "+driver.findElement(By.xpath("//span[contains(text(),'Subtotal')]/following-sibling::span")).getText());
		if(iprice.contains(oprice)){
			System.out.println("Same price is displayed");
		}
		else {
			System.out.println("Same price is not displayed");
		}
		driver.close();
		
		
		
		
		
		
		

	}

}
