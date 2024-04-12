package Marathon3.Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Marathon3.BaseClass.BaseLoginURLClass;

public class LoginPage extends BaseLoginURLClass{
	public LoginPage enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public HomePage click() {
		driver.findElement(By.id("Login")).click();
		return new HomePage();
	}

}
