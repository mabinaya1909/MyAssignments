package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following::span[text()='Click']")).click();
		String title=driver.getTitle();
		if(title=="Dashboard") {
			System.out.println("Title is dashboard");
		}
		else {
			System.out.println("Title is not Dashboard");
		}
		driver.navigate().back();//to navigate to previous page
		boolean disabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button[@disabled='disabled']")).isEnabled();
		if(disabled==true) {
			System.out.println("button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following::span[text()='Submit']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following::span[text()='Save']")).getCssValue("color"));
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following::span[text()='Save']")).getSize());
		driver.quit();
		

	}

}
