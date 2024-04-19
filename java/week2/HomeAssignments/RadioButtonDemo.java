package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding::span[1]")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding::span[1]")).click();
		System.out.println(driver.findElement(By.xpath("//label[text()='Bengaluru']/preceding::span[1]")).isSelected());
		boolean radioDefaultCheck = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).isSelected();
		System.out.println(radioDefaultCheck);
	}
}
