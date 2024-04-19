package week4.day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice;

public class SnapDealAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement men=driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		WebElement sport = driver.findElement(By.xpath("//span[contains(text(),'Sports Shoes')]"));
		a.moveToElement(men).moveToElement(sport).click().perform();
		System.out.println("The result count is "+driver.findElement(By.xpath("//span[contains(text(),'Items')]")).getText());
		driver.findElement(By.xpath("//div[contains(text(),'Training')]")).click();
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(3000);
		List<WebElement> trainingShoesList=driver.findElements(By.xpath("//span[contains(@id,'display-price-')]"));
		List<String> priceList=new ArrayList<String>();
		List<String> priceListSorted=priceList;
		//to verify the products are sorted
		for (int i = 0; i < trainingShoesList.size()-1; i++) {
			String price=trainingShoesList.get(i).getText();
			priceList.add(price);
			Collections.sort(priceListSorted);
		}
		if(priceList==priceListSorted) {
			System.out.println("Products are sorted");
		}
		else {
			System.out.println("Products are not sorted");
		}
			
			
		}
	
	

	}


