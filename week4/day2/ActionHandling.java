package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement women = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
		Actions builder =new Actions(driver);
        builder.moveToElement(women).perform();
		

	}

}
