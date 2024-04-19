package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt89']/div)[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]")).click();
		String checkAjax=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if(checkAjax.equalsIgnoreCase("Checked")) {
			System.out.println("Ajax is checked");
		}
		else {
			System.out.println("Ajax is unchecked");
		}
		driver.findElement(By.xpath("(//table[@id='j_idt87:basic']//div)[3]")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div[2])")).click();
		String state=driver.findElement(By.xpath("//p[contains(text(),'State =')]")).getText();
		System.out.println(state);
		driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt100']/div)[2]")).click();
		Thread.sleep(3000);
		String toggle = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(toggle);
		if(toggle.equalsIgnoreCase("Checked")) {
			System.out.println("Switch is toggled");
		}
		else {
			System.out.println("Switch is not toggled");
		}
		boolean disabled = driver.findElement(By.id("j_idt87:j_idt102")).isSelected();
		System.out.println(disabled);
		if(disabled==false) {
			System.out.println("checkbox is disabled");
		}
		else {
			System.out.println("checkbox is not disabled");
		}
		driver.quit();
	}

}
