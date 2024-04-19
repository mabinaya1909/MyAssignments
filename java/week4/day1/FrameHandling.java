package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		//to locate the frame
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//to switch to frame
		driver.switchTo().frame(frame);
		//to click the button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//to switch to alert and accept the alert
		driver.switchTo().alert().accept();
		String result =driver.findElement(By.xpath("//button[text()='Try it']/following-sibling::p")).getText();
		System.out.println(result);
		if(result.contains("OK")) {
			System.out.println("Try it is clicked successfully");
		}
		driver.close();

	}

}
