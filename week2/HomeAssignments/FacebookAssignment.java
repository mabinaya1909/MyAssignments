package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("9234567891");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("test123@");
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select dropdown=new Select(date);
		dropdown.selectByVisibleText("19");
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select dropdown1=new Select(month);
		dropdown1.selectByVisibleText("Sep");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select dropdown2=new Select(year);
		dropdown2.selectByVisibleText("1994");
		driver.findElement(By.xpath("(//input[@type='radio'])")).click();

	}

}
